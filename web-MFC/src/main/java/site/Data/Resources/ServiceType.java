package site.Data.Resources;

import org.openqa.selenium.By;

import static site.Data.WebElements.UserMenu_WebElements.*;

/**
 * Created by user on 04.07.2018.
 */
public class ServiceType {
    By language;
    public static String DTD;
    public static String DTP;
    public static String PTP;
    public static String WTW;
    public static String PTD;

    public ServiceType(By language){
        this.language=language;

        if(language.equals(English_language)) {
            DTD = "DTD";
            DTP = "DTP";
            PTP = "PTP";
            WTW = "WTW";
            PTD = "PTD";
        }
        if(language.equals(Franch_language)) {
            DTD = "DTD (fr)";
            DTP = "DTP (fr)";
            PTP = "PTP (fr)";
            WTW = "WTW (fr)";
            PTD = "PTD";

        }
        if(language.equals(German_language)) {
            DTD = "DTD (de)";
            DTP = "DTP (de)";
            PTP = "PTP (de)";
            WTW = "WTW (de)";
            PTD = "PTD";

        }
        if(language.equals(Spanish_language)) {
            DTD = "DTD (es)";
            DTP = "DTP (es)";
            PTP = "PTP (es)";
            WTW = "WTW (es)";
            PTD = "PTD";

        }
        if(language.equals(Russian_language)) {
            DTD = "DTD (ru)";
            DTP = "DTP (ru)";
            PTP = "PTP (ru)";
            WTW = "WTW (ru)";
            PTD = "PTD";
        }
        if(language.equals(Portugal_language)) {
            DTD = "DTD";
            DTP = "DTP";
            PTP = "PTP";
            WTW = "WTW";
            PTD = "PTD";
        }
        if(language.equals(Greek_language)) {
            DTD = "DTD";
            DTP = "DTP";
            PTP = "PTP";
            WTW = "WTW";
            PTD = "PTD";
        }
        if(language.equals(English_UK_language)) {
            DTD = "DTD";
            DTP = "DTP";
            PTP = "PTP";
            WTW = "WTW";
            PTD = "PTD";
        }
        if(language.equals(Italian_Language)) {
            DTD = "DTD";
            DTP = "DTP";
            PTP = "PTP";
            WTW = "WTW";
            PTD = "PTD";
        }
        if(language.equals(Dutch_Language)) {
            DTD = "DTD";
            DTP = "DTP";
            PTP = "PTP";
            WTW = "WTW";
            PTD = "PTD";
        }
        if(language.equals(Polish_Language)) {
            DTD = "DTD";
            DTP = "DTP";
            PTP = "PTP";
            WTW = "WTW";
            PTD = "PTD";
        }
        if(language.equals(Romanian_Language)) {
            DTD = "DTD";
            DTP = "DTP";
            PTP = "PTP";
            WTW = "WTW";
            PTD = "PTD";
        }
    }

}
