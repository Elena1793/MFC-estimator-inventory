package site.Data.Resources;

import org.openqa.selenium.By;

import static site.Data.WebElements.UserMenu_WebElements.*;
import static site.Data.WebElements.UserMenu_WebElements.English_UK_language;

/**
 * Created by user on 19.11.2018.
 */
public class ParkingType {
    public static String SingleYellowLine;
    public static String DoubleYellowLine;
    public static String ResidenceParking;
    public static String Meter;
    public static String GreenZone;
    public static String BlueZone;
    public static String Free;
    public static String PermitParking;

    private By language;

    public ParkingType(By language){

        this.language=language;

        if(language.equals(English_language)) {
            SingleYellowLine = "Single Yellow Line";
            DoubleYellowLine = "Double Yellow Line";
            ResidenceParking = "Residence Parking";
            Meter = "Meter";
            GreenZone = "Green Zone";
            BlueZone = "Blue Zone";
            Free = "Free";
            PermitParking = "Permit Parking";

        }
        if(language.equals(Franch_language)) {
            SingleYellowLine = "Single Yellow Line";
            DoubleYellowLine = "Double Yellow Line";
            ResidenceParking = "Residence Parking";
            Meter = "Meter";
            GreenZone = "Green Zone";
            BlueZone = "Blue Zone";
            Free = "Free";
            PermitParking = "Permit Parking";
        }
        if(language.equals(German_language)) {
            SingleYellowLine = "Single Yellow Line";
            DoubleYellowLine = "Double Yellow Line";
            ResidenceParking = "Residence Parking";
            Meter = "Meter";
            GreenZone = "Green Zone";
            BlueZone = "Blue Zone";
            Free = "Free";
            PermitParking = "Permit Parking";
        }
        if(language.equals(Spanish_language)) {
            SingleYellowLine = "Single Yellow Line";
            DoubleYellowLine = "Double Yellow Line";
            ResidenceParking = "Residence Parking";
            Meter = "Meter";
            GreenZone = "Green Zone";
            BlueZone = "Zona azul";
            Free = "Free";
            PermitParking = "Permit Parking";

        }
        if(language.equals(Russian_language)) {
            SingleYellowLine = "Single Yellow Line";
            DoubleYellowLine = "Double Yellow Line";
            ResidenceParking = "Residence Parking";
            Meter = "Meter";
            GreenZone = "Green Zone";
            BlueZone = "Blue Zone";
            Free = "Free";
            PermitParking = "Permit Parking";

        }
        if(language.equals(Portugal_language)) {
            SingleYellowLine = "Single Yellow Line";
            DoubleYellowLine = "Double Yellow Line";
            ResidenceParking = "Residence Parking";
            Meter = "Meter";
            GreenZone = "Green Zone";
            BlueZone = "Zona Azúl";
            Free = "Free";
            PermitParking = "Permit Parking";

        }
        if(language.equals(Greek_language)) {
            SingleYellowLine = "Single Yellow Line";
            DoubleYellowLine = "Double Yellow Line";
            ResidenceParking = "Residence Parking";
            Meter = "Meter";
            GreenZone = "Green Zone";
            BlueZone = "Μπλέ Ζώνη Parking";
            Free = "Free";
            PermitParking = "Permit Parking";

        }
        if(language.equals(English_UK_language)) {
            SingleYellowLine = "Single Yellow Line";
            DoubleYellowLine = "Double Yellow Line";
            ResidenceParking = "Residence Parking";
            Meter = "Meter";
            GreenZone = "Green Zone";
            BlueZone = "Blue Zone";
            Free = "Free";
            PermitParking = "Permit Parking";
        }
        if(language.equals(Italian_Language)) {
            SingleYellowLine = "Single Yellow Line";
            DoubleYellowLine = "Double Yellow Line";
            ResidenceParking = "Residence Parking";
            Meter = "Meter";
            GreenZone = "Green Zone";
            BlueZone = "Blue Zone";
            Free = "Free";
            PermitParking = "Permit Parking";

        }
        if(language.equals(Dutch_Language)) {
            SingleYellowLine = "Single Yellow Line";
            DoubleYellowLine = "Double Yellow Line";
            ResidenceParking = "Residence Parking";
            Meter = "Meter";
            GreenZone = "Green Zone";
            BlueZone = "Blue Zone";
            Free = "Free";
            PermitParking = "Permit Parking";

        }
        if(language.equals(Polish_Language)) {
            SingleYellowLine = "Single Yellow Line";
            DoubleYellowLine = "Double Yellow Line";
            ResidenceParking = "Residence Parking";
            Meter = "Meter";
            GreenZone = "Green Zone";
            BlueZone = "Blue Zone";
            Free = "Free";
            PermitParking = "Permit Parking";

        }
        if(language.equals(Romanian_Language)) {
            SingleYellowLine = "Single Yellow Line";
            DoubleYellowLine = "Double Yellow Line";
            ResidenceParking = "Residence Parking";
            Meter = "Meter";
            GreenZone = "Green Zone";
            BlueZone = "Blue Zone";
            Free = "Free";
            PermitParking = "Permit Parking";

        }
    }
}
