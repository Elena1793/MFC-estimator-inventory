package site.framework.ApplicationManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import site.Data.Resources.*;
import site.Data.Resources.GlobalResources.ScreensURL;
import site.framework.Screens.*;
import site.framework.Menu.JobMenu_Metods;
import site.framework.Menu.MainMenu_Metods;
import site.framework.Menu.ManagementMenu_Metods;
import site.framework.Menu.UserMenu_Metods;
import configuration.DataProviders;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private By language;
    private WebDriver wd;
    private String browser;
    private String version;
    private String url;
    private ScreensURL screensURL;
    public static String main_Page;

    private ServiceType serviceType;
    private Source source;
    private ServiceLevel serviceLevel;
    private Mode mode;
    private JobType jobType;
    private DataProviders dataProviders;
    private BookingType bookingType;
    private Country country;
    private ResidenceType residenceType;
    private CraneType craneType;
    private ParkingType parkingType;
    private Item item;
    private Units units;
    private QuotationStatus quotationStatus;

    private ExistedData existedData;

    private LoginScreen_Metods loginScreen_Metods;
    private MainMenu_Metods mainMenu_Metods;
    private CreateFile_Metods createFile_Metods;
    private Quotation_Metods quotation_metods;

    private JobMenu_Metods jobMenu_Metods;

    private ManagementMenu_Metods managementMenu_Metods;
    private ReportsGlobal_Metods reportsGlobal_Metods;
    private JobSummary_Metods jobSummary_Metods;
    private UserMenu_Metods userMenu_Metods;

    private UserMenu_Metods userMenu_Metods_lang;

    private Survey_Metods survey_Metods;
    private BookingSection_Metods bookingSection_Metods;

    private NewAddressForm_Metods addressForm;
    private  AddressDetails_Metods addressDetails_metods;
    private JobGrid_Metods jobGrid_Metods;

    private OperationsCV_metods operationsCV_metods;
    private Pickup_Metods pickup_metods;
    private WarehouseReceiveIn_Metods warehouseReceiveIn_Metods;
    private WarehouseOutload_Metods warehouseOutload_Metods;
    private PickupFromTerminal_Metods pickupFromTerminal_Metods;
    private DeliveryToTerminal_Metods deliveryToTerminal_Metods;
    private OnSite_Metods onSite_Metods;
    private Relo_Metods relo_Metods;
    private BoxDelivery_Metods boxDelivery_Metods;
    private Delivery_Metods delivery_Metods;

    private MaterialsConfig_Methods materialsConfig_Methods;
    private ItemsConfig_Methods itemsConfig_Methods;
    private Inventory_Methods inventory_Methods;
    private Shipments_Methods shipments_Methods;

    private Expense_Methods expense_Methods;



    public ApplicationManager(String browser, String version, String page, By language) {

        this.browser = browser;
        this.version = version;
        url = version+".voxme.com/Account/Login";
        //url = version;
        this.main_Page =version+page;
        this.language = language;
    }
    //принимает браузер который будет использоваться для запуска тестов, версию developer или prodaction
    // и страницу которая открывается после входа на сайт (после того как залогинились)


    public String getVersion() {
        return version;
    }

    public void init() throws IOException {

        if (browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        } else if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        }

        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        openSite(url);
        wd.manage().window().maximize();//fullscreen()

        screensURL = new ScreensURL(version);
        loginScreen_Metods = new LoginScreen_Metods(wd);
        mainMenu_Metods = new MainMenu_Metods(wd);
        managementMenu_Metods = new ManagementMenu_Metods(wd);
        jobMenu_Metods = new JobMenu_Metods(wd);
        createFile_Metods = new CreateFile_Metods(wd);
        reportsGlobal_Metods = new ReportsGlobal_Metods(wd);
        jobSummary_Metods = new JobSummary_Metods(wd);
        userMenu_Metods = new UserMenu_Metods(wd);

        userMenu_Metods_lang = new UserMenu_Metods(wd,language);

        quotation_metods = new Quotation_Metods(wd);
        addressForm = new NewAddressForm_Metods(wd);
        addressDetails_metods = new AddressDetails_Metods(wd);
        survey_Metods = new Survey_Metods(wd);
        bookingSection_Metods = new BookingSection_Metods(wd);
        jobGrid_Metods = new JobGrid_Metods (wd);
        operationsCV_metods= new OperationsCV_metods(wd);
        pickup_metods= new Pickup_Metods(wd);
        warehouseReceiveIn_Metods = new WarehouseReceiveIn_Metods(wd);
        warehouseOutload_Metods =  new WarehouseOutload_Metods(wd);
        pickupFromTerminal_Metods = new PickupFromTerminal_Metods(wd);
        deliveryToTerminal_Metods = new DeliveryToTerminal_Metods(wd);
        onSite_Metods = new OnSite_Metods(wd);
        relo_Metods =new Relo_Metods(wd);
        boxDelivery_Metods = new BoxDelivery_Metods(wd);
        delivery_Metods = new Delivery_Metods(wd);
        materialsConfig_Methods =  new MaterialsConfig_Methods(wd);
        itemsConfig_Methods=new ItemsConfig_Methods(wd);
        inventory_Methods = new Inventory_Methods(wd);
        shipments_Methods= new Shipments_Methods(wd);
        expense_Methods= new Expense_Methods(wd);

        serviceType = new ServiceType(language);
        source = new Source(language);
        serviceLevel = new ServiceLevel(language);
        mode = new Mode(language);
        jobType = new JobType(language);
        dataProviders = new DataProviders(language);
        bookingType = new BookingType(language);
        country = new Country(language);
        residenceType = new ResidenceType(language);
        craneType = new CraneType(language);
        parkingType = new ParkingType(language);
        item = new Item(language);
        units=new Units(language);
        quotationStatus=new QuotationStatus(language);;


        existedData = new ExistedData(version);

    }

    public void stop() {
        wd.quit();
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public LoginScreen_Metods getLoginScreen_Metods() {
        return loginScreen_Metods;
    }
    public CreateFile_Metods getMetodsCreateFile() {
        return createFile_Metods;
    }

    public MainMenu_Metods getMainMenu_Metods(){
        return mainMenu_Metods;
    }
    public JobMenu_Metods getJobMenu_Metods(){
        return jobMenu_Metods;
    }

    public ManagementMenu_Metods getManagementMenu_Metods(){
        return managementMenu_Metods;
    }

    public ReportsGlobal_Metods getReportsGlobal_Metods() {
        return reportsGlobal_Metods;
    }
    public JobSummary_Metods getJobSummary_Metods() {
        return jobSummary_Metods;
    }
    public UserMenu_Metods getUserMenu_Metods(){
        return userMenu_Metods;
    }



    public UserMenu_Metods userMenu_Metods_lang() {
        return userMenu_Metods_lang;
    }

    public Quotation_Metods Quotation_metods(){return quotation_metods;}
    public Survey_Metods getSurvey_Metods(){
        return survey_Metods;
    }
    public BookingSection_Metods getBookingSection_Metods(){
        return bookingSection_Metods;
    }

    public ServiceType getServiceType(){return serviceType;}
    public Source getSource(){return source;}
    public ServiceLevel getServiceLevel(){return serviceLevel;}
    public Mode getMode (){return mode;}
    public Item getItem(){return item;}
    public JobType getJobType (){return jobType;}
    public DataProviders getDataProviders (){return dataProviders;}
    public BookingType getBookingType(){return bookingType;}
    public NewAddressForm_Metods getAddressForm_Metods(){return addressForm;}
    public AddressDetails_Metods getAddressDetails_Metods(){
        return addressDetails_metods;
    }
    public JobGrid_Metods getJobGrid_Metods(){return jobGrid_Metods;}
    public Units getUnits(){return units;}
    public QuotationStatus getQuotationStatus(){
        return quotationStatus;
    }

    public OperationsCV_metods getOperationsCV_metods(){return operationsCV_metods;}
    public Pickup_Metods getPickup_Metods(){return pickup_metods;}
    public WarehouseReceiveIn_Metods getWarehouseReceiveIn_Metods(){return warehouseReceiveIn_Metods;}
    public WarehouseOutload_Metods getWarehouseOutload_Metods(){return warehouseOutload_Metods;}
    public PickupFromTerminal_Metods getPickupFromTerminal_Metods(){return pickupFromTerminal_Metods;}
    public DeliveryToTerminal_Metods getDeliveryToTerminal_Metods(){return deliveryToTerminal_Metods;}
    public OnSite_Metods getOnSite_Metods (){return onSite_Metods;}
    public Relo_Metods getRelo_Metods(){return relo_Metods;}
    public BoxDelivery_Metods getBoxDelivery_Metods(){return boxDelivery_Metods;}
    public Delivery_Metods getDelivery_Metods(){return delivery_Metods;}
    public MaterialsConfig_Methods getMaterialsConfig_Methods(){return materialsConfig_Methods;}
    public ItemsConfig_Methods getItemsConfig_Methods(){return itemsConfig_Methods;}
    public Inventory_Methods getInventory_Methods(){return inventory_Methods;}
    public Shipments_Methods getShipments_Methods(){return shipments_Methods;}
    public Expense_Methods getExpense_Methods(){
        return expense_Methods;
    }
    public ExistedData existedData(){return existedData;}


    public boolean CheckDataInField (By locator, String data){
        String getExistText = wd.findElement(locator).getText();
        if (getExistText.equalsIgnoreCase("")){
            getExistText = wd.findElement(locator).getAttribute("innerHTML");;}
        return data.equalsIgnoreCase(getExistText);
    }



}
