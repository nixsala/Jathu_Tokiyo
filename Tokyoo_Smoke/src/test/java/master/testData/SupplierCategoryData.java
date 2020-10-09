package master.testData;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class SupplierCategoryData extends ExcelDataConfig {


   private static final Logger LOGGER = Logger.getLogger(SupplierCategoryData.class);

    public SupplierCategoryData() {
        super("src\\test\\resources\\ExcelSheet\\TokyooMaster.xlsx");
    }
    @DataProvider(name = "SupplierCategoryDatatprovider")
    public Object[][] SupplierCategoryDatatprovider() {

        int rows = getRowCount("Supplier_NV.SupplierCategory");
        int col = getColumnCount("Supplier_NV.SupplierCategory");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Supplier_NV.SupplierCategory", i, j);
            }
        }
        return data;
    }
}
