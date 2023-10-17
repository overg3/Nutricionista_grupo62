package nutricionistaapp.vistas;

import java.text.Normalizer;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import nutricionistaapp.accesoDatos.PacienteData;
import nutricionistaapp.entidades.Paciente;

public class CrearDietaPacienteGUI extends javax.swing.JDialog {

    private DefaultTableModel modeloTabla;
    private CrearDietaGUI frame;
    private List<Paciente> listaPacientes;

    public CrearDietaPacienteGUI(java.awt.Frame parent, boolean modal,
            CrearDietaGUI frame) {
        super(parent, modal);
        initComponents();

        this.frame = frame;
        crearNuevoModeloTabla();
        setSelectionListener();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jbSeleccionar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbQuitarFiltro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfApellido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfDNI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Selección de paciente");
        setResizable(false);

        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtPacientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtPacientes);

        jbSeleccionar.setText("Seleccionar Paciente");
        jbSeleccionar.setEnabled(false);
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbQuitarFiltro.setText("Quitar Filtros");
        jbQuitarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitarFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jbQuitarFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jbSeleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSeleccionar)
                    .addComponent(jbCancelar)
                    .addComponent(jbQuitarFiltro))
                .addContainerGap())
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Filtrar por nombre:");

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreKeyReleased(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Filtrar por apellido:");

        jtfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfApellidoKeyReleased(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Filtrar lista por criterios");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Filtrar por DNI:");

        jtfDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDNIKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtfApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                            .addComponent(jtfDNI)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbQuitarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarFiltroActionPerformed

        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfDNI.setText("");
        jbSeleccionar.setEnabled(false);

        filtrarLista();

    }//GEN-LAST:event_jbQuitarFiltroActionPerformed

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed

        seleccionarPaciente();
        dispose();

    }//GEN-LAST:event_jbSeleccionarActionPerformed

    private void jtfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyReleased

        filtrarLista();

    }//GEN-LAST:event_jtfNombreKeyReleased

    private void jtfApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoKeyReleased

        filtrarLista();

    }//GEN-LAST:event_jtfApellidoKeyReleased

    private void jtfDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDNIKeyReleased

        filtrarLista();

    }//GEN-LAST:event_jtfDNIKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbQuitarFiltro;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables

    private void crearNuevoModeloTabla() {

        listaPacientes = null;

        // Instanciar nuevo modelo de tabla con celdas NO editables
        modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int col) {
                return false;
            }
        };

        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Peso Actual");

        // Importar la lista de pacientes de la base de datos 
        // y agregar las filas a la tabla
        listaPacientes = PacienteData.listarPacientes();

        for (Paciente paciente : listaPacientes) {
            Object[] fila = {paciente.getDni(), paciente.getNombre(),
                paciente.getApellido(), paciente.getPesoActual()};
            modeloTabla.addRow(fila);
        }

        // Setear el modelo creado al componente JTable
        jtPacientes.setModel(modeloTabla);

    }

    private void filtrarLista() {

        limpiarTabla();

        // Se guardan los valores de los criterios de búsqueda (sin acentos)
        String critNombre = quitarAcentos(jtfNombre.getText().trim().toLowerCase());
        String critApellido = quitarAcentos(jtfApellido.getText().trim().toLowerCase());
        String critDni = jtfDNI.getText().trim();

        // Se recorre la lista de pacientes
        for (Paciente paciente : listaPacientes) {

            // Por cada paciente en la lista se guarda el nombre, apellido (sin acentos) y dni
            String nombre = quitarAcentos(paciente.getNombre().trim().toLowerCase());
            String apellido = quitarAcentos(paciente.getApellido().trim().toLowerCase());
            String dni = paciente.getDni().trim();

            // Por cada valor que coincide con los criterios de búsqueda se agrega
            // el paciente a la fila de la tabla
            //
            if (nombre.startsWith(critNombre) && apellido.startsWith(critApellido)
                    && dni.startsWith(critDni)) {

                Object[] fila = {paciente.getDni(), paciente.getNombre(),
                    paciente.getApellido(), paciente.getPesoActual()};
                modeloTabla.addRow(fila);

            }
        }
    }

    private void limpiarTabla() {
        modeloTabla.setRowCount(0);
    }

    private void seleccionarPaciente() {

        Paciente paciente = null;
        int fila = jtPacientes.getSelectedRow();

        if (fila != -1) {
            String dni = (String) jtPacientes.getValueAt(fila, 0);
            paciente = PacienteData.buscarPacienteDNI(dni);
            frame.setPaciente(paciente);
            frame.getJlPacienteInfo().setText(paciente.getNombre() + " "
                    + paciente.getApellido());
            frame.getJlGenero().setText("Género: " + paciente.getGenero());
            frame.getJlAltura().setText("Altura: " + paciente.getAltura() / 100 + " m");
            frame.getJlPesoActual().setText("Peso actual: " + paciente.getPesoActual() + " kg");
            frame.getJlPesoDeseado().setText("Peso deseado: " + paciente.getPesoDeseado() + " kg");
            double pesoActual = paciente.getPesoActual();
            double altura = paciente.getAltura() / 100;
            double imc = pesoActual / (altura * altura);
            frame.getJlIMC().setText("IMC: " + (float) imc);
        }
    }

    private String quitarAcentos(String cadena) {
        // Normalizer se usa para normalizar texto, en este caso para quitar acentos
        // Se retorna la cadena con los caracteres diacriticos (acentos) reemplazados por cadenas vacías 
        String cadenaNormalizada = Normalizer.normalize(cadena, Normalizer.Form.NFD);
        return cadenaNormalizada.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    private void setSelectionListener() {

        ListSelectionModel selectionModel = jtPacientes.getSelectionModel();

        // Listener que controla si hay una fila seleccionada
        selectionModel.addListSelectionListener((ListSelectionEvent lse) -> {
            if (!lse.getValueIsAdjusting()) {

                if (jtPacientes.getSelectedRow() == -1) {
                    jbSeleccionar.setEnabled(false);
                } else {
                    jbSeleccionar.setEnabled(true);
                }
            }
        });
    }

}
