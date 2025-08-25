public class Main {
    public static void main(String[] args) {


                Domicilio miCasa = new Domicilio("Calle Falsa", 123);
                Persona yo = new Persona("Juan", 30, miCasa);

                // Ahora, esta llamada funciona correctamente sin recursividad
                System.out.println(yo);
                // Salida: Persona{nombre='Juan', edad=30, domicilio=Domicilio{calle='Calle Falsa', numero=123}}
            }
        }