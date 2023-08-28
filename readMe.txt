Please find below the instructions on how to run the code without having any type of issues.

1. Before you proceed to run the program, please make sure that you have Maven installed on your local machine.
Additionally, ensure that you have the Cucumber plugin for Java set up, as it's required for the
program's functionality. This combination of Maven and the Cucumber plugin will help ensure a smooth execution of
your program.

2. If you're using a Mac operating system, you can leave the existing chromedriver file as it is. However, if you're
on a Windows operating system, you need to have chromedriver downloaded for Windows OS.
Please remember to add '.exe' at the end of the chromedriver file name. This distinction ensures compatibility with
the respective operating systems and ensures smooth execution of your program. I have stored it under
src/test/java/Utilities/DriverFactory java class.

3. I use "webdrivermanager" dependency for Driver Instantiation. "webdrivermanager" is likely encountering issues because
there might be compatibility problems between ChromeDriver versions 116 and 114 and the Selenium framework. Selenium
requires specific versions of ChromeDriver to work properly, and using an incompatible version could lead to errors or
failures during execution. It's crucial to ensure the correct pairing of Chrome Browser and ChromeDriver versions for smooth
execution.

4. Under the "resources" package there is 'ui-config.properties' file, you will find the keys for various variables
such as username, password, URL, and other configuration data. These data are intentionally left blank for now.
Feel free to populate them with the appropriate information that has been provided in the email.