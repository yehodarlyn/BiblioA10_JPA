/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author jonyco
 */
public class Biblioteca {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BibliotecaPU");
        System.out.println("------------");
        System.out.println("diagrama de la DB generado exitosamente");
        System.out.println("revisa tu mysql para confirmar la creacion de tablas y relaciones");

  
        emf.close();
    }
}
