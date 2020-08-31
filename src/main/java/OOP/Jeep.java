package OOP;

public class Jeep extends Vehiculo {
    private String tipoCabina;
    private Boolean tipoConvertible;



    public Jeep(Integer ruedas, Integer puertas, Integer luces, String motor, Boolean dobleTraccion, String tipo) {
        super(ruedas, puertas, luces, motor, dobleTraccion, tipo);
    }

    public String getTipoCabina(String ca) {
        return tipoCabina;
    }

    public void setTipoCabina(String tipoCabina) {
        this.tipoCabina = tipoCabina;
    }

    public Boolean getTipoConvertible(boolean b) {
        return tipoConvertible;
    }

    public void setTipoConvertible(Boolean tipoConvertible) {
        this.tipoConvertible = tipoConvertible;
    }

    public void encenderDobleTraccion(){
        System.out.println("Metiendo la chancha " + super.getTipo());
    }

}