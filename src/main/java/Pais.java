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
        Hashtable<String, Integer> paises_cantidad = new Hashtable<>();
        String pais;
        int cantidad;

        for (Vehiculo vehiculo:vehiculos){
            pais = vehiculo.getFabricante().getPais().getNombre();

            if (!paises_cantidad.containsKey(pais)){
                paises_cantidad.put(pais, 1);
            }
            else {
                int cantidad_antigua = paises_cantidad.get(pais);
                cantidad_antigua++;
                paises_cantidad.put(pais, cantidad_antigua);
            }
        }

        int cantidad_mayor = paises_cantidad.get(vehiculos.get(0).getFabricante().getPais().getNombre());
        String pais_mayor = vehiculos.get(0).getFabricante().getPais().getNombre();
        
        for (String p : paises_cantidad.keySet()){
            if (paises_cantidad.get(p) > cantidad_mayor){
                cantidad_mayor = paises_cantidad.get(p);
                pais_mayor = p;
            }
        }
        return new Pais(pais_mayor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}