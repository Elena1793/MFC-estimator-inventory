package site.Data.WebElements;

import org.openqa.selenium.By;

/**
 * Created by Lena on 21.11.2019.
 */
public interface ItemsConfig_Webelemets {
    By AddItem_button =By.xpath("//button[@id='itemAdd']");
    By itemField = By.xpath("//tr[@class='k-grid-edit-row']//input[@id='ItemType']");
    By VolumeItemField= By.xpath("//*[@data-container-for='Volume']/span[@class='k-widget k-numerictextbox']");
    By WeightItemField=By.xpath("//*[@data-container-for='Weight']/span[@class='k-widget k-numerictextbox']");
    By AssociatedMaterials_buttonsGroup=By.xpath("//div[@class='col-lg-6 end-xs']//span[@class='btn-group']");
    By AddAssociatedMaterials_button=By.xpath("//button[@id='associatedAdd']");
    By MaterialsDropdown_Button_InAssociatedMaterialsGrid =By.xpath("//span[@class='k-widget k-dropdown k-header']//span[@class='k-select']");
    By MaterialsDropdown_List_InAssociatedMaterialsGrid=By.xpath("//ul[@id='MaterialId_listbox']/li");
    By QuantityForAssociatedMaterialField=By.xpath("//*[@data-container-for='Qty']/span[@class='k-widget k-numerictextbox']");
    By saveAddedAssociatedMaterial_button=By.xpath("//button[@id='associatedTick']");

}
