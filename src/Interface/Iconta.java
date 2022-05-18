/*Interface.java trata-se de um classe.java abstrata que contem todos os metodos abstratos*/
package Interface;

import Objetos.Conta;

public interface Iconta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);
    
    void imprimeExtrato();
    

}
