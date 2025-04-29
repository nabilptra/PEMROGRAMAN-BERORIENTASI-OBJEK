/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nabil2305380.tugasss8;

import java.util.Date;




class MyDate {
    private Date dateCreated;

    public MyDate() {
        this.dateCreated = new Date();
    }

    public MyDate(int year, int month, int day) {
        this.dateCreated = new Date(year - 1900, month - 1, day);
    }

    public String toString() {
        return dateCreated.toString();
    }
}

class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Class: Person, Name: " + name;
    }
}

class Student extends Person {
    public static final String FRESHMAN = "Mahasiswa Baru";
    public static final String SOPHOMORE = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private final String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + name + ", Status: " + status;
    }
}

class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + name;
    }
}

class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email,
                   String office, double salary, MyDate dateHired, int officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + name;
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + name;
    }
}

public class Tugasss8 {
    public static void main(String[] args) {
        Person p = new Person("Ayu", "Bandung", "08123456789", "ayu@mail.com");
        Student s = new Student("Budi", "Jakarta", "08234567890", "budi@mail.com", Student.FRESHMAN);
        Employee e = new Employee("Citra", "Surabaya", "08345678901", "citra@mail.com", "Ruang 101", 5000000, new MyDate(2022, 5, 10));
        Faculty f = new Faculty("Dodi", "Semarang", "08456789012", "dodi@mail.com", "Ruang 201", 7000000, new MyDate(2020, 8, 5), 10, "Lektor Kepala");
        Staff st = new Staff("Eka", "Yogyakarta", "08567890123", "eka@mail.com", "Ruang 301", 4000000, new MyDate(2021, 3, 15), "Administrator");

        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(st.toString());
    }
}