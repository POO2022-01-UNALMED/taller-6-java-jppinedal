package vehiculos;

public class Automovil extends Vehiculo {
	
	private int puestos;
	private static int cantidadAutomoviles = 0;
	
	
	
	public Automovil(String placa, String nombre, int peso, int precio, Fabricante fabricante, int puestos) {
		
		super(placa, nombre, 4, 100, precio, peso, fabricante, "FWD");
		this.puestos = puestos;
		cantidadAutomoviles++;
		
	}
	
	public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
	public static int getCantidadAutomoviles() {
        return cantidadAutomoviles;
    }
    public int getPuestos() {
        return puestos;
    }

}
