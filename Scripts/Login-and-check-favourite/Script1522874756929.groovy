import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Click on the login button.
WebUI.waitForElementPresent(findTestObject('Login-Button'), 10)
WebUI.click(findTestObject('Login-Button'))

// Fill username field.
WebUI.waitForElementPresent(findTestObject('Modal-Login-Email-Username'), 10)
WebUI.waitForElementVisible(findTestObject('Modal-Login-Email-Username'), 10)
WebUI.waitForElementClickable(findTestObject('Modal-Login-Email-Username'), 10)
WebUI.setText(findTestObject('Modal-Login-Email-Username'), 'george.m@weblicity.com')

// Fill password field.
WebUI.waitForElementPresent(findTestObject('Modal-Login-Passwordfield'), 10)
WebUI.waitForElementClickable(findTestObject('Modal-Login-Passwordfield'), 10)
WebUI.setText(findTestObject('Modal-Login-Passwordfield'), '123456aA!')

// Click on the form login button.
WebUI.waitForElementPresent(findTestObject('Modal-Login-Form-Submit'), 10)
WebUI.waitForElementClickable(findTestObject('Modal-Login-Form-Submit'), 10)
WebUI.click(findTestObject('Modal-Login-Form-Submit'))

// Mouseover action over the username.
WebUI.waitForElementPresent(findTestObject('Test-User-Dropdown-href'), 10)
WebUI.waitForElementVisible(findTestObject('Test-User-Dropdown-href'), 10)
WebUI.mouseOver(findTestObject('Test-User-Dropdown-href'))

// Click at the favourites list item in the user's dropdown menu.
WebUI.waitForElementPresent(findTestObject('Favourites-List-Item'), 10)
WebUI.waitForElementVisible(findTestObject('Favourites-List-Item'), 10)
WebUI.waitForElementClickable(findTestObject('Favourites-List-Item'), 10)
WebUI.click(findTestObject('Favourites-List-Item'))

// Click at the first favourite in your favourite list.
WebUI.waitForElementPresent(findTestObject('Favourite'), 10)
WebUI.waitForElementClickable(findTestObject('Favourite'), 10)
WebUI.click(findTestObject('Favourite'))

// Set some text in the note form's textarea.
WebUI.waitForElementPresent(findTestObject('Note-Textarea'), 10)
WebUI.waitForElementClickable(findTestObject('Note-Textarea'), 10)
String date = CustomKeywords.'custom.CustomDate.getDate'()
WebUI.setText(findTestObject('Note-Textarea'), 'This is an auto generated text message. ' + date)

// Click the save note button of the note form.
WebUI.waitForElementPresent(findTestObject('Note-Save-Button'), 10)
WebUI.waitForElementClickable(findTestObject('Note-Save-Button'), 10)
WebUI.click(findTestObject('Note-Save-Button'))

WebUI.closeBrowser()

