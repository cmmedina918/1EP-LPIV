package org.example.model;

public class Ahorro {
    private String nombre;
    private String type;
    private Double monto;

    public Ahorro() {};

    public Ahorro(String nombre, String type) {
        this.nombre = nombre;
        this.type = type;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getType() {
        return switch (type) {
            case "IV" -> "Ahorro a la vista";
            case "IF" -> "Ahorro a plazo fijo";
            default -> "";
        };
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto + 50000.0;
    }
}
