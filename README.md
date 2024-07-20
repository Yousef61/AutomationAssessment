# AutomationAssessment
This project is an GUI test automation framework using Java, Selenium , Maven, TestNG & PageObjectModel design pattern (fluent design). It tests the following:
  * Search for "selenium webdriver by this URL "https://www.google.com/"  Check that the third result text contains "What is Selenium WebDriver?".
  * Click on "File Upload" button IN this URL "https://the-internet.herokuapp.com/" to Upload any small image file & Check that the file has been uploaded successfully.
  * Click on "Dynamic Loading" IN this URL "https://the-internet.herokuapp.com/" to Check that the text displayed is "Hello World!" after loading to finish.

    
## Project Structure
-src/main/java
  - (GoogleSearchPage & SearchResult) : classes contains Locators & actions for firstTest.
  - (WelcomePage ,FileUploaderPage & UploadedSuccessPage) : classes contains Locators & methods for secondTest.
  - (WelcomePage ,DynamicallyLoadedElements & DynamicallyLoadedSuccessfully) : classes contains Locators & methods for thirdTest.
  - (BasePage) : classe contains  driver , waits & actions.
    
- src/test/java
  - FirstTest.java: test cases for Check that the third result text contains "What is Selenium WebDriver?".
  - secondTest.java: class for Upload any small image file & Check that the file has been uploaded successfully.
  - third.java: class for Check that the text displayed is "Hello World!" after loading to finish.
    

## Prerequisites

- Java 21.0.2
- Maven
- TestNG
- Selenium
- Install alluer Report on your machine.
- An IDE (IntelliJ IDEA)

## Dependencies

The project uses the following dependencies:

- selenium
- TestNG
- alluer Report

These dependencies are specified in the pom.xml file.

## Setup
Open the project in your IDE.
Running the Tests from testNG File to generate Allure report.
You can run the tests using your IDE from test clasess without testNG.xml File.

## Using IDE
From Test Classes:
 -Right-click on the (FirstTest.java ,secondTest.java or third.java) file.
 -Select Run.
 
 ## Using cmd
 From testNG File:
  - open testNG.xml file
  - decleare classes like that "<class name="GoogleTest.FirstTest"/>"
  - Right-click
  - Run ..\testNG.xml
  - after running done
  - goto allure-results file
  - copy Path/refrence
  - then open cmd
  - write the follwing command line (allure serve "Path/refrence")
  - allure report should be opend.
