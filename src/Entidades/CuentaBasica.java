package Entidades;

public class CuentaBasica extends CuentaOrganizacional{

    private Boolean estadoPrueba;
    private Double valorPlus;

    public CuentaBasica(Integer id, String nombre, Double precioBase) {
        super(id, nombre, precioBase);
    }


    public Double calcularCostoTotal(){


            Double valorPlus=getPerfiles().size()*0.03;



       return valorPlus+getPrecioBase();

    }

    @Override
    public void agregarPerfil(Perfil agregarPerfil) {

        if(getPerfiles().size()>5){

          throw new PerfiNoAutorizadoExeption("Error Perfil");

        }

        super.agregarPerfil(agregarPerfil);
    }
}
