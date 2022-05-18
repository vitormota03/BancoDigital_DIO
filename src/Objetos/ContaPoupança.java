package Objetos;

public class ContaPoupança extends Conta {

    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    public void imprimeExtrato() {
        System.out.println("\n=== Extrato Conta Poupança ===");
        super.imprimeInfo();
    }

}
