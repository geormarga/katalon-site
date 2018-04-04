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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.wg-gesucht.de/en/#')

WebUI.waitForElementPresent(findTestObject('Login-Button'), 10)

WebUI.click(findTestObject('Login-Button'))

WebUI.waitForElementClickable(findTestObject('Page_Your flat share apartment hous/input_login_email_username'), 10)

WebUI.setText(findTestObject('Page_Your flat share apartment hous/input_login_email_username'), 'george.m@weblicity.com')

WebUI.waitForElementPresent(findTestObject('Page_Your flat share apartment hous/input_login_password'), 10)

WebUI.setText(findTestObject('Page_Your flat share apartment hous/input_login_password'), '123456aA!')

WebUI.waitForElementPresent(findTestObject('Login-Button'), 10)

WebUI.click(findTestObject('Login-Button'))


WebUI.click(findTestObject('Page_Your flat share apartment hous/input_login_form_auto_login'))

WebUI.click(findTestObject('Page_Your flat share apartment hous/input_btn btn-info btn-block'))

WebUI.click(findTestObject('Page_Your flat share apartment hous/a_Test User'))

WebUI.click(findTestObject('Page_WG-Gesucht.de/a_To My Favourites and Contact'))

WebUI.click(findTestObject('Page_My Favourites on WG-Gesucht.de/div_16m'))

WebUI.click(findTestObject('Page_My Favourites on WG-Gesucht.de/div_16m'))

WebUI.click(findTestObject('Page_My Favourites on WG-Gesucht.de/img_vis img-responsive center-'))

WebUI.setText(findTestObject('Page_WG-Zimmer nahe der FU - WGZimm/textarea_form-control  note_te'), 'This is a generated note! random generated text')

WebUI.click(findTestObject('Page_WG-Zimmer nahe der FU - WGZimm/div_Save'))

WebUI.closeBrowser()

