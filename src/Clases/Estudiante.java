/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 *
 * @author luistv
 */
public class Estudiante {
    String Nombres;
    String Apellidos;
    String user;
    String contrase;
    

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrase() {
        return contrase;
    }

    public void setContrase(String contrase) {
        this.contrase = contrase;
    }

    public Estudiante(String Nombres, String Apellidos, String user, String contrase) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.user = user;
        this.contrase = contrase;
    }
}
