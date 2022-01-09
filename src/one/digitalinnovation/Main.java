package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Banco bradesco = new Banco("Bradesco");

        List<Conta> contasBradesco = new ArrayList<>();

        contasBradesco.add(new ContaCorrente(new Cliente("João Pedro"), bradesco));
        contasBradesco.add(new ContaPoupanca(new Cliente("Lucas"), bradesco));
        contasBradesco.add(new ContaCorrente(new Cliente("Jorge"), bradesco));

        bradesco.setContas(contasBradesco);

        bradesco.imprimirListaContas();
    }
}
