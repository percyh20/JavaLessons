package OOP;

public class Motocicleta extends Vehiculo{
    private String estilo;

    public Motocicleta(Integer ruedas, Integer puertas, Integer luces, String motor, Boolean dobleTraccion, String tipo, String estilo) {
        super(ruedas, puertas, luces, motor, dobleTraccion, tipo);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}

