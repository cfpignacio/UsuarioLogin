/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuariologin;
import java.util.Scanner;
/**
 *
 * @author Notebook
 */
public class UsuarioLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String usuario,password,usuarioIngresado,passwordIngresado;
        Scanner leer;
        boolean autenticado;
        int intentos = 1;
        // DB 
        usuario = "pepe";
        password = "Holamundo123";
        
        // controlador
        autenticado = false;
        
        leer = new Scanner(System.in);
        System.out.print("---|Sistema de Autenticación|--- \n");

        
       do{
        System.out.println("Intentos " + intentos + "/3");   
        // ingresamos el usuario
        System.out.print("Ingrese su usuario: ");
        usuarioIngresado = leer.next();
        // ingresamos el password
        System.out.print("Ingrese su password: ");
        passwordIngresado = leer.next();
        // Validamos el usuario y el password     
        if(usuario.equals(usuarioIngresado)){
            
            if(password.equals(passwordIngresado)){
             autenticado = true;  
             System.out.println("Usuario y Password correctos");
            }else{
             System.out.println("::::Usuario o Password Incorrecto::::");

            }
        }else{
             System.out.println("::::Usuario o Password Incorrecto::::");
        }
        // sumamos 1 a intentos
        intentos++;
       
       }while(intentos<=3 & (!autenticado));
   
        if(autenticado){
       System.out.println("::::::::::::::::::::::::::::::::::::");
       System.out.println("::::         Bienvenidos        ::::");
       System.out.println("::::Usuario y Password Correctos::::");
       System.out.println("::::::::::::::::::::::::::::::::::::");

        }else{
            System.out.println("::::Se supero la cantidad de intentos MAX ::::");
        }
    }
    
}
