package com.fundamentosnuevos.springboot.fundamentosNuevos.bean;

import java.util.HashMap;
import java.util.Map;

public class Algoritmo {

    public long factorial( long numero )
        {
            if ( numero <= 1 ) // evalúa el caso base
                return 1; // casos base: 0! = 1 y 1! = 1
            else // paso recursivo
                return numero * factorial( numero - 1 );
        } // fin del método factorial

    public long fibonacci( long numero )
  {
         if ( ( numero == 1 ) || ( numero == 2 ) ) // casos base
             return 1;
         else // paso recursivo
         return fibonacci( numero - 1 ) + fibonacci( numero - 2 );
         }
        // imprime factoriales para los valores del 0 al 10
//        public void mostrarFactoriales()
//        {
//            // calcula los factoriales del 0 al 10
//            for ( int contador = 0; contador <= 10; contador++ )
//                System.out.printf( "%d! = %d\n", contador, factorial( contador ) );
//        }
  }


/*        Map<String, String> paises = new HashMap<>();
//        paises.put("es", "españa");
//        paises.put("co", "colombia");
//        paises.put("eu", "estados unidos");
//
//        System.out.println(paises.containsKey("españa"));
//        System.out.println(paises.get("es"));
//        System.out.println(paises.containsKey("co"));
//        System.out.println(paises.get("eu"));

        int[] num = {1, 2, 3};


        int[] res = twoSum(num, 3);
        System.out.println(res[0]);
        System.out.println(res[1]);


        int[] ai;

    }

    public static int[] twoSum(int[] nums, int target) {

//        int [] res = new int[2];
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i<nums.length; i++){
//            int key = target-nums[i];
//            if(map.containsKey(key)){
//                int value = map.get(key);
//                res[0] = value;
//                res[1]= i;
//                return res;
//            }
//            map.put(nums[i], i);
//        }
//
//        return res;

        int[] res = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (target == nums[i] + nums[j]) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res; */


