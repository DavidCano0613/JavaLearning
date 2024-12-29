package OOP.AbstractClasses;

import Enums.NivelDeEstudios;

public abstract class Person {
    public static String especie = "Humano";
    private String name;
    private Integer age;
    public NivelDeEstudios nivelDeEstudios;

    public Person(String name, Integer age, NivelDeEstudios nivelDeEstudios) {
        this.name = name;
        this.age = age;
        this.nivelDeEstudios = nivelDeEstudios;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name instanceof String) {
            this.name = name;
        } else {
            System.out.println("El dato ingresado no es un texto");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age instanceof Integer) {
            this.age = age;
        } else {
            System.out.println("El dato ingresado no es un numero");
        }
    }

    public abstract String decirNacionalidad(String nacho);
}