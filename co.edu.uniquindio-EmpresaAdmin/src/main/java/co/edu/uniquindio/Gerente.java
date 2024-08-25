package co.edu.uniquindio;

import java.util.LinkedList;

public class Gerente extends Empleado{
    private String nivelGerencia;
    private LinkedList <Empleado> equipoBajoGestion;
    private LinkedList <Proyecto> proyectosGestionados;

    public Gerente(String nombre, String idEmpleado, Departamento departamento) {
        super (nombre, idEmpleado, departamento);
        this.nivelGerencia = nivelGerencia;
        this.equipoBajoGestion = equipoBajoGestion;
        this.proyectosGestionados = proyectosGestionados;
    }

    public String getNivelGerencia() {
        return nivelGerencia;
    }

    public void setNivelGerencia(String nivelGerencia) {
        this.nivelGerencia = nivelGerencia;
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectosGestionados.add(proyecto);
    }

    public void eliminarProyecto(Proyecto proyecto) {
        proyectosGestionados.remove(proyecto);
    }

    public LinkedList <Proyecto> getProyectosGestionados() {
        return proyectosGestionados;
    }

    public void setProyectosGestionados( LinkedList <Proyecto> proyectosGestionados) {
        this.proyectosGestionados = proyectosGestionados;
    }

    public void agregarEmpleado(Empleado empleado) {
        equipoBajoGestion.add (empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        equipoBajoGestion.remove(empleado);
    }

    public LinkedList <Empleado> getEquipoBajoGestion() {
        return equipoBajoGestion;
    }

    public void setEquipoBajoGestion(LinkedList <Empleado> empleados) {
        equipoBajoGestion = empleados;
    }

    @Override
    public void contribuir () {
        gestionarProyectos ();
        liderarEquipo ();
    }

    private void gestionarProyectos() {
        for (Proyecto proyecto : proyectosGestionados) {
            System.out.println("Gestionando proyecto: " + proyecto.getNombre());
        }
    }

    private void liderarEquipo() {
        System.out.println("Liderando equipo:");
        for (Empleado empleado : equipoBajoGestion) {
            System.out.println(" - " + empleado.getNombre() + " (" + empleado.getIdEmpleado() + ")");
        }
    }
}

