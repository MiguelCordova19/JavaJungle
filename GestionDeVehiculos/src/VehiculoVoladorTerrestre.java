
public class VehiculoVoladorTerrestre extends Vehiculo{
    private VehiculoAereo vehiculoAereo;
    private vehiculoTerrestre vehiculoTerrestre;

    public VehiculoVoladorTerrestre(String marca, String modelo, double altitudMaxima, String tipo, int numeroRuedas, double velocidadMaxima) {
        super(marca, modelo);
        this.vehiculoAereo = new VehiculoAereo(marca, modelo, altitudMaxima, tipo);
        this.vehiculoTerrestre = new vehiculoTerrestre(marca, modelo);
        this.vehiculoTerrestre.setNumeroRuedas(numeroRuedas);
        this.velocidadMaxima = velocidadMaxima;
    }

    private double velocidadMaxima; // Velocidad máxima en km/h

    public double getAltitudMaxima() {
        return vehiculoAereo.getAltitudMaxima();
    }

    public String getTipoAereo() {
        return vehiculoAereo.getTipo();
    }

    public int getNumeroRuedas() {
        return vehiculoTerrestre.getNumeroRuedas();
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String mostrarInfo() {
        return "Marca: " + getMarca() + 
               ", Modelo: " + getModelo() + 
               ", Altitud Máxima: " + getAltitudMaxima() + " m" +
               ", Tipo Aéreo: " + getTipoAereo() +
               ", Número de Ruedas: " + getNumeroRuedas() +
               ", Velocidad Máxima: " + getVelocidadMaxima() + " km/h";
    }
}

