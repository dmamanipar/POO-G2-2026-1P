package pe.edu.upeu.repository;

import pe.edu.upeu.model.Cliente;

import java.util.ArrayList;

public abstract class ClienteRepository {
    public static ClienteRepository instance = new ClienteRepository() {
        @Override
        public void update(int index) {

        }
    };

    public ClienteRepository getInstance(){
        if(instance == null){
            instance = new ClienteRepository() {
                @Override
                public void update(int index) {

                }
            };
        }
        return instance;
    }
    ArrayList<Cliente> clientes = new ArrayList();

    public void save(Cliente cliente){
        clientes.add(cliente);
    }
    public ArrayList<Cliente> finAll(){
        return clientes;
    }
    public void update(Cliente c,int index){
        clientes.set(index, c);
    }
    public void delete(int index){
        clientes.remove(index);
    }

    public abstract void update(int index);
}
