
package Vista;

import Controlador.*;
import Clases.*;
import javax.swing.JOptionPane;

public class Vista extends javax.swing.JFrame {
    CtPlan CtPlan;
    CtCliente CtCliente;
    /*LinkedList<Cliente> clienteComboBox;
    LinkedList<Plan> planComboBox;*/
    
    public Vista() {
        initComponents();

        this.CtPlan = new CtPlan();
        this.CtCliente = new CtCliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        identificacionCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombresCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidosCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        direccionCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefonoCliente = new javax.swing.JTextField();
        btnCrearCliente = new javax.swing.JButton();
        btnConsultarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnBorrarCliente = new javax.swing.JButton();
        btnLimpiarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        codigoPlan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nombrePlan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        precioPlan = new javax.swing.JTextField();
        btnCrearPlan = new javax.swing.JButton();
        btnBuscarPlan = new javax.swing.JButton();
        btnModificarPlan = new javax.swing.JButton();
        btnBorrarPlan = new javax.swing.JButton();
        btnLimpiarPlan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Identificación:");

        identificacionCliente.setBackground(new java.awt.Color(204, 255, 255));
        identificacionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacionClienteActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres:");

        nombresCliente.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos:");

        apellidosCliente.setBackground(new java.awt.Color(204, 255, 255));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección:");

        direccionCliente.setBackground(new java.awt.Color(204, 255, 255));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono:");

        telefonoCliente.setBackground(new java.awt.Color(204, 255, 255));

        btnCrearCliente.setBackground(new java.awt.Color(0, 153, 204));
        btnCrearCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCliente.setText("Crear");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        btnConsultarCliente.setBackground(new java.awt.Color(0, 153, 204));
        btnConsultarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarCliente.setText("Consultar");
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });

        btnModificarCliente.setBackground(new java.awt.Color(0, 153, 204));
        btnModificarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarCliente.setText("Modificar");
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });

        btnBorrarCliente.setBackground(new java.awt.Color(0, 153, 204));
        btnBorrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarCliente.setText("Borrar");
        btnBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarClienteActionPerformed(evt);
            }
        });

        btnLimpiarCliente.setBackground(new java.awt.Color(0, 153, 204));
        btnLimpiarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCliente.setText("Limpiar Campos");
        btnLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(identificacionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidosCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(nombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(btnCrearCliente))
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(btnLimpiarCliente)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(identificacionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(direccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCliente)
                    .addComponent(btnConsultarCliente)
                    .addComponent(btnModificarCliente)
                    .addComponent(btnBorrarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiarCliente)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel6.setText("Código:");

        codigoPlan.setBackground(new java.awt.Color(204, 204, 255));

        jLabel7.setText("Nombre:");

        nombrePlan.setBackground(new java.awt.Color(204, 204, 255));
        nombrePlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diamante", "Platino", "Estandar" }));
        nombrePlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePlanActionPerformed(evt);
            }
        });

        jLabel8.setText("Precio:");

        precioPlan.setBackground(new java.awt.Color(204, 204, 255));

        btnCrearPlan.setBackground(new java.awt.Color(0, 102, 102));
        btnCrearPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearPlan.setText("Crear");
        btnCrearPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPlanActionPerformed(evt);
            }
        });

        btnBuscarPlan.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPlan.setText("Consultar");
        btnBuscarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPlanActionPerformed(evt);
            }
        });

        btnModificarPlan.setBackground(new java.awt.Color(0, 102, 102));
        btnModificarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarPlan.setText("Modificar");
        btnModificarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPlanActionPerformed(evt);
            }
        });

        btnBorrarPlan.setBackground(new java.awt.Color(0, 102, 102));
        btnBorrarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarPlan.setText("Borrar");
        btnBorrarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPlanActionPerformed(evt);
            }
        });

        btnLimpiarPlan.setBackground(new java.awt.Color(0, 102, 102));
        btnLimpiarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarPlan.setText("Limpiar Campos");
        btnLimpiarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarPlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codigoPlan)
                            .addComponent(nombrePlan, 0, 150, Short.MAX_VALUE)
                            .addComponent(precioPlan)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnCrearPlan)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPlan)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarPlan)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarPlan)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpiarPlan)
                .addGap(145, 145, 145))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(codigoPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(precioPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearPlan)
                    .addComponent(btnBuscarPlan)
                    .addComponent(btnModificarPlan)
                    .addComponent(btnBorrarPlan))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarPlan)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Plan", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void identificacionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificacionClienteActionPerformed

    private void nombrePlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePlanActionPerformed

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        String identificacion = identificacionCliente.getText();
        String nombres = nombresCliente.getText();
        String apellidos = apellidosCliente.getText();
        String direccion = direccionCliente.getText();
        String telefono = telefonoCliente.getText();
        Cliente c = new Cliente(identificacion, nombres, apellidos, direccion, telefono);

        if (this.CtCliente.crearCliente(c)){
            JOptionPane.showMessageDialog(this, "El cliente fue agregado a la base de datos.");
        }
        else{
            JOptionPane.showMessageDialog(this, "No se pudo agregar al cliente a la base de datos.");
        }
        limpiarClientes();
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnCrearPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPlanActionPerformed
        String codigo = codigoPlan.getText();
        String nombre = nombrePlan.getSelectedItem().toString();
        int precio = Integer.parseInt(precioPlan.getText());
        Plan p = new Plan(codigo, nombre, precio);

        if (this.CtPlan.crearPlan(p)) {
            JOptionPane.showMessageDialog(this, "El plan fue agregado en la base de datos");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el registro a la base de datos");
        }
        limpiarPlan();
    }//GEN-LAST:event_btnCrearPlanActionPerformed

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed
        String identificacion = identificacionCliente.getText();
        Cliente c = CtCliente.buscarCliente(identificacion);

        if(c == null){
            JOptionPane.showMessageDialog(this, "El código de ese cliente no fue encontrado.");
            limpiarClientes();
        }
        else{
            identificacionCliente.setText(String.valueOf(c.getIdentificacion()));
            nombresCliente.setText(String.valueOf(c.getNombres()));
            apellidosCliente.setText(String.valueOf(c.getApellidos()));
            direccionCliente.setText(String.valueOf(c.getDireccion()));
            telefonoCliente.setText(String.valueOf(c.getTelefono()));
        }
    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
        String ident = identificacionCliente.getText();
        String nom = nombresCliente.getText();
        String apell = apellidosCliente.getText();
        String dir = direccionCliente.getText();
        String tel = telefonoCliente.getText();

        Cliente c = new Cliente(ident, nom, apell, dir, tel);

        try{
            boolean respuesta = CtCliente.actualizarCliente(c);
            if(respuesta){
                JOptionPane.showMessageDialog(this, "Registro actualizado correctamente.");
            }
            else{
                JOptionPane.showMessageDialog(this, "Registro no actualizado.");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "Debe buscar el registro para actualizar.");
        }
        limpiarClientes();
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void btnBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarClienteActionPerformed
        String ident = identificacionCliente.getText();
        String nom = nombresCliente.getText();
        String apell = apellidosCliente.getText();
        String dir = direccionCliente.getText();
        String tel = telefonoCliente.getText();

        Cliente c = new Cliente(ident, nom, apell, dir, tel);

        try{
            boolean respuesta = CtCliente.borrarCliente(c);
            if(respuesta){
                JOptionPane.showMessageDialog(this, "Cliente borrado correctamente.");
            }
            else{
                JOptionPane.showMessageDialog(this, "Cliente no borrado.");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "No se pudo borrar.");
        }
        limpiarClientes();
    }//GEN-LAST:event_btnBorrarClienteActionPerformed

    private void btnLimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarClienteActionPerformed
        limpiarClientes();
    }//GEN-LAST:event_btnLimpiarClienteActionPerformed

    private void btnBuscarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPlanActionPerformed
        String codigo = codigoPlan.getText();
        Plan p = CtPlan.buscarPlan(codigo);
        if (p == null){
            JOptionPane.showMessageDialog(this, "El código de ese plan no fue encontrado.");
            limpiarPlan();
        }
        else{
            if(p.getNombre().equals("Bienestar")){
                nombrePlan.setSelectedIndex(0);
            }
            else{
                if(p.getNombre().equals("Élite")){
                    nombrePlan.setSelectedIndex(1);
                }
                else{
                    nombrePlan.setSelectedIndex(2);
                }
            }
            precioPlan.setText(String.valueOf(p.getPrecio()));
        }
    }//GEN-LAST:event_btnBuscarPlanActionPerformed

    private void btnModificarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPlanActionPerformed
        String codigo = codigoPlan.getText();
        String nombre = nombrePlan.getSelectedItem().toString();
        int precio = Integer.parseInt(precioPlan.getText());
        Plan p = new Plan(codigo,nombre,precio);

        try{
            boolean respuesta = CtPlan.actualizarPlan(p);
            if(respuesta){
                JOptionPane.showMessageDialog(this, "Registro actualizado.");
            }
            else{
                JOptionPane.showMessageDialog(this, "Registro no actualizado.");
            }
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(this, "Debe buscar el registro para actualizar.");
        }
        limpiarPlan();
    }//GEN-LAST:event_btnModificarPlanActionPerformed

    private void btnBorrarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPlanActionPerformed
        String codigo = codigoPlan.getText();
        String nombre = nombrePlan.getSelectedItem().toString();
        int precio = Integer.parseInt(precioPlan.getText());

        Plan p = new Plan(codigo,nombre,precio);

        try{
            boolean respuesta = CtPlan.borrarPlan(p);
            if(respuesta){
                JOptionPane.showMessageDialog(this, "Plan borrado correctamente.");
            }
            else{
                JOptionPane.showMessageDialog(this, "No se pudo borrar el plan.");
            }
        }
        catch (Exception e){
        }
        limpiarPlan();
    }//GEN-LAST:event_btnBorrarPlanActionPerformed

    private void btnLimpiarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarPlanActionPerformed
        limpiarPlan();
    }//GEN-LAST:event_btnLimpiarPlanActionPerformed

    private void limpiarClientes() {
        identificacionCliente.setText("");
        nombresCliente.setText("");
        apellidosCliente.setText("");
        direccionCliente.setText("");
        telefonoCliente.setText("");
    }
    
    private void limpiarPlan() {
        codigoPlan.setText("");
        nombrePlan.setSelectedIndex(0);
        precioPlan.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosCliente;
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnBorrarPlan;
    private javax.swing.JButton btnBuscarPlan;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnCrearPlan;
    private javax.swing.JButton btnLimpiarCliente;
    private javax.swing.JButton btnLimpiarPlan;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnModificarPlan;
    private javax.swing.JTextField codigoPlan;
    private javax.swing.JTextField direccionCliente;
    private javax.swing.JTextField identificacionCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> nombrePlan;
    private javax.swing.JTextField nombresCliente;
    private javax.swing.JTextField precioPlan;
    private javax.swing.JTextField telefonoCliente;
    // End of variables declaration//GEN-END:variables
}
