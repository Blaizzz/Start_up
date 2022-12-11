package efrei.fr.repository;

import efrei.fr.domain.Contact;
import efrei.fr.domain.EmployeeInfo;
import java.util.ArrayList;
import java.util.List;

public class EmployeeInfoRepository implements IEmployeeInfoRepository
{
    private static EmployeeInfoRepository repository = null;

    private List<EmployeeInfo> employeeInfoDB = null;

    private EmployeeInfoRepository()
    {
        employeeInfoDB = new ArrayList<EmployeeInfo>();
    }





    public static EmployeeInfoRepository getRepository()
    {
        if ( repository == null)
        {
            return  new EmployeeInfoRepository();
        }
        return repository;
    }

    @Override
    public EmployeeInfo create(EmployeeInfo employeeInfo)
    {
        boolean sucess = employeeInfoDB.add(employeeInfo);
        if (sucess)
        {
            return employeeInfo;
        }
        else
        {
            return null;
        }
    }

    @Override
    public EmployeeInfo read(String s)
    {
        for (EmployeeInfo r: employeeInfoDB)
        {
            if (r.getEmployeeID().equals(s))
            {
                return r ;
            }
        }
        return null;
    }

    @Override
    public EmployeeInfo update(EmployeeInfo employeeInfo)
    {
        EmployeeInfo oldEmployeeInfo = read(employeeInfo.getEmployeeID());
        if (employeeInfo !=null)
        {
            employeeInfoDB.remove(oldEmployeeInfo);
            employeeInfoDB.add(employeeInfo);
            return employeeInfo;
        }
        return null;
    }

    @Override
    public boolean delete(String s)
    {
        EmployeeInfo employeeInfoToDelete = read(s);
        if (employeeInfoToDelete == null)
        {
            return false;
        }
        employeeInfoDB.remove(employeeInfoToDelete);
        return true;
    }

    @Override
    public List<EmployeeInfo> getAll()
    {
        return employeeInfoDB;
    }

    public EmployeeInfo find(int i){
        return employeeInfoDB.get(i);
    }
}

