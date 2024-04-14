package Banco;

import Cliente.ContaPJ;
import Cliente.ContaPF;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    
        public  Banco banco;
    
        private List<ContaPJ> ClientesPJ = new ArrayList<>();

        public void addClientePJ(ContaPJ ClientesPJ) {
        this.ClientesPJ.add(ClientesPJ);
        }

        public void removeClientePJ(ContaPJ ClientesPJ) {
            this.ClientesPJ.remove(ClientesPJ);
        }

        private List<ContaPF> ClientesPF = new ArrayList<>();
        
        public void addClientePF(ContaPF ClientesPF) {
        this.ClientesPF.add(ClientesPF);
        }
        
        public void removeClientePF(ContaPF ClientesPF) {
            this.ClientesPF.remove(ClientesPF);
        }

        public ContaPJ getClientePJ(int identificador) {
        for (ContaPJ novacontaPJ : this.ClientesPJ) {
            if (novacontaPJ.getId() == identificador) {
                return novacontaPJ;
            }
        }
        return null;
        }
        public ContaPF getClientePF(int identificador) {
        for (ContaPF novacontaPF : this.ClientesPF) {
            if (novacontaPF.getId() == identificador) {
                return novacontaPF;
            }
        }
        return null;
        }  
}
