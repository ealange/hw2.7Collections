import java.util.HashMap;
import java.util.Map;

public class Main {
    // Employee[] empolоyeeBook = new Employee[10];
    static Map<Person, Employee> employees = new HashMap<>();

    public static void main(String[] args) {

//       делаем образец, занимаем 0 элемент массива
        Person personPushkin = new Person("Pushkin", "Alexandr", "Sergeevi");
        Person ivanovII = new Person("Иванов", "Иван", "Иванович");
        Person sidorovSS = new Person("Сидров", "Сидор", "Сидорович");
        Person petrovPP = new Person("Петров", "Петр", "Петрович");
        Person ivanovvII = new Person("Ивановв", "Иван", "Иванович");
        Person sidorovvSS = new Person("Сидровв", "Сидор", "Сидорович");
        Person petrovvPP = new Person("Петровв", "Петр", "Петрович");

        Employee emplPushkin = new Employee(personPushkin, 5, 123465);
        Employee emplIvanovII = new Employee(ivanovII, 2, 11111);
        Employee emplSidorovSS = new Employee(sidorovSS, 1, 22222);
        Employee emplPetrovPP = new Employee(petrovPP, 1, 333);
        Employee emplIvanovvII = new Employee(ivanovvII, 4, 11110);
        Employee emplSidorovvSS = new Employee(sidorovvSS, 3, 22220);
        Employee emplPetrovvPP = new Employee(null, 5, 33335);
        Employee emplNullNN = new Employee(null, 0, 0);


        // printAllEmployee();
        // System.out.println("сотрудник с мин.зарплатой: " + getEmployeeMinSalary());
        // printFullNameAllEmployee();
        // System.out.println("сотрудник с мах.зарплатой: " + getEmployeeMaxSalary());
        // System.out.println("Средняя ЗП: " + getAndCalculateAverageSalary());
        addNewEmployee(personPushkin, emplPushkin);
        addNewEmployee(personPushkin, emplPushkin);
        addNewEmployee(sidorovSS, emplSidorovSS);
        addNewEmployee(petrovPP, emplPetrovPP);
        addNewEmployee(ivanovvII, emplIvanovvII);
        addNewEmployee(sidorovvSS, emplSidorovvSS);
        addNewEmployee(ivanovII, emplIvanovII);
        addNewEmployee(null, emplNullNN);
        System.out.println(employees.values());
        System.out.println("Сумма зарплат = " + getCalculateSalarySum());
        System.out.println("Средняя зарплата = " + getAndCalculateAverageSalary());
        removeEmployee(personPushkin);
        System.out.println(employees.values());
        removeEmployee(personPushkin);
        System.out.println("Сотрудник с мин зарплатой: " + getEmployeeMinSalary());

    }

    public static void addNewEmployee(Person person, Employee employee) {
        if (person == null) {
            System.out.println("ФИО сотрудника отсутствует");
        } else if (employees.containsKey(person)) {
            System.out.println("Сотрудник " + person + " уже есть в базе");
        } else {
            System.out.println(person + " успешно добавлен");
            employees.put(person, employee);
        }
    }

    public static void removeEmployee(Person person) {
        if (employees.containsKey(person)) {
            System.out.println("Сотрудник " + person + " успешно удален");
            employees.remove(person);
        } else {
            System.out.println("Сотрудника " + person + " нет в базе");
        }
    }


    // public static void printAllEmployee() {
    //     for (int i = 0; i < empolоyeeBook.length; i++) {
    //         System.out.println(empolоyeeBook[i]);

    //     }
    // }

    public static int getCalculateSalarySum() {

        int sum = 0;
        for (Employee employee : employees.values()) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static double getAndCalculateAverageSalary() {
        double sumSalaryAllEmpl = getCalculateSalarySum();
        if (employees.size() != 0) {
            return sumSalaryAllEmpl / employees.size();
        } else {
            return 0;
        }
    }

    public static Person getEmployeeMinSalary() {
        Person minSalaryEmployee = null;
        for (Map.Entry<Person, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getSalary() != 0) {
                minSalaryEmployee = entry.getKey();
                break;
            }
        }
        for (Map.Entry<Person, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getSalary() < employees.get(minSalaryEmployee).getSalary()) {
                minSalaryEmployee = entry.getKey();
            }
        }
        return minSalaryEmployee;
    }

    // public static Employee getEmployeeMaxSalary() {
    //     int maxSalary = -1;
    //     Employee maxSalaryEmployee = null;
    //     int indexMaxSalaryEmployee = 0;
    //     for (int i = 0; i < empolоyeeBook.length; i++) {
    //         if (empolоyeeBook[i] != null) {
    //             maxSalary = empolоyeeBook[i].getSalary();
    //             maxSalaryEmployee = empolоyeeBook[i];
    //             indexMaxSalaryEmployee = i;
    //             break;
    //         }
    //     }

    //     for (int i = indexMaxSalaryEmployee; i < empolоyeeBook.length; i++) {
    //         if (empolоyeeBook[i] != null) {
    //             if (maxSalary < empolоyeeBook[i].getSalary()) {
    //                 maxSalary = empolоyeeBook[i].getSalary();
    //                 maxSalaryEmployee = empolоyeeBook[i];

    //             }
    //         }

    //     }

    //     return maxSalaryEmployee;
    // }


    // public static void printFullNameAllEmployee() {
    //     for (int i = 0; i < empolоyeeBook.length; i++) {
    //         if (empolоyeeBook[i] != null && empolоyeeBook[i].getPerson() != null) {
    //             System.out.println(empolоyeeBook[i].getPerson().toString());
    //         }
    //     }
    // }
}
