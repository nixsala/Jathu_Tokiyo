package master.testData;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class EmployeeData extends ExcelDataConfig {


   private static final Logger LOGGER = Logger.getLogger(EmployeeData.class);

    public EmployeeData() {
        super("src\\test\\resources\\ExcelSheet\\TokyooMaster.xlsx");
    }
    @DataProvider(name = "EmployeeDataprovider")
    public Object[][] EmployeeDataprovider() {

        int rows = getRowCount("Employee_NV.Employee");
        int col = getColumnCount("Employee_NV.Employee");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Employee_NV.Employee", i, j);
            }
        }
        return data;
    }
}
