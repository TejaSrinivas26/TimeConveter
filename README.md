In this exercise, you will be automating the process of testing the Time Converter Application.

### Prerequisites

- Install IntelliJ IDEA Community IDE  Version 2018.3.6.
- Install OpenJDK 11 and complete the configuration.
- Install a Browser Driver(Chrome Driver).
- Setup a Selenium project with the name `TimeConverterTest`.

You can refer to this [Reading Material](https://learning.ccbp.in/qa-automation-testing/course?c_id=cf952b35-27ab-4b1e-a6de-44227f22806c&s_id=f5c19277-3889-4e63-b631-c06c088d612c&t_id=6a935df7-2c93-477c-b505-3ae0aabcf9a2#31-installing-ide) to complete the above prerequisites.

### Steps to Automate

- Create a driver instance using WebDriver interface.
- Navigate to the url `https://qatimeconverter.ccbp.tech/`
- Perform the below tests

    <details open>
    <summary>Test the conversion of hours and minutes to seconds</summary>
    > - Find the first input field - _use position() method_.
    >     
    >     - enter the text `2` in the input field.
    > - Find the second input field - _use position() method_.
    >     
    >     - enter the text `30` in the input field.
    > - Click the "Convert to Seconds" button whose id attribute value contains `convert`- _use contains() method_.
    > - Find the `<p>` element whose class attribute value starts with `converted`- _use starts-with() method_.
    > 
    >     - get the text content from the `<p>` element.
    > - Verify whether the text matches the below text.
    > 
    >     - text: `9000s`
    >     - if text matches the expected text, print "Conversion Successful".
    >     - else, print "Conversion Failed".
    </details>
    <details>
    <summary>Test the error case at hours</summary>
    > - Clear the text in both the input fields.
    > - Click the "Convert to Seconds" button.
    > - Find the `<p>` element whose class attribute value starts with `error` - _use starts-with() method_.
    > 
    >     - get the text content from the `<p>` element.
    > - Verify whether the text matches the below text.
    > 
    >     - text: `Please enter a valid number of hours.`
    >     - if text matches the expected text, print "Expected Error Message Shown".
    >     - else, print "Unexpected Error Message Shown".
    </details>
    <details>
    <summary>Test the error case at minutes</summary>
    > - Enter the text `1` in the first input field.
    > - Click the "Convert to Seconds" button.
    > - Get the text content from the error message(`<p>` element) 
    >     - verify whether the text matches the below text.
    >         - text: `Please enter a valid number of minutes.`
    >         - if text matches the expected text, print "Expected Error Message Shown".
    >         - else, print "Unexpected Error Message Shown".
    </details>
    <details>
    <summary>Test the conversion of hours and minutes to seconds</summary>
    > - Enter the text `15` in the second input field.
    > - Click the "Convert to Seconds" button.
    > - Get the text content from the time converted(`<p>` element) 
    >     - verify whether the text matches the below text.
    >         - text: `4500s`
    >         - if text matches the expected text, print "Conversion Successful".
    >         - else, print "Conversion Failed".
    </details>

- Close the browser window.

<br>
<br>

**Note: Set up the project and practice this exercise in your local IDE(IntelliJ).**