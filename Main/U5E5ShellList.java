
package Main;

import java.util.ArrayList;
import java.util.List;

public class U5E5ShellList {

    public static void main(String[] args) {
        //int[] arreglo={24,1,5,8,2,6,3,7,4,10};
         List <Integer> arreglo=new ArrayList<Integer>();
       
        arreglo.add(24);
        arreglo.add(1);
        arreglo.add(5);
        arreglo.add(8);
        arreglo.add(2);
        arreglo.add(6);
        arreglo.add(3);
        arreglo.add(7);
        arreglo.add(4);
        arreglo.add(10);
        
        System.out.println("Lista desordenada:");
        for(int i=0; i<arreglo.size(); i++){
            System.out.print(" "+arreglo.get(i));    
        }  
        
        metodoShellsort(arreglo);
        
        System.out.println(""
                + "");
        System.out.println("Lista ordenada:");
        for(int i=0; i<arreglo.size(); i++){
            System.out.print(" "+arreglo.get(i));    
        } 
    }
    
    private static void metodoShellsort(List<Integer> arreglo){
            int division=arreglo.size()/2, aux, salto, i;
            for(salto=division; salto!=0; salto/=2){
                boolean cambio=true;
                  while(cambio){
                      cambio=false;
                      for(i=salto; i<arreglo.size(); i++){
                          if(arreglo.get(i-salto)>arreglo.get(i)){
                              aux=arreglo.get(i);
                              arreglo.set(i, arreglo.get(i-salto));
                              arreglo.set((i-salto), aux);
                              cambio=true;
                          }   
                      }
                  }
            }
    }
    
}
