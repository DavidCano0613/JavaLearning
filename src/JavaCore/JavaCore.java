package JavaCore;
import java.util.*;
public class JavaCore {
    // PRIMITIVE DATA TYPES
    public int entero = 50;
    public float flotante = 45.6F;
    public double decimal = 45.89;
    public boolean boleanos = true;
    public byte eneteroPequeño = 127;
    public char caracteres = 'c';
    public long large = 9807;
    public short corto = 32767;

    // WRAPPER CLASSES
    public Integer integer = 12;
    public String string = "This is a string";
    public String string2 = "This is a string 2";
    public Double decimalclase = 12.4;
    public Boolean bool = true;
    public Float flotaclase = 25.7F;

    // String methods:
    String palabra = "Hola Mundo";
    public void stringMethods() {
        System.out.println(palabra.equals(integer));
        System.out.println(palabra.equalsIgnoreCase(string2));
        System.out.println(palabra.compareTo("Hola Mundo"));
        System.out.println(palabra.compareToIgnoreCase("hola mundo"));
        System.out.println(palabra.toUpperCase());
        System.out.println(palabra.toLowerCase());
        System.out.println(palabra.isEmpty());
        System.out.println(palabra.contains("Hol"));
        System.out.println(palabra.split("Hola",2));
        System.out.println(palabra.indexOf("M"));
        System.out.println(palabra.length());
        System.out.println(palabra.getBytes());
    }
    public void integerMethods(){
        System.out.println(integer.compareTo(34));
        System.out.println(integer.compareTo(12));
        System.out.println(integer.equals(2));
        System.out.println(integer.equals(12));
        System.out.println(integer.toString());
        System.out.println(integer.getClass());
        String num1 = "10";
        System.out.println(Integer.parseInt(num1));
        System.out.println(Double.parseDouble(num1));
    }

//  VARIABLES
//  Primitive variables: They are stored in memory directly and are efficient
//  Reference variables: They contain a reference to an object. They don't contain the object itself but an memory address of it
//  Local variables: Variables created inside a method, they only exist during the execution of the method
//  Instance variables: They are defined inside a class and each instance of the class has its own copy of the variable
//  Static variables: These variables belongs to the class instead of the object

//  DATA IN AND OUT (ENTRADA Y SALIDA DE DATOS)
    Scanner dataIn = new Scanner(System.in);
//    int num = dataIn.nextInt();
//    String name = dataIn.nextLine();
//    double salary = dataIn.nextFloat();
//    Boolean boleano = dataIn.nextBoolean();

//  DATE CLASS
    public Date fecha = new Date(122,12,12);
//  CALENDAR CLASS
    public Calendar calendar = new GregorianCalendar(2023,Calendar.MAY,23);
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH);
    int day = calendar.get(Calendar.DAY_OF_MONTH);


//  FLOW CONTROL STATEMENTS

//  CONDITIONALS
    public String numeroEs(int entero){
        String mensaje = null;
        if(entero > 0){
           mensaje = "El numero es positivo";
        } else if(entero == 0){
            mensaje = "El numero es neutro";
        } else {
            mensaje = "El numero es negativo";
        }
        return mensaje;
    }

// SWITCH CASE
    public void switchCase(){
        int dia = 1;
        switch (dia) {
        case 1:
            System.out.println("Today is Monday");
            break;
        case 2:
            System.out.println("Today is Tuesday");
            break;
        default:
            System.out.println("Today is Wednesday");
     }
    }


//  TERNAR OPERATOR (Ternary operator)
    int puntaje = 10;
    String resultado = puntaje > 9 ? "Pasaste" : "No pasaste";

//  LOOPS
    public void loops(){
//        while (){}
//        for (int i = 0; i < ; i++) {}
//        for (Tipo de dato - Nombre del interador :Arrayarecorrer) {}
    }


//  FUNCTIONS - METHODS
//  Function without return: We have to use the keyword void
    public void holaMundo() {
        System.out.println("Hola Mundo");
    }
    public void returnName(String name) {
        System.out.println(name);
    }

//  Function with return
    public int suma(int num1, int num2) {
        return num1 + num2;
    }
    public boolean mayorque0(int num) {
        return num > 0;
    }


//--------------------------------------------------------------------------------------------------------------------------

    // EJERCICIOS
    // 1)
    public double areaTriangulo() {
        System.out.println("Ingrese la base del triangulo:");
        int base = dataIn.nextInt();
        System.out.println("Ingrese la altura del triangulo");
        int altura = dataIn.nextInt();
        double result = (base * altura) / 2;
        return result;
    }

    // 2)
    public double inversionBanco() {
        System.out.println("Ingrese el capital:");
        double capital = dataIn.nextDouble();
        System.out.println("Ingrese el interes:");
        double interes = dataIn.nextDouble();
        double result = capital + ((capital * interes));
        return result;
    }

    // 3)
    public double sueldo1() {
        System.out.println("Ingrese el sueldo base: ");
        double sueldoBase = dataIn.nextDouble();
        System.out.println("Ingrese de cuanto fueron las ventas: ");
        double ventas = dataIn.nextDouble();
        double comision = 0.10;
        double resultado = sueldoBase + (ventas * comision);
        return resultado;
    }

    // 4)
    public double tienda() {
        System.out.println("Ingrese el precio del articulo: ");
        double tienda = dataIn.nextDouble();
        double discount = 0.15;
        double result = tienda + (tienda * discount);
        return result;
    }

    //   10)
    public void hospital() {
        double porcentajeGinecologia = .40;
        double porcentajeTraumatologia = .30;
        double porcentajePediatria = .30;
        System.out.println("Ingrese el presupuesto del hospital: ");
        double presupuestoDinero = dataIn.nextDouble();
        double presupuestoGinecologia = presupuestoDinero * porcentajeGinecologia;
        double presupuestoTraumatologia = presupuestoDinero * porcentajeTraumatologia;
        double presupuestoPediatria = presupuestoDinero * porcentajePediatria;
        System.out.println("La cantidad de dinero que le corresponde a ginecologia es: " + presupuestoGinecologia);
        System.out.println("La cantidad de dinero que le corresponde a traumatologia es: " + presupuestoTraumatologia);
        System.out.println("La cantidad de dinero que le corresponde a prediatria es: " + presupuestoPediatria);
    }

    public Double precioVentaParaGanar30porciento() {
        System.out.println("Ingrese el costo del articulo");
        Double precioArticulo = dataIn.nextDouble();
        Double ganancia = 0.30;
        Double precioFinal = precioArticulo + (precioArticulo * ganancia);
        return precioFinal;
    }

    //   CONDICIONALES
    public void condicional1(int sexo, int edad) {
        if (sexo == 2 && edad >= 18) {
            System.out.println("Eres un hombre mayor de edad");
        } else if (sexo == 2 && edad < 18) {
            System.out.println("Eres un hombre menor de edad");
        } else if (sexo == 1 && edad < 18) {
            System.out.println("Eres una mujer menor de edad");
        } else if (sexo == 1 && edad >= 18) {
            System.out.println("Eres una mujer mayor de edad");
        } else{
            System.out.println("Hubo un error durante la ejecución");
        }
    }

    public void condicional2(int X, int Y) {
        if (X > 0 || Y > 0) {
            System.out.println(X+","+Y);
        } else System.out.println("Numero negativo");
    }

    public void condicional3(int X, int Y) {
        if (((X > 0 && Y < 0) || (Y > 0 && X < 0)) && (X != 0 && Y != 0)) System.out.println(X + Y);
        else System.out.println("That is not correct");
    }

    public Object condicional4(Integer num1, Integer num2){
        return (num2 != 0) ? (double)num1/num2 : "No es posible dividir entre cero";
    }

    public String condicional5() {
        System.out.println("Ingrese su nombre: ");
        String name = dataIn.nextLine();
        System.out.println("Ingrese su salario: ");
        double salary = dataIn.nextDouble();
        double retencion = 0.0;
        double finalSalary = 0.0;
        if (salary >= 0 && salary <= 300000.0) retencion = 0.0;
        else if (salary > 300000.0 && salary <= 400000.0) retencion = 0.05;
        else if (salary > 400000.0 && salary <= 500000.0) retencion = 0.08;
        else retencion = 0.10;
        finalSalary = salary - (salary*retencion);
        return "Your name is: " + name + "Your final salary is: " + finalSalary + ", " + retencion;
    }

    public String condicional6(Double kilos, double pagar){
        double descuento = .0;
        double totalAPagar = .0;
        if(kilos >= 0 && kilos <= 2) descuento = 0;
        if(kilos >= 2.01 && kilos <= 5) descuento = 0.10;
        if(kilos >= 5.01 && kilos <= 10) descuento = 0.15;
        if(kilos >= 10.01) descuento = 0.20;
        totalAPagar = pagar-(pagar*descuento);
        return "El total a pagar es: " + totalAPagar;
    }

    public String bucle1(int nPersonas) {
        double pesoPrimedioNiños = 0.0;
        int niños = 0;
        double pesoNiños = 0.0;

        double pesoPromedioJovenes = 0.0;
        int jovenes = 0;
        double pesoJovenes = 0.0;

        double pesoPromedioAdultos = 0.0;
        int adultos = 0;
        double pesoAdultos = 0.0;

        double pesoPromedioViejos = 0.0;
        int viejos = 0;
        double pesoViejos = 0.0;

        int edadPersona = 0;
        double peso = 0;

        for (int i = 0; i <= nPersonas; i++) {
            if (edadPersona > 0 && edadPersona <= 12) {
                niños++;
                pesoNiños = pesoNiños + dataIn.nextDouble();
            } else if (edadPersona > 0 && edadPersona <= 12) {
                niños++;
                pesoNiños = pesoNiños + dataIn.nextDouble();
            } else if (edadPersona > 0 && edadPersona <= 12) {
                niños++;
                pesoNiños = pesoNiños + dataIn.nextDouble();
            }
            else return "La edad es invalida";
        }

        return "Hola";
    }

    public String bucle2(int limite){
        limite = 99;
        for (int i = 0; i <= limite; i++) {
            System.out.println(i);
        }
        return "El limite es: ";
    }

    public String bucle3(String especieAEstudiar) {
        int cantidadAnimales = 0;
        int acumuladorEdad0A1 = 0;
        int acumuladorEdad1A3 = 0;
        int acumuladorEdad3OMAS = 0;
        int pedirEdad = 0;
        if (especieAEstudiar.equals("Jirafas") || especieAEstudiar.equals("jirafas")) {
            cantidadAnimales = 15;
        } else if (especieAEstudiar.equalsIgnoreCase("Elefantes")) {
            cantidadAnimales = 20;
        } else if (especieAEstudiar.equalsIgnoreCase("Chimpances")) {
            cantidadAnimales = 25;
        }
        for (int i = 1; i <= cantidadAnimales; i++) {
            System.out.println("Ingrese la edad del animal #: " + i);
            pedirEdad = dataIn.nextInt();
            if (pedirEdad == 1) {
                acumuladorEdad0A1++;
            } else if (pedirEdad > 1 && pedirEdad <= 3) {
                acumuladorEdad1A3++;
            } else if (pedirEdad > 3) {
                acumuladorEdad3OMAS++;
            }
        }
        return "Los animales que tienen 0 a 1 años son: " + acumuladorEdad0A1 + " los que tienen de 2 a 3: " + acumuladorEdad1A3 + " los que tienen mas de 3: " + acumuladorEdad3OMAS;
    }
}