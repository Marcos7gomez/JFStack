package com.cursojava.curso.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp  implements UsuarioDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List getUsuarios() { //Consulta a base de datos
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();

    }
}
