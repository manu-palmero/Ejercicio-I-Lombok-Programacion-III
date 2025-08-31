package com.ejerciciolombok1;

// Clase Persona (versión corregida)
public class Persona {
    private String nombre;
    private int edad;
    private Domicilio domicilio;

    public Persona(String nombre, int edad, Domicilio domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;

        // Establecer la referencia en Domicilio
        if (domicilio != null) {
            domicilio.setResidente(this);
        }
    }

    // Método toString() corregido: llama a Domicilio.toString()
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", domicilio=" + (domicilio != null ? domicilio.toString() : "sin domicilio") +
                '}';
    }
}