package Start_up.repository;


import efrei.fr.domain.Gender;

import java.util.*;

public interface IGenderRepository extends IRepository<Gender,String>
{
    // create,read,update,delete

    public List<Gender> getAll();

}