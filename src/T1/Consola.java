package T1;

import java.util.ArrayList;

public class Consola {
    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Ana", 36.5));
        
        lista.add(new Persona("Luis", 38.0));
        
        lista.add(new Persona("Carla", 37.2));
        
        lista.add(new Persona("Pedro", 39.1));
        
        System.out.println(" Las Personas con fiebre son :");
        
        for (Persona p : lista) {
            if (p.tieneFiebre()) {
                System.out.println(p);
            }
        }
    }
}