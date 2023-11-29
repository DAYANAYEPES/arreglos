
public class Main {
    public static void main(String[] args) {

        int[] mi_arreglo = new int[8];
        int total = 0;
        mi_arreglo[0]=1;
        mi_arreglo[1]=2;
        mi_arreglo[2]=3;
        mi_arreglo[3]=4;
        mi_arreglo[4]=5;
        mi_arreglo[5]=6;
        mi_arreglo[6]=7;
        mi_arreglo[7]=8;

        for (int i = 0; i <= mi_arreglo.length -1; i++){
            System.out.println(mi_arreglo[i]);
            
            total = total + mi_arreglo[i];
        }
        System.out.println("la suma es "+total);
        
        
    }
}