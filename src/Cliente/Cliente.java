
package Cliente;

public class Cliente {
    private int id;
    private String tipo;
    private String documento;
    private float saldo;

    public Cliente(int id, String tipo, String documento, float saldo) {
        this.id = id;
        this.tipo = tipo;
        this.documento = documento;
        this.saldo = (float) 0.0;
    }

    public Cliente() {
    }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
