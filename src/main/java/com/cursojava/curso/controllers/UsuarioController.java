package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController

public class UsuarioController {
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
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(652L); //Se coloca una "L" para decirle a java que el numero es de tipo long
        usuario.setNombre("Marcos");
        usuario.setApellido("Gomez");
        usuario.setEmail("Marcoslg.Gomez@gmail.com");
        usuario.setTelefono("2604546647");

        Usuario usuario2 = new Usuario();
        usuario2.setId(345L);
        usuario2.setNombre("Luis");
        usuario2.setApellido("Vaquioni");
        usuario2.setEmail("Luismv.vaquioni@gmail.com");
        usuario2.setTelefono("2604321738");

        Usuario usuario3 = new Usuario();
        usuario3.setId(222L);
        usuario3.setNombre("Marinel");
        usuario3.setApellido("Rivas");
        usuario3.setEmail("Marisr.rivas@gmail.com");
        usuario3.setTelefono("2604321122");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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
