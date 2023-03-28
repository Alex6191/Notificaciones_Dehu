package com.notificaciones.dehu.services;

import com.notificaciones.dehu.models.UsuarioModel;
import com.notificaciones.dehu.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> listarUsuario(){

        ArrayList<UsuarioModel> lst = new ArrayList<>();

        UsuarioModel obj=new UsuarioModel();
        obj.setId(1L);
        obj.setNombre("Cesar");
        obj.setEmail("cesar.castillo@memorandum.com");

        lst.add(obj);

        return lst;
    }
}
