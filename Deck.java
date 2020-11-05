package act8;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

import static javax.swing.JOptionPane.showMessageDialog;

public class Deck {
    ArrayList Baraja = new ArrayList<>();

    public Deck(){
        String p = "",c,v = "";
        //este random nos permitira genear el color, ya sea rojo o negro
        int R =(new Random().nextInt(2));
        if (R==2)
            c="Negro";
        else
            c = "Rojo";
        for(int x=2; x<=52; x++)
        {// aqui asignamos si es A, J, Q.
            if(x==2 || x==18 || x==35){
                v="A";}
            else if(x==11 || x==28 || x==45){
                v="J";}
            else if(x==18 || x==35 || x==52){
                v="Q";}
            else{//aqui asignamos si es del 2 al 10
                if(x<13 && x>1)
                    v=Integer.toString(x);
                else if (x<23)
                    v=Integer.toString((x-13));
                else if (x<33)
                    v=Integer.toString((x-23));
                else if (x<43)
                    v=Integer.toString((x-33));
                else if (x<52)
                    v=Integer.toString((x-42));
            }//aqui asignamos si es tréboles, corazones, picas o diamantes.
            if(x<=13)
                p="Corazones";
            else if (x<=26)
                p="Picas";
            else if (x<=39)
                p="Tréboles";
            else if (x<=52)
                p="Diamantes";
            Card Tarje =new Card(p,c,v);
            Baraja.add("palo "+Tarje.Palo+" color "+Tarje.Color+" valor "+Tarje.Valor);
        }
    }

    public void shuffle() throws Exception  {
        System.out.println("Mezclando ");

      String shufle;
      try {
          if (Baraja.size() <= 0) {
              System.out.println("El Deck esta vacio..");

              //showMessageDialog("El Deck esta vacio..");
              // mezcla=false;
          } else {
              Collections.shuffle(Baraja);
              System.out.println("Se mezcló el Deck");
              // showMessageDialog("Se mezcló el Deck");
              // mezcla=true;
          }
      }catch (Exception e){

          System.out.println("el desck no se pudo mezclar");
          System.out.println(e.getMessage());
      }



    }



    public void head()  throws  Exception{
        System.out.println("head");
try {

    System.out.println("primera carta " + Baraja.get(1));
    //showMessageDialog("primera carta "+ Baraja.get(1));

    System.out.println("Se elimino " + Baraja.remove(1));
    //showMessageDialog("Se elimino "+ Baraja.remove(1));

}catch (Exception e){
    System.out.println(e.getMessage());

} finally {



    System.out.println("Quedan:" + Baraja.size() + "Cartas");
    //showMessageDialog("Quedan:"+ Baraja.size()+"Cartas");



}
//return Integer.parseInt("primera carta "+ Baraja.get(1)+"Se elimino "+ Baraja.remove(1)+"Quedan:"+ Baraja.size()+"Cartas");
    }

    public void pick()  {

        System.out.println("Pick ");

try {


    int R = (new Random().nextInt(52));
    System.out.println("se removera " + Baraja.get(R));

    Baraja.remove(R);

    System.out.println("Quedan: " + Baraja.size() + " Cartas");
//return Integer.parseInt("carta a remover"+Baraja.get(R)+"cartas restantes"+ Baraja.size());
}catch ( Exception e)
{
    System.out.println(e.getMessage());
}
    }

    public void hand()  throws  Exception {

        System.out.println("Hand ");
try {


for (int x=0;x<4;x++) {

    int R = (new Random().nextInt(Baraja.size() - x));

    System.out.println("se removera " + Baraja.get(R));

    Baraja.remove(R);

    System.out.println("Quedan:" + Baraja.size() + "Cartas");
}  }catch ( Exception e)
{System.out.println(e.getMessage());}
finally {


}
}

        //return Baraja.size();
    }

