
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
public class lanzaderaPanel extends javax.swing.JPanel {

    // Creamos un arreglo con los nombres de las columnas de la tabla
    String columnas[] = {"Nombres", "Peso","Empuje","Capacidad","Altura","Alcance","Potencia","Combustible","Pais"};

    // Creamos un modelo de tabla con esas columnas y sin filas iniciales
    DefaultTableModel modelo = new DefaultTableModel(columnas,0);

    // Creamos un objeto de acceso a datos para la tabla de lanzaderas
    daoLanzadera dao = new daoLanzadera();

    // Creamos una lista para almacenar los resultados de la búsqueda
    ArrayList<Object[]> data = new ArrayList<>();

    
    public lanzaderaPanel() {
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
        txtPeso.setText("");
        txtEmpuje.setText("");
        txtCapacidad.setText("");
        txtAltura.setText("");
        txtAlcance.setText("");
        txtPotencia.setText("");
        txtCombustible.setText("");
        txtPais.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtEmpuje = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtAlcance = new javax.swing.JTextField();
        txtPotencia = new javax.swing.JTextField();
        txtCombustible = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(940, 600));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(88, 24, 69));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LANZADERAS");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(88, 24, 69));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(88, 24, 69));
        jLabel4.setText("Peso en T ");

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(88, 24, 69));
        jLabel5.setText("Empuje en T");

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(88, 24, 69));
        jLabel6.setText("Alcance en Km");

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(88, 24, 69));
        jLabel7.setText("Potencia");

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(88, 24, 69));
        jLabel8.setText("Combustible");

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(88, 24, 69));
        jLabel9.setText("Capacidad de carga en T");

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(88, 24, 69));
        jLabel10.setText("Pais");

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(88, 24, 69));
        jLabel11.setText("Altura en m");

        txtNombre.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(88, 24, 69));

        txtPeso.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(88, 24, 69));

        txtEmpuje.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtEmpuje.setForeground(new java.awt.Color(88, 24, 69));

        txtCapacidad.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtCapacidad.setForeground(new java.awt.Color(88, 24, 69));

        txtAltura.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtAltura.setForeground(new java.awt.Color(88, 24, 69));

        txtAlcance.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtAlcance.setForeground(new java.awt.Color(88, 24, 69));

        txtPotencia.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtPotencia.setForeground(new java.awt.Color(88, 24, 69));

        txtCombustible.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtCombustible.setForeground(new java.awt.Color(88, 24, 69));

        txtPais.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txtPais.setForeground(new java.awt.Color(88, 24, 69));

        tbldata.setBackground(new java.awt.Color(88, 24, 69));
        tbldata.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        tbldata.setForeground(new java.awt.Color(255, 255, 255));
        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Peso", "Empuje", "Capacidad", "Altura", "Alcance", "Potencia", "Combustible", "Pais"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpuje, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlcance, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel5)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addGap(25, 25, 25)
                                .addComponent(btnAgregar)
                                .addGap(28, 28, 28)
                                .addComponent(btnModificar)
                                .addGap(31, 31, 31)
                                .addComponent(btnEliminar)
                                .addGap(14, 14, 14)))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtEmpuje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel8)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAlcance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Metodo que permite buscar por nombre en la base de datos pulsando buscar
        
        daoLanzadera dao = new daoLanzadera();
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
        this.txtPeso.setText(tbldata.getValueAt(tbldata.getSelectedRow(),1).toString());
        this.txtEmpuje.setText(tbldata.getValueAt(tbldata.getSelectedRow(),2).toString());
        this.txtCapacidad.setText(tbldata.getValueAt(tbldata.getSelectedRow(),3).toString());
        this.txtAltura.setText(tbldata.getValueAt(tbldata.getSelectedRow(),4).toString());
        this.txtAlcance.setText(tbldata.getValueAt(tbldata.getSelectedRow(),5).toString());
        this.txtPotencia.setText(tbldata.getValueAt(tbldata.getSelectedRow(),6).toString());
        this.txtCombustible.setText(tbldata.getValueAt(tbldata.getSelectedRow(),7).toString());
        this.txtPais.setText(tbldata.getValueAt(tbldata.getSelectedRow(),8).toString());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Metodo que premite agregar una nave a la tabla lanzaderas en la base de datos
        int peso = Integer.parseInt(txtPeso.getText());
        int empuje = Integer.parseInt(txtEmpuje.getText());
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        int altura = Integer.parseInt(txtAltura.getText());
        int alcance = Integer.parseInt(txtAlcance.getText());
        int potencia = Integer.parseInt(txtPotencia.getText());
        
        lanzaderas lan = new lanzaderas(txtNombre.getText(), 
                                    peso, 
                                    empuje, 
                                    capacidad, 
                                    altura, 
                                    alcance,
                                    potencia,
                                    txtCombustible.getText(),
                                    txtPais.getText());

        if(dao.insertar(lan)){
            JOptionPane.showMessageDialog(this, "!!!exito!!!");
        }else{
            JOptionPane.showMessageDialog(this, "Error al insertar -_- ");
        }
        cargar();
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //Metodo que premite modificar una nave en la tabla lanzaderas de la base de datos
        int peso = Integer.parseInt(txtPeso.getText());
        int empuje = Integer.parseInt(txtEmpuje.getText());
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        int altura = Integer.parseInt(txtAltura.getText());
        int alcance = Integer.parseInt(txtAlcance.getText());
        int potencia = Integer.parseInt(txtPotencia.getText());
        
        lanzaderas lan = new lanzaderas(txtNombre.getText(), 
                                    peso, 
                                    empuje, 
                                    capacidad, 
                                    altura, 
                                    alcance,
                                    potencia,
                                    txtCombustible.getText(),
                                    txtPais.getText());
        
        if(dao.modificar(lan)){
            JOptionPane.showMessageDialog(this, "!!!exito!!!");
        }else{
            JOptionPane.showMessageDialog(this, "Error al modificar -_- ");
        }
        cargar();
        limpiar();
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Metodo que premite eliminar una nave de la tabla lanzaderas en la base de datos
        int peso = Integer.parseInt(txtPeso.getText());
        int empuje = Integer.parseInt(txtEmpuje.getText());
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        int altura = Integer.parseInt(txtAltura.getText());
        int alcance = Integer.parseInt(txtAlcance.getText());
        int potencia = Integer.parseInt(txtPotencia.getText());
        
        lanzaderas lan = new lanzaderas(txtNombre.getText(), 
                                    peso, 
                                    empuje, 
                                    capacidad, 
                                    altura, 
                                    alcance,
                                    potencia,
                                    txtCombustible.getText(),
                                    txtPais.getText());
        
        if(dao.eliminar(lan)){
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
        this.txtPeso.setText(tbldata.getValueAt(tbldata.getSelectedRow(),1).toString());
        this.txtEmpuje.setText(tbldata.getValueAt(tbldata.getSelectedRow(),2).toString());
        this.txtCapacidad.setText(tbldata.getValueAt(tbldata.getSelectedRow(),3).toString());
        this.txtAltura.setText(tbldata.getValueAt(tbldata.getSelectedRow(),4).toString());
        this.txtPotencia.setText(tbldata.getValueAt(tbldata.getSelectedRow(),6).toString());
        this.txtCombustible.setText(tbldata.getValueAt(tbldata.getSelectedRow(),7).toString());
        this.txtPais.setText(tbldata.getValueAt(tbldata.getSelectedRow(),8).toString());
        this.txtAlcance.setText(tbldata.getValueAt(tbldata.getSelectedRow(),5).toString());
    }//GEN-LAST:event_tbldataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldata;
    private javax.swing.JTextField txtAlcance;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCombustible;
    private javax.swing.JTextField txtEmpuje;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPotencia;
    // End of variables declaration//GEN-END:variables
}
