package co.edu.uniquindio;

import java.util.LinkedList;

public class Gerente extends Empleado {
    private int nivelGerencia;
    private LinkedList<Empleado> equipoBajoGestion;
    private LinkedList<Proyecto> proyectosGestionados;

    public Gerente(String nombre, String idEmpleado, Departamento departamento, int nivelGerencia) {
        super(nombre, idEmpleado, departamento);
        this.nivelGerencia = nivelGerencia;
        this.equipoBajoGestion = new LinkedList<>();
        this.proyectosGestionados = new LinkedList<>();
    }

    public int getNivelGerencia() {
        return nivelGerencia;
    }

    public void setNivelGerencia(int nivelGerencia) {
        this.nivelGerencia = nivelGerencia;
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectosGestionados.add(proyecto);
    }

    public void eliminarProyecto(Proyecto proyecto) {
        proyectosGestionados.remove(proyecto);
    }

    public LinkedList<Proyecto> getProyectosGestionados() {
        return proyectosGestionados;
    }

    public void setProyectosGestionados(LinkedList<Proyecto> proyectosGestionados) {
        this.proyectosGestionados = proyectosGestionados;
    }

    public void agregarEmpleado(Empleado empleado) {
        equipoBajoGestion.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        equipoBajoGestion.remove(empleado);
    }

    public LinkedList<Empleado> getEquipoBajoGestion() {
        return equipoBajoGestion;
    }

    public void setEquipoBajoGestion(LinkedList<Empleado> empleados) {
        equipoBajoGestion = empleados;
    }

    @Override
    public String contribuir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gerente ").append(getNombre()).append(" (ID: ").append(getIdEmpleado()).append(") está contribuyendo con:\n");
        sb.append(gestionarProyectos()).append("\n");
        sb.append(liderarEquipo()).append("\n");
        return sb.toString();
    }

    private String gestionarProyectos() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ** Gestionando proyectos:\n");
        for (Proyecto proyecto : proyectosGestionados) {
            sb.append("       - Proyecto: ").append(proyecto.getNombre()).append("\n");
        }
        return sb.toString();
    }

    private String liderarEquipo() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ** Liderando equipos técnicos:\n");
        for (Empleado empleado : equipoBajoGestion) {
            sb.append("  - ").append(empleado.getNombre()).append(" (ID: ").append(empleado.getIdEmpleado()).append(")\n");
        }
        return sb.toString();
    }
}

