package OOP;

public class Vehiculo {
    private Integer ruedas;
    private Integer puertas;
    private Integer luces;
    private String motor;
    private Boolean dobleTraccion;
    private String tipo;
    private Integer pasajeros;
    protected Integer numeroSerie;
    String defaultModifier;

    public Vehiculo(){

    }

    public Vehiculo(Integer ruedas, Integer puertas, Integer luces, String motor, Boolean dobleTraccion, String tipo) {
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.luces = luces;
        this.motor = motor;
        this.dobleTraccion = dobleTraccion;
        this.tipo = tipo;

    }



    protected void arrancar(){
        System.out.println("Arrancado Listo " + tipo);
    }
    public void acelerar(){
        System.out.println("Acelerando " + tipo);
    }
    public void frenando(){
        System.out.println("Frenando " + tipo);
    }
    private void ponerCinturon(){
        System.out.println("Ajustando Cinturon");
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    public Integer getLuces() {
        return luces;
    }

    public void setLuces(Integer luces) {
        this.luces = luces;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Boolean getDobleTraccion() {
        return dobleTraccion;
    }

    public void setDobleTraccion(Boolean dobleTraccion) {
        this.dobleTraccion = dobleTraccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Integer pasajeros) {
        this.pasajeros = pasajeros;
    }
}