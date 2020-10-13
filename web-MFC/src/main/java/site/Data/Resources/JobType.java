package site.Data.Resources;

import org.openqa.selenium.By;

import static site.Data.WebElements.UserMenu_WebElements.*;

/**
 * Created by user on 01.07.2018.
 */
public class JobType {
    By language;

    public static String Export;
    public static String Domestic;
    public static String Fine_Arts;
    public static String Import;
    public static String Local;
    public static String National;
    public static String Storage;


    public JobType(By language){
        this.language=language;
        if(language.equals(English_language)) {
            Export = "Export";
            Domestic = "Domestic";
            Fine_Arts = "Fine Arts";
            Import = "Import";
            Local = "Local";
            National = "National";
            Storage = "Storage";

        }
        if(language.equals(Franch_language)) {
            Export = "Export";
            Domestic = "Domestic";
            Fine_Arts = "Fine Arts";
            Import = "Import";
            Local = "Local";
            National = "National";
            Storage = "Storage";

        }
        if(language.equals(German_language)) {
            Export = "Export";
            Domestic = "Domestic";
            Fine_Arts = "Fine Arts";
            Import = "Import";
            Local = "Local";
            National = "National";
            Storage = "Storage";

        }
        if(language.equals(Spanish_language)) {
            Export = "Export";
            Domestic = "Domestic";
            Fine_Arts = "Fine Arts";
            Import = "Import";
            Local = "Local";
            National = "National";
            Storage = "Storage";
        }
        if(language.equals(Russian_language)) {
            Export = "Export";
            Domestic = "Domestic";
            Fine_Arts = "Fine Arts";
            Import = "Import";
            Local = "Local";
            National = "National";
            Storage = "Storage";

        }
        if(language.equals(Portugal_language)) {
            Export = "Export";
            Domestic = "Domestic";
            Fine_Arts = "Fine Arts";
            Import = "Import";
            Local = "Local";
            National = "National";
            Storage = "Storage";

        }
        if(language.equals(Greek_language)) {
            Export = "Export";
            Domestic = "Domestic";
            Fine_Arts = "Fine Arts";
            Import = "Import";
            Local = "Local";
            National = "National";
            Storage = "Storage";

        }
        if(language.equals(English_UK_language)) {
            Export = "Export";
            Domestic = "Domestic";
            Fine_Arts = "Fine Arts";
            Import = "Import";
            Local = "Local";
            National = "National";
            Storage = "Storage";

        }
        if(language.equals(Italian_Language)) {
            Export = "Export";
            Domestic = "Domestic";
            Fine_Arts = "Fine Arts";
            Import = "Import";
            Local = "Local";
            National = "National";
            Storage = "Storage";

        }
        if(language.equals(Dutch_Language)) {
            Export = "Export";
            Domestic = "Domestic";
            Fine_Arts = "Fine Arts";
            Import = "Import";
            Local = "Local";
            National = "National";
            Storage = "Storage";

        }
        if(language.equals(Polish_Language)) {
            Export = "Export";
            Domestic = "Domestic";
            Fine_Arts = "Fine Arts";
            Import = "Import";
            Local = "Local";
            National = "National";
            Storage = "Storage";

        }
        if(language.equals(Romanian_Language)) {
            Export = "Export";
            Domestic = "Domestic";
            Fine_Arts = "Fine Arts";
            Import = "Import";
            Local = "Local";
            National = "National";
            Storage = "Storage";

        }
    }
}
