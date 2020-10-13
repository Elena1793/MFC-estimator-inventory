package configuration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import site.Data.Resources.*;
import site.Data.WebElements.UserMenu_WebElements;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static site.Data.WebElements.UserMenu_WebElements.*;

/**
 * Created by user on 29.05.2018.
 */
public class DataProviders {

    static String FirstName= "AutoTest";

    static By language;

    public DataProviders(By language) {
        this.language = language;

    }



    @DataProvider
    public static Iterator<Object[]> changeLanguage() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{English_language});
        data.add(new Object[]{Franch_language});
        data.add(new Object[]{UserMenu_WebElements.German_language});
        data.add(new Object[]{UserMenu_WebElements.Greek_language});
        data.add(new Object[]{UserMenu_WebElements.Portugal_language});
        data.add(new Object[]{UserMenu_WebElements.Russian_language});
        data.add(new Object[]{UserMenu_WebElements.Spanish_language});
        data.add(new Object[]{UserMenu_WebElements.Italian_Language});
        data.add(new Object[]{UserMenu_WebElements.Dutch_Language});
        data.add(new Object[]{UserMenu_WebElements.Polish_Language});
        data.add(new Object[]{UserMenu_WebElements.Romanian_Language});
        //data.add(new Object[]{UserMenu_WebElements.English_UK_language});

        return data.iterator();
    }
    @DataProvider(name = "NewAddress")
    public static Iterator<Object[]> newAddress(){
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{English_language, new Country(English_language).Albania, new Country(English_language).Bulgaria,"English1", "Street1", "12345"});
        data.add(new Object[]{Franch_language, new Country(Franch_language).Albania,
                new Country(Franch_language).Bulgaria,"Franch1", "Street1", "12345"});
        data.add(new Object[]{German_language, new Country(German_language).Albania,
                new Country(German_language).Bulgaria,"German1", "Street1", "12345"});
        data.add(new Object[]{Greek_language, new Country(Greek_language).Albania,
                new Country(Greek_language).Bulgaria,"Greek1", "Street1", "12345"});
        data.add(new Object[]{Portugal_language, new Country(Portugal_language).Albania,
                new Country(Portugal_language).Bulgaria,"Portugal1", "Street1", "12345"});
        data.add(new Object[]{Spanish_language, new Country(Spanish_language).Albania,
                new Country(Spanish_language).Bulgaria,"Spanish1", "Street1", "12345"});
        data.add(new Object[]{Russian_language, new Country(Russian_language).Albania,
                new Country(Russian_language).Bulgaria,"Russian1", "Street1", "12345"});
        data.add(new Object[]{Italian_Language, new Country(Italian_Language).Albania,
                new Country(Italian_Language).Bulgaria,"Italian1", "Street1", "12345"});
        data.add(new Object[]{Dutch_Language, new Country(Dutch_Language).Albania,
                new Country(Dutch_Language).Bulgaria,"Dutch1", "Street1", "12345"});
        data.add(new Object[]{Polish_Language, new Country(Polish_Language).Albania,
                new Country(Polish_Language).Bulgaria,"Polish1", "Street1", "12345"});
        data.add(new Object[]{Romanian_Language, new Country(Romanian_Language).Albania,
                new Country(Romanian_Language).Bulgaria,"Romanian1", "Street1", "12345"});

        return data.iterator();
    }

    @DataProvider(name = "EditAddressDetails")
    public static Iterator<Object[]> editAddressDetails(){

        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{English_language, new Country(English_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(English_language).Apartment,"residenceTypeDescription",
                "10","elevatorDetails",new CraneType(English_language).Mechanical,new ParkingType(English_language).BlueZone,
                "120","123","500","100", "91.97", "101.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{Franch_language, new Country(Franch_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(Franch_language).Apartment,"residenceTypeDescription",
                "11","elevatorDetails",new CraneType(Franch_language).Mechanical,new ParkingType(Franch_language).BlueZone,
                "121","124","501","101", "92.97", "102.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{German_language, new Country(German_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(German_language).Apartment,"residenceTypeDescription",
                "12","elevatorDetails",new CraneType(German_language).Mechanical,new ParkingType(German_language).BlueZone,
                "122","125","502","102", "93.97", "103.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{Greek_language, new Country(Greek_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(Greek_language).Apartment,"residenceTypeDescription",
                "13","elevatorDetails",new CraneType(Greek_language).Mechanical,new ParkingType(Greek_language).BlueZone,
                "123","126","503","103", "94.97", "104.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{Portugal_language, new Country(Portugal_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(Portugal_language).Apartment,"residenceTypeDescription",
                "10","elevatorDetails",new CraneType(Portugal_language).Mechanical,new ParkingType(Portugal_language).BlueZone,
                "120","123","500","100", "91.97", "101.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{Spanish_language, new Country(Spanish_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(Spanish_language).Apartment,"residenceTypeDescription",
                "13","elevatorDetails",new CraneType(Spanish_language).Mechanical,new ParkingType(Spanish_language).BlueZone,
                "123","126","503","103", "94.97", "104.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{Russian_language, new Country(Russian_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(Russian_language).Apartment,"residenceTypeDescription",
                "10","elevatorDetails",new CraneType(Russian_language).Mechanical,new ParkingType(Russian_language).BlueZone,
                "120","123","500","100", "91.97", "101.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{Italian_Language, new Country(Italian_Language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(Italian_Language).Apartment,"residenceTypeDescription",
                "12","elevatorDetails",new CraneType(Italian_Language).Mechanical,new ParkingType(Italian_Language).BlueZone,
                "122","125","502","102", "93.97", "103.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{Dutch_Language, new Country(Dutch_Language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(Dutch_Language).Apartment,"residenceTypeDescription",
                "12","elevatorDetails",new CraneType(Dutch_Language).Mechanical,new ParkingType(Dutch_Language).BlueZone,
                "122","125","502","102", "93.97", "103.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{Polish_Language, new Country(Polish_Language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(Polish_Language).Apartment,"residenceTypeDescription",
                "12","elevatorDetails",new CraneType(Polish_Language).Mechanical,new ParkingType(Polish_Language).BlueZone,
                "122","125","502","102", "93.97", "103.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{Romanian_Language, new Country(Romanian_Language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(Romanian_Language).Apartment,"residenceTypeDescription",
                "10","elevatorDetails",new CraneType(Romanian_Language).Mechanical,new ParkingType(Romanian_Language).BlueZone,
                "120","123","500","100", "91.97", "101.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        return data.iterator();
    }

    @DataProvider(name = "createFileForNewClient")
    public static Iterator<Object[]> createFileForNewClient2() {
        String date = "1909";
        List<Object[]> data = new ArrayList<Object[]>();

        data.add(new Object[]{English_language, new BookingType(English_language).Private  ,new Source(English_language).Google, new JobType(English_language).Export,
                new Mode(English_language).Air_AIR, new ServiceType(English_language).DTD,
                new ServiceLevel(English_language).Full_Origin_Service,FirstName+"En"+date, "check", "franch@mail.com","9797876",
                new Country(English_language).Albania, new Country(English_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
       /* data.add(new Object[]{Franch_language, new BookingType(Franch_language).Private,new Source(Franch_language).Google,
                new JobType(Franch_language).Export,
                new Mode(Franch_language).Air_AIR, new ServiceType(Franch_language).DTD,
                new ServiceLevel(Franch_language).Full_Origin_Service,FirstName+"Fr"+date, "check", "franch@mail.com","9797876",
                new Country(Franch_language).Albania, new Country(Franch_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{German_language, new BookingType(German_language).Private,new Source(German_language).Google,
                new JobType(German_language).Export,
                new Mode(German_language).Air_AIR, new ServiceType(German_language).DTD,
                new ServiceLevel(German_language).Full_Origin_Service,FirstName+"Gd"+date, "check", "franch@mail.com","9797876",
                new Country(German_language).Albania, new Country(German_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Greek_language, new BookingType(Greek_language).Private,new Source(Greek_language).Google,
                new JobType(Greek_language).Export,
                new Mode(Greek_language).Sea_Groupage_20ft_Container, new ServiceType(Greek_language).DTD,
                new ServiceLevel(Greek_language).Full_Origin_Service,FirstName+"Gr"+date, "check", "franch@mail.com","9797876",
                new Country(Greek_language).Albania, new Country(Greek_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Portugal_language, new BookingType(Portugal_language).Private,new Source(Portugal_language).Google,
                new JobType(Portugal_language).Export,
                new Mode(Portugal_language).Air_AIR, new ServiceType(Portugal_language).DTD,
                new ServiceLevel(Portugal_language).Full_Origin_Service,FirstName+"Por"+date, "check", "franch@mail.com","9797876",
                new Country(Portugal_language).Albania, new Country(Portugal_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Spanish_language, new BookingType(Spanish_language).Private,new Source(Spanish_language).Google,
                new JobType(Spanish_language).Export,
                new Mode(Spanish_language).Air_AIR, new ServiceType(Spanish_language).DTD,
                new ServiceLevel(Spanish_language).Full_Origin_Service,FirstName+"Sp"+date, "check", "franch@mail.com","9797876",
                new Country(Spanish_language).Albania, new Country(Spanish_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Russian_language, new BookingType(Russian_language).Private,new Source(Russian_language).Google,
                new JobType(Russian_language).Export,
                new Mode(Russian_language).Air_AIR, new ServiceType(Russian_language).DTD,
                new ServiceLevel(Russian_language).Full_Origin_Service,FirstName+"Ru"+date, "check", "franch@mail.com","9797876",
                new Country(Russian_language).Albania, new Country(Russian_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Italian_Language, new BookingType(Italian_Language).Private,new Source(Italian_Language).Google,
                new JobType(Italian_Language).Export,
                new Mode(Italian_Language).Air_AIR, new ServiceType(Italian_Language).DTD,
                new ServiceLevel(Italian_Language).Full_Origin_Service,FirstName+"It"+date, "check", "franch@mail.com","9797876",
                new Country(Italian_Language).Albania, new Country(Italian_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Dutch_Language, new BookingType(Dutch_Language).Private,new Source(Dutch_Language).Google,
                new JobType(Dutch_Language).Export,
                new Mode(Dutch_Language).Air_AIR, new ServiceType(Dutch_Language).DTD,
                new ServiceLevel(Dutch_Language).Full_Origin_Service,FirstName+"Dut"+date, "check", "franch@mail.com","9797876",
                new Country(Dutch_Language).Albania, new Country(Dutch_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Polish_Language, new BookingType(Polish_Language).Private,new Source(Polish_Language).Google,
                new JobType(Polish_Language).Export,
                new Mode(Polish_Language).Air_AIR, new ServiceType(Polish_Language).DTD,
                new ServiceLevel(Polish_Language).Full_Origin_Service,FirstName+"Pol"+date, "check", "franch@mail.com","9797876",
                new Country(Polish_Language).Albania, new Country(Polish_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});

        data.add(new Object[]{Romanian_Language, new BookingType(Romanian_Language).Private,new Source(Romanian_Language).Google,
                new JobType(Romanian_Language).Export,
                new Mode(Romanian_Language).Air_AIR, new ServiceType(Romanian_Language).DTD,
                new ServiceLevel(Romanian_Language).Full_Origin_Service,FirstName+"Rom"+date, "check", "franch@mail.com","9797876",
                new Country(Romanian_Language).Albania, new Country(Romanian_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});*/
        return data.iterator();
    }
    @DataProvider(name = "createFileForNewClient_gblinerstest")
    public static Iterator<Object[]> createFileForNewClient_gblinerstest() {
        String date = "-1202-1";
        List<Object[]> data = new ArrayList<Object[]>();


        data.add(new Object[]{English_language, new BookingType(English_language).Private  ,new Source(English_language).Google, "Combined[Domestic-and-International]",
                new Mode(English_language).Air_AIR, new ServiceType(English_language).DTD,
                new ServiceLevel(English_language).Full_Origin_Service,FirstName+"En"+date, "check", "franch@mail.com","9797876",
                new Country(English_language).Albania, new Country(English_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Franch_language, new BookingType(Franch_language).Private,new Source(Franch_language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Franch_language).Air_AIR, new ServiceType(Franch_language).DTD,
                new ServiceLevel(Franch_language).Full_Origin_Service,FirstName+"Fr"+date, "check", "franch@mail.com","9797876",
                new Country(Franch_language).Albania, new Country(Franch_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
       /* data.add(new Object[]{German_language, new BookingType(German_language).Private,new Source(German_language).Google,
                "Combined[Domestic-and-International]",
                new Mode(German_language).Air_AIR, new ServiceType(German_language).DTD,
                new ServiceLevel(German_language).Full_Origin_Service,FirstName+"Gd"+date, "check", "franch@mail.com","9797876",
                new Country(German_language).Albania, new Country(German_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Greek_language, new BookingType(Greek_language).Private,new Source(Greek_language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Greek_language).Sea_Groupage_20ft_Container, new ServiceType(Greek_language).DTD,
                new ServiceLevel(Greek_language).Full_Origin_Service,FirstName+"Gr"+date, "check", "franch@mail.com","9797876",
                new Country(Greek_language).Albania, new Country(Greek_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Portugal_language, new BookingType(Portugal_language).Private,new Source(Portugal_language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Portugal_language).Air_AIR, new ServiceType(Portugal_language).DTD,
                new ServiceLevel(Portugal_language).Full_Origin_Service,FirstName+"Por"+date, "check", "franch@mail.com","9797876",
                new Country(Portugal_language).Albania, new Country(Portugal_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Spanish_language, new BookingType(Spanish_language).Private,new Source(Spanish_language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Spanish_language).Air_AIR, new ServiceType(Spanish_language).DTD,
                new ServiceLevel(Spanish_language).Full_Origin_Service,FirstName+"Sp"+date, "check", "franch@mail.com","9797876",
                new Country(Spanish_language).Albania, new Country(Spanish_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Russian_language, new BookingType(Russian_language).Private,new Source(Russian_language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Russian_language).Air_AIR, new ServiceType(Russian_language).DTD,
                new ServiceLevel(Russian_language).Full_Origin_Service,FirstName+"Ru"+date, "check", "franch@mail.com","9797876",
                new Country(Russian_language).Albania, new Country(Russian_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Italian_Language, new BookingType(Italian_Language).Private,new Source(Italian_Language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Italian_Language).Air_AIR, new ServiceType(Italian_Language).DTD,
                new ServiceLevel(Italian_Language).Full_Origin_Service,FirstName+"It"+date, "check", "franch@mail.com","9797876",
                new Country(Italian_Language).Albania, new Country(Italian_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});

        data.add(new Object[]{Dutch_Language, new BookingType(Dutch_Language).Private,new Source(Dutch_Language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Dutch_Language).Air_AIR, new ServiceType(Dutch_Language).DTD,
                new ServiceLevel(Dutch_Language).Full_Origin_Service,FirstName+"Dut"+date, "check", "franch@mail.com","9797876",
                new Country(Dutch_Language).Albania, new Country(Dutch_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});

        data.add(new Object[]{Polish_Language, new BookingType(Polish_Language).Private,new Source(Polish_Language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Polish_Language).Air_AIR, new ServiceType(Polish_Language).DTD,
                new ServiceLevel(Polish_Language).Full_Origin_Service,FirstName+"Pol"+date, "check", "franch@mail.com","9797876",
                new Country(Polish_Language).Albania, new Country(Polish_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});

        data.add(new Object[]{Romanian_Language, new BookingType(Romanian_Language).Private,new Source(Romanian_Language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Romanian_Language).Air_AIR, new ServiceType(Romanian_Language).DTD,
                new ServiceLevel(Romanian_Language).Full_Origin_Service,FirstName+"Rom"+date, "check", "franch@mail.com","9797876",
                new Country(Romanian_Language).Albania, new Country(Romanian_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});*/
        return data.iterator();
    }


    @DataProvider(name = "createMaterialsConfig")
    public static Iterator<Object[]> createMaterialsConfig() {
        LocalTime marker = LocalTime.now();
        int marker1 = 320 ;
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{English_language, FirstName,
                new Materials("Mtl_PT-"+marker,10,12,13,14,100),
                new Materials("Mtl_PT1-"+marker,20,22,23,24,200),
                new Materials("MatCrate-"+marker,30,32,33,34,300),
                new Materials("MatCrate1-"+marker,40,42,43,44,400),
                new Materials("AssMaterials-"+marker,5,6,7,8,9, 2)});

        return  data.iterator();
    }

    public static class Materials {
        String materialType;
        float coast;
        float width;
        float length; float height; float volume;
        int quantity;

        public Materials(String materialType,float coast, float width,float length,float height,float volume) {
            this.materialType=materialType;
            this.coast=coast;
            this.width=width;
            this.length=length;
            this.height=height;
            this.volume=volume;
        }
        public Materials(String materialType,float coast, float width,float length,float height,float volume, int quantity) {
            this.materialType=materialType;
            this.coast=coast;
            this.width=width;
            this.length=length;
            this.height=height;
            this.volume=volume;
            this.quantity=quantity;
        }

        public int getQuantity() {
            return quantity;
        }

        public String getMaterialType() {
            return materialType;
        }

        public float getCoast() {
            return coast;
        }

        public float getWidth() {
            return width;
        }

        public float getLength() {
            return length;
        }

        public float getHeight() {
            return height;
        }

        public float getVolume() {
            return volume;
        }
    }
    public static class Item {
        String itemType;
        String itemCategory;
        float volumeItem;
        float widthItem;
        String room;
        String application;
        String useFor;
        int quantity;

        public Item(String itemType, String itemCategory, float volumeItem,
                    float widthItem, String room, String application, String useFor) {
            this.itemType = itemType;
            this.itemCategory = itemCategory;
            this.volumeItem = volumeItem;
            this.widthItem = widthItem;
            this.room = room;
            this.application = application;
            this.useFor = useFor;
            this.quantity = quantity;
        }

        public String getItemType() {
            return itemType;
        }

        public String getItemCategory() {
            return itemCategory;
        }

        public float getVolumeItem() {
            return volumeItem;
        }

        public float getWidthItem() {
            return widthItem;
        }

        public String getRoom() {
            return room;
        }

        public String getApplication() {
            return application;
        }

        public String getUseFor() {
            return useFor;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    @DataProvider(name = "createFileForNewClient1")
    public static Iterator<Object[]> createFileForNewClient1() {

        List<Object[]> data = new ArrayList<Object[]>();

        data.add(new Object[][]{{language, Source.Google, JobType.Export, Mode.Sea_LCL, ServiceType.DTD,
                ServiceLevel.Full_Origin_Service,"Test_FR", "Full", "franch@mail.com","9797876"},
                {UserMenu_WebElements.Franch_language}});


        return data.iterator();
    }

    @DataProvider(name = "createFileForNewClient2")
    public static Iterator<Object[]> createFileForNewClient() {
        String date="0109";

        List<Object[]> data = new ArrayList<Object[]>();

        data.add(new Object[]{language, Source.Google, JobType.Export, Mode.Sea_LCL, ServiceType.DTD,
                ServiceLevel.Full_Origin_Service,"test"+date, "check", "franch@mail.com","9797876",
                Country.Albania, Country.Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        /*data.add(new Object[]{language,Source.Call, JobType.Fine_Arts, Mode.Air_AIR, ServiceType.DTP,
              ServiceLevel.Full_Destination_Service,"Magda", "Oliver", "rosa@mail.ru","+9729797876"});*/


        return data.iterator();
    }
}
