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
WebUI.waitForElementPresent(findTestObject('Modal_login_email_username'), 30)
WebUI.waitForElementVisible(findTestObject('Modal_login_email_username'), 30)
WebUI.waitForElementClickable(findTestObject('Modal_login_email_username'), 30)
WebUI.setText(findTestObject('Modal_login_email_username'), 'george.m@weblicity.com')

// Fill password field.
WebUI.waitForElementPresent(findTestObject('Modal_login_passwordfield'), 30)
WebUI.waitForElementClickable(findTestObject('Modal_login_passwordfield'), 30)
WebUI.setText(findTestObject('Modal_login_passwordfield'), '123456aA!')

// Click on the form login button.
WebUI.waitForElementPresent(findTestObject('Modal_login_form_submit'), 30)
WebUI.waitForElementClickable(findTestObject('Modal_login_form_submit'), 30)
WebUI.click(findTestObject('Modal_login_form_submit'))

// Mouseover the offer dropdown.
WebUI.waitForElementPresent(findTestObject('Main_Menu_Offer_Dropdown'), 30)
WebUI.waitForElementClickable(findTestObject('Main_Menu_Offer_Dropdown'), 30)
WebUI.mouseOver(findTestObject('Main_Menu_Offer_Dropdown'))

// Click create offer
WebUI.waitForElementPresent(findTestObject('Main_Menu_Offer_Dropdown_Create_Offer'), 30)
WebUI.waitForElementVisible(findTestObject('Main_Menu_Offer_Dropdown_Create_Offer'), 30)
WebUI.waitForElementClickable(findTestObject('Main_Menu_Offer_Dropdown_Create_Offer'), 30)
WebUI.click(findTestObject('Main_Menu_Offer_Dropdown_Create_Offer'))

// plugin value
WebUI.waitForElementPresent(findTestObject('Create_Offer_Step_1/City_Dropdown'), 30)
WebUI.waitForElementClickable(findTestObject('Create_Offer_Step_1/City_Dropdown'), 30)
WebUI.setText(findTestObject('Create_Offer_Step_1/City_Dropdown'),'Hintertupfingen')

//WebUI.waitForElementPresent(findTestObject('Create_Offer_Step_1/City_Dropdown_Suggestion'), 30)
//WebUI.waitForElementClickable(findTestObject('Create_Offer_Step_1/City_Dropdown_Suggestion'), 30)
WebUI.click(findTestObject('Create_Offer_Step_1/City_Dropdown_Suggestion'))

WebUI.waitForElementPresent(findTestObject('Create_Offer_Step_1/Category_Dropdown'), 30)
WebUI.waitForElementClickable(findTestObject('Create_Offer_Step_1/Category_Dropdown'), 30)
WebUI.selectOptionByLabel(findTestObject('Create_Offer_Step_1/Category_Dropdown'),'Flatshares', true)

WebUI.waitForElementPresent(findTestObject('Create_Offer_Step_1/Rent_Type_Dropdown'), 30)
WebUI.waitForElementClickable(findTestObject('Create_Offer_Step_1/Rent_Type_Dropdown'), 30)
WebUI.selectOptionByLabel(findTestObject('Create_Offer_Step_1/Rent_Type_Dropdown'),'Long Term', true)


WebUI.delay(10)
