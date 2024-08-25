package co.edu.uniquindio;

public class Main {

    public static void main(String[] args) {
        // Crear un departamento
        Departamento depto = new Departamento("Desarrollo de Software", "D001");

        // Crear empleados
        Empleado emp1 = new Empleado("Juan Pérez", "E001", depto);
        Empleado emp2 = new Empleado("Ana Gómez", "E002", depto);

        // Crear proyectos
        Proyecto proj1 = new Proyecto("Proyecto Alpha", "P001");
        Proyecto proj2 = new Proyecto("Proyecto Beta", "P002");

        // Crear gerente
        Gerente gerente = new Gerente("Carlos Martínez", "G001", depto);
        gerente.setNivelGerencia("Senior");

        // Crear técnico
        Tecnico tecnico = new Tecnico("Luis Fernández", "T001", depto, "Desarrollo Web");

        // Agregar empleados al departamento
        depto.agregarEmpleado(emp1);
        depto.agregarEmpleado(emp2);

        // Asignar empleados a proyectos
        proj1.asignarEmpleado(emp1);
        proj2.asignarEmpleado(emp2);

        // Agregar proyectos al gerente
        gerente.agregarProyecto(proj1);
        gerente.agregarProyecto(proj2);

        // Agregar empleados al equipo bajo gestión del gerente
        gerente.agregarEmpleado(emp1);
        gerente.agregarEmpleado(emp2);

        // Ejecutar contribuciones
        System.out.println("Contribuciones del Gerente:");
        gerente.contribuir();

        System.out.println("\nContribuciones del Técnico:");
        tecnico.contribuir();

        // Mostrar empleados del departamento
        System.out.println("\nEmpleados en el Departamento:");
        for (Empleado emp : depto.getEmpleados()) {
            System.out.println(" - " + emp.getNombre() + " (" + emp.getIdEmpleado() + ")");
        }

        // Mostrar proyectos y sus empleados asignados
        System.out.println("\nEmpleados asignados a proyectos:");
        for (Proyecto proyecto : new Proyecto[]{proj1, proj2}) {
            System.out.println("Proyecto: " + proyecto.getNombre());
            for (Empleado empleado : proyecto.getEmpleadosAsignados()) {
                System.out.println(" - " + empleado.getNombre() + " (" + empleado.getIdEmpleado() + ")");
            }
        }
    }
}
