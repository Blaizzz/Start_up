package efrei.fr.domain;

import java.io.Serializable;
public class Employee implements Serializable {
    private String ID;
    private Address empAdress;
    private Contact empContact;
    private EmployeeInfo empInfo;
    private Gender empGender;
    private Identities empIdentities;
    private Name empName;
    private Position empPosition;
    private Race empRace;

    private Employee(Builder builder){
        this.ID = builder.ID;
        this.empAdress = builder.empAdress;
        this.empContact = builder.empContact;
        this.empInfo = builder.empInfo;
        this.empGender = builder.empGender;
        this.empIdentities = builder.empIdentities;
        this.empName = builder.empName;
        this.empPosition = builder.empPosition;
        this.empRace = builder.empRace;
    }

    private Employee(Address empAdress, Contact empContact, EmployeeInfo empInfo, Gender empGender, Identities empIdentities, Name empName, Position empPosition, Race empRace) {
        this.empAdress = empAdress;
        this.empContact = empContact;
        this.empInfo = empInfo;
        this.empGender = empGender;
        this.empIdentities = empIdentities;
        this.empName = empName;
        this.empPosition = empPosition;
        this.empRace = empRace;
    }
    public String getID(){
        return ID;
    }

    public Address getEmpAdress() {
        return empAdress;
    }

    public Contact getEmpContact() {
        return empContact;
    }

    public EmployeeInfo getEmpInfo() {
        return empInfo;
    }

    public Gender getEmpGender() {
        return empGender;
    }

    public Identities getEmpIdentities() {
        return empIdentities;
    }

    public Name getEmpName() {
        return empName;
    }

    public Position getEmpPosition() {
        return empPosition;
    }

    public Race getEmpRace() {
        return empRace;
    }

    @Override
    public String toString() {
        return "Employee = [" + "\n" +
                "ID number :"+ ID + "\n" +
                empName +
                empGender  +
                empRace +
                empAdress  +
                empContact  +
                empInfo  +
                empIdentities  +
                empPosition  +

                ']' + "\n" + "\n" ;
    }

    public static class Builder{
        private String ID;
        private Address empAdress;
        private Contact empContact;
        private EmployeeInfo empInfo;
        private Gender empGender;
        private Identities empIdentities;
        private Name empName;
        private Position empPosition;
        private Race empRace;

        public Builder setID(String ID){
            this.ID = ID;
            return this;
        }

        public Builder setEmpAdress(Address empAdress) {
            this.empAdress = empAdress;
            return this;
        }

        public Builder setEmpContact(Contact empContact) {
            this.empContact = empContact;
            return this;
        }

        public Builder setEmpInfo(EmployeeInfo empInfo) {
            this.empInfo = empInfo;
            return this;
        }

        public Builder setEmpGender(Gender empGender) {
            this.empGender = empGender;
            return this;
        }

        public Builder setEmpIdentities(Identities empIdentities) {
            this.empIdentities = empIdentities;
            return this;
        }

        public Builder setEmpName(Name empName) {
            this.empName = empName;
            return this;
        }

        public Builder setEmpPosition(Position empPosition) {
            this.empPosition = empPosition;
            return this;
        }

        public Builder setEmpRace(Race empRace) {
            this.empRace = empRace;
            return this;
        }


        public Employee build(){
            return new Employee(this);
        }
    }
}
