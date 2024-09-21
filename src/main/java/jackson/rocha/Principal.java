package jackson.rocha;

import jackson.rocha.modelo.Fazenda;
import jackson.rocha.modelo.Industria;
import jackson.rocha.modelo.ParceiroFinanceiro;
import jackson.rocha.servico.ServicoFinanciamento;

public class Principal {
    public static void main(String[] args) {
        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);
        var parceiro = new ParceiroFinanceiro("Capital ABC", 2_000_000);


        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
        // servicoFinanciamento.solicitarFinanciamento(industria, 600_000);
    }
}
