package efrei.fr.factory;


import efrei.fr.util.Helper;
import efrei.fr.domain.Employee;

public class EmployeeFactory
{
    public static Employee createRace(int employeeNumber)
    {
        String employeeId = Helper.generateId();

        if (Helper.isZero(employeeNumber))
        {
            return null;
        }
        Employee employee = new Employee.Builder().setEmployeeID(employeeId).setEmployeeNumber(employeeNumber).build();
        return employee;
    }
}
