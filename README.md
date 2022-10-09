# TFLAutomation
Framework: Below are the tools used as a part of the framework 
1. Java 
2. Maven - Added all the Dependencies
3. Cucumber - 
	 Features files are created in "FeatureFiles" Package
	 All Step Definitions are Created in "StepDef" Package
	 Test Runner class in "TestRunner"
4. Page Object
	All Web elements are created in src->main->java->ObjectRepo
5. Selenium
	Config.properties files reads the URL and Browser information.
	Created a Base class where the Driver is initialised 
6. Report 
	Cucumber Execution report is created in the folder /target/cucumber-reports/reports.html

How to Run->
Go to TestRunner(Package) -> Run the TestRunner.java file
Note : Need to configure JDK 17 before running the project .
