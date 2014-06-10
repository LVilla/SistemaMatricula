/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.util.ArrayList;

/**
 *
 * @author luistv
 */
public class Registro {
    ArrayList<Estudiante> Registro = new ArrayList<Estudiante>();
    ArrayList<Matricula> matriculas= new  ArrayList<Matricula>();

    public void AddEstudiante(String nombre, String apellido, String user, String contra) {
        Registro.add(new Estudiante(nombre, apellido, user, contra));

    }
    
    public void Verificacion(String user, String contra){
        for (int i = 0; i < Registro.size(); i++) {
            if (user.equals(Registro.get(i).getUser())&& contra.equals(Registro.get(i).getContrase())) {
                System.out.println("Contrasena y usuario correcto");
            }else{
                System.out.println("Ingrese nuevamente");
            }
        }
        
    }
    
    public void Matricular(String nombre, String apellido, String identificacion, String fecha){
        
        matriculas.add(new Matricula(nombre, apellido, identificacion, fecha));
        
    }

}
