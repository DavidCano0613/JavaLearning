package Exercises;

public class FunctionsExercise {
    public static String Vehiculo = "Coche";
    private static Double litrosConsumidos = 0.0;
    private Double totalAPagar = 0.0;
    private Double precioPorLitros = 0.0;
    private Double añadir = 0.0;

    public Integer retornaNumero(Integer num) {
        return num;
    }

    public Double TotalAPagar(String Vehiculo, Double litrosConsumidos) {
        this.Vehiculo = Vehiculo;
        this.litrosConsumidos = litrosConsumidos;
        this.totalAPagar = totalAPagar;
        this.precioPorLitros = precioPorLitros;
        if (this.Vehiculo.equalsIgnoreCase("coche")) {
            this.precioPorLitros = 86.0;
        } else if (this.Vehiculo.equalsIgnoreCase("moto")) {
            this.precioPorLitros = 70.0;
        } else if (this.Vehiculo.equalsIgnoreCase("autobús")) {
            this.precioPorLitros = 55.0;
        }
        if (this.litrosConsumidos > 0 && this.litrosConsumidos <= 25.0) {
            añadir = 50.0;
        } else if (this.litrosConsumidos > 25.0) {
            añadir = 25.0;
        }
        this.totalAPagar = (litrosConsumidos * precioPorLitros) + añadir;
        return this.totalAPagar;
    }

    public void entrarADiscoteca(Integer edad) {
        if (edad < 18) System.out.println("Eres menor de edad");
        else if (edad < 21) System.out.println("Eres mayor de edad, pero no puedes tomar licor bro");
        else if (edad >= 21) System.out.println("Eres mayor y puedes tomar");
        else if (!(edad instanceof Integer)) System.out.println("El dato ingresado no es numero");
        if (edad % 2 != 0) System.out.println("¿Sabias que tu edad es impar?");
    }

    public void numerosSiguientes(Integer num) {
//        for (int i = num+1; i <= num + 10; i++) {
//            System.out.println(i);
//        }
        Integer contador = num+10;
        while(num+1 <= contador){
            System.out.println(num);
            num++;
        }
    }

    public void del5Al20(){
        for (int i = 5; i <=20 ; i+=3) {
            System.out.println(i);
        }
    }

    public void mayorde3(Integer num1, Integer num2, Integer num3){
        if((num1 > num2)&&(num1 > num3)) System.out.println("El numero mayor es: " + num1);
        else if((num2 > num3)) System.out.println("El numero mayor es: " + num2);
        else System.out.println("El numero mayor es: " + num3);
    }

    public boolean cadenasDiferentes(String cadenaOne, String cadenaTwo){
        return cadenaOne.equals(cadenaTwo);
    }
}