package jackson.rocha.modelo;

public interface ClienteFinanciavel {

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (valorSolicitado <= 100_000) {
            return 1.0;
        } else if (valorSolicitado <= 100_000_000) {
            return 1.5;
        } else {
            return 2.0;
        }
    }
}
