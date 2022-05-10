package vehiculos;

import java.util.ArrayList;
import java.util.Hashtable;

public class Fabricante {
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais){
    	
            this.nombre = nombre;
            this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas() {
    	
        ArrayList<Vehiculo> vehiculos = Vehiculo.getVehiculos();
        Hashtable<String, Integer> numFabricantes = new Hashtable<>();
        String fabricante;
        int cantidad;

        
        for (Vehiculo vehiculo:vehiculos){
        	
            fabricante = vehiculo.getFabricante().getNombre();

            if (!numFabricantes.containsKey(fabricante)){
                numFabricantes.put(fabricante, 1);
            }
            else {
                int cantFabricantesAnt = numFabricantes.get(fabricante);
                cantFabricantesAnt++;
                numFabricantes.put(fabricante, cantFabricantesAnt);
            }
            
        }

        int mayor = numFabricantes.get(vehiculos.get(0).getFabricante().getNombre());
        String cMayorFabricante = vehiculos.get(0).getFabricante().getNombre();
        
        for (String i : numFabricantes.keySet()){
        	
            if (numFabricantes.get(i) > mayor){
                mayor = numFabricantes.get(i);
                cMayorFabricante = i;
            }
        }
        
        return new Fabricante(cMayorFabricante, null);
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}