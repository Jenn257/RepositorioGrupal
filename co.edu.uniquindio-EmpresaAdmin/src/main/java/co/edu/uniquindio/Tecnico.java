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
    public String contribuir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Técnico ").append(getNombre()).append(" (ID: ").append(getIdEmpleado()).append(") está contribuyendo con:\n");
        sb.append(realizarTareasTecnicas()).append("\n");
        sb.append(resolverProblemas()).append("\n");
        return sb.toString();
    }

    private String realizarTareasTecnicas() {
        return "  ** Realizando tareas técnicas en la especialidad de " + especialidad;
    }

    private String resolverProblemas() {
        return "  ** Resolviendo problemas";
    }
}
