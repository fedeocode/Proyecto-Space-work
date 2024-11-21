import Entidades.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


        CuentaPremium cuenta = new CuentaPremium(3, "fedeok", 200.00);
        CuentaBasica cuenta2 = new CuentaBasica(5, "Sergiook", 300.0);
        Perfil perfil = new Perfil(3, "FedeSangre");

        cuenta.setDescuentoHabiliatdo(true);
        Set<CuentaOrganizacional> listaCuenta = new HashSet<>();
        listaCuenta.add(cuenta);
        listaCuenta.add(cuenta2);
        for (CuentaOrganizacional lista : listaCuenta) {

            System.out.println("lista cuentas" + lista);

        }


        buscarPorNombre(listaCuenta, "fedeok");
        System.out.println("Costo Total Cuenta Premium"+cuenta.calcularCostoTotal());
        cuenta.agregarPerfil(perfil);
        cuenta.compareTo(cuenta2);
        System.out.println("Costo Total Cuenta Basica "+cuenta2.calcularCostoTotal());
        cuenta2.eliminarPerfil(perfil);

        try{
            cuenta2.agregarPerfil(perfil);
            cuenta2.agregarPerfil(perfil);
            cuenta2.agregarPerfil(perfil);
            cuenta2.agregarPerfil(perfil);
            cuenta2.agregarPerfil(perfil);
            cuenta2.agregarPerfil(perfil);
        }catch (PerfiNoAutorizadoExeption e){

            System.err.println(e.getMessage());

        }finally {
            System.out.println("aca finaliza Exception");

        }

    }


    public static void buscarPorNombre(Set<CuentaOrganizacional> nombreLista, String nombre) {

        if (nombre == null) {

            System.out.println("Nombre no valido");


        } else {
            for (CuentaOrganizacional lista : nombreLista) {
                if (lista.getNombre().equals(nombre)) {

                    System.out.println("nombre encontrado" + lista);


                }
            }

        }

    }
}