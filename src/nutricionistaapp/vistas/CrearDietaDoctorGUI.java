package nutricionistaapp.vistas;

import java.awt.Color;
import java.text.Normalizer;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import nutricionistaapp.accesoDatos.ProfesionalData;
import nutricionistaapp.entidades.Profesional;

public class CrearDietaDoctorGUI extends javax.swing.JDialog {

    private DefaultTableModel modeloTabla;
    private JInternalFrame frame;
    private List<Profesional> listaProfesionales;

    public CrearDietaDoctorGUI(java.awt.Frame parent, boolean modal,
            JInternalFrame frame) {
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
        jtDoctores = new javax.swing.JTable();
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
        jtfMatricula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Selección de profesional");
        setResizable(false);

        jtDoctores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtDoctores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtDoctores);

        jbSeleccionar.setText("Seleccionar Profesional");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
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
        jLabel4.setText("Filtrar por matricula:");

        jtfMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfMatriculaKeyReleased(evt);
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
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jtfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
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
        jtfMatricula.setText("");

        filtrarLista();

    }//GEN-LAST:event_jbQuitarFiltroActionPerformed

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed

        seleccionarProfesional();
        dispose();

    }//GEN-LAST:event_jbSeleccionarActionPerformed

    private void jtfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyReleased

        filtrarLista();

    }//GEN-LAST:event_jtfNombreKeyReleased

    private void jtfApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoKeyReleased

        filtrarLista();

    }//GEN-LAST:event_jtfApellidoKeyReleased

    private void jtfMatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfMatriculaKeyReleased

        filtrarLista();

    }//GEN-LAST:event_jtfMatriculaKeyReleased


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
    private javax.swing.JTable jtDoctores;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfMatricula;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables

    private void crearNuevoModeloTabla() {

        listaProfesionales = null;

        // Instanciar nuevo modelo de tabla con celdas NO editables
        modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int col) {
                return false;
            }
        };

        modeloTabla.addColumn("Matrícula");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");

        // Importar la lista de pacientes de la base de datos 
        // y agregar las filas a la tabla
        listaProfesionales = ProfesionalData.listarProfesionales();

        for (Profesional profesional : listaProfesionales) {
            Object[] fila = {profesional.getMatricula(), profesional.getNombre(),
                profesional.getApellido()};
            modeloTabla.addRow(fila);
        }

        // Setear el modelo creado al componente JTable
        jtDoctores.setModel(modeloTabla);

    }

    private void filtrarLista() {

        limpiarTabla();

        // Se guardan los valores de los criterios de búsqueda (sin acentos)
        String critNombre = quitarAcentos(jtfNombre.getText().trim().toLowerCase());
        String critApellido = quitarAcentos(jtfApellido.getText().trim().toLowerCase());
        String critMatricula = jtfMatricula.getText().trim();

        // Se recorre la lista de profesionales
        for (Profesional profesional : listaProfesionales) {

            // Por cada profesional en la lista se guarda el nombre, apellido (sin acentos) y matricula
            String nombre = quitarAcentos(profesional.getNombre().trim().toLowerCase());
            String apellido = quitarAcentos(profesional.getApellido().trim().toLowerCase());
            String matricula = profesional.getMatricula().trim();

            // Por cada valor que coincide con los criterios de búsqueda se agrega
            // el profesional a la fila de la tabla
            //
            if (nombre.startsWith(critNombre) && apellido.startsWith(critApellido)
                    && matricula.startsWith(critMatricula)) {

                Object[] fila = {profesional.getMatricula(), profesional.getNombre(),
                    profesional.getApellido()};
                modeloTabla.addRow(fila);

            }
        }
    }

    private void limpiarTabla() {
        modeloTabla.setRowCount(0);
    }

    private void seleccionarProfesional() {

        CrearDietaGUI frame1 = null;
        ModificarDietaGUI frame2 = null;

        if (frame instanceof CrearDietaGUI) {
            frame1 = (CrearDietaGUI) frame;
        } else {
            frame2 = (ModificarDietaGUI) frame;
        }

        Profesional profesional = null;
        int fila = jtDoctores.getSelectedRow();

        if (fila != -1 && frame1 != null) {
            
            String matricula = (String) jtDoctores.getValueAt(fila, 0);
            profesional = ProfesionalData.buscarProfesionalMatricula(matricula);
            frame1.setDoctor(profesional);
            frame1.getJlDoctorInfo().setText(profesional.getNombre() + " "
                    + profesional.getApellido());
            frame1.getJlMatricula().setText("Matrícula: " + profesional.getMatricula());
            frame1.getJlDoctorInfo().setForeground(new Color(34, 135, 59));

        } else if (fila != -1 && frame2 != null) {
            
            String matricula = (String) jtDoctores.getValueAt(fila, 0);
            profesional = ProfesionalData.buscarProfesionalMatricula(matricula);
            frame2.setDoctor(profesional);
            frame2.getJlDoctorInfo().setText(profesional.getNombre() + " "
                    + profesional.getApellido());
            frame2.getJlMatricula().setText("Matrícula: " + profesional.getMatricula());
            frame2.verificarCambios();
        }
    }

    private String quitarAcentos(String cadena) {
        // Normalizer se usa para normalizar texto, en este caso para quitar acentos
        // Se retorna la cadena con los caracteres diacriticos (acentos) reemplazados por cadenas vacías 
        String cadenaNormalizada = Normalizer.normalize(cadena, Normalizer.Form.NFD);
        return cadenaNormalizada.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    private void setSelectionListener() {

        ListSelectionModel selectionModel = jtDoctores.getSelectionModel();

        // Listener que controla si hay una fila seleccionada
        selectionModel.addListSelectionListener((ListSelectionEvent lse) -> {
            if (!lse.getValueIsAdjusting()) {

                if (jtDoctores.getSelectedRow() == -1) {
                    jbSeleccionar.setEnabled(false);
                } else {
                    jbSeleccionar.setEnabled(true);
                }
            }
        });
    }

}
