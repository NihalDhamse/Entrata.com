1. Project Title  : Entrata.com

2. Web Application Description : Entrata.com is the E-commerce domain which provided the Property managment, Marketing & Leasing, Accounting, Resident services utilites Management service and feature thorugh the web Application.

3. Project description : This automation framework is designed to streamline testing processes by providing a robust and flexible structure for writing and executing automated tests.

4. Table contains : 
              Installation 
                Usage
                Features
   
     1. Installation :
                   i. Clone the repository:
                            git clone https://github.com/NihalDhamse/Entrata.com.git

                   ii.  Navigate to the project directory:
                            cd automation-framework

    2. Usage       :   To run the tests, use the following command:
                             mvn verify

    3. Feature     :   i.  Easy setup and configuration
                       ii. Supports multiple browsers
                      iii. Detailed reporting
                      iv. Extensible with plugins                    
            

5. In that Task I am using following tool and technology for Automation testing.  
        Programming Lanuage   : Java
        Automation framewrok  : Data-driven framework, Page object Module & pagefactory
        Testing framework     : Selenium, TestNG
        cloud repository      : GitHub
        Build in tool         : Maven with sureFire plugin


6. Create automation framework Step :

        1. Setup all the driver and resources 
        2. create package for PagesClasses, TestBase, TestClasses, Utility, driver and properties.
        3. In TestBase package create "WebTestBase" class file for storing all the browser driver code and Wait property (Implicity and Explicity wait) and File Inputes code there.
        4. In Utitlity package create "Util" class file for storaing or selenium command/code for performing the test cases.
        5. In driver package installed the Web driver where performing all test cases such like Chrome driver, edge driver, firefox driver.
        6. In property package create "config.properties" file for Data-provider for performing or getting the test data such like. firstName, lastName, Mobile, emailId, title, company.
        7. In PageClasses package strored all the page element data on it.
        8. In TestClass package store all the test cases data which on wanted to perform for automation testing.

7. PagesClasses :
        1. HomePage   
        2. LoginPage  
        3. NavigatePage
        4. RegisterPage
        5. ScrollingPage
        6. SeduleMethodPage

8. TestClasses :
        i. NavigateTest
       ii. RegisterTest
      iii. ScrollingTest
       iv. sedualeTest
        v. SignUpTest  

