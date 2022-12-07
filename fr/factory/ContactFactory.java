package efrei.fr.factory;

import efrei.fr.domain.Contact;
import efrei.fr.util.Helper;

public class ContactFactory {

    public static Contact createContact(String contactCellPhoneNumber, String contactHomeNumber, String contactEmail){
        if (Helper.isNullOrEmpty(contactCellPhoneNumber) ||Helper.isNullOrEmpty(contactHomeNumber) || Helper.isNullOrEmpty(contactEmail)){
            return null;
        }
        Contact name = new Contact.Builder().setContactCellPhoneNumber(contactCellPhoneNumber).setContactHomeNumber(contactHomeNumber).setContactEmail(contactEmail).build();
        return name;
    }

    public static Contact createContact(String contactCellPhoneNumber, String contactEmail){
        if (Helper.isNullOrEmpty(contactCellPhoneNumber) || Helper.isNullOrEmpty(contactEmail)){
            return null;
        }
        Contact name = new Contact.Builder().setContactCellPhoneNumber(contactCellPhoneNumber).setContactEmail(contactEmail).build();
        return name;
    }

    public static Contact createContact(String contactCellPhoneNumber){
        if (Helper.isNullOrEmpty(contactCellPhoneNumber)){
            return null;
        }
        Contact name = new Contact.Builder().setContactCellPhoneNumber(contactCellPhoneNumber).build();
        return name;
    }
}

