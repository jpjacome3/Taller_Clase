
package Pruebas;

import Dominio.Curso;


/**
 *
 * @author JEAN_PIERRE
 */
public class Test_Curso {
    public static void main(String[] args){
        Curso cursoA= new Curso();
        double [] notas = new double [12];
        llenaNotas(notas);
        cursoA.setPromedio();
        cursoA.setEstudiantesEncimaPromedio();
        cursoA.mostrarNotas();
        cursoA.setNotas(notas);
        System.out.println("Promedio del Curso=" +cursoA.getPromedio());
        System.out.println("Numeros de Estudiantes Encima del Promedio="+cursoA.nroEstudiantesEncimaPromedio());
    }
         public static void llenaNotas(double[]notas){
         for(int i=0;i<12;i++){
            notas[i] = Math.random()*6;
        }   
    }
}
