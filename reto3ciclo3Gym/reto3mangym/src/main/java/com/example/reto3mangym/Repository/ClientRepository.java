package com.example.reto3mangym.Repository;


import com.example.reto3mangym.Model.Client;

import com.example.reto3mangym.Repository.CrudRepository.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll() {
        return (List<Client>) clientCrudRepository.findAll();
    }
    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }
    public Client save(Client admin){
        return  clientCrudRepository.save(admin);
    }
    public void delete(Client admin){
        clientCrudRepository.delete(admin);
    }

}
