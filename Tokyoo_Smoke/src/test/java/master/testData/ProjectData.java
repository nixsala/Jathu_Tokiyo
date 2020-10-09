package master.testData;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class ProjectData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(ProjectData.class);

    public ProjectData() {
        super("src\\test\\resources\\ExcelSheet\\TokyooMaster.xlsx");
    }
    @DataProvider(name = "ProjectDataprovider")
    public Object[][] ProjectDataprovider() {

        int rows = getRowCount("Customer_NV.Project");
        int col = getColumnCount("Customer_NV.Project");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Customer_NV.Project", i, j);
            }
        }
        return data;
    }
}
