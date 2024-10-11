
public class UtilidadCalculos {

    public static double convertirToneladasALibras(double toneladas) {
        return toneladas * 2204.62;
    }

    public static double convertirLibrasAToneladas(double libras) {
        return libras / 2204.62;
    }

    public static double convertirLitrosAGalones(double litros) {
        return litros * 0.264172;
    }

    public static double convertirGalonesALitros(double galones) {
        return galones / 0.264172;
    }

    public static double calcularEficienciaCombustible(double distancia, double litros) {
        if (litros == 0) {
            throw new IllegalArgumentException("El número de litros no puede ser cero.");
        }
        return distancia / litros;
    }

    public static double calcularCostePorKilometro(double costeCombustible, double eficiencia) {
        return costeCombustible / eficiencia;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }
}
