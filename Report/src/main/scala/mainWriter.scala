package scoverage
import java.io._


object mainWriter {
  def main(args: Array[String]) = {
  
    val basePath = System.getProperty("user.dir")
    
	val reportDir = new File(basePath + "\\Report\\FinalReport")
    val dataDir = basePath + "\\Report\\scoverage-data"
	val file = new File(basePath + "\\Report\\scoverage-data\\scoverage.coverage.xml")

	val sourceDir = new File(basePath + "\\codeTest\\src\\main\\scala")
	
	//val sourceDir2 = new File(basePath + "dotty\\coverageOutput")
    
    //Recreate the coverage
	val cov = Serializer.deserialize(file)
    
    val measurementFiles = IOUtils.findMeasurementFiles(dataDir)
    val measurements = IOUtils.invoked(measurementFiles)
    cov.apply(measurements)
  
	println("Write the report")
    new ScoverageHtmlWriter(Seq(sourceDir), reportDir, None).write(cov)
	//new ScoverageHtmlWriter(Seq(sourceDir,sourceDir2), reportDir, None).write(cov)
  }
}