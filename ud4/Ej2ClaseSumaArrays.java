package ud4;

public class Ej2ClaseSumaArrays {

    // 2. Programar una función que reciba dos arrays de 5 posiciones
    // y devuelva un tercer array con la suma de ambos.

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {10, 20, 30, 40, 50};

        int[] resultado = suma(nums1, nums2);

        for (int i = 0; i < 5; i++) {
            System.out.println(resultado[i]);
        }
        
        suma2(nums1,nums2);
        for (int i = 0; i < 5; i++) {
            System.out.println(nums1[i]);
    }
        
    }

    // Función que suma los dos arrays y devuelve un array con el resultado
    public static int[] suma(int[] nums1, int[] nums2) { 

        int[] rsdo = new int[5];

        for (int i = 0; i < 5; i++) {
            rsdo[i] = nums1[i] + nums2[i];
        }

        return rsdo;
    }
    
    public static void suma2(int[] nums1, int[] nums2) {
    	   for (int i = 0; i < 5; i++) {
               nums1[i] = nums1[i] + nums2[i];
    }
    
    }

}

