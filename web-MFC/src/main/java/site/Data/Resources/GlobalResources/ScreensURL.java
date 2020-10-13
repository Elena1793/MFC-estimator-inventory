package site.Data.Resources.GlobalResources;


public class ScreensURL {


    protected String version;
    public static String Management = ".voxme.com/Management/Iterators";
    public static String Job_Grid = ".voxme.com/Job/Grid";
    public static String DailyAgenda = ".voxme.com/DailyAgenda";
    public static String Task_Grid = ".voxme.com/Task/Grid";
    public static String Shipment_Grid = ".voxme.com/Shipment/Grid";
    public static String Quotation_Grid = ".voxme.com/Quotation/Grid";

    public static String Transaction_Grid = ".voxme.com/Transaction/Grid";
    public static String Warehouse_Grid = ".voxme.com/Warehouse/LoadingUnits";
    public static String Opportunity_Grid = ".voxme.com/Opportunity/Grid";
    public static String Financials = ".voxme.com/Financials";
    public static String Survey_Grid = ".voxme.com/Survey/Grid";
    public static String ReportsGlobal = ".voxme.com/Management/Iterators";
    public static String Iterators = ".voxme.com/Management/Iterators";
    public static String Variables = ".voxme.com/Management/Variables";
    public static String Tables = ".voxme.com/Management/Tables";
    public static String Envelopes = ".voxme.com/Management/Envelopes";
    public static String ReportsClient = ".voxme.com/Management/ReportsClient";
    public static String Suppliers = ".voxme.com/PartyConfig/Suppliers";
    public static String Agents = ".voxme.com/PartyConfig/Agents";
    public static String Clients = ".voxme.com/PartyConfig/Clients";
    public static String Resources = ".voxme.com/Management/Resources";
    public static String Materials = ".voxme.com/Management/Materials";
    public static String ExchangeRates = ".voxme.com/Management/ExchangeRates";
    public static String Tasks = ".voxme.com/Management/Tasks";
    public static String OfficeStaff = ".voxme.com/UserConfig/OfficeStaff";
    public static String Users = ".voxme.com/UserConfig/Users";
    public static String Roles = ".voxme.com/UserConfig/Roles";
    public static String Items = ".voxme.com/Management/Items";
    public static String ResidenceSettings = ".voxme.com/Management/ResidenceSettings";
    public static String OtherSettings = ".voxme.com/Management/OtherSettings";
    public static String CompanyStructure = ".voxme.com/CompanyStructure/CompanyStructure";
    public static String NotificationConfig = ".voxme.com/NotificationConfig/NotificationConfig";
    public static String Dictionary = ".voxme.com/Dictionary/Dictionary";
    public static String Leads = ".voxme.com/LeadSourceConfig/Leads";

    public static String  Questions_and_services = ".voxme.com/CommonPropertyConfig/QuestionsServices";
    public static String  Statuses = ".voxme.com/StatusConfig/Statuses";
    public static String  Documents = ".voxme.com/DocumentConfig/Documents";
    public static String  Offered_services = ".voxme.com/OfferedServiceConfig/OfferedServices";
    public static String  Billable_services = ".voxme.com/BillableServiceConfig/BillableServices";
    public static String  Licenses_services = ".voxme.com/LicenseConfig/Licenses";


    public ScreensURL(String version) {
        this.version = version;
        Management = version+Management;
        Job_Grid = version+Job_Grid;
        DailyAgenda = version+DailyAgenda;
        Task_Grid = version+Task_Grid;
        Shipment_Grid = version+Shipment_Grid;
        Quotation_Grid = version+Quotation_Grid;
        Transaction_Grid = version+Transaction_Grid;
        Warehouse_Grid= version+Warehouse_Grid;
        Opportunity_Grid = version+Opportunity_Grid;
        Financials = version+Financials;
        Survey_Grid = version+Survey_Grid;
        ReportsGlobal = version+ReportsGlobal;
        Iterators = version+Iterators;
        Variables = version+Variables;
        Tables = version+Tables;
        Envelopes = version+Envelopes;
        ReportsClient = version+ReportsClient;
        Suppliers = version+Suppliers;
        Agents = version+Agents;
        Clients = version+Clients;
        Resources = version+Resources;
        Materials = version+Materials;
        ExchangeRates = version+ExchangeRates;
        Tasks = version+Tasks;
        OfficeStaff = version+OfficeStaff;
        Users = version+Users;
        Roles = version+Roles;
        Items = version+Items;
        ResidenceSettings = version+ResidenceSettings;
        OtherSettings = version+OtherSettings;
        CompanyStructure = version+CompanyStructure;
        NotificationConfig = version+NotificationConfig;
        Dictionary = version+Dictionary;
        Leads = version+Leads;
        Questions_and_services = version+Questions_and_services;
        Statuses=version+Statuses;
        Documents=version+Documents;
        Offered_services=version+Offered_services;
        Billable_services=version+Billable_services;
        Licenses_services=version+Licenses_services;

    }
   /* protected String version;
    public static String Management = "/Management/Iterators";
    public static String Job_Grid = "/Job/Grid";
    public static String DailyAgenda = "/DailyAgenda";
    public static String Task_Grid = "/Task/Grid";
    public static String Shipment_Grid = "/Shipment/Grid";
    public static String Quotation_Grid = "/Quotation/Grid";

    public static String Transaction_Grid = "/Transaction/Grid";
    public static String Warehouse_Grid = "/Warehouse/Grid";
    public static String Opportunity_Grid = "/Opportunity/Grid";
    public static String Financials = "/Financials";
    public static String Survey_Grid = "/Survey/Grid";
    public static String ReportsGlobal = "/Management/Iterators";
    public static String Iterators = "/Management/Iterators";
    public static String Variables = "/Management/Variables";
    public static String Tables = "/Management/Tables";
    public static String Envelopes = "/Management/Envelopes";
    public static String ReportsClient = "/Management/ReportsClient";
    public static String Suppliers = "/PartyConfig/Suppliers";
    public static String Agents = "/PartyConfig/Agents";
    public static String Clients = "/PartyConfig/Clients";
    public static String Resources = "/Management/Resources";
    public static String Materials = "/Management/Materials";
    public static String ExchangeRates = "/Management/ExchangeRates";
    public static String Tasks = "/Management/Tasks";
    public static String OfficeStaff = "/UserConfig/OfficeStaff";
    public static String Users = "/UserConfig/Users";
    public static String Roles = "/UserConfig/Roles";
    public static String Items = "/Management/Items";
    public static String ResidenceSettings = "/Management/ResidenceSettings";
    public static String OtherSettings = "/Management/OtherSettings";
    public static String CompanyStructure = "/CompanyStructure/CompanyStructure";
    public static String NotificationConfig = "/NotificationConfig/NotificationConfig";
    public static String Dictionary = "/Dictionary/Dictionary";
    public static String Leads = "/LeadSourceConfig/Leads";

    public static String  Questions_and_services = "/CommonPropertyConfig/QuestionsServices";
    public static String  Statuses = "/StatusConfig/Statuses";
    public static String  Documents = "/DocumentConfig/Documents";
    public static String  Offered_services = "/OfferedServiceConfig/OfferedServices";
    public static String  Billable_services = "/BillableServiceConfig/BillableServices";
    public static String  Licenses_services = "/LicenseConfig/Licenses";


    public ScreensURL(String version) {
        this.version = version;
        Management = version+Management;
        Job_Grid = version+Job_Grid;
        DailyAgenda = version+DailyAgenda;
        Task_Grid = version+Task_Grid;
        Shipment_Grid = version+Shipment_Grid;
        Quotation_Grid = version+Quotation_Grid;
        Transaction_Grid = version+Transaction_Grid;
        Warehouse_Grid= version+Warehouse_Grid;
        Opportunity_Grid = version+Opportunity_Grid;
        Financials = version+Financials;
        Survey_Grid = version+Survey_Grid;
        ReportsGlobal = version+ReportsGlobal;
        Iterators = version+Iterators;
        Variables = version+Variables;
        Tables = version+Tables;
        Envelopes = version+Envelopes;
        ReportsClient = version+ReportsClient;
        Suppliers = version+Suppliers;
        Agents = version+Agents;
        Clients = version+Clients;
        Resources = version+Resources;
        Materials = version+Materials;
        ExchangeRates = version+ExchangeRates;
        Tasks = version+Tasks;
        OfficeStaff = version+OfficeStaff;
        Users = version+Users;
        Roles = version+Roles;
        Items = version+Items;
        ResidenceSettings = version+ResidenceSettings;
        OtherSettings = version+OtherSettings;
        CompanyStructure = version+CompanyStructure;
        NotificationConfig = version+NotificationConfig;
        Dictionary = version+Dictionary;
        Leads = version+Leads;
        Questions_and_services = version+Questions_and_services;
        Statuses=version+Statuses;
        Documents=version+Documents;
        Offered_services=version+Offered_services;
        Billable_services=version+Billable_services;
        Licenses_services=version+Licenses_services;

    }*/
}

