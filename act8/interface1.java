package act8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Iinterface extends JFrame implements ActionListener {

    private JButton Revolver, Head, Pick, Hand;
    private JTextField consolita;
    private  JTextArea consola;
    private JEditorPane Resp;

    public static void main(String[] args) {
        Deck op = new Deck();
        Iinterface frame = new Iinterface();
        frame.setSize(300, 300);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        JLabel Titulo = new JLabel("Baraja");
        window.add(Titulo);
        Revolver = new JButton("Revolver"); //boton
        window.add(Revolver);
        Revolver.addActionListener(this);
        Head = new JButton("Head"); //boton
        window.add(Head);
        Head.addActionListener(this);
        Pick = new JButton("Pick"); //boton
        window.add(Pick);
        Pick.addActionListener(this);
        Hand = new JButton("Hand"); //boton
        window.add(Hand);
        Hand.addActionListener(this);

        /*consolita = new JTextField(50 );
        window.add(consolita);
*/
        Resp = new JEditorPane();
        Resp.setSize(new Dimension(250,100));
        window.add(Resp);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Deck op = new Deck();


if (event.getSource()==Revolver) {
    op.shuffle();
}else if (event.getSource()==Hand){ op.hand();
}
    else if(event.getSource()==Pick){ op.pick();}
else if(event.getSource()==Head){ op.head();

}
    }

}
