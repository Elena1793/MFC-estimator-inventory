package site.Data.Resources;

import org.openqa.selenium.By;

import static site.Data.WebElements.UserMenu_WebElements.*;


/**
 * Created by user on 25.06.2018.
 */
public class BookingType {
    By language;

    public static String Private;
    public static String Agent;
    public static String Commercial;
    public static String Corporate;
    public static String Corporate_competitive;
    public static String Move_management;


    public BookingType(By language){

        this.language=language;

        if(language.equals(English_language)) {
            Private="Private";
            Agent="Agent";
            Commercial="Commercial";
            Corporate="Corporate";
            Corporate_competitive="Corporate competitive";
            Move_management="Move management";

        }
        if(language.equals(Franch_language)) {
            Private="Privée";
            Agent="Agent";
            Commercial="Commercial";
            Corporate="Société";
            Corporate_competitive="Corporate competitive";
            Move_management="Move management";

        }
        if(language.equals(German_language)) {
            Private="Privat";
            Agent="Agent";
            Commercial="Kommerziell";
            Corporate="Firmen";
            Corporate_competitive="Corporate competitive";
            Move_management="Move management";

        }
        if(language.equals(Spanish_language)) {
            Private="Privado";
            Agent="Agente";
            Commercial="Comercial";
            Corporate="Corporativo";
            Corporate_competitive="Corporate competitive";
            Move_management="Move management";

        }
        if(language.equals(Russian_language)) {
            Private="Частная";
            Agent="Агентская";
            Commercial="Коммерческая";
            Corporate="Корпоративная";
            Corporate_competitive="Corporate competitive";
            Move_management="Move management";
        }
        if(language.equals(Portugal_language)) {
            Private="Privado";
            Agent="Agente";
            Commercial="Comercial";
            Corporate="Корпоративная";
            Corporate_competitive="Corporate competitive";
            Move_management="Move management";
        }
        if(language.equals(Greek_language)) {
            Private="Ιδιωτικά";
            Agent="Ανταποκριτής";
            Commercial="Commercial";
            Corporate="Εμπορικά";
            Corporate_competitive="Corporate competitive";
            Move_management="Move management";
        }
        if(language.equals(English_UK_language)) {
            Private="Private";
            Agent="Agent";
            Commercial="Commercial";
            Corporate="Corporate";
            Corporate_competitive="Corporate competitive";
            Move_management="Move management";
        }
        if(language.equals(Italian_Language)) {
            Private="Private";
            Agent="Agent";
            Commercial="Commercial";
            Corporate="Corporate";
            Corporate_competitive="Corporate competitive";
            Move_management="Move management";

        }
        if(language.equals(Dutch_Language)) {
            Private="Private";
            Agent="Agent";
            Commercial="Commercial";
            Corporate="Corporate";
            Corporate_competitive="Corporate competitive";
            Move_management="Move management";

        }
        if(language.equals(Polish_Language)) {
            Private="Private";
            Agent="Agent";
            Commercial="Commercial";
            Corporate="Corporate";
            Corporate_competitive="Corporate competitive";
            Move_management="Move management";

        }
        if(language.equals(Romanian_Language)) {
            Private="Private";
            Agent="Agent";
            Commercial="Commercial";
            Corporate="Corporate";
            Corporate_competitive="Corporate competitive";
            Move_management="Move management";

        }
    }
}
