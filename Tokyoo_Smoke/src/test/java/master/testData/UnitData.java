package master.testData;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

/**
 * @Author Nixsala
 */

public class UnitData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(UnitData.class);// to print logger

    public UnitData() {
        super("src\\test\\resources\\ExcelSheet\\TokyooMaster.xlsx");
    }//excel source
    @DataProvider (name = "unitDetail")
    public Object[][] unitDetail() {

        // To get rows and Coloumns
        int rows = getRowCount("Materail_NV.Unit");
        int col = getColumnCount("Materail_NV.Unit");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Materail_NV.Unit", i, j);
            }
        }
        return data;
    }

}
