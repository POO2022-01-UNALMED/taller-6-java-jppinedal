package vehiculos;

public class Camion extends Vehiculo {
	private static int cantidadCamiones = 0;
	private int ejes;

	public Camion(String placa, String nombre, int peso, int precio, Fabricante fabricante, int ejes) {
		
		super(placa, nombre, 2, 80, precio, peso, fabricante, "4X2");
		this.setEjes(ejes);
				
	}

	public static int getCantidadCamiones() {
		return cantidadCamiones;
	}

	public static void setCantidadCamiones(int cantidadCamiones) {
		Camion.cantidadCamiones = cantidadCamiones;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

}
