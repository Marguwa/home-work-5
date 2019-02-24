/*
Введение в ООП
* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
* Конструктор класса должен заполнять эти поля при создании объекта;
* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
* Создать массив из 5 сотрудников

Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println("\n");
        System.out.println("----------------------------------");
        System.out.println("\n");
    }

    int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Employee[] employeesTable = new Employee[5];
        employeesTable[0] = new Employee("Ivanov Ivan Ivanovich", "Director", "ivanov@mail.me", "0301233333", 60000, 62);
        employeesTable[1] = new Employee("Petrov Petr Petrovich", "Driver", "petrov@mail.me", "0301231212", 15000, 19);
        employeesTable[2] = new Employee("Sidorov Sidor Sidorovich", "Accountant", "sidorov@mail.me", "301231323", 30000, 42);
        employeesTable[3] = new Employee("Ivanova Ivanka Ivanovna", "Economist", "ivanov@mail.me", "301232313", 35000, 21);
        employeesTable[4] = new Employee("Petrova Elena Semenovna", "Lawyer", "petrova@mail.me", "301230023", 55000, 46);
        for (int i = 0; i < employeesTable.length; i++) {
            if (employeesTable[i].getAge() > 40) employeesTable[i].printInfo();
        }
    }
}
