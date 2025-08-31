package com.ejerciciolombok1;

// Clase Domicilio (versión corregida)
public class Domicilio {
    private String calle;
    private int numero;
    // No necesitamos una referencia a Persona para el propósito del toString()
    // Aunque la tuviéramos para otra lógica, no la usaríamos en este método
    private Persona residente;

    public Domicilio(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    // Asignar el residente después de la creación
    public void setResidente(Persona residente) {
        this.residente = residente;
    }

    // Método toString() corregido: no llama a Persona.toString()
    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                '}';
    }
}
