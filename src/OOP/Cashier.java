package OOP;

import Enums.NivelDeEstudios;

// Herencia
// Herencia multiple: No esta permitida en Java
public class Cashier extends Employee {
    private int cubiculo;
    private double base;

    public Cashier(String name, int employeeNo, NivelDeEstudios nivelDeEstudios, int age, double salary, int year, int month, int day, int cubiculo, double base) {
        super(name, employeeNo, nivelDeEstudios ,age, salary, year, month, day);
        this.cubiculo = cubiculo;
        this.base = base;
    }

    public String cajear() {
        return "Estoy cajeando";
    }

    public String cobrar() {
        return "Estoy cobrado como cajero";
    }

//    Para sobre escribir un metodo

//    Opcion 1
//    @Override
//    public double calcSalary(){
//        return salary - discounts;
//    }

//    Opcion 2
//    public double calcSalary(){
//        double salaryCashier = super.getSalary();
//        return salary - discounts;
//    }


}

