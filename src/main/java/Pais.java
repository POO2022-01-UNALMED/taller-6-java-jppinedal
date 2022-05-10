package vehiculos;

import java.util.ArrayList;
import java.util.Hashtable;

public class Pais {
    private String nombre;

    
    public Pais(String nombre){
        this.nombre = nombre;

    }

    public static Pais paisMasVendedor(){

        ArrayList<Vehiculo> vehiculos = Vehiculo.getVehiculos();
        Hashtable<String, Integer> numeroPaises = new Hashtable<>();
        String pais;
        int cantidad;

        for (Vehiculo vehiculo:vehiculos){
            pais = vehiculo.getFabricante().getPais().getNombre();

            if (!numeroPaises.containsKey(pais)){
                numeroPaises.put(pais, 1);
            }
            else {
                int cantidad_antigua = numeroPaises.get(pais);
                cantidad_antigua++;
                numeroPaises.put(pais, cantidad_antigua);
            }
        }

        int mayor = numeroPaises.get(vehiculos.get(0).getFabricante().getPais().getNombre());
        String cMayorPais = vehiculos.get(0).getFabricante().getPais().getNombre();
        
        for (String i : numeroPaises.keySet()){
        	
            if (numeroPaises.get(i) > mayor){
                mayor = numeroPaises.get(i);
                cMayorPais = i;
            }
        }
        
        return new Pais(cMayorPais);
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}