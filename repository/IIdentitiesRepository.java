package Start_up.repository;

import efrei.fr.domain.Identities;

import java.util.*;

public interface IIdentitiesRepository extends IRepository<Identities,String>
{
    // create,read,update,delete

    public List<Identities> getAll();

}
