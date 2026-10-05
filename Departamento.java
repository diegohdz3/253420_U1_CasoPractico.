public class Departamento {
    private String nombre;
    private String ubicacion;
    private Empleado[] empleados;

    public Departamento(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        empleados = new Empleado[5];
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void mostrarDatos() {
        System.out.println("Departamento: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
    }
}