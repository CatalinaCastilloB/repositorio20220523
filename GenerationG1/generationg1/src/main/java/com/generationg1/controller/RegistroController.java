package com.generationg1.controller;

import com.generationg1.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    //inyeccion de dependencias, para guardar informacion
    @Autowired

    //ruta para desplejar el jsp
    @RequestMapping("")
    public String registro(@ModelAttribute("usuario") Usuario usuari){
        return "Registro.jsp";
    }


    //Captura de datos
    // el formulario request tiene muchas libertades @RequestMapping("/usuario"), asi no pasa informacion por url el usuario

    @PostMapping("/usuario/respaldo") //se retringe la ruta, solo acepta formulario post
    public String registroUsuario(@ModelAttribute("usuario") Usuario usuario){
            //(@RequestParam(value = "NombreIng") String nombre, @RequestParam(value = "ApellidoIng") String apellido, @RequestParam(value = "EdadIng") Integer edad){
        System.out.println("Metodo registro de usuario " + usuario.toString());
        return "Registro.jsp";
    }

    //el bindingresult tiene que ir inmediatamente al lado de donde se encuentra el valid, se guarda el resultado
    //model es quien manda informacion al front end
    @PostMapping("/usuario") //todos los atributos de usuario llenos
    public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario,
                                 BindingResult resultado, Model model){
        if(resultado.hasErrors()){//se detiene la ejecucion para mostrar mensajes de error, captura si hay un error en el ingreso de datos
            model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
            return "Registro.jsp";
        }
        System.out.println(usuario.getApellido() +" "+ usuario.getNombre() +" "+ usuario.getEdad());
        return "index.jsp";
    }


}
