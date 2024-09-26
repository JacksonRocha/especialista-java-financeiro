package jackson.rocha;

import jackson.rocha.modelo.Funcionario;
import jackson.rocha.modelo.PessoaBonificavel;
import jackson.rocha.servico.ServicoPagementoBonus;

public class Principal2 {
    public static void main(String[] args) {
        PessoaBonificavel funcionario = new Funcionario("João da Silva", 18_000);
        funcionario.calcularBonus(10);

        ServicoPagementoBonus servicoPagementoBonus = new ServicoPagementoBonus();
        servicoPagementoBonus.pagar(funcionario, 50);
    }
}
