package test;

import datos.*;
import domain.*;
import java.util.List;

public class ManejoPersonas {
    
    public static void main(String[] args) {
        
        //prueba SELECT Persona
//        PersonaJDBC personaJDBC = new PersonaJDBC();
//        List<Persona> personas =  personaJDBC.select();
//
//        for(Persona persona: personas){
//            System.out.println("persona: " + persona);
//        }
        
        //prueba SELECT Usuario
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        List<Usuario> usuarios = usuarioJDBC.select();
        
        for(Usuario usuario: usuarios){
            System.out.println("usuario: " + usuario);
        }
        
        //prueba INSERT Persona
//        Persona persona = new Persona();
//        persona.setNombre("Maria");
//        persona.setApellido("Lara");
//        persona.setEmail("Mlara@mail.com");
//        persona.setTelefono("55422211");
//        
//        personaJDBC.insert(persona);

        //prueba INSERT Usuario
//        Usuario usuario = new Usuario();
//        usuario.setUsuario("Yayo");
//        usuario.setPassword("nmr123");
//       
//        usuarioJDBC.insert(usuario);
        
        //Prueba UPDATE Persona
//        Persona persona = new Persona();
//        persona.setId_persona(3);
//        persona.setNombre("Mayra");
//        persona.setApellido("Lara");
//        persona.setEmail("mlara@mail.com");
//        persona.setTelefono("55422211");
//        
//        personaJDBC.update(persona);

        //Prueba UPDATE Usuario
//        Usuario usuario = new Usuario();
//        usuario.setId_usuario(3);
//        usuario.setUsuario("Eduardo");
//        usuario.setPassword("nomere");
//        
//        usuarioJDBC.update(usuario);

        //Prueba DELETE Persona
//        Persona persona = new Persona();
//        persona.setId_persona(3);
//        
//        personaJDBC.delete(persona);

        //Prueba DELETE Usuario
        Usuario usuario = new Usuario();
        usuario.setId_usuario(3);
        
        usuarioJDBC.delete(usuario);
    }
}
