/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static gui.MainFrame.f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kuba
 */
public class DataPanel extends javax.swing.JPanel {

    static public int bodyNumber=0;

    /**
     * Creates new form DataPanel
     */
    public DataPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlanetDataScrollPane = new javax.swing.JScrollPane();
        PlanetDataTable = new javax.swing.JTable();
        TopPanel = new javax.swing.JPanel();
        ButtonPanel = new javax.swing.JPanel();
        SaveButton = new javax.swing.JButton();
        ChoseFileButton = new javax.swing.JButton();
        MenuButton = new javax.swing.JButton();
        TimeDataPanel = new javax.swing.JPanel();
        DurationLabel = new javax.swing.JLabel();
        TimeStepLabel = new javax.swing.JLabel();
        DurationTextField = new javax.swing.JTextField();
        TimeStepTextField = new javax.swing.JTextField();
        InsertDataPanel = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        MassLabel = new javax.swing.JLabel();
        XCoordinateLabel = new javax.swing.JLabel();
        YCoordinateLabel = new javax.swing.JLabel();
        ZCoordinateLabel = new javax.swing.JLabel();
        XVelocityLabel = new javax.swing.JLabel();
        YVelocityLabel = new javax.swing.JLabel();
        ZVelocityLabel = new javax.swing.JLabel();
        RemoveButton = new javax.swing.JButton();
        NameTextField = new javax.swing.JTextField();
        MassTextField = new javax.swing.JTextField();
        XCoordinateTextField = new javax.swing.JTextField();
        YCoordinateTextField = new javax.swing.JTextField();
        ZCoordinateTextField = new javax.swing.JTextField();
        XVelocityTextField = new javax.swing.JTextField();
        YVelocityTextField = new javax.swing.JTextField();
        ZVelocityTextField = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        PlanetDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nazwa", "Masa", "Wsp. x", "Wsp. y", "Wsp. z", "Vx", "Vy", "Vz"
            }
        ));
        PlanetDataScrollPane.setViewportView(PlanetDataTable);

        TopPanel.setBackground(new java.awt.Color(255, 255, 255));

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPanel.setLayout(new java.awt.GridLayout(1, 0, 40, 0));

        SaveButton.setText("Zapisz");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        ButtonPanel.add(SaveButton);

        ChoseFileButton.setText("Wybierz plik");
        ChoseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoseFileButtonActionPerformed(evt);
            }
        });
        ButtonPanel.add(ChoseFileButton);

        MenuButton.setText("Menu");
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
            }
        });
        ButtonPanel.add(MenuButton);

        TimeDataPanel.setBackground(new java.awt.Color(255, 255, 255));
        TimeDataPanel.setLayout(new java.awt.GridLayout(2, 2, 30, 15));

        DurationLabel.setText("Czas trwania:");
        TimeDataPanel.add(DurationLabel);

        TimeStepLabel.setText("Krok czasowy:");
        TimeDataPanel.add(TimeStepLabel);
        TimeDataPanel.add(DurationTextField);

        TimeStepTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeStepTextFieldActionPerformed(evt);
            }
        });
        TimeDataPanel.add(TimeStepTextField);

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(TimeDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimeDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        InsertDataPanel.setBackground(new java.awt.Color(255, 255, 255));
        InsertDataPanel.setLayout(new java.awt.GridLayout(2, 9, 25, 20));

        NameLabel.setText("Nazwa");
        InsertDataPanel.add(NameLabel);

        MassLabel.setText("Masa");
        InsertDataPanel.add(MassLabel);

        XCoordinateLabel.setText("Wsp. x");
        InsertDataPanel.add(XCoordinateLabel);

        YCoordinateLabel.setText("Wsp. y");
        InsertDataPanel.add(YCoordinateLabel);

        ZCoordinateLabel.setText("Wsp. z");
        InsertDataPanel.add(ZCoordinateLabel);

        XVelocityLabel.setText("Vx");
        InsertDataPanel.add(XVelocityLabel);

        YVelocityLabel.setText("Vy");
        InsertDataPanel.add(YVelocityLabel);

        ZVelocityLabel.setText("Vz");
        InsertDataPanel.add(ZVelocityLabel);

        RemoveButton.setText("Usuń");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });
        InsertDataPanel.add(RemoveButton);
        InsertDataPanel.add(NameTextField);
        InsertDataPanel.add(MassTextField);

        XCoordinateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XCoordinateTextFieldActionPerformed(evt);
            }
        });
        InsertDataPanel.add(XCoordinateTextField);
        InsertDataPanel.add(YCoordinateTextField);

        ZCoordinateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZCoordinateTextFieldActionPerformed(evt);
            }
        });
        InsertDataPanel.add(ZCoordinateTextField);
        InsertDataPanel.add(XVelocityTextField);

        YVelocityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YVelocityTextFieldActionPerformed(evt);
            }
        });
        InsertDataPanel.add(YVelocityTextField);
        InsertDataPanel.add(ZVelocityTextField);

        AddButton.setText("Dodaj");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        InsertDataPanel.add(AddButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanetDataScrollPane)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(InsertDataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlanetDataScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InsertDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TimeStepTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeStepTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeStepTextFieldActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) PlanetDataTable.getModel();
        PrintWriter plik = null;
        try {
            plik = new PrintWriter(new FileWriter("data.txt"));

            for (int i = 0; i < tableModel.getRowCount(); i++) {
                for (int j = 0; j < tableModel.getColumnCount(); j++) {
                    plik.print(tableModel.getValueAt(i, j) + " ");
                }
                plik.print("\n");
            }

        } catch (IOException e) {
            System.err.println("Nieudany zapis do pliku!");
        } finally {
            if (plik != null) {
                plik.close();
            }
        }
        duration = parseInt(DurationTextField.getText());/////////////////////!!!!!!!!!!!!!!!WYJĄTEK GDY NIC NIE PODAMY
        timeStep = parseInt(TimeStepTextField.getText());/////////////////////!!!!!!!!!!!!!!!WYJĄTEK GDY NIC NIE PODAMY

        DurationTextField.setText("");
        TimeStepTextField.setText("");
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void XCoordinateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XCoordinateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XCoordinateTextFieldActionPerformed

    private void ZCoordinateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZCoordinateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZCoordinateTextFieldActionPerformed

    private void YVelocityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YVelocityTextFieldActionPerformed
        // TODO add your handlng code here:
    }//GEN-LAST:event_YVelocityTextFieldActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) PlanetDataTable.getModel();
        tableModel.addRow(new Object[]{NameTextField.getText(), MassTextField.getText(), XCoordinateTextField.getText(), YCoordinateTextField.getText(), ZCoordinateTextField.getText(),
            XVelocityTextField.getText(), YVelocityTextField.getText(), ZVelocityTextField.getText()});

        bodyNumber++;    
        
        NameTextField.setText("");
        MassTextField.setText("");
        XCoordinateTextField.setText("");
        YCoordinateTextField.setText("");
        ZCoordinateTextField.setText("");
        XVelocityTextField.setText("");
        YVelocityTextField.setText("");
        ZVelocityTextField.setText("");
    }//GEN-LAST:event_AddButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) PlanetDataTable.getModel();
        if (tableModel.getRowCount() > 0) {
            tableModel.removeRow(tableModel.getRowCount() - 1);
            bodyNumber--;
        }
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void ChoseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoseFileButtonActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) PlanetDataTable.getModel();
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String fileadress = f.getAbsolutePath();
        //System.out.println(fileadress);

        Object tab[] = new Object[8];
        Scanner file = null;
        try {
            file = new Scanner(new BufferedReader(new FileReader(fileadress)));
            while (file.hasNext()) {
                //for (int i = 0; i < tableModel.getRowCount(); i++) {
                for (int i = 0; i < tableModel.getColumnCount(); i++) {
                    if (file.hasNext()) {
                        tab[i] = file.next();
                    }
                }
                tableModel.addRow(tab);
                bodyNumber++;
            }

        } catch (IOException e) {
            System.err.println("Nieudana próba otwarcia pliku!");
        } finally {
            if (file != null) {
                file.close();
            }
        }

    }//GEN-LAST:event_ChoseFileButtonActionPerformed

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonActionPerformed
        JPanel mp = new MenuPanel();
        f.getContentPane().removeAll();
        f.add(mp);
        f.validate();
    }//GEN-LAST:event_MenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton ChoseFileButton;
    private javax.swing.JLabel DurationLabel;
    private javax.swing.JTextField DurationTextField;
    private javax.swing.JPanel InsertDataPanel;
    private javax.swing.JLabel MassLabel;
    private javax.swing.JTextField MassTextField;
    private javax.swing.JButton MenuButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JScrollPane PlanetDataScrollPane;
    private javax.swing.JTable PlanetDataTable;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JPanel TimeDataPanel;
    private javax.swing.JLabel TimeStepLabel;
    private javax.swing.JTextField TimeStepTextField;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JLabel XCoordinateLabel;
    private javax.swing.JTextField XCoordinateTextField;
    private javax.swing.JLabel XVelocityLabel;
    private javax.swing.JTextField XVelocityTextField;
    private javax.swing.JLabel YCoordinateLabel;
    private javax.swing.JTextField YCoordinateTextField;
    private javax.swing.JLabel YVelocityLabel;
    private javax.swing.JTextField YVelocityTextField;
    private javax.swing.JLabel ZCoordinateLabel;
    private javax.swing.JTextField ZCoordinateTextField;
    private javax.swing.JLabel ZVelocityLabel;
    private javax.swing.JTextField ZVelocityTextField;
    // End of variables declaration//GEN-END:variables
    static public int timeStep;
    static public int duration;
}
