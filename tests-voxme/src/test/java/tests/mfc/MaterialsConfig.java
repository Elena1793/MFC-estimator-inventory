package tests.mfc;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import configuration.DataProviders;
import configuration.MFC_testConfig;

/**
 * Created by Lena on 20.11.2019.
 */
public class MaterialsConfig implements MFC_testConfig {

    @Test(priority=1,dataProviderClass = DataProviders.class,dataProvider = "createMaterialsConfig")
    public void createMateria_PackType(By locatorlanguage, String FirstName,
                                       DataProviders.Materials materialsPackType,
                                       DataProviders.Materials materialsPackType1,DataProviders.Materials materialsCrate,
                                       DataProviders.Materials materialsCrate1, DataProviders.Materials associatedMaterials) {
        appMFC.getMainMenu_Metods().ManagementScreen_Open();
        appMFC.getManagementMenu_Metods().MaterialsScreen_Open();
        appMFC.getMaterialsConfig_Methods().clickOnAddMaterials_button();
        appMFC.getMaterialsConfig_Methods().enterMaterialsType(materialsPackType.getMaterialType());
        appMFC.getMaterialsConfig_Methods().enterCostMaterials(materialsPackType.getCoast());
        appMFC.getMaterialsConfig_Methods().enterWidthMaterials(materialsPackType.getWidth());
        appMFC.getMaterialsConfig_Methods().enterLengthMaterials(materialsPackType.getLength());
        appMFC.getMaterialsConfig_Methods().enterHeightMaterials(materialsPackType.getHeight());
        appMFC.getMaterialsConfig_Methods().enterVolumeMaterials(materialsPackType.getVolume());
        appMFC.getMaterialsConfig_Methods().trueIsPackingType_checkbox();
        appMFC.getMaterialsConfig_Methods().saveCreatedMaterials();

    }
    @Test(priority=2,dataProviderClass = DataProviders.class,dataProvider = "createMaterialsConfig")
    public void createMaterials_Crate(By locatorlanguage, String FirstName,
                                      DataProviders.Materials materialsPackType,
                                      DataProviders.Materials materialsPackType1,DataProviders.Materials materialsCrate,
                                      DataProviders.Materials materialsCrate1, DataProviders.Materials associatedMaterials) {
        appMFC.getMainMenu_Metods().ManagementScreen_Open();
        appMFC.getManagementMenu_Metods().MaterialsScreen_Open();
        appMFC.getMaterialsConfig_Methods().clickOnAddMaterials_button();
        appMFC.getMaterialsConfig_Methods().enterMaterialsType(materialsCrate.getMaterialType());
        appMFC.getMaterialsConfig_Methods().enterCostMaterials(materialsCrate.getCoast());
        appMFC.getMaterialsConfig_Methods().enterWidthMaterials(materialsCrate.getWidth());
        appMFC.getMaterialsConfig_Methods().enterLengthMaterials(materialsCrate.getLength());
        appMFC.getMaterialsConfig_Methods().enterHeightMaterials(materialsCrate.getHeight());
        appMFC.getMaterialsConfig_Methods().enterVolumeMaterials(materialsCrate.getVolume());
        appMFC.getMaterialsConfig_Methods().trueIsCrate_checkbox();
        appMFC.getMaterialsConfig_Methods().saveCreatedMaterials();

    }
    @Test(priority=3,dataProviderClass = DataProviders.class,dataProvider = "createMaterialsConfig")
    public void addAssociatedMaterialsForMaterial(By locatorlanguage, String FirstName,
                                                  DataProviders.Materials materialsPackType,
                                                  DataProviders.Materials materialsPackType1,DataProviders.Materials materialsCrate,
                                                  DataProviders.Materials materialsCrate1, DataProviders.Materials associatedMaterials) {
        appMFC.getMainMenu_Metods().ManagementScreen_Open();
        appMFC.getManagementMenu_Metods().MaterialsScreen_Open();
        appMFC.getMaterialsConfig_Methods().clickOnAddMaterials_button();
        appMFC.getMaterialsConfig_Methods().enterMaterialsType(associatedMaterials.getMaterialType());
        appMFC.getMaterialsConfig_Methods().enterCostMaterials(associatedMaterials.getCoast());
        appMFC.getMaterialsConfig_Methods().enterWidthMaterials(associatedMaterials.getWidth());
        appMFC.getMaterialsConfig_Methods().enterLengthMaterials(associatedMaterials.getLength());
        appMFC.getMaterialsConfig_Methods().enterHeightMaterials(associatedMaterials.getHeight());
        appMFC.getMaterialsConfig_Methods().enterVolumeMaterials(associatedMaterials.getVolume());
        appMFC.getMaterialsConfig_Methods().saveCreatedMaterials();

        appMFC.getMaterialsConfig_Methods().chooseMaterial_inMaterialsGrid(materialsPackType.getMaterialType());
        appMFC.getMaterialsConfig_Methods().clickOnAddAssociatedMaterials_button();
        appMFC.getMaterialsConfig_Methods().selectMaterialIn_MaterialsDropdown_InAssociatedMaterialsGrid(associatedMaterials.getMaterialType());
        appMFC.getMaterialsConfig_Methods().enterQuantityForAssociatedMaterial(associatedMaterials.getQuantity());
        appMFC.getMaterialsConfig_Methods().saveAddedAssociatedMaterial_button();

    }
}
