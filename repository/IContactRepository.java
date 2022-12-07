package Start_up.repository;


import efrei.fr.domain.Contact;

import java.util.*;

public interface IContactRepository extends IRepository<Contact,String>
{
    // create,read,update,delete

    public List<Contact> getAll();

}