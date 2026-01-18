package LayersHackathon.Tradicionais.FelizAnoNovo;

import java.util.Scanner;

public class Code {
    public void felizAnoNovo() {
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        if (n > 0) {
            System.out.print("Feliz ano nov");
        }
        for (i = 0; i < n; i++) {
            System.out.print("o");
        }
    }
}