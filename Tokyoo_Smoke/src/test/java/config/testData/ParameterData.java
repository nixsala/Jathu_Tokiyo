package config.testData;

import master.testData.CustomerData;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class ParameterData extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(CustomerData.class);

    public ParameterData() {
        super("src\\test\\resources\\ExcelSheet\\TokyooConfig.xlsx");
    }
    @DataProvider(name = "ParameterDataprovider")
    public Object[][] ParameterDataprovider() {

        int rows = getRowCount("Parameter");
        int col = getColumnCount("Parameter");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Parameter", i, j);
            }
        }
        return data;
    }
}
