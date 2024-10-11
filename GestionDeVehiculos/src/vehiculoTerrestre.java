public class vehiculoTerrestre extends Vehiculo {
    private int numeroRuedas;
    
    public vehiculoTerrestre(String marca, String modelo, int numeroRuedas) {
        super(marca, modelo);
        this.numeroRuedas = numeroRuedas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }


    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }
    
    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Número de ruedas: " + numeroRuedas;
    }
    
}
