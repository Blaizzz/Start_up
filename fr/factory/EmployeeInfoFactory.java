package efrei.fr.factory;


import efrei.fr.util.Helper;
import efrei.fr.domain.EmployeeInfo;

public class EmployeeInfoFactory
{
    public static EmployeeInfo createEmployeeInfo(int employeeNumber)
    {
        String employeeId = Helper.generateId();

        if (Helper.isZero(employeeNumber))
        {
            return null;
        }
        EmployeeInfo employeeInfo = new EmployeeInfo.Builder().setEmployeeID(employeeId).setEmployeeNumber(employeeNumber).build();
        return employeeInfo;
    }
}
