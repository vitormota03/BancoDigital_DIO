package Objetos;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimeExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimeInfo();
    }

}
