package Start_up.repository;

import efrei.fr.domain.Contact;
import java.util.ArrayList;
import java.util.List;

public class ContactRepository implements IContactRepository
{
    private static ContactRepository repository = null;

    private List<Contact> contactDB = null;

    private ContactRepository()
    {
        contactDB = new ArrayList<Contact>();
    }





    public static ContactRepository getRepository()
    {
        if ( repository == null)
        {
            return  new ContactRepository();
        }
        return repository;
    }

    @Override
    public Contact create(Contact contact)
    {
        boolean sucess = contactDB.add(contact);
        if (sucess)
        {
            return contact;
        }
        else
        {
            return null;
        }
    }

    @Override
    public Contact read(String s)
    {
        for (Contact r: contactDB)
        {
            if (r.getContactCellPhoneNumber().equals(s))
            {
                return r ;
            }
        }
        return null;
    }

    @Override
    public Contact update(Contact name)
    {
        Contact oldName = read(name.getContactCellPhoneNumber());
        if (name!=null)
        {
            contactDB.remove(oldName);
            contactDB.add(name);
            return name;
        }
        return null;
    }

    @Override
    public boolean delete(String s)
    {
        Contact nameToDelete = read(s);
        if (nameToDelete == null)
        {
            return false;
        }
        contactDB.remove(nameToDelete);
        return true;
    }

    @Override
    public List<Contact> getAll()
    {
        return contactDB;
    }
}
