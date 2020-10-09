package master.testData;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class MaterialCategoryData extends ExcelDataConfig {


   private static final Logger LOGGER = Logger.getLogger(MaterialCategoryData.class);

    public MaterialCategoryData() {
        super("src\\test\\resources\\ExcelSheet\\TokyooMaster.xlsx");
    }
    @DataProvider(name = "Materialcategorydataprovider")
    public Object[][] Materialcategorydataprovider() {

        int rows = getRowCount("Material_NV.Material_Categogory");
        int col = getColumnCount("Material_NV.Material_Categogory");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Material_NV.Material_Categogory", i, j);
            }
        }
        return data;
    }
}
