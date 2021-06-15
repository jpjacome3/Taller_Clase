
package Dominio;

/**
 *
 * @author JEAN_PIERRE
 */
public class Curso {
    private double [] notas;
    private double promedio;
    private int estudiantesEncimaPromedio;

    
    public Curso(){
        notas = new double[12];
    }
    
    public void setNotas(double notas[]){
        this.notas=notas;
    }
    
    public void mostrarNotas(){
        for(int i=0;i<12;i++){
            System.out.println(this.notas[i]);
        }
    }
    
    public void setPromedio(){
        double promedio_es=0;
      
        for(int i=0;i<12;i++){
        double n = notas[i];
        promedio_es = n + promedio_es;
          
    }
        this.promedio=(promedio_es/12);
    }
    
    public void setEstudiantesEncimaPromedio(){
        int estudiantes=0;
        double promedios_es = 0;
        for (int i = 0; i < 12; i++) {
            double n = notas[i];
            promedios_es = n + promedios_es;
        }
        for (int i = 0; i < 12; i++) {
            if (notas[i] > (promedios_es/12)) {
            estudiantes++;
        }
        }
        this.estudiantesEncimaPromedio=estudiantes;
    }

    public double getPromedio() {
        return this.promedio;
    }


    
    
    public int nroEstudiantesEncimaPromedio() {
        return this.estudiantesEncimaPromedio;
    }
}
