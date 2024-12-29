package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionsHandling {
    public static void exception(){
        System.out.println("Hello");
        int x = 10, y ,z;
         System.out.println("Ingrese y: ");
        try{
            y = new Scanner(System.in).nextInt();
            z = x/y;
            System.out.println("Resultado es: " + z);
        }
        catch(InputMismatchException ime){
            System.out.println("You didn't enter a number, it is not possible to divide a number by that");
            System.out.println(ime.getMessage());
        }
        catch(ArithmeticException ae){
            System.out.println("No se puede dividir entre cero o un numero negativo");
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }
        catch(Exception e){
            System.out.println("An error happened" + e.getMessage());
            e.printStackTrace();
        } finally{
            System.out.println("Bye bye");
        }
    }

    public static int factorial(int num){
        if(num <0){
            throw new ArithmeticException("Negative number is not allowed here");
        }
        int fact = 1;
        for (int i = 2; i<= num; i++){
            fact = fact * i;
        }
        return fact;
    }


}


// Errors

// Compile time errors:
// Before the program execution starts, Java compiler finds errors in the code and throw compile time errors, the key thing to note here is that it comes before the code execution, syntax errors for example

// Throwable is all exceptions superclass in Java, only instaces of this class (or their subclases) can get to be thrown by the JVM or manually by using throw keyword

// Exception (Is a class in Java):
// Are errors which come in Runtime (while code is being executed) they are not identified during compile time

// We have two type of excpetions: Checked (IOException)and Unchecked exceptions (RunTimeException)

// TRY - CATCH - FINALLY BLOCKS
// Try: Statements which be candidates to fail due an error should be located here

// Catch: It sets whether an error happens, first we se type of exception followed by exception name, by using catch software will execute the logic whithin the catch inteadof breaking

// Catch order is important, any expection comes from Exception, by inheritance, Exception should by placed as the last catch

// Finally: Either try or catch works, this logic will get executed

// CHEKED:
// UNCHEKED: