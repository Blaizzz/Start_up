package Start_up.repository;

import efrei.fr.domain.Identities;
import java.util.ArrayList;
import java.util.List;

public class IdentitiesRepository implements IIdentitiesRepository
{
    private static IdentitiesRepository repository = null;

    private List<Identities> identitiesDB = null;

    private IdentitiesRepository()
    {
        identitiesDB = new ArrayList<Identities>();
    }





    public static IdentitiesRepository getRepository()
    {
        if ( repository == null)
        {
            return  new IdentitiesRepository();
        }
        return repository;
    }

    @Override
    public Identities create(Identities identities)
    {
        boolean sucess = identitiesDB.add(identities);
        if (sucess)
        {
            return identities;
        }
        else
        {
            return null;
        }
    }

    @Override
    public Identities read(String s)
    {
        for (Identities r: identitiesDB)
        {
            if (r.getIdentitiesValue().equals(s))
            {
                return r ;
            }
        }
        return null;
    }

    @Override
    public Identities update(Identities identities)
    {
        Identities oldIdentities = read(identities.getIdentitiesValue());
        if (identities!=null)
        {
            identitiesDB.remove(oldIdentities);
            identitiesDB.add(identities);
            return identities;
        }
        return null;
    }

    @Override
    public boolean delete(String s)
    {
        Identities nameToDelete = read(s);
        if (nameToDelete == null)
        {
            return false;
        }
        identitiesDB.remove(nameToDelete);
        return true;
    }

    @Override
    public List<Identities> getAll()
    {
        return identitiesDB;
    }
}
