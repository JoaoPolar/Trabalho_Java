
package Cliente;

public abstract class Cliente {
    
    private int id;
    private String tipo;
    private String documento;
    private float saldo;
}

class ContaPF extends Cliente {
    private int CPF;
}

class ContaPJ extends Cliente {
    private int CNPJ;
}