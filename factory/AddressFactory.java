package Start_up.factory;

import efrei.fr.domain.Address;
import efrei.fr.util.Helper;

public class AddressFactory {


    public static Address createAddress(String addressStreet, String addressPostal){
        if (Helper.isNullOrEmpty(addressStreet) || Helper.isNullOrEmpty(addressPostal)){
            return null;
        }
        Address address = new Address.Builder().setaddressStreet(addressStreet).setaddressPostal(addressPostal).build();
        return address;
    }

}

