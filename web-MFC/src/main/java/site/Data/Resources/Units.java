package site.Data.Resources;

import org.openqa.selenium.By;

import static site.Data.WebElements.UserMenu_WebElements.*;


/**
 * Created by user on 25.06.2018.
 */
public class Units {
    By language;

    public static String Airvan;
    public static String Container_20_ft;
    public static String Delivery;



    public Units(By language){

        this.language=language;

        if(language.equals(English_language)) {
            Airvan="Airvan";
            Container_20_ft="Container 20 ft";
            Delivery="Delivery";


        }
        if(language.equals(Franch_language)) {
            Airvan="Airvan*";
            Container_20_ft="Container 20 pieds";
            Delivery="Delivery";

        }
        if(language.equals(German_language)) {
            Airvan="Airvan";
            Container_20_ft="Contenedor 20 ft";
            Delivery="Delivery";

        }
        if(language.equals(Spanish_language)) {
            Airvan="Airvan";
            Container_20_ft="Container 20 ft";
            Delivery="Delivery";

        }
        if(language.equals(Russian_language)) {
            Airvan="Airvan";
            Container_20_ft="Container 20 ft";
            Delivery="Delivery";
        }
        if(language.equals(Portugal_language)) {
            Airvan="Airvan";
            Container_20_ft="Container 20 ft";
            Delivery="Delivery";
        }
        if(language.equals(Greek_language)) {
            Airvan="Airvan";
            Container_20_ft="Container 20 ft";
            Delivery="Delivery";
        }
        if(language.equals(English_UK_language)) {
            Airvan="Airvan";
            Container_20_ft="Container 20 ft";
            Delivery="Delivery";
        }
        if(language.equals(Italian_Language)) {
            Airvan="Airvan";
            Container_20_ft="Container 20 ft";
            Delivery="Delivery";

        }
        if(language.equals(Dutch_Language)) {
            Airvan="Airvan";
            Container_20_ft="Container 20 ft";
            Delivery="Delivery";

        }
        if(language.equals(Polish_Language)) {
            Airvan="Airvan";
            Container_20_ft="Container 20 ft";
            Delivery="Delivery";

        }
        if(language.equals(Romanian_Language)) {
            Airvan="Airvan";
            Container_20_ft="Container 20 ft";
            Delivery="Delivery";

        }
    }

    public static String getAirvan() {
        return Airvan;
    }

    public static String getContainer_20_ft() {
        return Container_20_ft;
    }

    public static String getDelivery() {
        return Delivery;
    }
}
