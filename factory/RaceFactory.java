package Start_up.factory;

//import com.company.util.Helper;
//import com.company.domain.Race;

import efrei.fr.util.Helper;
import efrei.fr.domain.Race;

public class RaceFactory
{
    public static Race createRace(String description)
    {
        String id = Helper.generateId();

        if (Helper.isNullOrEmpty(description))
        {
            return null;
        }
        Race race = new Race.Builder().setId(id).setDescription(description).build();
        return race;
    }
}
