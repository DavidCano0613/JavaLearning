package OOP;

import Enums.NivelDeEstudios;

public class Manager extends Employee {
    public Manager(String name, int employeeNo, int age, NivelDeEstudios nivelDeEstudios, double salary, int year, int month, int day, double base){
        super(name,employeeNo, nivelDeEstudios, age,salary,year,month,day);
    }
    public String cobrar(){
        return "Estoy cobrando como manager";
    }

    //  Polimorfirms with heritage
    public String billing(){
        return "I'm earning as a manager";
    }
}
