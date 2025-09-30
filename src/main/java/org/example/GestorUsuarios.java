package org.example;

import javax.swing.*;

public class GestorUsuarios {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GestorUsuarios");
        frame.setContentPane(new GestorUsuarios().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    private JPanel panel1;
    private JPanel HeaderPanel;
    private JPanel NavPanel;
    private JButton dashboardButton;
    private JButton usuariosButton;
    private JButton informesButton;
    private JButton ajustesButton;
    private JButton ayudaButton;
    private JPanel CenterPanel;
    private JTabbedPane tabbedPane1;
    private JPanel BotoneraPanel;
    private JPanel PrevisualizacionPanel;
    private JTextArea estoEsUnResumenTextArea;
    private JList list1;
    private JButton GUARDARButton;
    private JButton LIMPIARButton;
    private JButton CANCELARButton;
    private JPanel Fila0Panel;
    private JLabel NombreLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel EmailLabel;
    private JComboBox comboBox1;
    private JLabel RolLabel;
    private JCheckBox activoCheckBox;
    private JPanel Fila3Panel;
    private JPanel Fila2Panel;
    private JPanel Fila1Panel;
    private JPanel Fila4Panel;
    private JLabel NotasLabel;
    private JTextArea textArea2;
    private JPanel EastPanel;
    private JLabel ActivoLabel;
}
