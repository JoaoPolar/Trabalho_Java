package Banco;

import Cliente.Cliente;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    
        private List<Cliente> Clientes = new ArrayList<>();

        public void addCliente(Cliente Cliente) {
        this.Clientes.add(Cliente);
        }

        public Cliente removeCliente(int id) {
            for (Cliente c : Clientes) {
                if (c.getId()== id){
                    c.setId(-1);
                }
               
        }
            return null;
        }
        
        public Cliente getCliente(int id){
            for (Cliente c : Clientes) {
                if (c.getId()== id){
                    return c;
                }
                
            }
            return null;
        }

}
       
