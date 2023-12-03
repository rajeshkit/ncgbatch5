public class Employee {
    int employeeId;
    String employeeName;
    long phone;
    Employee() {
    }
    public Employee(int employeeId, String employeeName, long phone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.phone = phone;
    }

    void displayEmployee() {
        System.out.println(employeeId+" "+employeeName+" "+phone);
    }

    public static void main(String[] args) {
        Employee e=new Employee(123,"Rajesh",9894851315L);
        Employee e1=new Employee(234,"Shinha",5764324567L);
        Employee e2=new Employee(577,"Malik",64324567L);
        e.displayEmployee();
        e1.displayEmployee();
        e2.displayEmployee();
    }
}















