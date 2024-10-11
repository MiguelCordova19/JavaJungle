
public class VehiculoAereo extends Vehiculo{
    private double altitudMaxima;
    private String tipo;    

    public VehiculoAereo(String marca, String modelo, double altitudMaxima, String tipo) {
        super(marca, modelo);
        this.altitudMaxima = altitudMaxima;
        this.tipo = tipo;
    }

    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(double altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Altitud Máxima: " + getAltitudMaxima() + " m, Tipo: " + getTipo();
    }
}

