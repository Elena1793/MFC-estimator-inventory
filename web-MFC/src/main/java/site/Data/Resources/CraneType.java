package site.Data.Resources;

import org.openqa.selenium.By;

import static site.Data.WebElements.UserMenu_WebElements.*;
import static site.Data.WebElements.UserMenu_WebElements.English_UK_language;

/**
 * Created by user on 19.11.2018.
 */
public class CraneType {
    public static String Electrical;
    public static String Mechanical;
    public static String Telescopic;
    public static String Truckmounted;
    private By language;

    public CraneType(By language){

        this.language=language;
        if(language.equals(English_language)) {
            Electrical="Electrical";
            Mechanical ="Mechanical";
            Telescopic = "Telescopic";
            Truckmounted = "Truck mounted";

        }
        if(language.equals(Franch_language)) {
            Electrical="Electrical";
            Mechanical ="Mechanical";
            Telescopic = "Telescopic";
            Truckmounted = "Truck mounted";

        }
        if(language.equals(German_language)) {
            Electrical="Electrical";
            Mechanical ="Mechanical";
            Telescopic = "Telescopic";
            Truckmounted = "Truck mounted";

        }
        if(language.equals(Spanish_language)) {
            Electrical="Electrical";
            Mechanical ="Mecánico";
            Telescopic = "Telescópico";
            Truckmounted = "Montado en camión";

        }
        if(language.equals(Russian_language)) {
            Electrical="Electrical";
            Mechanical ="Mechanical";
            Telescopic = "Telescopic";
            Truckmounted = "Truck mounted";
        }
        if(language.equals(Portugal_language)) {
            Electrical="Electrical";
            Mechanical ="Mecânico";
            Telescopic = "Telescópico";
            Truckmounted = "Montado em caminhão";

        }
        if(language.equals(Greek_language)) {
            Electrical="Electrical";
            Mechanical ="Μηχανικός";
            Telescopic = "Τηλεσκοπικός";
            Truckmounted = "Επί Οχήματος";

        }
        if(language.equals(English_UK_language)) {
            Electrical="Electrical";
            Mechanical ="Mechanical";
            Telescopic = "Telescopic";
            Truckmounted = "Truck mounted";
        }
        if(language.equals(Italian_Language)) {
            Electrical="Electrical";
            Mechanical ="Mechanical";
            Telescopic = "Telescopic";
            Truckmounted = "Truck mounted";

        }
        if(language.equals(Dutch_Language)) {
            Electrical="Electrical";
            Mechanical ="Mechanical";
            Telescopic = "Telescopic";
            Truckmounted = "Truck mounted";

        }
        if(language.equals(Polish_Language)) {
            Electrical="Electrical";
            Mechanical ="Mechanical";
            Telescopic = "Telescopic";
            Truckmounted = "Truck mounted";

        }
        if(language.equals(Romanian_Language)) {
            Electrical="Electrical";
            Mechanical ="Mechanical";
            Telescopic = "Telescopic";
            Truckmounted = "Truck mounted";

        }
    }
}
