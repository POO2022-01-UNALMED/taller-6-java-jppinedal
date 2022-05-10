package vehiculos;

import java.util.ArrayList;

public class Vehiculo {

    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    protected static int cantidadVehiculos = 0;

    public Vehiculo(String placa, String nombre, int puertas, int velocidadMaxima, int precio, int peso, Fabricante fabricante, String traccion) {

    	this.placa = placa;
    	this.nombre = nombre;
    	this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        this.traccion = traccion;       
        cantidadVehiculos++;
        vehiculos.add(this);
    }

    public Vehiculo(String placa, int puertas, int velociadadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){

        this(placa, nombre, puertas, velociadadMaxima, precio, peso, fabricante, traccion);
        cantidadVehiculos++;
        vehiculos.add(this);

    }

    public static ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        Vehiculo.cantidadVehiculos = cantidadVehiculos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    public String vehiculosPorTipo(){
        return  "Automoviles: " + Automovil.getCantidadAutomoviles() +
                "\nCamionetas: " + Camioneta.getCantidadCamionetas() +
                "\nCamiones: " + Camion.getCantidadCamiones();
    }
}
