package Start_up.repository;

import efrei.fr.domain.Address;

import java.util.*;

public interface IAddressRepository extends IRepository<Address,String>
{
    // create,read,update,delete

    public List<Address> getAll();

}
