
public class VehiculoAcuatico extends Vehiculo{
    private double eslora;
    private String tipo;  

    public VehiculoAcuatico(String marca, String modelo, double eslora, String tipo) {
        super(marca, modelo);
        this.eslora = eslora;
        this.tipo = tipo;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Eslora: " + getEslora() + " m, Tipo: " + getTipo();
    }

}
