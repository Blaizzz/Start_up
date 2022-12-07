package efrei.fr.repository;

import efrei.fr.domain.Gender;
import java.util.ArrayList;
import java.util.List;

public class GenderRepository implements IGenderRepository
{
    private static GenderRepository repository = null;

    private List<Gender> genderDB = null;

    private GenderRepository()
    {
        genderDB = new ArrayList<Gender>();
    }





    public static GenderRepository getRepository()
    {
        if ( repository == null)
        {
            return  new GenderRepository();
        }
        return repository;
    }

    @Override
    public Gender create(Gender gender)
    {
        boolean sucess = genderDB.add(gender);
        if (sucess)
        {
            return gender;
        }
        else
        {
            return null;
        }
    }

    @Override
    public Gender read(String s)
    {
        for (Gender r: genderDB)
        {
            if (r.getId().equals(s))
            {
                return r ;
            }
        }
        return null;
    }

    @Override
    public Gender update(Gender gender)
    {
        Gender oldGender = read(gender.getId());
        if (gender!=null)
        {
            genderDB.remove(oldGender);
            genderDB.add(gender);
            return gender;
        }
        return null;
    }

    @Override
    public boolean delete(String s)
    {
        Gender genderToDelete = read(s);
        if (genderToDelete == null)
        {
            return false;
        }
        genderDB.remove(genderToDelete);
        return true;
    }

    @Override
    public List<Gender> getAll()
    {
        return genderDB;
    }
}
