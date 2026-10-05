public class Empleado {
    private String nombreCompleto;
    private int identificador;

    public Empleado(String nombreCompleto, int identificador) {
        this.nombreCompleto = nombreCompleto;
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Identificador: " + identificador);
    }
}