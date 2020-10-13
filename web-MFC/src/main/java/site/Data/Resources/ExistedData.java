package site.Data.Resources;

import site.Data.Resources.GlobalResources.Version;

/**
 * Created by user on 22.10.2018.
 */
public class ExistedData {
    public String version;
    public static String booker;
    public static String account;
    public String clientFirstName;

    public ExistedData(String version){
        this.version=version;
        if (version.equals(Version.development)){
            booker="DIVfinTest";
            account="Amazon Canada";
            clientFirstName="Automation";
        }
        if (version.equals(Version.prodaction)||version.equals(Version.MFP2) ){
            booker="DIVfinTest";
            account="ES_Account7";
            clientFirstName="Automation";
        }
    }
}
