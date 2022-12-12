package efrei.fr.factory;

import efrei.fr.domain.*;
import efrei.fr.util.Helper;

public class EmployeeFactory {

    public static Employee createEmployee(Address empAdress, Contact empContact, EmployeeInfo empInfo, Gender empGender, Identities empIdentities, Name empName, Position empPosition, Race empRace) {
        //if (Helper.isNullOrEmpty(empAdress) ||Helper.isNullOrEmpty(empContact) || Helper.isNullOrEmpty(empInfo)||Helper.isNullOrEmpty(empIdentities) || Helper.isNullOrEmpty(empName)||Helper.isNullOrEmpty(empGender) || Helper.isNullOrEmpty(empRace)|| Helper.isNullOrEmpty(empPosition)){
        //     return null;
        //}
        String id = Helper.generateEmpId(empInfo);

        Employee emp = new Employee.Builder().setID(id).setEmpAdress(empAdress).setEmpContact(empContact).setEmpInfo(empInfo).setEmpGender(empGender).setEmpIdentities(empIdentities).setEmpPosition(empPosition).setEmpRace(empRace).setEmpName(empName).build();
        return emp;
    }

    public static Employee createEmployee(String id,Address empAdress, Contact empContact, EmployeeInfo empInfo, Gender empGender, Identities empIdentities, Name empName, Position empPosition, Race empRace) {
        //if (Helper.isNullOrEmpty(empAdress) ||Helper.isNullOrEmpty(empContact) || Helper.isNullOrEmpty(empInfo)||Helper.isNullOrEmpty(empIdentities) || Helper.isNullOrEmpty(empName)||Helper.isNullOrEmpty(empGender) || Helper.isNullOrEmpty(empRace)|| Helper.isNullOrEmpty(empPosition)){
        //     return null;
        //}

        Employee emp = new Employee.Builder().setID(id).setEmpAdress(empAdress).setEmpContact(empContact).setEmpInfo(empInfo).setEmpGender(empGender).setEmpIdentities(empIdentities).setEmpPosition(empPosition).setEmpRace(empRace).setEmpName(empName).build();
        return emp;
    }
}