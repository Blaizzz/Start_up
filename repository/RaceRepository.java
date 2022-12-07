package Start_up.repository;

//import com.company.domain.Race;

import efrei.fr.domain.Race;
import java.util.ArrayList;
import java.util.List;

public class RaceRepository implements IRaceRepository
{
    private static RaceRepository repository = null;

    private List<Race> raceDB = null;

    private RaceRepository()
    {
        raceDB = new ArrayList<Race>();
    }





    public static RaceRepository getRepository()
    {
        if ( repository == null)
        {
            return  new RaceRepository();
        }
        return repository;
    }

    @Override
    public Race create(Race race)
    {
        boolean sucess = raceDB.add(race);
        if (sucess)
        {
            return race;
        }
        else
        {
            return null;
        }
    }

    @Override
    public Race read(String s)
    {
        for (Race r: raceDB)
        {
            if (r.getId().equals(s))
            {
                return r ;
            }
        }
        return null;
    }

    @Override
    public Race update(Race race)
    {
        Race oldRace = read(race.getId());
        if (race!=null)
        {
            raceDB.remove(oldRace);
            raceDB.add(race);
            return race;
        }
        return null;
    }

    @Override
    public boolean delete(String s)
    {
        Race raceToDelete = read(s);
        if (raceToDelete == null)
        {
            return false;
        }
        raceDB.remove(raceToDelete);
        return true;
    }

    @Override
    public List<Race> getAll()
    {
        return raceDB;
    }
}
