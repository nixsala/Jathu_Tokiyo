package config.testData;


import master.testData.CustomerData;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class TestData extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(CustomerData.class);

    public TestData() {
        super("src\\test\\resources\\ExcelSheet\\TokyooConfig.xlsx");
    }
    @DataProvider(name = "TestDataprovider")
    public Object[][]TestDataprovider() {

        int rows = getRowCount("Test");
        int col = getColumnCount("Test");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Test", i, j);
            }
        }
        return data;
    }
}
