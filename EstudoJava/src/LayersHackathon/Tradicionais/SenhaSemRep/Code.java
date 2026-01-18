package LayersHackathon.Tradicionais.SenhaSemRep;

import java.util.Scanner;

public class Code {
    public void contasenhas(){
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();
        int count = 0;
        int countRep = 0;
        int res = 0;

        if (min>= 1 && max <= 5000) {
            for (int i = min; i <= max; i++){
                //no intervalo do min ao máximo contar qnts números que não se repetem existem

                String numStr = String.valueOf(i); // "12345"
                char[] arrayChar = numStr.toCharArray(); // ['1', '2', '3', '4', '5']

                for (int j = 0; j <= arrayChar.length-1; j++) {
                    for (int k = 0; k < arrayChar.length-1; k++) {
                        if (arrayChar[j] == arrayChar[k]){
                            countRep++;
                        }
                        res = count - countRep;
                    }
                }
            }
        }
        System.out.println(countRep);
    }
}
