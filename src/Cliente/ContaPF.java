package Cliente;

public class ContaPF extends Cliente{
    
    private int CPF;
    
    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    
    public ContaPF(int id, String nome, String tipo, int CPF) {
        super(id, tipo, nome);
        this.CPF = CPF;
    }
    
}
