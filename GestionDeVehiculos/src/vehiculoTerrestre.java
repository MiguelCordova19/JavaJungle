public class vehiculoTerrestre extends Vehiculo {
    private int numeroRuedas;
    
    public vehiculoTerrestre(String marca, String modelo) {
        super(marca, modelo);
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
