package OOP.Interfaces;

public interface JavaInterface {

//  Variables in interfaces
//  Static and Final by default, therefore we have to initialize them
//  It's not possible to create instance variables in an interface, they have to be static and final

    public static final int constante = 0;
    String account = null;
    Integer integer = 4;


//Methods:
//  Los métodos pueden tener implementación predeterminada o ser estáticos a partir de ciertas versiones de Java.
//  All methods are public and abstract by default
    public abstract void viewAccountBalance();
    public void transferFunders();
    public void openDeposit();

}
