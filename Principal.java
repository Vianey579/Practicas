/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_1_memory_management;

/**
 *
 * @author invitado
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("inicia Main");
        A();
        System.out.println("termina Main");
    }
    public static void A(){
        System.out.println("inicia B");
        B();
        System.out.println("termina B");  
    }
    public static void B(){
        System.out.println("inicia C");
        C();
        System.out.println("termina C");
    }
    public static void C(){
        System.out.println("inicia ");
        System.out.println("termina");
    }
    
    
}
