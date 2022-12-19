package com.proyectoniv.banca.Dao;
import com.proyectoniv.banca.Models.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteDao extends CrudRepository< Cliente, String>  {
}