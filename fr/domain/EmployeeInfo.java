package efrei.fr.domain;

import java.io.Serializable;

public class EmployeeInfo implements Serializable {

    private int employeeNumber;
    private String employeeID;

    private EmployeeInfo(Builder builder){
        this.employeeID = builder.employeeID;
        this.employeeNumber = builder.employeeNumber;
    }

    private EmployeeInfo() {

    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "employeeNumber=" + employeeNumber +
                '}' + "\n";
    }

    public static class Builder
    {
        private int employeeNumber;
        private String employeeID;

        public EmployeeInfo.Builder setEmployeeNumber(int employeeNumber)
        {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public EmployeeInfo.Builder setEmployeeID(String employeeID)
        {
            this.employeeID = employeeID;
            return this;
        }
        public EmployeeInfo.Builder copy(EmployeeInfo employeeInfo)
        {
            this.employeeID = employeeInfo.employeeID;
            this.employeeID= employeeInfo.employeeID;
            return this;
        }

        public EmployeeInfo build()
        {
            return new EmployeeInfo(this);
        }
    }

}
