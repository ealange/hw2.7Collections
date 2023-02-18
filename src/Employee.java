public class Employee {
    private static int employeeCounter;
    private final int id;
    private Person person;
    private int department;
    private int salary;

    public Employee(Person person, int department, int salary) {
        this.person = person;
        this.department = department;
        this.salary = salary;
        id = employeeCounter;
        employeeCounter = employeeCounter + 1;

    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "\n Сотрудник: " +
                "табельный номер: " + id +
                "; " + person +
                ", отдел: " + department +
                ", заработная плата= " + salary +
                '$';
    }


}
