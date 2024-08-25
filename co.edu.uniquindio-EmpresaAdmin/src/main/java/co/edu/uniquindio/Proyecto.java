package co.edu.uniquindio;

import java.util.LinkedList;

public class Proyecto {
    private String nombre;
    private String codigo;
    private LinkedList<Empleado> empleadosAsignados;

    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        empleadosAsignados = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void asignarEmpleado (Empleado empleado) {
        empleadosAsignados.add(empleado);
    }

    public void elimimarEmpleado (Empleado empleado) {
        empleadosAsignados.remove(empleado);
    }

    public LinkedList<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        empleadosAsignados = empleados;
    }
}
