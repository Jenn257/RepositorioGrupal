package co.edu.uniquindio;

public class Tecnico extends Empleado {
    private String especialidad;


    public Tecnico(String nombre, String idEmpleado, Departamento departamento, String especialidad) {
        super(nombre, idEmpleado, departamento);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void contribuir() {
        realizarTareasTecnicas();
        resolverProblemas();
    }

    private void realizarTareasTecnicas() {
        System.out.println("Realizando tareas técnicas en la especialidad de " + especialidad);
    }

    private void resolverProblemas() {
        System.out.println("Resolviendo problemas");
    }
}
