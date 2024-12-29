//import JavaExceptions;
import Enums.Frutas;
import Enums.NivelDeEstudios;
import OOP.Employee;
//import JavaInterface.JavaInterfaceIIChild;


public class Main implements Vehiculo {
    public static void main(String[] args) {


//  Java Basics
//      JavaCore core = new JavaCore();
//        core.stringMethods();
//        core.integerMethods();
//        System.out.println(core.fecha);
//        System.out.println(core.calendar);

//      TERNAR OPERATOR (Ternary operator)
//        int puntaje = 10;
//        String resultado = puntaje > 9 ? "Pasaste" : "No pasaste";
//        core.holaMundo();
//        core.suma(10,20);
//        core.mayorque0(10);
//        core.areaTriangulo();
//        core.inversionBanco();
//        core.sueldo1();
//        core.tienda();
//        core.hospital();
//        core.precioVentaParaGanar30porciento();
//        System.out.println(core.numeroEs(10));
//        core.condicional1(1,18);
//        core.condicional2(10,20);
//        core.condicional3(20,23);
//        System.out.println(core.condicional4(10,2));
//        System.out.println(core.condicional5());
//        System.out.println(core.condicional6(1.0,2000));
//        System.out.println(core.);
//        System.out.println(core.bucle2(99));
//        System.out.println(core.bucle3("Jirafas"));


// ========================================================================================================================================

//    OOP - OBJECT-ORIENTED PROGRAMMING

//    Accediendo a atributos y metodos de clase
//        System.out.println(Persona.especie);

//    Instanciación de un objeto - ejemplar de clase - Accediendo a atributos y metodos de instancia
//        Persona david = new Persona("Juan David Cano",23);

//    Encapsulación
//    Uso del Getter para acceder a su propiedades
//        System.out.println(david.getName());
//        System.out.println(david.getAge());

//    Uso del Setter para acceder a modificar propiedades encapsuladas
//        david.setName("David Cano");
//        david.setAge(24);

//    Instancia del constructor sobrecargado
//    Employee sebas = new Employee("Sebancho",23,Employee.getNextId(),22234,2021,2,3);
//    System.out.println(sebas.getAllData());
//    System.out.println(sebas.getAllData(true));

//    Enlazado dinamico (Dynamic binding): Obedece la regla "es un"
//    Referencia - Objeto referenciado
//    Cashier david = new Cashier("David", 1234, 22, 345.6, 2022, 12, 2, 2, 2);
//    Employee Daniela = new Cashier("Daniela", 1234, 22, 345.6, 2022, 12, 2, 2, 2); //Un cajero es un tipo de empleado

//    Cashier Julian = new Employee(); // No esta permitido, no obedece a la regla "Es un", un empleado no necesariamente debe ser un cajero, puede ser cualquier otro tipo de empleado

//    En Java todas las clases por definición heredan de Object con lo cual un Cashier es un Object
//    Object Jenny = new Cashier("Jenny", 1234, 22, 345.6, 2022, 12, 2, 2, 2);

//    Casteo de objetos- Casting, al ser Marina una instancia de Employee, se debe hacer el casting para que pueda acceder a las propiedades y metodos de cashier - Esto sirve para crear un objeto de una clase padre y acceder a las propiedades/metodos de sus clases hijas
//    System.out.println(((Cashier)Jenny).cajear());

//    Casteo de datos
//        double valorDouble = 30.2232;
//        System.out.println(valorDouble);
//        int valorEntero = (double) valorDouble; //Se perdera la información decimal
//        System.out.println(valorEntero);

//===========================================================================================================================================

//   INTERFACES
//    JavaInterfaceIIChild instance = new JavaInterfaceIIChild();
//    System.out.println(JavaInterface.account);

//===========================================================================================================================================

//   COLLECTIONS FRAMEWORK
//     JavaCollectionsAndArrays call = new JavaCollectionsAndArrays();
//     call.collections();

//===========================================================================================================================================

//    EXCEPTION HANDLING

//        JavaExceptionsHandling.exception();
//        System.out.println(JavaExceptionsHandling.factorial(-9));

//        File file = new File("D:\\A");
//        try{
//            FileReader fr = new FileReader(file);
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }

//===========================================================================================================================================

//  HANDLING FILES: We can creat files, Write into the file, Read the text that is already written in the file, Delete the file
//        File file = new File("C:\\Users\\DavidCano\\Documents\\GitHub\\LEARNING-SOFTWARE-DEVELOPMENT\\SOFTWARE DEVELOPMENT\\PROGRAMMING LENGUAGES\\JAVA\\Redeable.txt");
//        try{
//            FileReader fr = new FileReader(file);
//            if(file.exists()){
//                System.out.println("The file exists at the provided path");
//                System.out.println(file.getAbsoluteFile());
//            }
//        } catch(Exception e){
//            System.out.println("Could not find the file");
//            e.printStackTrace();
//        }
//
//        try{
//           File fr2 = new File("C:\\Users\\DavidCano\\IdeaProjects\\Learning_Java\\src\\texto.txt\n");
//            if(fr2.exists()){
//                System.out.println("The file exists at the provided path");
//            }
//        } catch (Exception fr2e){
//
//        }

//     Sourtcut Paths
//     BufferedReader
//        try{
//            File localpath = new File("src/texto.txt");
//            FileReader fr = new FileReader(localpath);
//            BufferedReader br = new BufferedReader(fr);
//            String str;
//            while ((str=br.readLine())!= null) {
//                System.out.println(str);
//            }
////          Close the object to release the memory
//            br.close();
//        } catch (Exception ex){
//            System.out.println("It does not exist");
//            ex.printStackTrace();
//        }


//===========================================================================================================================================

//       FunctionsExercise callFunctionExercise = new FunctionsExercise();

////     Encapsulación in more detail
//       System.out.println(callFunctionExercise.Vehiculo);
//       callFunctionExercise.Vehiculo = "Otro vehiculo para el objeto 1";
//       System.out.println(callFunctionExercise.Vehiculo);

//       FunctionsExercise anotherFunctionExercise = new FunctionsExercise();
//       System.out.println(anotherFunctionExercise.Vehiculo);

//       anotherFunctionExercise.Vehiculo = "Otro vehiculo para el objeto 2";
//       System.out.println(anotherFunctionExercise.Vehiculo);

//       callFunctionExercise.numerosSiguientes(10);
//       callFunctionExercise.del5Al20();
//       callFunctionExercise.entrarADiscoteca(20);
//       System.out.println(callFunctionExercise.TotalAPagar("COCHE",54.0));
//       callFunctionExercise.mayorde3(20,7,6);
//       System.out.println(callFunctionExercise.cadenasDiferentes("Hola","Papaya"));


// ========================================================================================================================================
//      ENUMS

//        NivelDeEstudios nivelEstudio;
//        System.out.println(NivelDeEstudios.BACHILLER);
//        System.out.println(NivelDeEstudios.BACHILLER.ordinal());
//        String bachillerAsString = NivelDeEstudios.BACHILLER.name();
//        System.out.println(bachillerAsString);
//
//        NivelDeEstudios[] niveles = NivelDeEstudios.values();
//        for (int i = 0; i < niveles.length; i++){
//            System.out.println(niveles[i]);
//        }
//
//        System.out.println(NivelDeEstudios.valueOf("TECNICO"));
//
//        System.out.println(Frutas.BANANA.getColor());

// ========================================================================================================================================

//        hacerAlgo();
//        getBaseUrl();

    }


// ========================================================================================================================================


//  Add & Remove the word static
//    public static void hacerAlgo(){
//        System.out.println("Hacer algo");
//    }


// ========================================================================================================================================



// ========================================================================================================================================


// ========================================================================================================================================

}

