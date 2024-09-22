package jackson.rocha.modelo;

public interface ClienteFinanciavel {

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoPequenoValor(valorSolicitado)) {
            return 1.0;
        } else if (isFinanciamentoGrandeValor(valorSolicitado)) {
            return 1.5;
        } else {
            return 2.0;
        }
    }

    private static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 100_000_000;
    }

    private static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }
}
