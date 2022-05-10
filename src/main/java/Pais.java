package vehiculos;

import java.util.ArrayList;
import java.util.Hashtable;

public class Pais {
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		
		ArrayList<Vehiculo> vehiculos = Vehiculo.getVehiculos();
        Hashtable<String, Integer> numPaises = new Hashtable<>(); 
        String pais;
        int cantidad;
		
        for (Vehiculo vehiculo:vehiculos){
            pais = vehiculo.getFabricante().getPais().getNombre();

            if (!numPaises.containsKey(pais)){
                numPaises.put(pais, 1);
            }
            
            else {
                int cantidad_antigua = numPaises.get(pais);
                cantidad_antigua++;
                numPaises.put(pais, cantidad_antigua);
            }
        }

        int mayor = numPaises.get(vehiculos.get(0).getFabricante().getPais().getNombre());
        String paisMayor = vehiculos.get(0).getFabricante().getPais().getNombre();
        
        for (String i : numPaises.keySet()){
            if (numPaises.get(i) > mayor){
                mayor = numPaises.get(i);
                paisMayor = i;
            }
        }
        return new Pais(paisMayor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
