package site.Data.Resources;

import org.openqa.selenium.By;

import static site.Data.WebElements.UserMenu_WebElements.*;
import static site.Data.WebElements.UserMenu_WebElements.English_UK_language;

/**
 * Created by user on 19.11.2018.
 */
public class ResidenceType {

    public static String House;
    public static String Apartment;
    public static String Bungalo;
    public static String Mansion;
    public static String Castle;
    public static String Office;
    private By language;

    public ResidenceType(By language){

        this.language=language;

        if(language.equals(English_language)) {
            Apartment="Apartment";
            Bungalo="Bungalo";
            Castle="Castle";
            House="House";
            Mansion="Mansion";
            Office="Office";


        }
        if(language.equals(Franch_language)) {
            Apartment="Apartment";
            Bungalo="Bungalo";
            Castle="Castle";
            House="House";
            Mansion="Mansion";
            Office="Office";
        }
        if(language.equals(German_language)) {
            Apartment="Apartment";
            Bungalo="Bungalo";
            Castle="Castle";
            House="House";
            Mansion="Mansion";
            Office="Office";
        }
        if(language.equals(Spanish_language)) {
            Apartment="Apartamento";
            Bungalo="Bungalo";
            Castle="Castillo";
            House="Casa";
            Mansion="Palacio";
            Office="Office";

        }
        if(language.equals(Russian_language)) {
            Apartment="Apartment";
            Bungalo="Bungalo";
            Castle="Castle";
            House="House";
            Mansion="Mansion";
            Office="Office";

        }
        if(language.equals(Portugal_language)) {
            Apartment="Apartamento";
            Bungalo="Bungalo";
            Castle="Castelo";
            House="Casa";
            Mansion="Mansão";
            Office="Office";

        }
        if(language.equals(Greek_language)) {
            Apartment="Διαμέρισμα";
            Bungalo="Μπανγκαλόου";
            Castle="Κάστρο";
            House="Σπίτι / Μονοκατοικία";
            Mansion="Έπαυλη";
            Office="Office";

        }
        if(language.equals(English_UK_language)) {
            Apartment="Apartment";
            Bungalo="Bungalo";
            Castle="Castle";
            House="House";
            Mansion="Mansion";
            Office="Office";
        }
        if(language.equals(Italian_Language)) {
            Apartment="Apartment";
            Bungalo="Bungalo";
            Castle="Castle";
            House="House";
            Mansion="Mansion";
            Office="Office";


        }
        if(language.equals(Dutch_Language)) {
            Apartment="Apartment";
            Bungalo="Bungalo";
            Castle="Castle";
            House="House";
            Mansion="Mansion";
            Office="Office";


        }
        if(language.equals(Polish_Language)) {
            Apartment="Apartment";
            Bungalo="Bungalo";
            Castle="Castle";
            House="House";
            Mansion="Mansion";
            Office="Office";


        }
        if(language.equals(Romanian_Language)) {
            Apartment="Apartment";
            Bungalo="Bungalo";
            Castle="Castle";
            House="House";
            Mansion="Mansion";
            Office="Office";


        }
    }
}
