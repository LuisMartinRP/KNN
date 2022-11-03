/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Luis Martin R.P
 */
public class Clacifica {
    private double distancia;
    private String aux[];
    private double dist[];
    private int id[];
    private String clase;
    private HashMap<String, Integer> frecuencias = new HashMap<>();
    public String vecinos="Vecinos mas cercanos: \n";
    private int it=1;
    
    public String calculardistancia(ArrayList<String[]>datos,double x, double y, int k){
        String[] clases=new String[k];
        dist=new double[datos.size()-1];
        id=new int[datos.size()-1];
        for(int i=1;i<datos.size();i++){
            aux=datos.get(i);
            distancia=Math.sqrt(Math.pow((x-Float.valueOf(aux[2])),2)+Math.pow((y-Float.valueOf(aux[3])),2));
            //distancia=Math.sqrt(Math.pow((x-Float.valueOf(datos[i][it+1])),2)+Math.pow((y-Float.valueOf(datos[i][it+2])),2));
            dist[i-1]=distancia;
            id[i-1]=i-1;
        }
        ordenar(dist,id);
        prediccion(clases,id,datos,k);
        return clase;
    }

    private void ordenar(double[]dist,int[]id){
        for(int i=1;i<dist.length;i++){
            double auxc=dist[i];
            int aux2=id[i];
            int j=i-1;
            while(j>=0&&dist[j]>auxc){
                dist[j+1]=dist[j];
                id[j+1]=id[j];
                j--;
            }
            dist[j+1]=auxc;
            id[j+1]=aux2;
        }
    }
    
    public void prediccion(String[]clases,int[]id,ArrayList<String[]>datos,int k){
        for(int i=0;i<k;i++){
            aux=datos.get(id[i]);
            clases[i]=aux[4];
            vecinos+=clases[i];
            vecinos+="\n";
        }
        
        for (String palabra : clases) {
            if (frecuencias.containsKey(palabra)) {
                frecuencias.put(palabra, frecuencias.get(palabra) + 1);
            } else {
                frecuencias.put(palabra, 1);
            }
        }
        int mayor = 0;
        for (HashMap.Entry<String, Integer> entry : frecuencias.entrySet()) {
          if (entry.getValue()>mayor || entry.getValue()==mayor) {
            mayor = entry.getValue();
            clase = entry.getKey();
          }
        }
    }
}
