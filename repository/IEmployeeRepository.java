package Start_up.repository;

import efrei.fr.domain.Employee;

import java.util.*;

public interface IEmployeeRepository extends IRepository<Employee,String>
{
    // create,read,update,delete

    public List<Employee> getAll();

}
