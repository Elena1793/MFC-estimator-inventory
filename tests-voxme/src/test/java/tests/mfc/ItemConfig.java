package tests.mfc;


import org.testng.annotations.Test;
import configuration.MFC_testConfig;

/**
 * Created by Lena on 21.11.2019.
 */
public class ItemConfig implements MFC_testConfig {

    @Test(priority = 1)
    public void createItem (){
        appMFC.getMainMenu_Metods().ManagementScreen_Open();
        appMFC.getManagementMenu_Metods().ItemsScreen_Open();
        appMFC.getItemsConfig_Methods().clickOnAddNewItem_button();
        appMFC.getItemsConfig_Methods().enterItem("Item15");
        appMFC.getItemsConfig_Methods().selectItemCategory("Others");
        appMFC.getItemsConfig_Methods().enterVolumeItem(5);
        appMFC.getItemsConfig_Methods().enterWeightItem(6);
        appMFC.getItemsConfig_Methods().chooseRoom("Hallway");
        appMFC.getItemsConfig_Methods().setAplicationField("Both");
        appMFC.getItemsConfig_Methods().setUseForField("Both");
        appMFC.getItemsConfig_Methods().clickOnSaveAddedItem_button();


    }
    @Test(priority = 2)
    public void addAssociatedMaterialsForItem(){
        appMFC.getItemsConfig_Methods().chooseItem_inItemsGrid("Item15");
        appMFC.getItemsConfig_Methods().clickOnAddAssociatedMaterials_button();
        appMFC.getItemsConfig_Methods().selectMaterialFrom_MaterialsDropdown_InAssociatedMaterialsGrid("test");
        appMFC.getItemsConfig_Methods().enterQuantityForAssociatedMaterial(2);
        appMFC.getItemsConfig_Methods().saveAddedAssociatedMaterial_button();
    }
}
