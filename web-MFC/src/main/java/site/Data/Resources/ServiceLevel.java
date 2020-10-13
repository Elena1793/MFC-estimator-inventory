package site.Data.Resources;

import org.openqa.selenium.By;

import static site.Data.WebElements.UserMenu_WebElements.*;

/**
 * Created by user on 28.06.2018.
 */
public class ServiceLevel {
    By language;

    public static String Full_Origin_Service;
    public static String Full_Destination_Service ;
    public static String Maid_Service;
    public static String Handyman_Service;


    public ServiceLevel(By language) {

        this.language=language;
        if(language.equals(English_language)) {
            Full_Origin_Service = "Full Origin Service";
            Full_Destination_Service = "Full Destination Service";
            Handyman_Service = "Handyman Service";
            Maid_Service = "Maid Service";

        }
        if(language.equals(Franch_language)) {
            Full_Origin_Service= "Full Origin Service (fr)";
            Full_Destination_Service = "Full Destination Service (fr)";
            Handyman_Service = "Handyman Service";
            Maid_Service = "Maid Service (fr)";

        }
        if(language.equals(German_language)) {
            Full_Destination_Service = "Full Destination Service (de)";
            Full_Origin_Service= "Full Origin Service (de)";
            Handyman_Service = "Handyman Service";
            Maid_Service = "Maid Service (de)";

        }
        if(language.equals(Spanish_language)) {
            Full_Destination_Service = "Servicio completo en Destino";
            Full_Origin_Service= "Servicio completo en Origen";
            Handyman_Service = "Handyman Service";
            Maid_Service = "Servicio de limpieza";

        }
        if(language.equals(Russian_language)) {
            Full_Destination_Service = "Полное обслуживание в конечном пункте";
            Full_Origin_Service= "Полное обслуживание в начальном пункте";
            Handyman_Service = "Handyman Service";
            Maid_Service = "Услуги горничной";

        }
        if(language.equals(Portugal_language)) {
            Full_Destination_Service = "Serviço de Destino completa (de)";
            Full_Origin_Service= "Serviço de Origem completo";
            Handyman_Service = "Handyman Service";
            Maid_Service = "Serviço de Limpeza (de)";

        }
        if(language.equals(Greek_language)) {
            Full_Destination_Service = "Πλήρης Υπηρεσία Προορισμού";
            Full_Origin_Service= "Πλήρης Υπηρεσία Προέλευσης";
            Handyman_Service = "Handyman Service";
            Maid_Service = "Βοηθητική Υπηρεσία";

        }
        if(language.equals(English_UK_language)) {
            Full_Destination_Service = "Full Destination Service";
            Full_Origin_Service= "Full Origin Service";
            Handyman_Service = "Handyman Service";
            Maid_Service = "Maid Service";

        }
        if(language.equals(Italian_Language)) {
            Full_Origin_Service = "Full Origin Service";
            Full_Destination_Service = "Full Destination Service";
            Handyman_Service = "Handyman Service";
            Maid_Service = "Maid Service";

        }
        if(language.equals(Dutch_Language)) {
            Full_Origin_Service = "Full Origin Service";
            Full_Destination_Service = "Full Destination Service";
            Handyman_Service = "Handyman Service";
            Maid_Service = "Maid Service";

        }
        if(language.equals(Polish_Language)) {
            Full_Origin_Service = "Full Origin Service";
            Full_Destination_Service = "Full Destination Service";
            Handyman_Service = "Handyman Service";
            Maid_Service = "Maid Service";

        }
        if(language.equals(Romanian_Language)) {
            Full_Origin_Service = "Full Origin Service";
            Full_Destination_Service = "Full Destination Service";
            Handyman_Service = "Handyman Service";
            Maid_Service = "Maid Service";

        }
    }




/*
    LanguageID	TenantID	Code	Label
1	1	Enum.ServiceLevel.FullDestinationService	Full Destination Service
1	1	Enum.ServiceLevel.FullOriginService	Full Origin Service
1	1	Enum.ServiceLevel.HandymanService	Handyman Service
1	1	Enum.ServiceLevel.MaidService	Maid Service
2	1	Enum.ServiceLevel.FullDestinationService	Full Destination Service (fr)
2	1	Enum.ServiceLevel.FullOriginService	Full Origin Service (fr)
2	1	Enum.ServiceLevel.HandymanService	Handyman Service
2	1	Enum.ServiceLevel.MaidService	Maid Service (fr)
3	1	Enum.ServiceLevel.FullDestinationService	Full Destination Service (de)
3	1	Enum.ServiceLevel.FullOriginService	Full Origin Service (de)
3	1	Enum.ServiceLevel.HandymanService	Handyman Service
3	1	Enum.ServiceLevel.MaidService	Maid Service (de)
4	1	Enum.ServiceLevel.FullDestinationService	Servicio completo en Destino
4	1	Enum.ServiceLevel.FullOriginService	Servicio completo en Origen
4	1	Enum.ServiceLevel.HandymanService	Handyman Service
4	1	Enum.ServiceLevel.MaidService	Servicio de limpieza
5	1	Enum.ServiceLevel.FullDestinationService	Полное обслуживание в конечном пункте
5	1	Enum.ServiceLevel.FullOriginService	Полное обслуживание в начальном пункте
5	1	Enum.ServiceLevel.HandymanService	Handyman Service
5	1	Enum.ServiceLevel.MaidService	Услуги горничной
6	1	Enum.ServiceLevel.FullDestinationService	Serviço de Destino completa (de)
6	1	Enum.ServiceLevel.FullOriginService	Serviço de Origem completo
6	1	Enum.ServiceLevel.HandymanService	Handyman Service
6	1	Enum.ServiceLevel.MaidService	Serviço de Limpeza (de)
7	1	Enum.ServiceLevel.FullDestinationService	Πλήρης Υπηρεσία Προορισμού
7	1	Enum.ServiceLevel.FullOriginService	Πλήρης Υπηρεσία Προέλευσης
7	1	Enum.ServiceLevel.HandymanService	Handyman Service
7	1	Enum.ServiceLevel.MaidService	Βοηθητική Υπηρεσία
8	1	Enum.ServiceLevel.FullDestinationService	Full Destination Service
8	1	Enum.ServiceLevel.FullOriginService	Full Origin Service
8	1	Enum.ServiceLevel.HandymanService	Handyman Service
8	1	Enum.ServiceLevel.MaidService	Maid Service*/
}
