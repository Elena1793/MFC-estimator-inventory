package site.framework.Menu;

import org.openqa.selenium.WebDriver;
import site.Data.WebElements.ManagementScreen_WebElements;
import site.Data.Resources.GlobalResources.ScreensURL;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by user on 06.05.2018.
 */
public class ManagementMenu_Metods extends BasisMetods implements ManagementScreen_WebElements{


    public ManagementMenu_Metods(WebDriver wd){
        super(wd);
    }


    public void ReportsGlobalScreen_Open(){
        OpenPage(Reports_Global_button, ScreensURL.ReportsGlobal);
    }

    public void ReportsClientScreen_Open(){
        OpenPage(Reports_Client_button, ScreensURL.ReportsClient);
    }
    public void SuppliersScreen_Open(){
        OpenPage(Suppliers_button, ScreensURL.Suppliers);
    }
    public void AgentsScreen_Open(){
        OpenPage(Agents_button, ScreensURL.Agents);
    }
    public void ClientsScreen_Open(){
        OpenPage(Clients_button, ScreensURL.Clients);
    }
    public void ResourcesScreen_Open(){
        OpenPage(Resources_button, ScreensURL.Resources);
    }
    public void MaterialsScreen_Open(){
        OpenPage(Materials_button, ScreensURL.Materials);
    }
    public void ExchangeRatesScreen_Open(){
        OpenPage(Currencies_button, ScreensURL.ExchangeRates);
    }
    public void TasksScreen_Open (){
        OpenPage(Tasks_button, ScreensURL.Tasks);
    }
    public void OfficeStaffScreen_Open(){
        OpenPage(Office_staff_button, ScreensURL.OfficeStaff);
    }
    public void UsersScreen_Open() {
        OpenPage(Users_button, ScreensURL.Users);
    }
    public void RolesScreen_Open() {
        OpenPage(Roles_button, ScreensURL.Roles);
    }
    public void ItemsScreen_Open() {
        OpenPage(Items_button, ScreensURL.Items);
    }
    public void ResidenceSettingsScreen_Open() {
        OpenPage(Residence_settings_button, ScreensURL.ResidenceSettings);
    }
    public void OtherSettingsScreen_Open() {
        OpenPage(Other_settings_button, ScreensURL.OtherSettings);
    }
    public void CompanyStructureScreen_Open() {
        OpenPage(Company_structure_button, ScreensURL.CompanyStructure);
    }
    public void NotificationConfigScreen_Open() {
        OpenPage(Notification_button, ScreensURL.NotificationConfig);
    }
    public void DictionaryScreen_Open() {
        OpenPage(Dictionary_button, ScreensURL.Dictionary);
    }
    public void LeadsScreen_Open() {
        OpenPage(Leads_button, ScreensURL.Leads);
    }

    public void Questions_and_servicesScreen_Open(){ OpenPage(Questions_and_services_button,ScreensURL.Questions_and_services);};
    public void StatusesScreen_Open(){
        OpenPage(Statuses_button,ScreensURL.Statuses);
    }
    public void DocumentsScreen_Open(){
        OpenPage(Documents_button,ScreensURL.Documents);
    };
    public void Offered_servicesScreen_Open(){
        OpenPage(Offered_services_button,ScreensURL.Offered_services);
    };
    public void Billable_servicesScreen_Open(){
        OpenPage(Billable_services_button,ScreensURL.Billable_services);
    };
    public void Licenses_servicesScreen_Open(){
        OpenPage(Licenses_services_button,ScreensURL.Licenses_services);
    };
}
