package master.testData;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class EquipmentData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(EquipmentData.class);

    public EquipmentData() {
        super("src\\test\\resources\\ExcelSheet\\TokyooMaster.xlsx");
    }
    @DataProvider (name = "equipmentdataprovider")
    public Object[][] equipmentdataprovider() {

        int rows = getRowCount("Equipment_NV.Equipment");
        int col = getColumnCount("Equipment_NV.Equipment");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Equipment_NV.Equipment", i, j);
            }
        }
        return data;
    }

    @DataProvider (name = "plantequipmentdataprovider")
    public Object[][] equipmentdataproviderr() {

        int rows = getRowCount("Sheet3");
        int col = getColumnCount("Sheet3");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Sheet3", i, j);
            }
        }
        return data;
    }

}
