package Entidades;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.setOut;

public abstract class CuentaOrganizacional implements Comparable <CuentaOrganizacional> {

    private Integer id;
    private String nombre;
    private List<Perfil>perfiles;
    private Double precioBase;

    public CuentaOrganizacional(Integer id, String nombre, Double precioBase) {
        this.id = id;
        this.nombre = nombre;
        this.perfiles = new ArrayList<>();
        this.precioBase = precioBase;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public abstract Double calcularCostoTotal();

    public List<Perfil> getPerfiles() {
        return perfiles;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(CuentaOrganizacional o) {

        int resultado = 1;
        if (this.perfiles.size() > o.perfiles.size()) {

            return resultado = -1;

        } else {


            return resultado;

        }

    }

    @Override
    public String toString() {
        return "CuentaOrganizacional{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", perfiles=" + perfiles +
                ", precioBase=" + precioBase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaOrganizacional that = (CuentaOrganizacional) o;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre) && Objects.equals(perfiles, that.perfiles) && Objects.equals(precioBase, that.precioBase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, perfiles, precioBase);
    }

    public void eliminarPerfil(Perfil eliminarPerfil){
   perfiles.add(eliminarPerfil);

}
public void agregarPerfil(Perfil agregarPerfil){
   perfiles.add(agregarPerfil);


}
    }




