package co.edu.uniquindio;

import java.util.LinkedList;

public class Departamento {
    private String nombre;
    private String codigo;
    private LinkedList <Empleado> empleados;

    public Departamento (String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        empleados = new LinkedList<>();
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

    public void agregarEmpleado (Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado (Empleado empleado) {
        empleados.remove(empleado);
    }

    public LinkedList <Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList <Empleado> empleados) {
        this.empleados = empleados;
    }
}
