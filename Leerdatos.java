/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
/**
 *
 * @author Luis Martin R.P
 */
public class Leerdatos {
    private BufferedReader lee;
    private String renglon;
    private String[] partes;
    private ArrayList<String[]> datos = new ArrayList<String[]>();
    
    public ArrayList<String[]> leer(String nombrearch){
        int cont=0;
        try{
            lee = new BufferedReader(new FileReader(nombrearch));
            while((renglon=lee.readLine())!= null){
                partes = renglon.split(",");
                datos.add(partes);
                System.out.println();
                cont++;
            }
            lee.close();
            renglon="";
            partes=null;
        }catch(Exception e){
        
        }
        return datos;
    }
}
