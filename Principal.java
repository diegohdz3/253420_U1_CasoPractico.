public class Principal {
    public static void main(String[] args) {

        Departamento[] departamentos = new Departamento[3];

        departamentos[0] = new Departamento("Ventas", "Matriz");
        departamentos[1] = new Departamento("Sistemas", "Sucursal");
        departamentos[2] = new Departamento("Contabilidad", "Matriz");

        Empleado[] ventas = departamentos[0].getEmpleados();
        Empleado[] sistemas = departamentos[1].getEmpleados();
        Empleado[] contabilidad = departamentos[2].getEmpleados();

        ventas[0] = new Empleado("Ana Lopez Perez", 10001);
        ventas[1] = new Empleado("Juan Martinez Ruiz", 10002);
        ventas[2] = new Empleado("Maria Garcia Torres", 10003);
        ventas[3] = new Empleado("Luis Hernandez Diaz", 10004);
        ventas[4] = new Empleado("Sofia Ramirez Cruz", 10005);

        sistemas[0] = new Empleado("Pedro Sanchez Rios", 10006);
        sistemas[1] = new Empleado("Laura Flores Mendoza", 10007);

        contabilidad[0] = new Empleado("Carlos Morales Vega", 10008);

        int departamentoBuscado = 3;
        int identificadorBuscado = 10006;

        if (departamentoBuscado >= 0
                && departamentoBuscado < departamentos.length) {

            Departamento departamento = departamentos[departamentoBuscado];
            departamento.mostrarDatos();

            Empleado[] empleados = departamento.getEmpleados();
            boolean encontrado = false;

            for (int i = 0; i < empleados.length; i++) {
                if (empleados[i] != null) {
                    if (empleados[i].getIdentificador() == identificadorBuscado) {
                        empleados[i].mostrarDatos();
                        encontrado = true;
                    }
                }
            }

            if (encontrado == false) {
                System.out.println("Empleado no encontrado en el departamento.");
            }

        } else {
            System.out.println("El departamento no existe.");
        }
    }
}