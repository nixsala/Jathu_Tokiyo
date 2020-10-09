package com.test.qa.Full_Code;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

public class Sample_Full extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"Smoke"}, priority = 41)
    public void I_ViewMoreTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[1]"),"Incoming Sample page is not displayed"); // Incoming sample page displyed verification
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/i"); //click more
        PageBase.staticWait(3);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div[7]/div/div/div/div[2]/div/div[1]"),"More is not displayed"); // verification for more button
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 42)
    public void I_TestandResult() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");                //IncommingSampleBtn
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@class=\"anticon anticon-experiment\"]"); //click test result
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]"); // click ok
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 43)
    public void I_SummaryReport() {
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        PageBase.staticWait(02);
        MethodBase.click_ById("Report_BT-CA-INC-0001"); // click Summary report
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]");//click ok button
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 44)
    public void I_ProcessSampleTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        PageBase.staticWait(02);
        MethodBase.click_ById("proccess_CL-AM-INC-0001"); // click process sample
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"processSample_quantity\"]","jhqqlkjkh"); //Quantity
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"unit_id\"]/div/div"); // click unit
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]");// save
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

//    @Test(groups = {"Smoke"}, priority = 45)
//    public void I_DeliveryReportTest() throws Exception {
//        softAssert = new SoftAssert();
//        PageBase.staticWait(03);
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
//        PageBase.staticWait(03);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[4]/td[10]/span/i"); // click delivery report
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@class=\"ant-btn ant-btn-primary\"]"); // click ok
//        PageBase.staticWait(07);
//        softAssert.assertAll();
//    }

    @Test(groups = {"Smoke"}, priority = 46)
    public void I_EditTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        PageBase.staticWait(02);
        MethodBase.click_ById("edit_BL-FA-INC-0003"); //edit button
        MethodBase.click_ByXpath("//*[@id=\"supplierCategory\"]/div");   //SuplierCatageryDrop
        MethodBase.hitEnter();
        PageBase.staticWait(02);;
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div"); // plant
        MethodBase.hitEnter();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"supplierName\"]/div/div"); // click Supplier
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"rawMaterialId\"]/div");      //RawmaterialDrop
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"vehicleNo\"]", "21450"); //VehicleNoTxt
        PageBase.staticWait(03);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]"); //savebt
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 47)
    public void I_DeleteTest( ) throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        PageBase.staticWait(02);
        MethodBase.click_ById("delete_TR-FA-INC-0002"); //delete button
        Thread.sleep(1000);
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div/div/div[2]/div/div/div[2]/button[2]"); // click ok button
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 48)
    public void I_AddIncommingSampleTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]"); //AddPIncommingSampleBt
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"supplierCategory\"]/div/div");   //SuplierCatageryDrop
        MethodBase.hitEnter();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");              //PlantDrop
        MethodBase.hitEnter();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"supplierName\"]/div/div"); // click Supplier
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"rawMaterialId\"]/div");      //RawmaterialDrop
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"vehicleNo\"]", "6655"); //VehicleNoTxt
        PageBase.staticWait(03);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]"); //savebt
        PageBase.staticWait(02);
        // MethodBase.assertEqual_Text_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]", "abi"); //supplier soft assert
        //       MethodBase.assertEqual_Text_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]","Badulla"); //plant soft assert
        //     PageBase.staticWait(02);
//        MethodBase.assertEqual_Text_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]", "Manufactured sand");
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[6]/i"); //click more
//      //  MethodBase.assertEqual_Text_ByXpath("//*[@class=\"ant-col ant-col-8\"]", "Vehicle No");
        PageBase.staticWait(02);
        softAssert.assertAll();

    }

    @Test(groups = {"Smoke"}, priority = 49)
    public void I_ValidationTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");                //IncommingSampleBtn
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]"); //AddPIncommingSampleBt
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]"); //savebt
        PageBase.staticWait(02);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Plant Name can't be empty\"]", "Plant Name can't be empty"); // plant validation
        PageBase.staticWait(5);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Supplier name can't be empty\"]", "Supplier name can't be empty"); // supplier validation
        PageBase.staticWait(5);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Material Name can't be empty\"]", "Material Name can't be empty"); // Raw material validation
        PageBase.staticWait(5);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 50)
    public void AddIncomingCancelTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");  //Incoming sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]"); //AddPIncommingSampleBt
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[1]"); //cancel button
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 51)
    public void AddIncomingCloseTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]"); //AddPIncommingSampleBt
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"rcDialogTitle0\"]/div/i"); //close button
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 52)
    public void I_SearchTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/thead/tr/th[3]/span[2]"); // click plant search
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("/html/body/div[4]/div/div/div/div/input", "Jaffna"); // enter search value
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/div/div/button[1]");
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"},priority = 53)
    public void P_EditTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samlemenu
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");     //ProcessingSampleBtn
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@class=\"anticon anticon-edit\"]");// click edit button
        MethodBase.setText_ByXpath("//*[@id=\"processSample_quantity\"]","55"); // edit
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]"); // click submit button
        PageBase.staticWait(02);
        softAssert.assertAll();

    }

    @Test(groups = {"Smoke"},priority = 54)
    public void P_EditReturnTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samlemenu
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");     //ProcessingSampleBtn
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@class=\"anticon anticon-edit\"]");// click edit button
        MethodBase.click_ByXpath("//*[@class=\"ant-btn\"]"); // click cancel button
        PageBase.staticWait(02);
        softAssert.assertAll();

    }

    @Test(groups = {"Smoke"},priority = 55)
    public void P_SearchTest(){
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samlemenu
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");     //ProcessingSampleBtn
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/thead/tr/th[2]/span[2]"); // click incoming sample search
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("/html/body/div[4]/div/div/div/div/input", "Optima-100"); // enter search value
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/div/div/button[1]"); // click search button
        PageBase.staticWait(02);
        softAssert.assertAll();
    }
    @Test(groups = {"Smoke"},priority = 56)
    public void TestResultTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div"); // Click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"); // Click Finish Product Sample
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"), "Finish Product Sample is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@class=\"anticon anticon-experiment\"]"); //click test more
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"},priority = 57)
    public void TestResultCancelTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div"); // Click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"); // Click Finish Product Sample
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"), "Finish Product Sample is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@class=\"anticon anticon-experiment\"]"); // click test result
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@class=\"ant-btn\"]"); // click cancel
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"},priority = 58)
    public void TestResultOkTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div"); // Click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"); // Click Finish Product Sample
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"), "Finish Product Sample is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@class=\"anticon anticon-experiment\"]"); // click test result
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@class=\"ant-btn ant-btn-default\"]"); // click ok
        softAssert.assertAll();
    }


    @Test(groups = {"Smoke"},priority = 59)
    public void DetailTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div"); // Click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"); // Click Finish Product Sample
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"), "Finish Product Sample is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/i"); //click details
        PageBase.staticWait(02);
        softAssert.assertAll();
    }
    @Test(groups = {"Smoke"}, priority = 60)
    public void SearchTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"); // Click Finish Product Sample
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"), "Finish Product Sample is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/thead/tr/th[4]/span[2]"); // click plant search
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("/html/body/div[6]/div/div/div/div/input", "Peliyagoda"); // enter search value
        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@class=\"ant-btn ant-btn-primary ant-btn-sm\"]");
//        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 61)
    public void DeleteTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"); // Click Finish Product Sample
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"), "Finish Product Sample is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[8]/span/a[1]/a/i"); // click Delete button
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div/div/div[2]/div/div/div[2]/button[2]"); // click ok
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"},priority = 62)
    public void AddFinishProductDelivery()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");// click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]");// click Finish product delivery
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]"), "Finish Product Sample Issue is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div/button"); // click Add finish product
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"rawMaterialId\"]/div/div/div"); // click Raw material
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div/div/ul/li[2]"); // select Raw material
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"mixDesignCode\"]/div/div");// click mix design
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[12]/div/div/div/ul/li"); // select mix design
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"customer\"]"); // click customer
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[13]/div/div/div/ul/li[2]");// select customer
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"projectId\"]/div/div"); // click project
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[14]/div/div/div/ul/li"); // select project
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"pourId\"]/div/div"); // click pour code
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[15]/div/div/div/ul/li[3]"); // select pour code
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"workOrderNo\"]","4545"); // work order number
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"vehicleNo\"]","GG442"); // vehicle number
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[3]/button[2]"); // Save button
        PageBase.staticWait(03);
        softAssert.assertAll();

    }

    @Test(groups = {"Smoke"},priority = 63)
    public void EditTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");// click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]");// click Finish product delivery
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]"), "Finish Product Sample Issue is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[8]/span/a[1]/i"); // edit button
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"rawMaterialId\"]/div/div/div"); // click Raw material
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div/div/ul/li[2]"); // select Raw material
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"mixDesignCode\"]/div/div");// click mix design
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[12]/div/div/div/ul/li"); // select mix design
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"customer\"]"); // click customer
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[13]/div/div/div/ul/li[2]");// select customer
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"projectId\"]/div/div"); // click project
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[14]/div/div/div/ul/li"); // select project
        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"pourId\"]/div/div"); // click pour code
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("/html/body/div[15]/div/div/div/ul/li[3]"); // select pour code
//        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"workOrderNo\"]","55"); // work order number
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"vehicleNo\"]","mn55"); // vehicle number
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[3]/button[2]"); // Save button
        PageBase.staticWait(03);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"},priority = 64)
    public void F_DeleteTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");// click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]");// click Finish product delivery
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]"), "Finish Product Sample Issue is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[8]/span/a[2]/a/i"); // delete button
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[10]/div/div/div/div[2]/div/div/div[2]/button[2]"); // click ok
        PageBase.staticWait(02);
        softAssert.assertAll();

    }
}
