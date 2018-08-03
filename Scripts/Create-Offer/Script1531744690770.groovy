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


// Click on the login button.
WebUI.waitForElementPresent(findTestObject('Login-Button'), 30)
WebUI.click(findTestObject('Login-Button'))

// Fill username field.
WebUI.waitForElementPresent(findTestObject('Modal-Login-Email-Username'), 30)
WebUI.waitForElementVisible(findTestObject('Modal-Login-Email-Username'), 30)
WebUI.waitForElementClickable(findTestObject('Modal-Login-Email-Username'), 30)
WebUI.setText(findTestObject('Modal-Login-Email-Username'), 'george.m@weblicity.com')

// Fill password field.
WebUI.waitForElementPresent(findTestObject('Modal-Login-Passwordfield'), 30)
WebUI.waitForElementClickable(findTestObject('Modal-Login-Passwordfield'), 30)
WebUI.setText(findTestObject('Modal-Login-Passwordfield'), '123456aA!')

// Click on the form login button.
WebUI.waitForElementPresent(findTestObject('Modal-Login-Form-Submit'), 30)
WebUI.waitForElementClickable(findTestObject('Modal-Login-Form-Submit'), 30)
WebUI.click(findTestObject('Modal-Login-Form-Submit'))

// Mouseover the offer dropdown.
WebUI.waitForElementPresent(findTestObject('Main-Menu-Offer-Dropdown'), 30)
WebUI.waitForElementClickable(findTestObject('Main-Menu-Offer-Dropdown'), 30)
WebUI.mouseOver(findTestObject('Main-Menu-Offer-Dropdown'))

// Click create offer.
WebUI.waitForElementPresent(findTestObject('Main-Menu-Offer-Dropdown-Create-Offer'), 30)
WebUI.waitForElementVisible(findTestObject('Main-Menu-Offer-Dropdown-Create-Offer'), 30)
WebUI.waitForElementClickable(findTestObject('Main-Menu-Offer-Dropdown-Create-Offer'), 30)
WebUI.click(findTestObject('Main-Menu-Offer-Dropdown-Create-Offer'))

// Select city from plugin dropdown.
WebUI.waitForElementPresent(findTestObject('Create_Offer_Step_1/City-Dropdown'), 30)
WebUI.waitForElementClickable(findTestObject('Create_Offer_Step_1/City-Dropdown'), 30)
WebUI.setText(findTestObject('Create_Offer_Step_1/City-Dropdown'),'Hintertupfingen')
WebUI.waitForElementPresent(findTestObject('Create_Offer_Step_1/City-Dropdown-Suggestion'), 30)
WebUI.waitForElementClickable(findTestObject('Create_Offer_Step_1/City-Dropdown-Suggestion'), 30)
WebUI.click(findTestObject('Create_Offer_Step_1/City-Dropdown-Suggestion'))

// Select category from dropdown.
WebUI.waitForElementPresent(findTestObject('Create_Offer_Step_1/Category-Dropdown'), 30)
WebUI.waitForElementClickable(findTestObject('Create_Offer_Step_1/Category-Dropdown'), 30)
WebUI.selectOptionByLabel(findTestObject('Create_Offer_Step_1/Category-Dropdown'), /.*Flatshares.*/, true)

// Select Rent type from dropdown.
WebUI.waitForElementPresent(findTestObject('Create_Offer_Step_1/Rent-Type-Dropdown'), 30)
WebUI.waitForElementClickable(findTestObject('Create_Offer_Step_1/Rent-Type-Dropdown'), 30)
WebUI.selectOptionByLabel(findTestObject('Create_Offer_Step_1/Rent-Type-Dropdown'), /.*Long Term.*/, true)

// Submit the first form
WebUI.waitForElementPresent(findTestObject('Create_Offer_Step_1/Form-Submit'), 30)
WebUI.waitForElementVisible(findTestObject('Create_Offer_Step_1/Form-Submit'), 30)
WebUI.waitForElementClickable(findTestObject('Create_Offer_Step_1/Form-Submit'), 30)
WebUI.click(findTestObject('Create_Offer_Step_1/Form-Submit'))


WebUI.delay(10)
