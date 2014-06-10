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
public class Matricula extends Estudiante{
    String identificacion;
    String FechaNacimiento;

    public Matricula(String identificacion, String FechaNacimiento, String Nombres, String Apellidos, String user, String contrase) {
        super(Nombres, Apellidos, user, contrase);
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.identificacion = identificacion;
        this.FechaNacimiento = FechaNacimiento;
    }
    
    

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
}
