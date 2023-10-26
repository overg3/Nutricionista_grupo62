package nutricionistaapp.vistas;

import java.awt.Dimension;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import nutricionistaapp.accesoDatos.DietaData;
import nutricionistaapp.entidades.Dieta;
import nutricionistaapp.entidades.Paciente;
import nutricionistaapp.entidades.Profesional;

public class CrearDietaGUI extends javax.swing.JInternalFrame {

    private DefaultComboBoxModel<Dieta> dietaComboBoxModel;
    private Paciente paciente;
    private Profesional doctor;

    public CrearDietaGUI(Dimension size) {
        initComponents();

        centrarVentana(size);
        jDateChooser1.setMinSelectableDate(new Date());
        jDateChooser1.setDate(new Date());

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
        jLabel2 = new javax.swing.JLabel();
        jtfNombreDieta = new javax.swing.JTextField();
        jbSelectPaciente = new javax.swing.JButton();
        jbSelectDoctor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbCrearDieta = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
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

        setClosable(true);
        setTitle("Nueva Dieta");

        jLabel2.setText("Ingrese el nombre de la dieta:");

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

        jbCrearDieta.setText("Crear Dieta");
        jbCrearDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearDietaActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jbCrearDieta)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar)
                .addGap(87, 87, 87))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrearDieta)
                    .addComponent(jbCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlPacienteInfo.setForeground(new java.awt.Color(51, 51, 51));
        jlPacienteInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPacienteInfo.setText("Indique el paciente");
        jlPacienteInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlDoctorInfo.setForeground(new java.awt.Color(51, 51, 51));
        jlDoctorInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDoctorInfo.setText("Indique el profesional");
        jlDoctorInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Fecha de finalización:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfNombreDieta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
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
                            .addComponent(jlDoctorInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
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

    private void jbSelectDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelectDoctorActionPerformed

        CrearDietaDoctorGUI selectorDoctor = new CrearDietaDoctorGUI(null,
                true, this);
        selectorDoctor.setVisible(true);

    }//GEN-LAST:event_jbSelectDoctorActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSelectPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelectPacienteActionPerformed

        CrearDietaPacienteGUI selectorPaciente = new CrearDietaPacienteGUI(null,
                true, this);
        selectorPaciente.setVisible(true);

    }//GEN-LAST:event_jbSelectPacienteActionPerformed

    private void jbCrearDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearDietaActionPerformed

        int confirmacion = crearNuevaDieta();
        if (confirmacion == 1) {
            JOptionPane.showMessageDialog(this, "Dieta creada con éxito",
                    " Dieta creada", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }

    }//GEN-LAST:event_jbCrearDietaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCrearDieta;
    private javax.swing.JButton jbSelectDoctor;
    private javax.swing.JButton jbSelectPaciente;
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

    private LocalDate toLocalDate(Date date) {

        Instant instant = date.toInstant();
        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();

        return localDate;

    }

    private int crearNuevaDieta() {

        LocalDate fechaFinal = null;

        if (jtfNombreDieta.getText().trim().isEmpty() == false) {
            if (paciente != null && doctor != null) {

                try {
                    fechaFinal = toLocalDate(jDateChooser1.getDate());
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(this, "La fecha ingresada no es válida",
                            " Advertencia", JOptionPane.WARNING_MESSAGE);
                    return 0;
                }

                // Si todas las condiciones son correctas se procede a instanciar
                // una Dieta y se pasa a la base de datos
                Dieta dieta = new Dieta(jtfNombreDieta.getText(), doctor, paciente,
                        LocalDate.now(), fechaFinal, paciente.getPesoActual(),
                        paciente.getPesoDeseado(), true);

                DietaData.agregarDieta(dieta);
                return 1;

            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un paciente y/o profesional");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre de la dieta",
                    " Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
        return 0;
    }

}
