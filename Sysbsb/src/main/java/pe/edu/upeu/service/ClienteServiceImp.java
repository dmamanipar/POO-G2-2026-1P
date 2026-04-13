package pe.edu.upeu.service;

import pe.edu.upeu.model.Cliente;
import pe.edu.upeu.repository.ClienteRepository;

import java.util.ArrayList;

public class ClienteServiceImp extends ClienteRepository implements ClienteService{
    @Override
    public void save(Cliente cliente) {
        super.save(cliente);
    }

    @Override
    public ArrayList<Cliente> finAll() {
         return super.finAll();
    }

    @Override
    public void update(int index, Cliente cliente) {
        super.update(cliente, index);
    }

    @Override
    public void update(int index) {
        super.delete(index);
    }
}
