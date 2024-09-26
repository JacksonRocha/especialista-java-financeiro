package jackson.rocha.servico;

import jackson.rocha.modelo.PessoaBonificavel;

public class ServicoPagementoBonus {

    public void pagar(PessoaBonificavel pessoa, double percentualMetaAlcancada) {
        double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);

        System.out.printf("DEBUG: Bônus pagor no valor de %.2f", valorBonus);
    }
}
