package org.example.model;

public class InteresAhorro extends Ahorro{
    private String plazo;
    private Double interes;
    private Double total;

    public InteresAhorro() {
        super();
    }

    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    public Double getInteres() {
        return switch (getPlazo()){
            case "1" ->  0.05;
            case "12" -> 0.10;
            case "24" -> 0.20;
            case "48" -> 0.30;
            case "120" -> 0.40;
            default -> 1.0;
        };
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getTotal() {
        return getMonto() * getInteres();
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
