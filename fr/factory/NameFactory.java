package efrei.fr.factory;
import efrei.fr.domain.Name;
import efrei.fr.util.Helper;

public class NameFactory {

    public static Name createName(String firstName, String middleName, String lastName){
        if (Helper.isNullOrEmpty(firstName) ||Helper.isNullOrEmpty(middleName) || Helper.isNullOrEmpty(lastName)){
            return null;
        }
     Name name = new Name.Builder().setFirstName(firstName).setMiddleName(middleName).setLastName(lastName).build();
        return name;
    }

    public static Name createName(String firstName, String lastName){
        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)){
            return null;
        }
        Name name = new Name.Builder().setFirstName(firstName).setLastName(lastName).build();
        return name;
    }

    public static Name createName(String lastName){
        if (Helper.isNullOrEmpty(lastName)){
            return null;
        }
        Name name = new Name.Builder().setLastName(lastName).build();
        return name;
    }
}
