package Entidades;

public class CuentaPremium extends CuentaOrganizacional {

    private Boolean descuentoHabiliatdo;

    public CuentaPremium(Integer id, String nombre, Double precioBase) {
        super(id, nombre, precioBase);
    }

    public void setDescuentoHabiliatdo(Boolean descuentoHabiliatdo) {
        this.descuentoHabiliatdo = descuentoHabiliatdo;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Double calcularCostoTotal() {
          Double total=0.0;
        if (descuentoHabiliatdo == true) {

            Double descuento = getPrecioBase() * 0.20;
            Double total2=getPrecioBase()-descuento;
            total=getPerfiles().size()*0.05*getPrecioBase()+total2;



        }else{

                total=getPrecioBase()*total;
            }

        return total;
    }

}

