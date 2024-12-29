package OOP;

import Enums.NivelDeEstudios;
import OOP.AbstractClasses.Person;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person {
    protected double salary;
    private Date contractDate;
    private static int nextId = 1;
    private static double discounts;

    public Employee(String name, Integer age, NivelDeEstudios nivelDeEstudios, int employeeNo, double salary, int year, int month, int day) {
        super(name, age, nivelDeEstudios);
        // Esto se usa para diferenciar la variable del parámetro cuando ambas se llaman igual
        employeeNo = nextId;
        nextId++;
        this.salary = salary;
        GregorianCalendar fecha = new GregorianCalendar(year, month - 1, day);
        this.contractDate = fecha.getTime();
    }

    //Constructors - Methods overloading: It's about creating various methods having the same name, Java knows which method it has to call depending on, number, type and name
    public Employee(String name) {
        //  Let's say we want to create 1 employee with inital state, but its properties are unknown
        //  With the purpose if giving a default state (since they are unkown), what we do this to call the other constructor
        this(name, 0, null, 0, 0, 0, 0, 0);
    }

    public double getSalary() {
        return salary;
    }

    public Date getContract() {
        return contractDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calcSalary() {
        return salary - discounts;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getAllData() {
        return "El id del empleado es:" + nextId + "El nombre del empleado es: " + "edad es: " + "salario actual es: " + salary + "fecha de contracto es: " + contractDate;
    }

    public String getAllData(boolean permision) {
        if (true)
            return "El id del empleado es:" + "El nombre del empleado es: " + "edad es: " + "salario actual es: " + salary + "fecha de contracto es: " + contractDate;
        return "Can't show you";
    }

    public String billing() {
        return "I'm billing my salary as an employee";
    }

    public String decirNacionalidad(String nacho) {
        return "Nacionalidad es: " + nacho;
    }
}