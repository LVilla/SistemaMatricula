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
public class Curso {
    private String strNombCurso;
    private String strParalelo;

    public Curso(String strNombCurso, String strParalelo) {
        this.strNombCurso = strNombCurso;
        this.strParalelo = strParalelo;
    }

    public String getStrNombCurso() {
        return strNombCurso;
    }

    public void setStrNombCurso(String strNombCurso) {
        this.strNombCurso = strNombCurso;
    }

    public String getStrParalelo() {
        return strParalelo;
    }

    public void setStrParalelo(String strParalelo) {
        this.strParalelo = strParalelo;
    }
    
    
}
