package master.testData;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class MaterialStateData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(MaterialStateData.class);

    public MaterialStateData() {
        super("src\\test\\resources\\ExcelSheet\\TokyooMaster.xlsx");
    }
    @DataProvider(name = "Materialstatedataprovider")
    public Object[][] Materialstatedataprovider() {

        int rows = getRowCount("Material_NV.Material_State");
        int col = getColumnCount("Material_NV.Material_State");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Material_NV.Material_State", i, j);
            }
        }
        return data;
    }
}
