package nutricionistaapp.vistas;

import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import nutricionistaapp.accesoDatos.DietaData;
import nutricionistaapp.entidades.Dieta;
import nutricionistaapp.entidades.Paciente;
import nutricionistaapp.entidades.Profesional;

public class ModificarDietaGUI extends javax.swing.JInternalFrame {

    private Paciente paciente;
    private Profesional doctor;

    // Atributos para verificar cambios
    private String pacienteOriginal;
    private String doctorOriginal;
    private String nombreDietaOriginal;
    private Date fechaOriginal;

    public ModificarDietaGUI(Dimension size) {
        initComponents();

        centrarVentana(size);
        iniciarListaDietas();
        cargarInfo();
        setearJDateChooserListener();

    }

    public Profesional getDoctor() {
        return doctor;
    }

    public void setDoctor(Profesional doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public JLabel getJlDoctorInfo() {
        return jlDoctorInfo;
    }

    public JLabel getJlPacienteInfo() {
        return jlPacienteInfo;
    }

    public JLabel getJlPesoActual() {
        return jlPesoActual;
    }

    public JLabel getJlPesoDeseado() {
        return jlPesoDeseado;
    }

    public JLabel getJlAltura() {
        return jlAltura;
    }

    public JLabel getJlGenero() {
        return jlGenero;
    }

    public JLabel getJlIMC() {
        return jlIMC;
    }

    public JLabel getJlMatricula() {
        return jlMatricula;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jcbDietas = new javax.swing.JComboBox();
        jbBuscar = new javax.swing.JButton();
        jbSelectPaciente = new javax.swing.JButton();
        jbSelectDoctor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbAplicar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jlPacienteInfo = new javax.swing.JLabel();
        jlDoctorInfo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jlPesoActual = new javax.swing.JLabel();
        jlPesoDeseado = new javax.swing.JLabel();
        jlIMC = new javax.swing.JLabel();
        jlGenero = new javax.swing.JLabel();
        jlAltura = new javax.swing.JLabel();
        jlMatricula = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtfNombreDieta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle(" Modificación de dieta");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), " Seleccionar dieta ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jcbDietas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbDietasItemStateChanged(evt);
            }
        });

        jbBuscar.setText("Buscar dieta");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbDietas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbDietas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbSelectPaciente.setText("Asignar Paciente");
        jbSelectPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSelectPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelectPacienteActionPerformed(evt);
            }
        });

        jbSelectDoctor.setText("Asignar Doctor/a");
        jbSelectDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelectDoctorActionPerformed(evt);
            }
        });

        jbAplicar.setText("Aplicar cambios");
        jbAplicar.setEnabled(false);
        jbAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAplicarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar Dieta");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAplicar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAplicar)
                    .addComponent(jbCancelar)
                    .addComponent(jbBorrar))
                .addContainerGap())
        );

        jlPacienteInfo.setForeground(new java.awt.Color(34, 135, 59));
        jlPacienteInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPacienteInfo.setText("Indique el paciente");
        jlPacienteInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlDoctorInfo.setForeground(new java.awt.Color(34, 135, 59));
        jlDoctorInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDoctorInfo.setText("Indique el profesional");
        jlDoctorInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Cambiar fecha de finalización:");

        jlPesoActual.setForeground(new java.awt.Color(51, 51, 51));
        jlPesoActual.setText("Peso actual: n/a");

        jlPesoDeseado.setForeground(new java.awt.Color(51, 51, 51));
        jlPesoDeseado.setText("Peso deseado: n/a");

        jlIMC.setForeground(new java.awt.Color(51, 51, 51));
        jlIMC.setText("IMC: n/a");

        jlGenero.setForeground(new java.awt.Color(51, 51, 51));
        jlGenero.setText("Género: n/a");

        jlAltura.setForeground(new java.awt.Color(51, 51, 51));
        jlAltura.setText("Altura: n/a");

        jlMatricula.setForeground(new java.awt.Color(51, 51, 51));
        jlMatricula.setText("Matrícula: n/a");

        jtfNombreDieta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreDietaKeyReleased(evt);
            }
        });

        jLabel1.setText("Cambiar nombre de dieta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jlPacienteInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbSelectPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlAltura)
                                    .addComponent(jlIMC)
                                    .addComponent(jlPesoDeseado)
                                    .addComponent(jlPesoActual)
                                    .addComponent(jlGenero))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlMatricula)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jbSelectDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlDoctorInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNombreDieta)))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbSelectPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSelectDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPacienteInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDoctorInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGenero)
                    .addComponent(jlMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlAltura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPesoActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPesoDeseado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlIMC)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jcbDietasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbDietasItemStateChanged

        cargarInfo();
        jbAplicar.setEnabled(false);


    }//GEN-LAST:event_jcbDietasItemStateChanged

    private void jbSelectPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelectPacienteActionPerformed

        CrearDietaPacienteGUI cambiarPacienteVentana = new CrearDietaPacienteGUI(null, true, this);
        cambiarPacienteVentana.setVisible(true);

    }//GEN-LAST:event_jbSelectPacienteActionPerformed

    private void jbSelectDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelectDoctorActionPerformed

        CrearDietaDoctorGUI cambiarDoctorVentana = new CrearDietaDoctorGUI(null, true, this);
        cambiarDoctorVentana.setVisible(true);

    }//GEN-LAST:event_jbSelectDoctorActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed

        // Se registra la respuesta
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea "
                + "borrar la dieta?", " Borrar",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        // Borra la dieta si la respuesta es "ok"
        if (respuesta == 0) {
            Dieta dieta = (Dieta) jcbDietas.getSelectedItem();
            DietaData.bajaDieta(dieta.getIdDieta());
            iniciarListaDietas();
            cargarInfo();
        }

    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAplicarActionPerformed

        int index = jcbDietas.getSelectedIndex();
        Dieta dieta = (Dieta) jcbDietas.getSelectedItem();
        Instant instant = jDateChooser1.getDate().toInstant();

        dieta.setFechaFinal(instant.atZone(ZoneId.systemDefault()).toLocalDate());
        dieta.setPaciente(paciente);
        dieta.setProfesional(doctor);
        dieta.setNombre(jtfNombreDieta.getText());

        DietaData.modificarDieta(dieta);
        iniciarListaDietas();
        cargarInfo();
        jcbDietas.setSelectedIndex(index);

    }//GEN-LAST:event_jbAplicarActionPerformed

    private void jtfNombreDietaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreDietaKeyReleased

        String nombreDietaNueva = jtfNombreDieta.getText();
        System.out.println(nombreDietaNueva);

        if (!nombreDietaNueva.equals(nombreDietaOriginal)) {
            jbAplicar.setEnabled(true);
        }

    }//GEN-LAST:event_jtfNombreDietaKeyReleased

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        IndicacionesSearchGUI buscarDieta = new IndicacionesSearchGUI(null, true, jcbDietas);
        buscarDieta.setVisible(true);
        
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAplicar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSelectDoctor;
    private javax.swing.JButton jbSelectPaciente;
    private javax.swing.JComboBox jcbDietas;
    private javax.swing.JLabel jlAltura;
    private javax.swing.JLabel jlDoctorInfo;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlIMC;
    private javax.swing.JLabel jlMatricula;
    private javax.swing.JLabel jlPacienteInfo;
    private javax.swing.JLabel jlPesoActual;
    private javax.swing.JLabel jlPesoDeseado;
    private javax.swing.JTextField jtfNombreDieta;
    // End of variables declaration//GEN-END:variables

    private void centrarVentana(Dimension size) {
        Dimension internalFrameSize = this.getSize();

        setLocation((size.width - internalFrameSize.width) / 2,
                (size.height - internalFrameSize.height) / 2);
    }

    private void iniciarListaDietas() {

        List<Dieta> listaDietas = DietaData.listarDietas();
        DefaultComboBoxModel<Dieta> comboBoxModel = new DefaultComboBoxModel<>();

        for (Dieta dieta : listaDietas) {
            comboBoxModel.addElement(dieta);
        }
        jcbDietas.setModel(comboBoxModel);
    }

    private void cargarInfo() {

        // Método para cargar toda la información 
        // de acuerdo a la dieta seleccionada
        Dieta dieta = (Dieta) jcbDietas.getSelectedItem();
        Date fechaFinal = java.sql.Date.valueOf(dieta.getFechaFinal());
        paciente = dieta.getPaciente();
        doctor = dieta.getProfesional();

        jtfNombreDieta.setText(dieta.getNombre());
        jlPacienteInfo.setText(paciente.getNombre() + " " + paciente.getApellido());
        jlDoctorInfo.setText(doctor.getNombre() + " " + doctor.getApellido());
        jlMatricula.setText("Matrícula: " + doctor.getMatricula());
        jlGenero.setText("Género: " + paciente.getGenero());
        jlAltura.setText("Altura: " + paciente.getAltura() / 100 + " m");
        jlPesoActual.setText("Peso actual: " + paciente.getPesoActual() + " kg");
        jlPesoDeseado.setText("Peso deseado: " + paciente.getPesoDeseado() + " kg");
        double pesoActual = paciente.getPesoActual();
        double altura = paciente.getAltura() / 100;
        double imc = pesoActual / (altura * altura);
        jlIMC.setText("IMC: " + (float) imc);
        jDateChooser1.setDate(fechaFinal);

        pacienteOriginal = jlPacienteInfo.getText();
        doctorOriginal = jlDoctorInfo.getText();
        nombreDietaOriginal = jtfNombreDieta.getText();
        fechaOriginal = jDateChooser1.getDate();

    }

    public void verificarCambios() {

        String pacienteNuevo = jlPacienteInfo.getText();
        String doctorNuevo = jlDoctorInfo.getText();

        if (!pacienteNuevo.equals(pacienteOriginal)
                || !doctorNuevo.equals(doctorOriginal)) {
            jbAplicar.setEnabled(true);
        }

    }

    private void setearJDateChooserListener() {

        // Método para verificar si hay cambios respecto a la fecha original
        // Se agrega un listener que detecta la seleccion de fecha
        // Se compara la fecha original con la nueva
        // Se activa el botón "aplicar" si las fechas son distintas
        jDateChooser1.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent pce) {
                if ("date".equals(pce.getPropertyName())) {
                    Date nuevaFecha = (Date) pce.getNewValue();
                    if (!fechaOriginal.equals(nuevaFecha)) {
                        jbAplicar.setEnabled(true);
                    }
                }
            }
        });
    }

}
