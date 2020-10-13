package site.Data.WebElements;

import org.openqa.selenium.By;

/**
 * Created by user on 21.05.2018.
 */
public interface ManagementScreen_WebElements {
    By Reports_Global_button = By.xpath("//a[@href=\"/Management/ReportsGlobal\"]");//By.linkText("Reports Global");

    By Reports_Client_button = By.xpath("//a[@href='/Management/ReportsClient']");//By.linkText("Reports Client");
    By Suppliers_button = By.xpath("//a[@href='/PartyConfig/Suppliers']");//By.linkText("Suppliers");
    By Agents_button = By.xpath("//a[@href='/PartyConfig/Agents']");// By.linkText("Agents");
    By Clients_button = By.xpath("//a[@href='/PartyConfig/Clients']");//By.linkText("Clients");
    By Resources_button = By.xpath("//a[@href='/Management/Resources']");//By.linkText("Resources");
    By Materials_button = By.xpath("//a[@href='/Management/Materials']");// By.linkText("Materials");
    By Currencies_button = By.xpath("//a[@href='/Management/ExchangeRates']");//By.linkText("Currencies");
    By Tasks_button = By.xpath("//a[@href='/Management/Tasks']");//By.xpath("(//a[contains(text(),'Tasks')])[2]");
    By Office_staff_button = By.xpath("//a[@href='/UserConfig/OfficeStaff']");//By.linkText("Office staff");
    By Users_button = By.xpath("//a[@href='/UserConfig/Users']");//By.linkText("Users");
    By Roles_button = By.xpath("//a[@href='/UserConfig/Roles']");//By.linkText("Roles");
    By Items_button = By.xpath("//a[@href='/Management/Items']");//By.linkText("Items");
    By Residence_settings_button = By.xpath("//a[@href='/Management/ResidenceSettings']");//By.linkText("Residence settings");
    By Other_settings_button = By.xpath("//a[@href='/Management/OtherSettings']");//By.linkText("Other settings");
    By Company_structure_button = By.xpath("//a[@href='/CompanyStructure/CompanyStructure']");//By.linkText("Company settings");
    By Notification_button = By.xpath("//a[@href='/NotificationConfig/NotificationConfig']");//By.linkText("Notification");
    By Dictionary_button = By.xpath("//a[@href='/Dictionary/Dictionary']");//By.linkText("Dictionary");
    By Leads_button = By.xpath("//a[@href='/LeadSourceConfig/Leads']");//By.linkText("Leads");
    By Questions_and_services_button = By.xpath("//a[@href='/CommonPropertyConfig/QuestionsServices']");//By.linkText("Questions and services");
    By Statuses_button = By.xpath("//a[@href='/StatusConfig/Statuses']");//By.linkText("Statuses");
    By Documents_button = By.xpath("//a[@href='/DocumentConfig/Documents']");//By.linkText("Documents");
    By Offered_services_button = By.xpath("//a[@href='/OfferedServiceConfig/OfferedServices']");//By.linkText("Offered services");
    By Billable_services_button = By.xpath("//a[@href='/BillableServiceConfig/BillableServices']");//By.linkText("Billable services");
    By Licenses_services_button = By.xpath("//a[@href='/LicenseConfig/Licenses']");//By.linkText("Licenses");

}
