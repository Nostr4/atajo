package gps;

import java.util.Random;

public class Bicicleta {
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
        int tramos=0;
    }
    
    public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3) {
        
    	int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        Random r = new Random();
        int tramos = r.nextInt(camino3.length)+1;     
       
        for(int i=0; i<tramos; i++)
        {
            sum1 += camino1[i];
            sum2 += camino2[i];
            sum3 += camino3[i];
        }
        
        System.out.println("El camino tiene " +tramos+" tramos");
        System.out.println("En "+tramos+" tramos, el camino uno suma " +sum1+ " quilometros.");
        System.out.println("En "+tramos+" tramos, el camino uno suma " +sum2+ " quilometros.");
        System.out.println("En "+tramos+" tramos, el camino uno suma " +sum3+ " quilometros.");
        System.out.println("Por tanto:");
        
        if(sum1 < sum2 && sum1 < sum3)
        {
            return "camino 1"; 
        }else if(sum2 < sum3 && sum2 < sum1)
        {
            return "camino 2";
        }else if(sum3 < sum1 && sum3 < sum2)
        {
            return "camino 3";
        }else{
            if(sum1 == sum2 && sum2 == sum3)
            {
                return "camino 1, 2 y 3";
            }else if(sum1 == sum3)
            {
                return "caminos 1 y 3";
            }else if(sum2 == sum3){
                return "caminos 2 y 3";
            }else{
                return "caminos 1 y 2";
            }
        }
        
      } 
    

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {12,21,5,46,25,3,5,8,70};
        int[] camino2 = {24,9,4,64,10,15,21,15,10};
        int[] camino3 = {23,10,4,15,8,10,20,46,104};
        System.out.println("El camino mas corto es el "+Bicicleta.rutaCorta(camino1,camino2,camino3)+".");
    }
}

