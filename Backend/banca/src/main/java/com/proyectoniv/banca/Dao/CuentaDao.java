package com.proyectoniv.banca.Dao;
import com.proyectoniv.banca.Models.Cuenta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CuentaDao  extends CrudRepository<Cuenta, String> {
}