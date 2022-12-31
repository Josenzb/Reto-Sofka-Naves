
package vistas;

import dao.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;
/**
 *
 * @author nunez
 */

public class noTripuladaPanel extends javax.swing.JPanel {
    // Creamos un arreglo con los nombres de las columnas de la tabla
    String columnas[] = {"Nombres", "Cantidad Motores","Empuje","Mision","Combustible","Pais"};
    // Creamos un modelo de tabla con esas columnas y sin filas iniciales
    DefaultTableModel modelo = new DefaultTableModel(columnas,0);
    // Creamos un objeto de acceso a datos para la tabla de no tripuladas
    daoNoTripuladas dao = new daoNoTripuladas();
    // Creamos una lista para almacenar los resultados de la búsqueda
    ArrayList<Object[]> data = new ArrayList<>();
    
    
    public noTripuladaPanel() {
        initComponents();
        cargar();
    }
    // Creamos un metodo que permita llenar la tabla con los datos de la base de datos
    private void cargar(){
        this.data = dao.consultar();
        modelo.setNumRows(0);
        for(Object [] dato : this.data){
            this.modelo.addRow(dato);
        }
        tbldata.setModel(modelo);    
    }
    //Creamos un metodo que permita vaciar los campos de la interfaz grafica
    private void limpiar(){
        txtNombre.setText("");
        txtCantidad.setText("");
        txtEmpuje.setText("");
        txtMision.setText("");
        txtCombustible.setText("");
        txtPais.setText("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmpuje = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtMision = new javax.swing.JTextField();
        txtCombustible = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(88, 24, 69));
        jLabel1.setText("NO TRIPULADAS");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(88, 24, 69));
        jLabel2.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(88, 24, 69));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(88, 24, 69));
        jLabel4.setText("Cantidad motores");

        txtCantidad.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(88, 24, 69));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(88, 24, 69));
        jLabel6.setText("Empuje en T");

        txtEmpuje.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtEmpuje.setForeground(new java.awt.Color(88, 24, 69));

        tbldata.setBackground(new java.awt.Color(88, 24, 69));
        tbldata.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        tbldata.setForeground(new java.awt.Color(255, 255, 255));
        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Cantidad motores", "Empuje", "Mision", "Combustible", "Pais"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldata);

        btnEliminar.setBackground(new java.awt.Color(88, 24, 69));
        btnEliminar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(88, 24, 69));
        btnAgregar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(88, 24, 69));
        btnModificar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(88, 24, 69));
        btnBuscar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(88, 24, 69));
        jLabel8.setText("Mision");

        txtMision.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtMision.setForeground(new java.awt.Color(88, 24, 69));

        txtCombustible.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtCombustible.setForeground(new java.awt.Color(88, 24, 69));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(88, 24, 69));
        jLabel9.setText("Combustible");

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(88, 24, 69));
        jLabel10.setText("Pais");

        txtPais.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtPais.setForeground(new java.awt.Color(88, 24, 69));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel1)))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpuje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCombustible)
                        .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmpuje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtMision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(btnAgregar)
                            .addGap(56, 56, 56)
                            .addComponent(btnEliminar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificar)
                            .addGap(38, 38, 38))))
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Metodo que permite buscar por nombre en la base de datos pulsando buscar
        daoNoTripuladas dao = new daoNoTripuladas();
        ArrayList<Object[]> fila = new ArrayList<>();
        

        int filastabla = tbldata.getRowCount();
        for(int i = 0; filastabla>i; i++){
            modelo.removeRow(0);
        }
        
        fila = dao.buscar(txtNombre.getText());
        
        for(int i =0; i < fila.size();i++){
        modelo.addRow(fila.get(i));        
        }
        
        tbldata.getSelectionModel().setSelectionInterval(0,0);
        this.txtNombre.setText(tbldata.getValueAt(tbldata.getSelectedRow(),0).toString());
        this.txtCantidad.setText(tbldata.getValueAt(tbldata.getSelectedRow(),1).toString());
        this.txtEmpuje.setText(tbldata.getValueAt(tbldata.getSelectedRow(),2).toString());
        this.txtMision.setText(tbldata.getValueAt(tbldata.getSelectedRow(),3).toString());
        this.txtCombustible.setText(tbldata.getValueAt(tbldata.getSelectedRow(),4).toString());
        this.txtPais.setText(tbldata.getValueAt(tbldata.getSelectedRow(),5).toString());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Metodo que premite agregar una nave a la tabla no tripuladas en la base de datos
        int empuje = Integer.parseInt(txtEmpuje.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());

        noTripuladas noTrip = new noTripuladas(txtNombre.getText(), 
                                    cantidad,
                                    empuje,
                                    txtMision.getText(),
                                    txtCombustible.getText(),
                                    txtPais.getText());

        if(dao.insertar(noTrip)){
            JOptionPane.showMessageDialog(this, "!!!exito!!!");
        }else{
            JOptionPane.showMessageDialog(this, "Error al insertar -_- ");
        }
        cargar();
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //Metodo que premite modificar una nave en la tabla no tripuladas de la base de datos
        int empuje = Integer.parseInt(txtEmpuje.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());

        noTripuladas noTrip = new noTripuladas(txtNombre.getText(), 
                                    cantidad,
                                    empuje,
                                    txtMision.getText(),
                                    txtCombustible.getText(),
                                    txtPais.getText());

        if(dao.modificar(noTrip)){
            JOptionPane.showMessageDialog(this, "!!!exito!!!");
        }else{
            JOptionPane.showMessageDialog(this, "Error al modificar -_- ");
        }
        cargar();
        limpiar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Metodo que premite eliminar una nave de la tabla no tripuladas en la base de datos
        int empuje = Integer.parseInt(txtEmpuje.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());

        noTripuladas noTrip = new noTripuladas(txtNombre.getText(), 
                                    cantidad,
                                    empuje,
                                    txtMision.getText(),
                                    txtCombustible.getText(),
                                    txtPais.getText());

        if(dao.eliminar(noTrip)){
            JOptionPane.showMessageDialog(this, "!!!exito!!!");
        }else{
            JOptionPane.showMessageDialog(this, "Error al eliminar -_- ");
        }
        cargar();
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldataMouseClicked
        //Metodo que llena los campos de la interfaz grafica con los 
        //valores de la tabla al hacer clic en la tabla
        this.txtNombre.setText(tbldata.getValueAt(tbldata.getSelectedRow(),0).toString());
        this.txtCantidad.setText(tbldata.getValueAt(tbldata.getSelectedRow(),1).toString());
        this.txtEmpuje.setText(tbldata.getValueAt(tbldata.getSelectedRow(),2).toString());
        this.txtMision.setText(tbldata.getValueAt(tbldata.getSelectedRow(),3).toString());
        this.txtCombustible.setText(tbldata.getValueAt(tbldata.getSelectedRow(),4).toString());
        this.txtPais.setText(tbldata.getValueAt(tbldata.getSelectedRow(),5).toString());
    }//GEN-LAST:event_tbldataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldata;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCombustible;
    private javax.swing.JTextField txtEmpuje;
    private javax.swing.JTextField txtMision;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
