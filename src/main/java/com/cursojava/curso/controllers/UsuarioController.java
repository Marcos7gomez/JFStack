package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {

    @Autowired //Hace que la clase usuarioDaoImp cree un objeto y lo guarda en la variable declarada
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Marcos");
        usuario.setApellido("Gomez");
        usuario.setEmail("Marcoslg.Gomez@gmail.com");
        usuario.setTelefono("2604546647");
        return usuario;
    }

    @RequestMapping(value = "editar")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Marcos");
        usuario.setApellido("Gomez");
        usuario.setEmail("Marcoslg.Gomez@gmail.com");
        usuario.setTelefono("2604546647");
        return usuario;
    }

    @RequestMapping(value = "eliminar")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Marcos");
        usuario.setApellido("Gomez");
        usuario.setEmail("Marcoslg.Gomez@gmail.com");
        usuario.setTelefono("2604546647");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "buscar")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Marcos");
        usuario.setApellido("Gomez");
        usuario.setEmail("Marcoslg.Gomez@gmail.com");
        usuario.setTelefono("2604546647");
        return usuario;
    }

}
