package com.notificaciones.dehu.controllers;

import com.notificaciones.dehu.models.UsuarioModel;
import com.notificaciones.dehu.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> listarUsuario(){
        return usuarioService.listarUsuario();
    }
}
