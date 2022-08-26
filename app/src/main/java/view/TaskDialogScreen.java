/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Leonardo
 */
public class TaskDialogScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public TaskDialogScreen() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        TaskToolBar = new javax.swing.JPanel();
        TaskImage1 = new javax.swing.JLabel();
        TaskTittle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TaskName = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        TaskDescription = new javax.swing.JLabel();
        TaskDescriptionText = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        TaskDeadline = new javax.swing.JLabel();
        TaskNotes = new javax.swing.JLabel();
        TaskNotesText = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TaskToolBar.setBackground(new java.awt.Color(0, 153, 102));

        TaskImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\NetBeansProjects\\ToDo\\app\\src\\main\\resources\\icons8-selecionado-50.png")); // NOI18N

        TaskTittle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TaskTittle.setForeground(new java.awt.Color(255, 255, 255));
        TaskTittle.setText("TASK");

        javax.swing.GroupLayout TaskToolBarLayout = new javax.swing.GroupLayout(TaskToolBar);
        TaskToolBar.setLayout(TaskToolBarLayout);
        TaskToolBarLayout.setHorizontalGroup(
            TaskToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TaskToolBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TaskTittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TaskImage1)
                .addGap(18, 18, 18))
        );
        TaskToolBarLayout.setVerticalGroup(
            TaskToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaskToolBarLayout.createSequentialGroup()
                .addGroup(TaskToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TaskToolBarLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(TaskImage1))
                    .addGroup(TaskToolBarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(TaskTittle)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        TaskName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TaskName.setText("Name");

        jTextField1.setText("TaskNameText");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        TaskDescription.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TaskDescription.setText("Description");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        TaskDescriptionText.setViewportView(jTextArea1);

        TaskDeadline.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TaskDeadline.setText("Deadline");

        TaskNotes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TaskNotes.setText("Notes");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        TaskNotesText.setViewportView(jTextArea3);

        jTextField2.setText("TaskDeadlineText");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TaskName)
                    .addComponent(TaskDescription))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TaskDeadline)
                    .addComponent(TaskNotes))
                .addContainerGap(340, Short.MAX_VALUE))
            .addComponent(jTextField1)
            .addComponent(TaskDescriptionText)
            .addComponent(jTextField2)
            .addComponent(TaskNotesText)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TaskName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TaskDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TaskDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TaskDeadline)
                .addGap(7, 7, 7)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TaskNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TaskNotesText)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TaskToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TaskToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskDialogScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TaskDeadline;
    private javax.swing.JLabel TaskDescription;
    private javax.swing.JScrollPane TaskDescriptionText;
    private javax.swing.JLabel TaskImage1;
    private javax.swing.JLabel TaskName;
    private javax.swing.JLabel TaskNotes;
    private javax.swing.JScrollPane TaskNotesText;
    private javax.swing.JLabel TaskTittle;
    private javax.swing.JPanel TaskToolBar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
