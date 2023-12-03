public class Employee2 {
    int employeeId;
    String employeeName;
    long phone;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    void displayEmployee() {
        System.out.println(employeeId+" "+employeeName+" "+phone);
    }

    public static void main(String[] args) {
        Employee2 e=new Employee2();
        e.setEmployeeId(123);
        e.setEmployeeName("Rajesh");
        e.setPhone(3456776543L);
        Employee2 e1=new Employee2();
        e1.setEmployeeId(346);
        e1.setEmployeeName("Sinha");
        e1.setPhone(5678765L);
        Employee2 e2=new Employee2();
        e2.setEmployeeId(6787);
        e2.setEmployeeName("abc");
        e2.setPhone(478765456L);
        e.displayEmployee();
        e1.displayEmployee();
        e2.displayEmployee();
    }
}















