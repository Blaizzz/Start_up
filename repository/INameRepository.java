package Start_up.repository;

import efrei.fr.domain.Name;

import java.util.*;

public interface INameRepository extends IRepository<Name,String>
{
    // create,read,update,delete

    public List<Name> getAll();

}
