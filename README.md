# dotty-coverage-tools

Tools used for my semester project about code coverage for Dotty.

**Warning** : the following only works with the modified version of the dotty compiler !

To run:

```
;codeTest/run;codeTest/clean;Report/run
```

The repository contains two main projects:


## CodeTest

[Simple dotty project](https://github.com/lampepfl/dotty-example-project) adapted to be used with the current experimental version of the dotty compiler who implements the code coverage, with a sample code to test the coverage.

## Report

Report that takes the ouput coverage data of CodeTest to generate HTML reports. The code comes from [Scoverage](https://github.com/scoverage/scalac-scoverage-plugin/tree/master/scalac-scoverage-plugin/src/main/scala/scoverage) and is slightly adapted to be used in this project. 
