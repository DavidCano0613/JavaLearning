public interface Vehiculo {

    default void arrancar() {
        System.out.println("arrancar");
    }
}
