import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.baseUrl)

def testData = 'Data Files/dataProperti/dataProperti'

for (def rowNumber = 1; rowNumber <= findTestData(testData).getRowNumbers(); rowNumber++) {
    String penghasilan = findTestData(testData).getValue(1, rowNumber)

    String pengeluaran = findTestData(testData).getValue(2, rowNumber)

    String jangkaWaktu = findTestData(testData).getValue(3, rowNumber)

    switch (penghasilan) {
        case penghasilan = '300000':
            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/penghasilanTotal_Field'), penghasilan)

            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/pengeluaran_Field'), pengeluaran)

            WebUI.selectOptionByValue(findTestObject('Object Repository/hitungHargaProperti/jangkaWaktu_Dropdown'), jangkaWaktu, 
                false)

            break
        case penghasilan = '290000':
            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/penghasilanTotal_Field'), penghasilan)

            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/pengeluaran_Field'), pengeluaran)

            WebUI.selectOptionByValue(findTestObject('Object Repository/hitungHargaProperti/jangkaWaktu_Dropdown'), jangkaWaktu, 
                false)

            break
        case penghasilan = '280000':
            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/penghasilanTotal_Field'), penghasilan)

            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/pengeluaran_Field'), pengeluaran)

            WebUI.selectOptionByValue(findTestObject('Object Repository/hitungHargaProperti/jangkaWaktu_Dropdown'), jangkaWaktu, 
                false)

            break
        case penghasilan = '270000':
            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/penghasilanTotal_Field'), penghasilan)

            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/pengeluaran_Field'), pengeluaran)

            WebUI.selectOptionByValue(findTestObject('Object Repository/hitungHargaProperti/jangkaWaktu_Dropdown'), jangkaWaktu, 
                false)

            break
        case penghasilan = '260000':
            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/penghasilanTotal_Field'), penghasilan)

            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/pengeluaran_Field'), pengeluaran)

            WebUI.selectOptionByValue(findTestObject('Object Repository/hitungHargaProperti/jangkaWaktu_Dropdown'), jangkaWaktu, 
                false)

            break
        case penghasilan = '250000':
            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/penghasilanTotal_Field'), penghasilan)

            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/pengeluaran_Field'), pengeluaran)

            WebUI.selectOptionByValue(findTestObject('Object Repository/hitungHargaProperti/jangkaWaktu_Dropdown'), jangkaWaktu, 
                false)

            break
        case penghasilan = '240000':
            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/penghasilanTotal_Field'), penghasilan)

            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/pengeluaran_Field'), pengeluaran)

            WebUI.selectOptionByValue(findTestObject('Object Repository/hitungHargaProperti/jangkaWaktu_Dropdown'), jangkaWaktu, 
                false)

            break
        case penghasilan = '230000':
            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/penghasilanTotal_Field'), penghasilan)

            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/pengeluaran_Field'), pengeluaran)

            WebUI.selectOptionByValue(findTestObject('Object Repository/hitungHargaProperti/jangkaWaktu_Dropdown'), jangkaWaktu, 
                false)

            break
        case penghasilan = '220000':
            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/penghasilanTotal_Field'), penghasilan)

            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/pengeluaran_Field'), pengeluaran)

            WebUI.selectOptionByValue(findTestObject('Object Repository/hitungHargaProperti/jangkaWaktu_Dropdown'), jangkaWaktu, 
                false)

            break
        case penghasilan = '210000':
            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/penghasilanTotal_Field'), penghasilan)

            WebUI.setText(findTestObject('Object Repository/hitungHargaProperti/pengeluaran_Field'), pengeluaran)

            WebUI.selectOptionByValue(findTestObject('Object Repository/hitungHargaProperti/jangkaWaktu_Dropdown'), jangkaWaktu, 
                false)

            break
    }
    
    hasilnya = ((penghasilan.toInteger() - pengeluaran.toInteger()) * ((jangkaWaktu.toInteger() * 12) / 3))

    WebUI.click(findTestObject('Object Repository/hitungHargaProperti/hitung_Btn'))

    hargaPropertiMaksimal = WebUI.getText(findTestObject('Object Repository/hitungHargaProperti/hasil_txt')).replaceAll(
        '\\.', '')

    final_hargaProperti = hargaPropertiMaksimal.substring(3)

    WebUI.verifyEqual(hasilnya, final_hargaProperti)
	
	println(hasilnya)
	println(final_hargaProperti)
}

WebUI.closeBrowser()