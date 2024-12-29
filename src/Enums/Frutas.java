package Enums;

public enum Frutas {
    BANANA("Amarillo", "Dulce", "Arbol"),
    FRESA("Rojo", "Acido", "Arbusto"),
    MANZANA("Rojo/Verde", "Dulce", "Arbol"),
    MANGO("Amarillo", "Dulce", "Arbol");

    private String color;
    private String sabor;
    private String crece;

    private Frutas(String color, String sabor, String crece) {
        this.color = color;
        this.sabor = sabor;
        this.crece = crece;
    }

    public String getColor() {
        return color;
    }

    public String getSabor() {
        return sabor;
    }

    public String getCrece() {
        return crece;
    }
}
