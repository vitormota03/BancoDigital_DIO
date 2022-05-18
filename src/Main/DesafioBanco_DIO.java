package Main;

import Objetos.Cliente;
import Objetos.Conta;
import Objetos.ContaCorrente;
import Objetos.ContaPoupança;

public class DesafioBanco_DIO {

    public static void main(String[] args) {
        
        Cliente nomeCliente = new Cliente();
        nomeCliente.setNome("Vitor Mota");
        

        Conta corrente = new ContaCorrente(nomeCliente);
        corrente.depositar(100);

        Conta poupança = new ContaPoupança(nomeCliente);
        corrente.transferir(50, poupança);

        corrente.imprimeExtrato();
        poupança.imprimeExtrato();

    }

}
