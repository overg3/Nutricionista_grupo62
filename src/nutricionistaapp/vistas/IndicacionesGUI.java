package nutricionistaapp.vistas;

import java.awt.Dimension;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import nutricionistaapp.accesoDatos.AntecedenteData;
import nutricionistaapp.accesoDatos.ComidaData;
import nutricionistaapp.accesoDatos.DietaData;
import nutricionistaapp.accesoDatos.IndicacionData;
import nutricionistaapp.categorias.AntecedenteTipo;
import nutricionistaapp.categorias.ComidaTipo;
import nutricionistaapp.entidades.Antecedente;
import nutricionistaapp.entidades.Comida;
import nutricionistaapp.entidades.Dieta;
import nutricionistaapp.entidades.Indicacion;
import nutricionistaapp.entidades.Paciente;

public class IndicacionesGUI extends javax.swing.JInternalFrame {

    private DefaultTableModel tableModelAlimentos;
    private DefaultTableModel tableModelIndicaciones;
    private List<Comida> listaComidas;

    public IndicacionesGUI(Dimension size) {
        initComponents();

        centrarVentana(size);
        setListaDietasComboModel();
        setListaTiposAlimentosComboModel();
        setInfo();
        setTableModelAlimentos();
        setTableModelIndicaciones();
        setSelectionListeners();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jpInfoDieta = new javax.swing.JPanel();
        jlDNI = new javax.swing.JLabel();
        jlNombrePaciente = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlstAntecedentes = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jlPesoInicial = new javax.swing.JLabel();
        jlPesoObjetivo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jbCancelar = new javax.swing.JButton();
        jpSeleccionDieta = new javax.swing.JPanel();
        jcbDietas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jlPesoActual = new javax.swing.JLabel();
        jlAltura = new javax.swing.JLabel();
        jpAlimentos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlimentos = new javax.swing.JTable();
        jpIndicaciones = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtIndicaciones = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbAgregar = new javax.swing.JButton();
        jbQuitar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbFiltroAlimentos = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jtfNombreFiltro = new javax.swing.JTextField();

        setClosable(true);
        setTitle(" Gestor de indicaciones");

        jlDNI.setText("DNI: 33834768");

        jlNombrePaciente.setText("Maria Pepe");

        jScrollPane4.setViewportView(jlstAntecedentes);

        jLabel4.setText("Antecedentes clínicos:");

        jlPesoInicial.setText("Peso inicial: 125 kg");

        jlPesoObjetivo.setText("Peso objetivo: 95 kg");

        jbCancelar.setText("Cerrar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelar)
                .addContainerGap())
        );

        jpSeleccionDieta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), " Seleccione una dieta ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jcbDietas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbDietasItemStateChanged(evt);
            }
        });

        jButton1.setText("Buscar Dieta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSeleccionDietaLayout = new javax.swing.GroupLayout(jpSeleccionDieta);
        jpSeleccionDieta.setLayout(jpSeleccionDietaLayout);
        jpSeleccionDietaLayout.setHorizontalGroup(
            jpSeleccionDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSeleccionDietaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSeleccionDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbDietas, 0, 321, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSeleccionDietaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jpSeleccionDietaLayout.setVerticalGroup(
            jpSeleccionDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSeleccionDietaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbDietas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jlPesoActual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlPesoActual.setText("Peso actual: 90 kg");

        jlAltura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlAltura.setText("Altura: 190cm");

        javax.swing.GroupLayout jpInfoDietaLayout = new javax.swing.GroupLayout(jpInfoDieta);
        jpInfoDieta.setLayout(jpInfoDietaLayout);
        jpInfoDietaLayout.setHorizontalGroup(
            jpInfoDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoDietaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInfoDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addGroup(jpInfoDietaLayout.createSequentialGroup()
                        .addGroup(jpInfoDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlPesoInicial)
                            .addComponent(jlPesoObjetivo)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpInfoDietaLayout.createSequentialGroup()
                        .addComponent(jlDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlPesoActual))
                    .addGroup(jpInfoDietaLayout.createSequentialGroup()
                        .addComponent(jlNombrePaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlAltura)))
                .addContainerGap())
            .addComponent(jpSeleccionDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpInfoDietaLayout.setVerticalGroup(
            jpInfoDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoDietaLayout.createSequentialGroup()
                .addComponent(jpSeleccionDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpInfoDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDNI)
                    .addComponent(jlPesoActual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpInfoDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombrePaciente)
                    .addComponent(jlAltura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jlPesoInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPesoObjetivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpAlimentos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), " Comidas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jtAlimentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtAlimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtAlimentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtAlimentos);

        javax.swing.GroupLayout jpAlimentosLayout = new javax.swing.GroupLayout(jpAlimentos);
        jpAlimentos.setLayout(jpAlimentosLayout);
        jpAlimentosLayout.setHorizontalGroup(
            jpAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAlimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpAlimentosLayout.setVerticalGroup(
            jpAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpIndicaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), " Indicaciones ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jpIndicaciones.setPreferredSize(new java.awt.Dimension(30, 202));

        jtIndicaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jtIndicaciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jtIndicaciones);

        javax.swing.GroupLayout jpIndicacionesLayout = new javax.swing.GroupLayout(jpIndicaciones);
        jpIndicaciones.setLayout(jpIndicacionesLayout);
        jpIndicacionesLayout.setHorizontalGroup(
            jpIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIndicacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpIndicacionesLayout.setVerticalGroup(
            jpIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIndicacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        jbAgregar.setText("Agregar");
        jbAgregar.setEnabled(false);
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbQuitar.setText("Quitar");
        jbQuitar.setEnabled(false);
        jbQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbQuitar)
                .addGap(125, 125, 125))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbQuitar))
                .addContainerGap())
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Filtrar por tipo:");

        jcbFiltroAlimentos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbFiltroAlimentosItemStateChanged(evt);
            }
        });

        jLabel1.setText("Filtrar por alimento:");

        jtfNombreFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreFiltroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpInfoDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpAlimentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpIndicaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNombreFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbFiltroAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpInfoDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jpAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcbFiltroAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jtfNombreFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jpIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbDietasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbDietasItemStateChanged

        setInfo();
        setTableModelIndicaciones();

    }//GEN-LAST:event_jcbDietasItemStateChanged

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed

        String nombreComida = (String) jtAlimentos.getValueAt(jtAlimentos.getSelectedRow(), 0);
        Comida comida = ComidaData.buscarComidaNombre(nombreComida);
        Dieta dieta = (Dieta) jcbDietas.getSelectedItem();

        IndicacionesAgregarGUI nuevaIndicacion
                = new IndicacionesAgregarGUI(null, true, comida, dieta, jtIndicaciones);
        nuevaIndicacion.setVisible(true);

    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro?",
                " Borrar Indicación", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (respuesta == 0) {
            quitarIndicacion();
        }

    }//GEN-LAST:event_jbQuitarActionPerformed

    private void jcbFiltroAlimentosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbFiltroAlimentosItemStateChanged

        jtfNombreFiltro.setText("");
        ComidaTipo tipo = (ComidaTipo) jcbFiltroAlimentos.getSelectedItem();
        DefaultTableModel tableModel = (DefaultTableModel) jtAlimentos.getModel();

        // Se pasa el tipo y el modelo de tabla por parametro 
        filtrarComidasPorTipo(tipo, tableModel);

    }//GEN-LAST:event_jcbFiltroAlimentosItemStateChanged

    private void jtfNombreFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreFiltroKeyReleased

        jcbFiltroAlimentos.setSelectedIndex(0);
        String nombre = jtfNombreFiltro.getText().trim().toLowerCase();
        DefaultTableModel tableModel = (DefaultTableModel) jtAlimentos.getModel();

        // Se pasa el nombre de la comida y el modelo de tabla por parametro
        filtrarComidasPorNombre(nombre, tableModel);

    }//GEN-LAST:event_jtfNombreFiltroKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        IndicacionesSearchGUI busquedaVentana = new IndicacionesSearchGUI(null, true, jcbDietas);
        busquedaVentana.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbQuitar;
    private javax.swing.JComboBox<Dieta> jcbDietas;
    private javax.swing.JComboBox jcbFiltroAlimentos;
    private javax.swing.JLabel jlAltura;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlNombrePaciente;
    private javax.swing.JLabel jlPesoActual;
    private javax.swing.JLabel jlPesoInicial;
    private javax.swing.JLabel jlPesoObjetivo;
    private javax.swing.JList jlstAntecedentes;
    private javax.swing.JPanel jpAlimentos;
    private javax.swing.JPanel jpIndicaciones;
    private javax.swing.JPanel jpInfoDieta;
    private javax.swing.JPanel jpSeleccionDieta;
    private javax.swing.JTable jtAlimentos;
    private javax.swing.JTable jtIndicaciones;
    private javax.swing.JTextField jtfNombreFiltro;
    // End of variables declaration//GEN-END:variables

    private void centrarVentana(Dimension size) {
        Dimension internalFrameSize = this.getSize();

        setLocation((size.width - internalFrameSize.width) / 2,
                (size.height - internalFrameSize.height) / 2);
    }

    private void setTableModelAlimentos() {

        listaComidas = null;

        // Instanciar nuevo modelo de tabla con celdas NO editables
        tableModelAlimentos = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int col) {
                return false;
            }
        };

        tableModelAlimentos.addColumn("Alimento");
        tableModelAlimentos.addColumn("Tipo");
        tableModelAlimentos.addColumn("Calorías (kcal)");

        // Importar la lista de alimentos de la base de datos 
        // y agregar las filas a la tabla
        listaComidas = ComidaData.listarAlimentos();

        for (Comida comida : listaComidas) {
            Object[] fila = {comida.getNombre(), comida.getTipo(),
                comida.getCalorias()};
            tableModelAlimentos.addRow(fila);
        }

        // Setear el modelo creado al componente JTable
        jtAlimentos.setModel(tableModelAlimentos);

    }

    private void setTableModelIndicaciones() {

        List<Indicacion> listaIndicaciones = null;

        // Instanciar nuevo modelo de tabla con celdas NO editables
        tableModelIndicaciones = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int col) {
                return false;
            }
        };

        tableModelIndicaciones.addColumn("ID");
        tableModelIndicaciones.addColumn("Horario");
        tableModelIndicaciones.addColumn("Comida");
        tableModelIndicaciones.addColumn("Porción (g)");

        // Importar la lista de indicaciones de la base de datos 
        // y agregar las filas a la tabla
        Dieta dieta = (Dieta) jcbDietas.getSelectedItem();
        int idDieta = dieta.getIdDieta();
        listaIndicaciones = IndicacionData.listarIndicaciones(idDieta);

        for (Indicacion indicacion : listaIndicaciones) {
            Object[] fila = {indicacion.getIdIndic(), indicacion.getHorario(),
                indicacion.getComida().getNombre(), indicacion.getPorcion()};
            tableModelIndicaciones.addRow(fila);
        }

        // Setear el modelo creado al componente JTable
        jtIndicaciones.setModel(tableModelIndicaciones);

    }

    private void setListaDietasComboModel() {

        DefaultComboBoxModel<Dieta> defaultComboBoxModel = new DefaultComboBoxModel<>();
        List<Dieta> listaDietas = DietaData.listarDietas();

        for (Dieta dieta : listaDietas) {
            defaultComboBoxModel.addElement(dieta);
        }

        jcbDietas.setModel(defaultComboBoxModel);

    }

    private void setInfo() {

        Dieta dieta = (Dieta) jcbDietas.getSelectedItem();
        Paciente paciente = dieta.getPaciente();
        int idPaciente = dieta.getPaciente().getIdPaciente();

        jlDNI.setText("DNI: " + paciente.getDni());
        jlNombrePaciente.setText(paciente.getNombre() + " " + paciente.getApellido());
        jlPesoInicial.setText("Peso inicial: " + dieta.getPesoInicial());
        jlPesoObjetivo.setText("Peso objetivo: " + dieta.getPesoFinal());
        jlAltura.setText("Altura: " + paciente.getAltura() + " cm");
        jlPesoActual.setText("Peso actual: " + paciente.getPesoActual() + " kg");
        jlstAntecedentes.setModel(getListModel(idPaciente));

    }

    private DefaultListModel<AntecedenteTipo> getListModel(int idPaciente) {

        DefaultListModel<AntecedenteTipo> listModel = new DefaultListModel<>();
        List<Antecedente> listaAntecedentes = AntecedenteData.listarAntecedentesIDPaciente(idPaciente);

        // Recorrer los antecedentes y agregar los valores enum al modelo de lista
        for (Antecedente antecedente : listaAntecedentes) {
            listModel.addElement(antecedente.getAntecendete());
        }
        return listModel;
    }

    private void setListaTiposAlimentosComboModel() {

        DefaultComboBoxModel<ComidaTipo> comboBoxModel = new DefaultComboBoxModel<>();

        comboBoxModel.addElement(null);

        for (ComidaTipo value : ComidaTipo.values()) {
            comboBoxModel.addElement(value);
        }
        jcbFiltroAlimentos.setModel(comboBoxModel);
    }

    private void quitarIndicacion() {
        int fila = jtIndicaciones.getSelectedRow();
        int idIndic = (int) jtIndicaciones.getValueAt(fila, 0);

        IndicacionData.bajaIndicacion(idIndic);

        DefaultTableModel tableModel = (DefaultTableModel) jtIndicaciones.getModel();
        tableModel.removeRow(fila);
    }

    private void filtrarComidasPorTipo(ComidaTipo tipo, DefaultTableModel tableModel) {

        // Se borran las filas de la tabla de comidas
        tableModel.setRowCount(0);

        // Si el tipo está vacío se rellenan las filas con todas las comidas
        // Sino se agregan las comidas que coincidan con el tipo seleccionado
        if (tipo == null) {
            for (Comida comida : listaComidas) {
                Object[] fila = {comida.getNombre(), comida.getTipo(),
                    comida.getCalorias()};
                tableModel.addRow(fila);
            }
        } else {
            for (Comida comida : listaComidas) {
                if (comida.getTipo().equals(tipo)) {
                    Object[] fila = {comida.getNombre(), comida.getTipo(),
                        comida.getCalorias()};
                    tableModel.addRow(fila);
                }
            }
        }
    }

    private void filtrarComidasPorNombre(String nombre, DefaultTableModel tableModel) {

        // Se eliminan todas filas de la tabla
        tableModel.setRowCount(0);

        // Se recorre la lista de comidas y se agregan a la tabla si el nombre
        // de la comida coincide
        for (Comida comida : listaComidas) {
            if (comida.getNombre().toLowerCase().startsWith(nombre)) {
                Object[] fila = {comida.getNombre(), comida.getTipo(),
                    comida.getCalorias()};
                tableModel.addRow(fila);
            }
        }
    }

    private void setSelectionListeners() {

        ListSelectionModel selectionModelIndicaciones = jtIndicaciones.getSelectionModel();
        ListSelectionModel selectionModelComidas = jtAlimentos.getSelectionModel();

        // Listeners que controlan si hay una fila seleccionada
        selectionModelIndicaciones.addListSelectionListener((ListSelectionEvent lse) -> {
            if (!lse.getValueIsAdjusting()) {

                if (jtIndicaciones.getSelectedRow() == -1) {
                    jbQuitar.setEnabled(false);
                } else {
                    jbQuitar.setEnabled(true);
                }
            }
        });
        selectionModelComidas.addListSelectionListener((ListSelectionEvent lse) -> {
            if (!lse.getValueIsAdjusting()) {

                if (jtAlimentos.getSelectedRow() == -1) {
                    jbAgregar.setEnabled(false);
                } else {
                    jbAgregar.setEnabled(true);
                }
            }
        });
    }

}
