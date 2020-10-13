package site.Data.Resources;

import org.openqa.selenium.By;

import static site.Data.WebElements.UserMenu_WebElements.*;

/**
 * Created by user on 11.11.2018.
 */
public class Country {
    By language;
    public static String Albania;
    public static String Bulgaria;
    public static String Israel;


    public Country (By language){
        this.language=language;

        if(language.equals(English_language)){
            Albania="Albania";
            Bulgaria="Bulgaria";
            Israel="Israel";
        }

        if(language.equals(Franch_language)){
            Albania="Albania";
            Bulgaria="Bulgaria";
            Israel="Israel";
        }

        if(language.equals(German_language)){
            Albania="Albania";
            Bulgaria="Bulgaria";
            Israel="Israel";
        }
        if(language.equals(Spanish_language)){
            Albania="Albania";
            Bulgaria="Bulgaria";
            Israel="Israel";
        }

        if(language.equals(Russian_language)){
            Albania="Албания";
            Bulgaria="Болгария";
            Israel="Израиль";
        }

        if(language.equals(Portugal_language)){
            Albania="Albânia";
            Bulgaria="Bulgária";
            Israel="Israel";
        }

        if(language.equals(Greek_language)){
            Albania="Αλβανία";
            Bulgaria="Βουλγαρία";
            Israel="Ισραήλ";
        }

        if(language.equals(English_UK_language)){
            Albania="Albania";
            Bulgaria="Bulgaria";
            Israel="Israel";
        }
        if(language.equals(Italian_Language)){
            Albania="Albania";
            Bulgaria="Bulgaria";
            Israel="Israel";
        }
        if(language.equals(Dutch_Language)){
            Albania="Albania";
            Bulgaria="Bulgaria";
            Israel="Israel";
        }
        if(language.equals(Polish_Language)){
            Albania="Albania";
            Bulgaria="Bulgaria";
            Israel="Israel";
        }
        if(language.equals(Romanian_Language)){
            Albania="Albania";
            Bulgaria="Bulgaria";
            Israel="Israel";
        }
    }
}
