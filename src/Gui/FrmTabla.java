package Gui;

import Beans.Tabla;
import Dao.DTabla;

public class FrmTabla extends javax.swing.JInternalFrame {

    public FrmTabla() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DataGrid = new javax.swing.JTable();
        Lblpro = new javax.swing.JLabel();
        Lblfdi = new javax.swing.JLabel();
        Lblpre = new javax.swing.JLabel();
        Lblimp = new javax.swing.JLabel();
        Lblexis = new javax.swing.JLabel();
        Lblfdv = new javax.swing.JLabel();
        txtpro = new javax.swing.JTextField();
        txtexis = new javax.swing.JTextField();
        txtfdi = new javax.swing.JTextField();
        txtpre = new javax.swing.JTextField();
        txtfdv = new javax.swing.JTextField();
        txtimp = new javax.swing.JTextField();
        btnins = new javax.swing.JButton();
        btnelit = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        DataGrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Producto", "Precio", "Fecha de ingreso", "Fecha de vencimiento", "Importado desde", "Existencia"
            }
        ));
        DataGrid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataGridMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DataGrid);

        Lblpro.setText("Producto:");

        Lblfdi.setText("Fecha de ingreso:");

        Lblpre.setText("Precio:");

        Lblimp.setText("Importado desde:");

        Lblexis.setText("Existencias:");

        Lblfdv.setText("Fecha de vencimiento:");

        btnins.setText("INSERTAR");
        btnins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsActionPerformed(evt);
            }
        });

        btnelit.setText("ELIMINAR TODO");
        btnelit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Lblpro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(txtpro, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lblpre)
                            .addComponent(Lblfdi))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpre)
                            .addComponent(txtfdi))))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lblfdv, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lblexis, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lblimp, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtexis, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtimp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfdv, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnins)
                .addGap(28, 28, 28)
                .addComponent(btnelit)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lblpro)
                    .addComponent(Lblfdv)
                    .addComponent(txtpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lblpre)
                    .addComponent(Lblimp)
                    .addComponent(txtimp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lblexis)
                    .addComponent(Lblfdi)
                    .addComponent(txtexis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnins)
                    .addComponent(btnelit))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DTabla obj=new DTabla();
    
    private void DataGridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataGridMouseClicked
        int f = DataGrid.getSelectedRow();
        String cod = DataGrid.getValueAt(f, 0).toString();
        Registro.login.txtpro.setText(cod);
        Registro.login.dispose();
    }//GEN-LAST:event_DataGridMouseClicked

    private void btninsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsActionPerformed
        String pro= txtpro.getText();
        String pre= txtpre.getText();
        String fdi= txtfdi.getText();
        String fdv= txtfdv.getText();
        String imp= txtimp.getText();
        String exis= txtexis.getText();
        obj.getGuardar(new Tabla(pro, pre, fdi, fdv, imp, exis));
        formInternalFrameOpened(null);
    }//GEN-LAST:event_btninsActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        obj.MCargarTexto();
        DataGrid.setModel(obj.getTable());
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnelitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnelitActionPerformed
    public static javax.swing.JTextField txtreg;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DataGrid;
    private javax.swing.JLabel Lblexis;
    private javax.swing.JLabel Lblfdi;
    private javax.swing.JLabel Lblfdv;
    private javax.swing.JLabel Lblimp;
    private javax.swing.JLabel Lblpre;
    private javax.swing.JLabel Lblpro;
    private javax.swing.JButton btnelit;
    private javax.swing.JButton btnins;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtexis;
    private javax.swing.JTextField txtfdi;
    private javax.swing.JTextField txtfdv;
    private javax.swing.JTextField txtimp;
    private javax.swing.JTextField txtpre;
    private javax.swing.JTextField txtpro;
    // End of variables declaration//GEN-END:variables

}

