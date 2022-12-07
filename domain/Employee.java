package Start_up.domain;

public class Employee {

    private int employeeNumber;
    private String employeeID;

    private Employee (Builder builder){

    }

    private Employee() {

    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", employeeID='" + employeeID + '\'' +
                '}';
    }

    public static class Builder
    {
        private int employeeNumber = 0;
        private String employeeID;

        public Employee.Builder setEmployeeNumber(int employeeNumber)
        {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Employee.Builder setEmployeeID(String employeeID)
        {
            this.employeeID = employeeID;
            return this;
        }
        public Employee.Builder copy(Employee employee)
        {
            this.employeeID = employee.employeeID;
            this.employeeID=employee.employeeID;
            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }
    }

}
