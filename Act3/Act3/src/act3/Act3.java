//Recorrer un vector de N enteros contabilizando cuántos 
//números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
package act3;
import java.util.Scanner;

public class Act3 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,rep,rep1,rep2,rep3,rep4;
        rep = 0;
        rep1=0;
        rep2=0;
        rep3=0;
        rep4=0;
        System.out.println("Ingresa un numero que sera tamaño del vector");
        n = sc.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector [i] = (int) (Math.random()*99999); 
        }
            for (int i = 0; i < n; i++) {
                String n1 = String.valueOf(vector[i]);
                if (n1.length()==1) {
                    rep++;
                    }
                else if (n1.length()==2) {
                    rep1++;
                    }
                else if (n1.length()==3) {
                    rep2++;
                   }
                else if (n1.length()==4) {
                    rep3++;
                    }
                else if (n1.length()==5) {
                    rep4++;
                }
            }
        System.out.println("");
        System.out.println("En el vector hay "+rep+" numeros de 1 digito");
        System.out.println("En el vector hay "+rep1+" numeros de 2 digitos");
        System.out.println("En el vector hay "+rep2+" numeros de 3 digitos");
        System.out.println("En el vector hay "+rep3+" numeros de 4 digitos");
        System.out.println("En el vector hay "+rep4+" numeros de 5 digitos");
    }
}