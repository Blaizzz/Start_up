package efrei.fr.factory;


import efrei.fr.util.Helper;
import efrei.fr.domain.Gender;

public class GenderFactory
{
    public static Gender createRace(String description)
    {
        String id = Helper.generateId();

        if (Helper.isNullOrEmpty(description))
        {
            return null;
        }
        Gender gender = new Gender.Builder().setId(id).setDescription(description).build();
        return gender;
    }
}

