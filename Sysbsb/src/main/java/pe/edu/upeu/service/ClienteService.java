package pe.edu.upeu.service;

import pe.edu.upeu.model.Cliente;

import java.util.ArrayList;

public interface ClienteService {
    void save(Cliente cliente);
    ArrayList<Cliente> finAll();
    void update(int index, Cliente cliente);
    void delete(int index);

}
