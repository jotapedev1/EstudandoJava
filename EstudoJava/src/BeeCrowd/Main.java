package BeeCrowd;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    }
    public void number1(){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = A+B;
        System.out.println("X = " + X);
    }
    public void number2(){
        Scanner sc = new Scanner(System.in);
        double n = 3.14159;
        double R = sc.nextDouble();
        double A = n * (R*R);

        String resFormatted = String.format("%.4f", A);

        System.out.println("A=" + resFormatted);
    }
    public void number3(){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int SOMA = A+B;
        System.out.println("SOMA = " + SOMA);
    }

    public void number4(){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if(B > C && D > A && (C+D) > (A+B) && C > 0 && D > 0 && (A % 2) == 0){
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }
    }
}