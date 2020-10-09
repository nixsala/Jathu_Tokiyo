package master.testData;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class PlantEquipmentData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(PlantEquipmentData.class);

    public PlantEquipmentData() {
        super("src\\test\\resources\\ExcelSheet\\TokyooMaster.xlsx");
    }

    @DataProvider(name = "plantequipmentdata")
    public Object[][] plantequipmentdataprovider() {

        int rows = getRowCount("Equipmet_NV.Plant_Equipment");
        int col = getColumnCount("Equipmet_NV.Plant_Equipment");


        LOGGER.info("row = " + rows + " columns = " + col);
        System.out.println("row = " + rows + " columns = " + col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Equipmet_NV.Plant_Equipment", i, j);
            }
        }
        return data;
    }

}
