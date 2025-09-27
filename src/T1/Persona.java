
package T1;

public class Persona {
    private String nombre;
    private double temperatura;

    public Persona(String nombre, double temperatura) {
        this.nombre = nombre;
        this.temperatura = temperatura;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public boolean tieneFiebre() {
        return temperatura > 37.5;
    }
    @Override
    public String toString() {
        return "Persona nombre=" + nombre + ", temperatura=" + temperatura + "°C";
    }
}
