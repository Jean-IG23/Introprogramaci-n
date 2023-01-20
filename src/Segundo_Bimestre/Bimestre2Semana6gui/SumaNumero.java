package Bimestre2Semana6gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNumero {
    private JPanel panelPrincipal;
    private JTextField txt_n1;
    private JTextField txt_n2;
    private JButton btn_suma;
    private JLabel lbl_resultado;
    private JButton btn_restar;
    private JButton btn_multiplicar;
    private JButton btn_division;

    public SumaNumero() {
        btn_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = Integer.parseInt(txt_n1.getText() )
                        + Integer.parseInt(txt_n2.getText() );
                lbl_resultado.setText(String.valueOf(suma) );
            }
        });
        btn_restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = Integer.parseInt(txt_n1.getText() )
                        - Integer.parseInt(txt_n2.getText() );
                lbl_resultado.setText(String.valueOf(suma) );
            }
        });
        btn_multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = Integer.parseInt(txt_n1.getText() )
                        * Integer.parseInt(txt_n2.getText() );
                lbl_resultado.setText(String.valueOf(suma) );
            }
        });
        btn_division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double suma = Double.parseDouble(txt_n1.getText() )
                        / Double.parseDouble(txt_n2.getText() );
                lbl_resultado.setText(String.valueOf(suma) );
            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio = new JFrame("SumaNumero");
        inicio.setContentPane(new SumaNumero().panelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}
