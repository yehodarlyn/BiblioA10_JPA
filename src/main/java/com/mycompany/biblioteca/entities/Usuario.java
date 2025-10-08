package com.mycompany.biblioteca.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;


/**
 *
 * @author jonyco
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int id;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "correo", length = 100)
    private String correo;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Credencial credencial;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String correo, Credencial credencial) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.credencial = credencial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    
}
