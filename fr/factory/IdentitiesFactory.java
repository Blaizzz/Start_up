package efrei.fr.factory;

import efrei.fr.domain.Identities;
import efrei.fr.util.Helper;

public class IdentitiesFactory {


    public static Identities createIdentities(String identitiesType, String identitiesValue){
        if (Helper.isNullOrEmpty(identitiesType) || Helper.isNullOrEmpty(identitiesValue)){
            return null;
        }
        Identities identities = new Identities.Builder().setIdentitiesType(identitiesType).setIdentitiesValue(identitiesValue).build();
        return identities;
    }

}