package homeworkeight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class TicTakToeSwing extends JFrame {

    private static final String EMPTY_DOT = "[    ]";
    private static final String X_DOT = "X";
    private static final String O_DOT = "O";
    private static TicTakToeSwing ticTakToeSwing;


    public static void main (String [] args){

        ticTakToeSwing = new TicTakToeSwing();
        ticTakToeSwing.setTitle("Крестики и нолики");
        ticTakToeSwing.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ticTakToeSwing.setBounds(300, 300 ,300, 300);
        ticTakToeSwing.setLayout(new GridLayout(3, 3));

        JButton [][] jbssss = new JButton[3][3];
        for (int i = 0; i < jbssss.length; i++) {
            for (int j = 0; j < jbssss[i].length; j++) {
                jbssss[i][j] = new JButton(EMPTY_DOT);
                ticTakToeSwing.add(jbssss[i][j]);
            }
        }

        ticTakToeSwing.setVisible(true);


        while (true){
            humanTurn(jbssss);
            if (checkWin(jbssss, X_DOT)){
                System.out.println("You win");
                break;
            }
            if (checkDraw(jbssss)){
                System.out.println("Draw");
                break;
            }
            try {
                Thread.sleep(3000);
            }catch (InterruptedException ignored){
            }
            //compTurn(jbssss);
            if (checkWin(jbssss, O_DOT)) {
                System.out.println("You lose");
                break;
            }
            if (checkDraw(jbssss)) {
                System.out.println("Draw");
                break;
            }
        }
    }
    
    private static boolean checkDraw(JButton jbc[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (jbc[i][j].getText().equals(EMPTY_DOT));
                return false;
            }
        }
        return true;
    }

    private static boolean checkWin(JButton [][] jbsss, String c){
        int ch1 = 0;
        int ch2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (jbsss[i][0].getText().equals(c) && jbsss [i][1].getText().equals(c) && jbsss [i][2].getText().equals(c)) {
                    return true;
                }
                if (jbsss[0][i].getText().equals(c) && jbsss[1][i].getText().equals(c) && jbsss [2][i].getText().equals(c)) {
                    return true;
                }
                if (i == j) {
                    if (jbsss [i][j].getText().equals(c)){
                        ch1++;
                    }
                }
                if (i == 3 - j - 1) {
                    if (jbsss [i][j].getText().equals(c)){
                        ch2++;
                    }
                }
                if (ch1 == 3 || ch2 == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void compTurn(JButton [][] jbssss){
        int xCoordinate;
        int yCoordinate;
        do {
            Random random = new Random();
            xCoordinate = random.nextInt(3);
            yCoordinate = random.nextInt(3);
        } while (!isValidCell(xCoordinate, yCoordinate, jbssss));
        jbssss[xCoordinate][yCoordinate].setLabel(O_DOT);
        return;
    }

    private static boolean isValidCell (int x, int y, JButton [][]jbssss){
        return jbssss[x][y].getText().equals("[    ]");
    }

    private static boolean humanTurn(JButton [][] jbssss){
        jbssss[0][0].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbssss[0][0].setLabel(X_DOT);
                compTurn(jbssss);
            }
        });

        jbssss[0][1].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbssss[0][1].setLabel(X_DOT);
            }
        });

        jbssss[0][2].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbssss[0][2].setLabel(X_DOT);
            }
        });

        jbssss[1][0].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbssss[1][0].setLabel(X_DOT);
            }
        });

        jbssss[1][1].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbssss[1][1].setLabel(X_DOT);
            }
        });

        jbssss[1][2].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbssss[1][2].setLabel(X_DOT);
            }
        });

        jbssss[2][0].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbssss[2][0].setLabel(X_DOT);
            }
        });
        jbssss[2][1].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbssss[2][1].setLabel(X_DOT);
            }
        });

        jbssss[2][2].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbssss[2][2].setLabel(X_DOT);
            }
        });
        return true;
    }
}
