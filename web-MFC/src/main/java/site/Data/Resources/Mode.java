package site.Data.Resources;

import org.openqa.selenium.By;

import static site.Data.WebElements.UserMenu_WebElements.*;

/**
 * Created by user on 02.07.2018.
 */
public class Mode {

    static By language;
    public static String Air_AIR ;
    public static String Sea_LCL ;
    public static String Sea_20ft_Container ;
    public static String Sea_40ft_Container ;
    public static String Sea_40Ft_HC_Container ;
    public static String Truck_LTL ;
    public static String Truck_FTL ;
    public static String Sea_Groupage_20ft_Container ;
    public static String Sea_Groupage_40ft_Container ;
    public static String Sea_Groupage_40Ft_HC_Container ;
    public static String Sea_Groupage_FTL ;
    public static String Truck_Groupage_FTL ;


    public Mode(By language) {
        this.language = language;
        if (language.equals(English_language)) {
            Air_AIR = "Air AIR";
            Sea_LCL = "Sea LCL";
            Sea_20ft_Container = "Sea 20ft Container";
            Sea_40ft_Container = "Sea 40ft Container";
            Sea_40Ft_HC_Container = "Sea 40Ft HC Container";
            Truck_LTL = "Truck LTL";
            Truck_FTL = "Truck FTL";
            Sea_Groupage_20ft_Container = "Sea Groupage 20ft Container";
            Sea_Groupage_40ft_Container = "Sea Groupage 40ft Container";
            Sea_Groupage_40Ft_HC_Container = "Sea Groupage 40Ft HC Container";
            Sea_Groupage_FTL = "Sea Groupage FTL";
            Truck_Groupage_FTL = "Truck Groupage FTL";

        }
        if (language.equals(Franch_language)) {
            Air_AIR = "Aérien Aérien";
            Sea_LCL = "Mer LCL (fr)";
            Sea_20ft_Container = "Mer Container 20 pieds";
            Sea_40ft_Container = "Mer Container 40 pieds";
            Sea_40Ft_HC_Container = "Mer Container 40 pieds HC";
            Truck_LTL = "Route LTL (fr)";
            Truck_FTL = "Route AIR";
            Sea_Groupage_20ft_Container = "Groupage maritime Container 20 pieds";
            Sea_Groupage_40ft_Container = "Groupage maritime Container 40 pieds";
            Sea_Groupage_40Ft_HC_Container = "Groupage maritime Container 40 pieds HC";
            Sea_Groupage_FTL = "Groupage maritime FTL (fr)";
            Truck_Groupage_FTL = "Truck Groupage FTL";

        }
        if (language.equals(German_language)) {
            Air_AIR = "Air (de) AIR (de)";
            Sea_LCL = "Sea (de) LCL (de)";
            Sea_20ft_Container = "Sea (de) 20ft Container (de)";
            Sea_40ft_Container = "Sea (de) 40ft Container (de)";
            Sea_40Ft_HC_Container = "Sea (de) 40Ft HC Container (de)";
            Truck_LTL = "Truck (de) LTL (de)";
            Truck_FTL = "Truck (de) AIR";
            Sea_Groupage_20ft_Container = "Sea Groupage (de) 20ft Container (de)";
            Sea_Groupage_40ft_Container = "Sea Groupage (de) 40ft Container (de)";
            Sea_Groupage_40Ft_HC_Container = "Sea Groupage (de) 40Ft HC Container (de)";
            Sea_Groupage_FTL = "Sea Groupage (de) FTL (de)";
            Truck_Groupage_FTL = "Truck Groupage FTL";

        }
        if (language.equals(Spanish_language)) {
            Air_AIR = "Aéreo AÉREO";
            Sea_LCL = "Marítimo LCL";
            Sea_20ft_Container = "Marítimo Contenedor 20ft";
            Sea_40ft_Container = "Marítimo Contenedor 40ft";
            Sea_40Ft_HC_Container = "Marítimo Contenedor 40Ft HC";
            Truck_LTL = "Camión LTL";
            Truck_FTL = "Camión AIR";
            Sea_Groupage_20ft_Container = "Grupage Marítimo Contenedor 20ft";
            Sea_Groupage_40ft_Container = "Grupage Marítimo Contenedor 40ft";
            Sea_Groupage_40Ft_HC_Container = "Grupage Marítimo Contenedor 40Ft HC";
            Sea_Groupage_FTL = "Grupage Marítimo FTL";
            Truck_Groupage_FTL = "Truck Groupage FTL";

        }
        if (language.equals(Russian_language)) {
            Air_AIR = "Воздух AIR (ru)";
            Sea_LCL = "Море LCL (ru)";
            Sea_20ft_Container = "Море 20ft Container (ru)";
            Sea_40ft_Container = "Море 40ft Container (ru)";
            Sea_40Ft_HC_Container = "Море 40Ft HC Container (ru)";
            Truck_LTL = "Грузовик LTL (ru)";
            Truck_FTL = "Грузовик AIR";
            Sea_Groupage_20ft_Container = "Морской груз 20ft Container (ru)";
            Sea_Groupage_40ft_Container = "Морской груз 40ft Container (ru)";
            Sea_Groupage_40Ft_HC_Container = "Морской груз 40Ft HC Container (ru)";
            Sea_Groupage_FTL = "Морской груз FTL (ru)";
            Truck_Groupage_FTL = "Truck Groupage FTL";

        }
        if (language.equals(Portugal_language)) {
            Air_AIR = "Aéreo AÉREO";
            Sea_LCL = "Marítimo LCL";
            Sea_20ft_Container = "Marítimo Contenedor 20ft";
            Sea_40ft_Container = "Marítimo Contenedor 40ft";
            Sea_40Ft_HC_Container = "Marítimo Contenedor 40Ft HC";
            Truck_LTL = "Rodoviário LTL";
            Truck_FTL = "Rodoviário AIR";
            Sea_Groupage_20ft_Container = "Grupagem Marítima 20ft Container";
            Sea_Groupage_40ft_Container = "Grupagem Marítima 40ft Container";
            Sea_Groupage_40Ft_HC_Container = "Grupagem Marítima 40Ft HC Container";
            Sea_Groupage_FTL = "Grupagem Marítima FTL";
            Truck_Groupage_FTL = "Truck Groupage FTL";

        }
        if (language.equals(Greek_language)) {
            Air_AIR = "Αεροπλάνο AIR";
            Sea_LCL = "Θάλασσα LCL";
            Sea_20ft_Container = "Θάλασσα 20ft Container";
            Sea_40ft_Container = "Θάλασσα 40ft Container";
            Sea_40Ft_HC_Container = "Θάλασσα 40Ft HC Container";
            Truck_LTL = "Φορτηγό LTL";
            Truck_FTL = "Φορτηγό AIR";
            Sea_Groupage_20ft_Container = "Groupage Θαλάσσης 20ft Container";
            Sea_Groupage_40ft_Container = "Groupage Θαλάσσης 40ft Container";
            Sea_Groupage_40Ft_HC_Container = "Groupage Θαλάσσης 40Ft HC Container";
            Sea_Groupage_FTL = "Groupage Θαλάσσης FTL";
            Truck_Groupage_FTL = "Truck Groupage FTL";

        }
        if (language.equals(English_UK_language)) {
            Air_AIR = "Air AIR";
            Sea_LCL = "Sea LCL";
            Sea_20ft_Container = "Sea 20ft Container";
            Sea_40ft_Container = "Sea 40ft Container";
            Sea_40Ft_HC_Container = "Sea 40Ft HC Container";
            Truck_LTL = "Truck LTL";
            Truck_FTL = "Truck FTL";
            Sea_Groupage_20ft_Container = "Sea Groupage 20ft Container";
            Sea_Groupage_40ft_Container = "Sea Groupage 20ft Container";
            Sea_Groupage_40Ft_HC_Container = "Sea Groupage 40Ft HC Container";
            Sea_Groupage_FTL = "Sea Groupage FTL";
            Truck_Groupage_FTL = "Truck Groupage FTL";

        }
        if (language.equals(Italian_Language)) {
            Air_AIR = "Air AIR";
            Sea_LCL = "Sea LCL";
            Sea_20ft_Container = "Sea 20ft Container";
            Sea_40ft_Container = "Sea 40ft Container";
            Sea_40Ft_HC_Container = "Sea 40Ft HC Container";
            Truck_LTL = "Truck LTL";
            Truck_FTL = "Truck FTL";
            Sea_Groupage_20ft_Container = "Sea Groupage 20ft Container";
            Sea_Groupage_40ft_Container = "Sea Groupage 40ft Container";
            Sea_Groupage_40Ft_HC_Container = "Sea Groupage 40Ft HC Container";
            Sea_Groupage_FTL = "Sea Groupage FTL";
            Truck_Groupage_FTL = "Truck Groupage FTL";

        }
        if (language.equals(Dutch_Language)) {
            Air_AIR = "Air AIR";
            Sea_LCL = "Sea LCL";
            Sea_20ft_Container = "Sea 20ft Container";
            Sea_40ft_Container = "Sea 40ft Container";
            Sea_40Ft_HC_Container = "Sea 40Ft HC Container";
            Truck_LTL = "Truck LTL";
            Truck_FTL = "Truck FTL";
            Sea_Groupage_20ft_Container = "Sea Groupage 20ft Container";
            Sea_Groupage_40ft_Container = "Sea Groupage 40ft Container";
            Sea_Groupage_40Ft_HC_Container = "Sea Groupage 40Ft HC Container";
            Sea_Groupage_FTL = "Sea Groupage FTL";
            Truck_Groupage_FTL = "Truck Groupage FTL";

        }
        if (language.equals(Polish_Language)) {
            Air_AIR = "Air AIR";
            Sea_LCL = "Sea LCL";
            Sea_20ft_Container = "Sea 20ft Container";
            Sea_40ft_Container = "Sea 40ft Container";
            Sea_40Ft_HC_Container = "Sea 40Ft HC Container";
            Truck_LTL = "Truck LTL";
            Truck_FTL = "Truck FTL";
            Sea_Groupage_20ft_Container = "Sea Groupage 20ft Container";
            Sea_Groupage_40ft_Container = "Sea Groupage 40ft Container";
            Sea_Groupage_40Ft_HC_Container = "Sea Groupage 40Ft HC Container";
            Sea_Groupage_FTL = "Sea Groupage FTL";
            Truck_Groupage_FTL = "Truck Groupage FTL";

        }
        if (language.equals(Romanian_Language)) {
            Air_AIR = "Air AIR";
            Sea_LCL = "Sea LCL";
            Sea_20ft_Container = "Sea 20ft Container";
            Sea_40ft_Container = "Sea 40ft Container";
            Sea_40Ft_HC_Container = "Sea 40Ft HC Container";
            Truck_LTL = "Truck LTL";
            Truck_FTL = "Truck FTL";
            Sea_Groupage_20ft_Container = "Sea Groupage 20ft Container";
            Sea_Groupage_40ft_Container = "Sea Groupage 40ft Container";
            Sea_Groupage_40Ft_HC_Container = "Sea Groupage 40Ft HC Container";
            Sea_Groupage_FTL = "Sea Groupage FTL";
            Truck_Groupage_FTL = "Truck Groupage FTL";

        }

    }
}
