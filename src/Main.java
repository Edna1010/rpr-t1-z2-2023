import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Unesite broj n");
        Scanner scanner=new Scanner(System.in);
        Integer n= scanner.nextInt();
        for(Integer i=1; i<=n; i++){
            if(i%SumaCifara(i)==0) {
                System.out.printf(" " +i);
            }
        }



    }


    public static Integer SumaCifara(Integer n) {
        Integer suma=0;
        Integer cifra=0;
        while(n!=0){
            cifra=n%10;
            n=n/10;
            suma=suma+cifra;
        }
       return suma;
    }
}



