package efrei.fr.views;

import efrei.fr.domain.Address;
import efrei.fr.domain.Name;
import efrei.fr.domain.Race;
import efrei.fr.domain.Gender;
import efrei.fr.domain.Contact;
import efrei.fr.domain.Employee;
import efrei.fr.domain.EmployeeInfo;
import efrei.fr.domain.Position;
import efrei.fr.domain.Identities;
import efrei.fr.factory.AddressFactory;
import efrei.fr.factory.NameFactory;
import efrei.fr.factory.RaceFactory;
import efrei.fr.factory.PositionFactory;
import efrei.fr.factory.GenderFactory;
import efrei.fr.factory.ContactFactory;
import efrei.fr.factory.IdentitiesFactory;
import efrei.fr.factory.EmployeeFactory;
import efrei.fr.factory.EmployeeInfoFactory;
import efrei.fr.repository.AddressRepository;
import efrei.fr.repository.NameRepository;
import efrei.fr.repository.RaceRepository;
import efrei.fr.repository.ContactRepository;
import efrei.fr.repository.EmployeeRepository;
import efrei.fr.repository.EmployeeInfoRepository;
import efrei.fr.repository.GenderRepository;
import efrei.fr.repository.IdentitiesRepository;
import efrei.fr.repository.PositionRepository;
import efrei.fr.util.Helper;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);


        Boolean verif = false;
        while (verif == false) {
            System.out.println("Menu Choose your action : \n" +
                    "1. Read the Employee File \n" +
                    "2. Read an Employee in particular \n" +
                    "3. Add an Employee \n" +
                    "4. Update an Employee \n" +
                    "5. Delete an Employee \n" +
                    "6. Exit the menu \n ");

            int choice = scan.nextInt();
            //----------------------------------------------------Read_File------------------------------------------------------
            if (choice == 1){
                EmployeeRepository repositoryempreadall = Helper.DeSerialization();
                System.out.println(repositoryempreadall.getAll());
            }
            //--------------------------------------------------Read_Employee--------------------------------------------------------
            else if (choice == 2){
                EmployeeRepository repositoryempread = Helper.DeSerialization();
                System.out.println("Write the ID of the Employee that you want to read \n");
                String ID = scan.next();
                System.out.println(repositoryempread.read(ID));
            }
            //-----------------------------------------------Add-----------------------------------------------------------
            else if (choice == 3){
                System.out.println("Let's create a new employee :");
                Name name = null;
                Boolean Verif = true;
                while (Verif == true) {
                    System.out.println("What is his name information (firstName/middleName/lastName) : ");
                    String Namesinfo = scan.next();
                    StringTokenizer strtok1 = new StringTokenizer(Namesinfo, "/");
                    Verif = false;
                    if ((strtok1.countTokens()>0) && (strtok1.countTokens()<4) ) {
                        if (strtok1.countTokens() == 1) {
                            String lastname = strtok1.nextToken();
                            name = NameFactory.createName(lastname);
                        }
                        if (strtok1.countTokens() == 2) {
                            String firstname = strtok1.nextToken();
                            String lastname = strtok1.nextToken();
                            name = NameFactory.createName(firstname, lastname);
                        }
                        if (strtok1.countTokens() == 3) {
                            String firstname = strtok1.nextToken();
                            String middlename = strtok1.nextToken();
                            String lastname = strtok1.nextToken();
                            name = NameFactory.createName(firstname, middlename, lastname);
                        }
                    }
                    else {
                        System.out.println("Please write name information as the example (firstName/middleName/lastName)");
                        Verif = true;
                    }
                }
                System.out.println("What is his gender description : ");
                String Genderinfo = scan.next();
                Gender gender = GenderFactory.createGender(Genderinfo);
                System.out.println("What is his Race description : ");
                String Raceinfo = scan.next();
                Race race = RaceFactory.createRace(Raceinfo);
                Address address = null;
                Boolean Verif2 = true;
                while (Verif2 == true) {
                    System.out.println("What is his address information (Street address/Postal address): ");
                    Verif2 = false;
                    String Addressinfo = scan.next();
                    StringTokenizer strtok2 = new StringTokenizer(Addressinfo, "/");
                    if ((strtok2.countTokens()>1) && (strtok2.countTokens()<3) ) {
                        if (strtok2.countTokens() == 2) {
                            String addressStreet = strtok2.nextToken();
                            String addressPostal = strtok2.nextToken();
                            address = AddressFactory.createAddress(addressStreet, addressPostal);
                        }
                    }
                    else {
                        System.out.println("Please write address information as the example (Street address/Postal address)");
                        Verif2 = true;
                    }
                }
                Contact contact = null;
                Boolean Verif3 = true;
                while (Verif3 == true) {
                    System.out.println("What is his contact information (CellPhone Number/Home Number/Email) : ");
                    String Contactinfo = scan.next();
                    StringTokenizer strtok3 = new StringTokenizer(Contactinfo, "/");
                    Verif3 = false;

                    if ((strtok3.countTokens()>0) && (strtok3.countTokens()<4) ) {
                        if (strtok3.countTokens() == 1) {
                            String contactCellPhoneNumber = strtok3.nextToken();
                            contact = ContactFactory.createContact(contactCellPhoneNumber);
                        }
                        if (strtok3.countTokens() == 2) {
                            String contactCellPhoneNumber = strtok3.nextToken();
                            String email = strtok3.nextToken();
                            contact = ContactFactory.createContact(contactCellPhoneNumber, email);
                        }
                        if (strtok3.countTokens() == 3) {
                            String contactCellPhoneNumber = strtok3.nextToken();
                            String contactHomeNumber = strtok3.nextToken();
                            String email = strtok3.nextToken();
                            contact = ContactFactory.createContact(contactCellPhoneNumber, contactHomeNumber, email);
                        }
                    }
                    else{
                        System.out.println("Please write contact information as the example (CellPhone Number/Home Number/Email)");
                        Verif3 = true;
                    }
                }
                System.out.println("What is his number in the Startup : ");
                int Employeeinfo = scan.nextInt();
                EmployeeInfo employeeinfo = EmployeeInfoFactory.createEmployeeInfo(Employeeinfo);
                Identities identities = null;
                Boolean Verif4 = true;
                while (Verif4 == true) {
                    System.out.println("What is his identity document information (Identity Type/Identity Value) : ");
                    Verif4 = false;
                    String Identityinfo = scan.next();
                    StringTokenizer strtok4 = new StringTokenizer(Identityinfo, "/");
                    if ((strtok4.countTokens()>1) && (strtok4.countTokens()<3) ) {
                        if (strtok4.countTokens() == 2) {
                            String identityType = strtok4.nextToken();
                            String identityValue = strtok4.nextToken();
                            identities = IdentitiesFactory.createIdentities(identityType, identityValue);
                        }
                    }
                    else {
                        System.out.println("Please write identity information as the example (Identity Type/Identity Value)");
                        Verif4 = true;
                    }
                }
                System.out.println("What is his Position description : ");
                String Positioninfo = scan.next();
                Position position = PositionFactory.createPosition(Positioninfo);

                Employee employee = EmployeeFactory.createEmployee(address,contact,employeeinfo,gender,identities,name,position,race);
                System.out.println(employee);
                EmployeeRepository repositoryempadd = Helper.DeSerialization();
                repositoryempadd.create(employee);
                Helper.Serialization(repositoryempadd);
            }
            //------------------------------------------------Update-----------------------------------------------------------
            else if (choice == 4){
                EmployeeRepository repositoryempupdate = Helper.DeSerialization();
                System.out.println("Write the ID of the Employee that you want to update \n");
                String ID = scan.next();
                Employee employeeold = repositoryempupdate.read(ID);
                Name name = null;
                Boolean Verif = true;
                while (Verif == true) {
                    System.out.println("Name information of the employee :" + employeeold.getEmpName());
                    System.out.println("What is his name information (firstName/middleName/lastName) : ");
                    String Namesinfo = scan.next();
                    StringTokenizer strtok1 = new StringTokenizer(Namesinfo, "/");
                    Verif = false;
                    if ((strtok1.countTokens()>0) && (strtok1.countTokens()<4) ) {
                        if (strtok1.countTokens() == 1) {
                            String lastname = strtok1.nextToken();
                            name = NameFactory.createName(lastname);
                        }
                        if (strtok1.countTokens() == 2) {
                            String firstname = strtok1.nextToken();
                            String lastname = strtok1.nextToken();
                            name = NameFactory.createName(firstname, lastname);
                        }
                        if (strtok1.countTokens() == 3) {
                            String firstname = strtok1.nextToken();
                            String middlename = strtok1.nextToken();
                            String lastname = strtok1.nextToken();
                            name = NameFactory.createName(firstname, middlename, lastname);
                        }
                    }
                    else {
                        System.out.println("Please write name information as the example (firstName/middleName/lastName)");
                        Verif = true;
                    }
                }
                System.out.println("Gender information of the employee :" + employeeold.getEmpGender());
                System.out.println("What is his gender description : ");
                String Genderinfo = scan.next();
                Gender gender = GenderFactory.createGender(Genderinfo);
                System.out.println("Race information of the employee :" + employeeold.getEmpRace());
                System.out.println("What is his Race description : ");
                String Raceinfo = scan.next();
                Race race = RaceFactory.createRace(Raceinfo);
                Address address = null;
                Boolean Verif2 = true;
                while (Verif2 == true) {
                    System.out.println("Address information of the employee :" + employeeold.getEmpAdress());
                    System.out.println("What is his address information (Street address/Postal address): ");
                    Verif2 = false;
                    String Addressinfo = scan.next();
                    StringTokenizer strtok2 = new StringTokenizer(Addressinfo, "/");
                    if ((strtok2.countTokens()>1) && (strtok2.countTokens()<3) ) {
                        if (strtok2.countTokens() == 2) {
                            String addressStreet = strtok2.nextToken();
                            String addressPostal = strtok2.nextToken();
                            address = AddressFactory.createAddress(addressStreet, addressPostal);
                        }
                    }
                    else {
                        System.out.println("Please write address information as the example (Street address/Postal address)");
                        Verif2 = true;
                    }
                }
                Contact contact = null;
                Boolean Verif3 = true;
                while (Verif3 == true) {
                    System.out.println("Contact information of the employee :" + employeeold.getEmpContact());
                    System.out.println("What is his contact information (CellPhone Number/Home Number/Email) : ");
                    String Contactinfo = scan.next();
                    StringTokenizer strtok3 = new StringTokenizer(Contactinfo, "/");
                    Verif3 = false;

                    if ((strtok3.countTokens()>0) && (strtok3.countTokens()<4) ) {
                        if (strtok3.countTokens() == 1) {
                            String contactCellPhoneNumber = strtok3.nextToken();
                            contact = ContactFactory.createContact(contactCellPhoneNumber);
                        }
                        if (strtok3.countTokens() == 2) {
                            String contactCellPhoneNumber = strtok3.nextToken();
                            String email = strtok3.nextToken();
                            contact = ContactFactory.createContact(contactCellPhoneNumber, email);
                        }
                        if (strtok3.countTokens() == 3) {
                            String contactCellPhoneNumber = strtok3.nextToken();
                            String contactHomeNumber = strtok3.nextToken();
                            String email = strtok3.nextToken();
                            contact = ContactFactory.createContact(contactCellPhoneNumber, contactHomeNumber, email);
                        }
                    }
                    else{
                        System.out.println("Please write contact information as the example (CellPhone Number/Home Number/Email)");
                        Verif3 = true;
                    }
                }
                System.out.println("Number of the employee :" + employeeold.getEmpInfo());
                System.out.println("What is his number in the Startup : ");
                int Employeeinfo = scan.nextInt();
                EmployeeInfo employeeinfo = EmployeeInfoFactory.createEmployeeInfo(Employeeinfo);
                Identities identities = null;
                Boolean Verif4 = true;
                while (Verif4 == true) {
                    System.out.println("Identities information of the employee :" + employeeold.getEmpIdentities());
                    System.out.println("What is his identity document information (Identity Type/Identity Value) : ");
                    Verif4 = false;
                    String Identityinfo = scan.next();
                    StringTokenizer strtok4 = new StringTokenizer(Identityinfo, "/");
                    if ((strtok4.countTokens()>1) && (strtok4.countTokens()<3) ) {
                        if (strtok4.countTokens() == 2) {
                            String identityType = strtok4.nextToken();
                            String identityValue = strtok4.nextToken();
                            identities = IdentitiesFactory.createIdentities(identityType, identityValue);
                        }
                    }
                    else {
                        System.out.println("Please write identity information as the example (Identity Type/Identity Value)");
                        Verif4 = true;
                    }
                }
                System.out.println("Contact information of the employee :" + employeeold.getEmpPosition());
                System.out.println("What is his Position description : ");
                String Positioninfo = scan.next();
                Position position = PositionFactory.createPosition(Positioninfo);

                Employee employeenew = EmployeeFactory.createEmployee(ID,address,contact,employeeinfo,gender,identities,name,position,race);
                repositoryempupdate.update(employeenew);
                Helper.Serialization(repositoryempupdate);
            }
            //-----------------------------------------------Delete-----------------------------------------------------------
            else if (choice == 5){
                EmployeeRepository repositoryempdelete = Helper.DeSerialization();
                System.out.println("Write the ID of the Employee that you want to delete \n");
                String ID = scan.next();
                repositoryempdelete.delete(ID);
                Helper.Serialization(repositoryempdelete);
            }
            //------------------------------------------------Exit---------------------------------------------------------
            else if (choice == 6){
                System.out.println("Goodbye");
                verif = true;
            }
            //-------------------------------------------------Error---------------------------------------------------------
            else {
                System.out.println("Please choose between 1-6 for the different actions \n");
                verif = false;
            }
        }
    }
}

