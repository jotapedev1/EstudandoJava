package LayersHackathon.Tradicionais.DJLia;

import java.util.Scanner;

public class Code {
    int bubbleSort(int arr[], int n){
        int i, j, temp;
        int count = 0;
        for (i = 0; i < n - 1; i++) {
            count = 0;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] == arr[j + 1]) {
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
        }
        return count;
    }
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int NumMusicas = sc.nextInt();
        int possivelSet = NumMusicas/2;

        if (possivelSet%2 != 0) {
            possivelSet++;
        }

        //definir o tamanho do array a partir do numero de musicas
        int[] EnergiaMusicas = new int[NumMusicas]; //tamanho da musica
        int[] arrayAuxiliar = new int[NumMusicas];

        //captura energia das músicas
        for (int i = 0; i <= NumMusicas; i++) {
            EnergiaMusicas[i] = sc.nextInt();
        }

        arrayAuxiliar[0] = EnergiaMusicas[0];
        bubbleSort(EnergiaMusicas, NumMusicas);
/*
        System.out.print("\n");
        for (int item : EnergiaMusicas) {
            System.out.print(item);
        }
    }
    System.out.print("\n");
    for(int item : arrayAuxiliar){
        System.out.print(item);*/
    }
}


//cada set deve conter exatamente 2 ou 3 músicas do
// mesmo nível de energia. Sets com 1 música desengajam o público, e sets com 4+ músicas ficam monótono


//Dado um array energias onde energias[i] representa o nível de energia da i-ésima música, determine o número
// mínimo de sets para tocar todas as músicas, ou retorne -1 se impossível.

//Imprima um único inteiro: o número mínimo de sets necessários para tocar todas as músicas, ou -1 se for impossível.

//Existe apenas 1 música de nível de energia 2, mas em cada set a DJ Lia só pode tocar 2 ou 3 músicas do mesmo nível de energia.
// Portanto, é impossível tocar todas as músicas seguindo as regras, e a resposta é -1.

