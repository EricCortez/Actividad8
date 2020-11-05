package act8;

import java.util.Scanner;

public class interfaaace {

    public static void main (String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Deck op = new Deck();
        int x=0;
        do {
            System.out.println("Poker \n   "+"1 mezclar\n "+"2 Sacar carta\n "+"3 Carta alazar\n "+"4 mano de 5 cartas\n "+"5 salir\n ");
             x = entrada.nextInt();


switch (x) {
    case 1:
        try {
            op.shuffle();
        } catch (Exception e) {
            e.printStackTrace();
        }
        break;
    case 2:
        try {
            op.head();
        } catch (Exception e) {
            e.printStackTrace();
        }
        break;
    case 3:
        op.pick();
        break;
    case 4:
        op.hand();
        break;

        case 5:
        System.out.println(" Salir");
        break;

    default: System.out.println(" opcion no valida");
}}while (x!=5);

    }
}