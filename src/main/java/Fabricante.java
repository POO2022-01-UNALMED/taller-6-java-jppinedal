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
        Hashtable<String, Integer> fabricantes_cantidad = new Hashtable<>();
        String fabricante;
        int cantidad;

        for (Vehiculo vehiculo:vehiculos){
            fabricante = vehiculo.getFabricante().getNombre();

            if (!fabricantes_cantidad.containsKey(fabricante)){
                fabricantes_cantidad.put(fabricante, 1);
            }
            else {
                int cantidad_antigua = fabricantes_cantidad.get(fabricante);
                cantidad_antigua++;
                fabricantes_cantidad.put(fabricante, cantidad_antigua);
            }
        }

        int cantidad_mayor = fabricantes_cantidad.get(vehiculos.get(0).getFabricante().getNombre());
        String fabricante_mayor = vehiculos.get(0).getFabricante().getNombre();
        
        for (String p : fabricantes_cantidad.keySet()){
            if (fabricantes_cantidad.get(p) > cantidad_mayor){
                cantidad_mayor = fabricantes_cantidad.get(p);
                fabricante_mayor = p;
            }
        }
        return new Fabricante(fabricante_mayor, null);
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