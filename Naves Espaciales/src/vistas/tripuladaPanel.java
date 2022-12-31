
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
public class tripuladaPanel extends javax.swing.JPanel {
    // Creamos un arreglo con los nombres de las columnas de la tabla
    String columnas[] = {"Nombres", "Finalidad de uso","Peso","Distancia de orbita","Capacidad","Pais"};
    // Creamos un modelo de tabla con esas columnas y sin filas iniciales
    DefaultTableModel modelo = new DefaultTableModel(columnas,0);
    // Creamos un objeto de acceso a datos para la tabla de lanzaderas
    daoTripuladas dao = new daoTripuladas();
    // Creamos una lista para almacenar los resultados de la búsqueda
    ArrayList<Object[]> data = new ArrayList<>();
    
    public tripuladaPanel() {
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
        txtFinalidad.setText("");
        txtPeso.setText("");
        txtOrbita.setText("");
        txtCapacidad.setText("");
        txtPais.setText("");
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFinalidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtOrbita = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        txtCapacidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(88, 24, 69));
        jLabel2.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(88, 24, 69));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(88, 24, 69));
        jLabel4.setText("Finalidad de Uso");

        txtFinalidad.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtFinalidad.setForeground(new java.awt.Color(88, 24, 69));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(88, 24, 69));
        jLabel6.setText("Peso en T");

        txtPeso.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(88, 24, 69));

        txtPais.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtPais.setForeground(new java.awt.Color(88, 24, 69));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(88, 24, 69));
        jLabel10.setText("Pais");

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(88, 24, 69));
        jLabel9.setText("Capacidad personas");

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(88, 24, 69));
        jLabel8.setText("Distancia de orbita");

        txtOrbita.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtOrbita.setForeground(new java.awt.Color(88, 24, 69));

        btnBuscar.setBackground(new java.awt.Color(88, 24, 69));
        btnBuscar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
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

        btnEliminar.setBackground(new java.awt.Color(88, 24, 69));
        btnEliminar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

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
                "Nombre", "Finalidad de Uso", "Peso", "Distancia de orbita", "Capacidad", "Pais"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
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

        txtCapacidad.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtCapacidad.setForeground(new java.awt.Color(88, 24, 69));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(88, 24, 69));
        jLabel1.setText("Tripuladas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(124, 124, 124)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(390, 390, 390)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(txtFinalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(37, 37, 37)
                                    .addComponent(txtOrbita, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(29, 29, 29)
                                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(jLabel2)
                    .addGap(114, 114, 114)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.LEADING))
                    .addContainerGap(572, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtOrbita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtFinalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 126, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(65, 65, 65)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(383, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Metodo que permite buscar por nombre en la base de datos pulsando buscar
        daoTripuladas dao = new daoTripuladas();
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
        this.txtFinalidad.setText(tbldata.getValueAt(tbldata.getSelectedRow(),1).toString());
        this.txtPeso.setText(tbldata.getValueAt(tbldata.getSelectedRow(),2).toString());
        this.txtOrbita.setText(tbldata.getValueAt(tbldata.getSelectedRow(),3).toString());
        this.txtCapacidad.setText(tbldata.getValueAt(tbldata.getSelectedRow(),4).toString());
        this.txtPais.setText(tbldata.getValueAt(tbldata.getSelectedRow(),5).toString());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Metodo que premite agregar una nave a la tabla tripuladas en la base de datos
        int peso = Integer.parseInt(txtPeso.getText());
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        int orbita = Integer.parseInt(txtOrbita.getText());

        tripuladas trip = new tripuladas(txtNombre.getText(),
                                            txtFinalidad.getText(),
                                            peso,
                                            orbita,
                                            capacidad,
                                            txtPais.getText());

        if(dao.insertar(trip)){
            JOptionPane.showMessageDialog(this, "!!!exito!!!");
        }else{
            JOptionPane.showMessageDialog(this, "Error al insertar -_- ");
        }
        cargar();
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //Metodo que premite modificar una nave en la tabla tripuladas de la base de datos
        int peso = Integer.parseInt(txtPeso.getText());
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        int orbita = Integer.parseInt(txtOrbita.getText());

        tripuladas trip = new tripuladas(txtNombre.getText(),
                                            txtFinalidad.getText(),
                                            peso,
                                            orbita,
                                            capacidad,
                                            txtPais.getText());

        if(dao.modificar(trip)){
            JOptionPane.showMessageDialog(this, "!!!exito!!!");
        }else{
            JOptionPane.showMessageDialog(this, "Error al modificar -_- ");
        }
        cargar();
        limpiar();    
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Metodo que premite eliminar una nave de la tabla tripuladas en la base de datos
        int peso = Integer.parseInt(txtPeso.getText());
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        int orbita = Integer.parseInt(txtOrbita.getText());

        tripuladas trip = new tripuladas(txtNombre.getText(),
                                            txtFinalidad.getText(),
                                            peso,
                                            orbita,
                                            capacidad,
                                            txtPais.getText());

        if(dao.eliminar(trip)){
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
        this.txtFinalidad.setText(tbldata.getValueAt(tbldata.getSelectedRow(),1).toString());
        this.txtPeso.setText(tbldata.getValueAt(tbldata.getSelectedRow(),2).toString());
        this.txtOrbita.setText(tbldata.getValueAt(tbldata.getSelectedRow(),3).toString());
        this.txtCapacidad.setText(tbldata.getValueAt(tbldata.getSelectedRow(),4).toString());
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
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtFinalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOrbita;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
