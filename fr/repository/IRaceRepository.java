package efrei.fr.repository;

//import com.company.domain.Race;

import efrei.fr.domain.Race;

import java.util.*;

public interface IRaceRepository extends IRepository<Race,String>
{
    // create,read,update,delete

    public List<Race> getAll();

}
