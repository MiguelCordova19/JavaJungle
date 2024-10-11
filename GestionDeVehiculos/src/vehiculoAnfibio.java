public class vehiculoAnfibio extends Vehiculo{
    private int capacidadFlotacion;
    private int numeroRuedas;

    public vehiculoAnfibio(String marca, String modelo, int numeroRuedas, int capacidadFlotacion) {
        super(marca, modelo, numeroRuedas);
        this.capacidadFlotacion = capacidadFlotacion;
    }

    
    public int getCapacidadFlotacion() {
        return capacidadFlotacion;
    }

    
    public void setCapacidadFlotacion(int capacidadFlotacion) {
        this.capacidadFlotacion = capacidadFlotacion;
    }

    /**
     * @return the numeroRuedas
     */
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    /**
     * @param numeroRuedas the numeroRuedas to set
     */
    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }
}
