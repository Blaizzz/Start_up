package efrei.fr.repository;

import efrei.fr.domain.Employee;
import efrei.fr.domain.EmployeeInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository, Serializable
{
    private static EmployeeRepository repository = null;

    private List<Employee> employeeDB = null;

    private EmployeeRepository()
    {
        employeeDB = new ArrayList<Employee>();
    }





    public static EmployeeRepository getRepository()
    {
        if ( repository == null)
        {
            return  new EmployeeRepository();
        }
        return repository;
    }

    @Override
    public Employee create(Employee employee)
    {
        boolean sucess = employeeDB.add(employee);
        if (sucess)
        {
            return employee;
        }
        else
        {
            return null;
        }
    }

    @Override
    public Employee read(String s)
    {
        for (Employee r: employeeDB)
        {
            if (r.getID().equals(s))
            {
                return r ;
            }
        }
        return null;
    }

    @Override
    public Employee update(Employee employee)
    {
        Employee oldEmployee = read(employee.getID());
        if (employee!=null)
        {
            employeeDB.remove(oldEmployee);
            employeeDB.add(employee);
            return employee;
        }
        return null;
    }

    @Override
    public boolean delete(String s)
    {
        Employee employeeToDelete = read(s);
        if (employeeToDelete == null)
        {
            return false;
        }
        employeeDB.remove(employeeToDelete);
        return true;
    }

    @Override
    public List<Employee> getAll()
    {
        return employeeDB;
    }

    public Employee find(int i){
        return employeeDB.get(i);
    }
}

