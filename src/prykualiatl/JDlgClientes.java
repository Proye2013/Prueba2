package prykualiatl;
import elaprendiz.bdmodel.Cliente;
import elaprendiz.modelgui.ModeloTablaCliente;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableModel;

public class JDlgClientes extends javax.swing.JDialog
{
    public String operacion;
    public String opera;   
    private ModeloTablaCliente mtc;
    private Cliente seleccionado;
  
    public JDlgClientes(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        mtc = new ModeloTablaCliente();
        initComponents();
        operacion="GUARDAR";
        opera="EDITAR";
        jTextField1.setVisible(false);
        setLocationRelativeTo(null);
        //Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);
             JTblClientes.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            JTblClientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            this.jLabel1.setVisible(false);
            this.JTxtBuscar.setVisible(false);          

     }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        JBtnNuevo = new javax.swing.JButton();
        JBtnEditar = new javax.swing.JButton();
        JBtnEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JTBtnBuscar = new javax.swing.JToggleButton();
        JBtnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTblClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTxtBuscar = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(prykualiatl.PryKualiAtlApp.class).getContext().getResourceMap(JDlgClientes.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N
        jToolBar1.setNextFocusableComponent(JBtnNuevo);

        JBtnNuevo.setFont(resourceMap.getFont("JBtnEliminar.font")); // NOI18N
        JBtnNuevo.setIcon(resourceMap.getIcon("JBtnNuevo.icon")); // NOI18N
        JBtnNuevo.setText(resourceMap.getString("JBtnNuevo.text")); // NOI18N
        JBtnNuevo.setToolTipText(resourceMap.getString("JBtnNuevo.toolTipText")); // NOI18N
        JBtnNuevo.setFocusable(false);
        JBtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnNuevo.setName("JBtnNuevo"); // NOI18N
        JBtnNuevo.setNextFocusableComponent(JBtnEditar);
        JBtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtnNuevoMouseClicked(evt);
            }
        });
        JBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(JBtnNuevo);

        JBtnEditar.setFont(resourceMap.getFont("JBtnEditar.font")); // NOI18N
        JBtnEditar.setIcon(resourceMap.getIcon("JBtnEditar.icon")); // NOI18N
        JBtnEditar.setText(resourceMap.getString("JBtnEditar.text")); // NOI18N
        JBtnEditar.setToolTipText(resourceMap.getString("JBtnEditar.toolTipText")); // NOI18N
        JBtnEditar.setFocusable(false);
        JBtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnEditar.setName("JBtnEditar"); // NOI18N
        JBtnEditar.setNextFocusableComponent(JBtnEliminar);
        JBtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtnEditarMouseClicked(evt);
            }
        });
        JBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(JBtnEditar);

        JBtnEliminar.setFont(resourceMap.getFont("JBtnEliminar.font")); // NOI18N
        JBtnEliminar.setIcon(resourceMap.getIcon("JBtnEliminar.icon")); // NOI18N
        JBtnEliminar.setText(resourceMap.getString("JBtnEliminar.text")); // NOI18N
        JBtnEliminar.setToolTipText(resourceMap.getString("JBtnEliminar.toolTipText")); // NOI18N
        JBtnEliminar.setFocusable(false);
        JBtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnEliminar.setName("JBtnEliminar"); // NOI18N
        JBtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(JBtnEliminar);

        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setIcon(resourceMap.getIcon("jButton1.icon")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setToolTipText(resourceMap.getString("jButton1.toolTipText")); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setName("jButton1"); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        JTBtnBuscar.setFont(resourceMap.getFont("JTBtnBuscar.font")); // NOI18N
        JTBtnBuscar.setIcon(resourceMap.getIcon("JTBtnBuscar.icon")); // NOI18N
        JTBtnBuscar.setText(resourceMap.getString("JTBtnBuscar.text")); // NOI18N
        JTBtnBuscar.setToolTipText(resourceMap.getString("JTBtnBuscar.toolTipText")); // NOI18N
        JTBtnBuscar.setFocusPainted(false);
        JTBtnBuscar.setFocusable(false);
        JTBtnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JTBtnBuscar.setName("JTBtnBuscar"); // NOI18N
        JTBtnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JTBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTBtnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(JTBtnBuscar);

        JBtnSalir.setFont(resourceMap.getFont("JBtnEliminar.font")); // NOI18N
        JBtnSalir.setIcon(resourceMap.getIcon("JBtnSalir.icon")); // NOI18N
        JBtnSalir.setText(resourceMap.getString("JBtnSalir.text")); // NOI18N
        JBtnSalir.setToolTipText(resourceMap.getString("JBtnSalir.toolTipText")); // NOI18N
        JBtnSalir.setFocusable(false);
        JBtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnSalir.setName("JBtnSalir"); // NOI18N
        JBtnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(JBtnSalir);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        JTblClientes.setFont(resourceMap.getFont("JTblClientes.font")); // NOI18N
        JTblClientes.setModel(mtc);
        JTblClientes.setName("JTblClientes"); // NOI18N
        JTblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTblClientes);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        JTxtBuscar.setFont(resourceMap.getFont("JTxtBuscar.font")); // NOI18N
        JTxtBuscar.setText(resourceMap.getString("JTxtBuscar.text")); // NOI18N
        JTxtBuscar.setName("JTxtBuscar"); // NOI18N
        JTxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtBuscarKeyTyped(evt);
            }
        });

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBtnSalirActionPerformed

    private void JBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnNuevoActionPerformed
      jTextField1.setText(operacion);
        JDlgRegCliente cliente=new JDlgRegCliente(null,true);
        cliente.mostrar1(operacion);
        cliente.setVisible(true);
    }//GEN-LAST:event_JBtnNuevoActionPerformed

    private void JTblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTblClientesMouseClicked
  seleccionado = mtc.getFila(JTblClientes.getSelectedRow());       
    }//GEN-LAST:event_JTblClientesMouseClicked

    private void JBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnEditarActionPerformed

        try
           {
             jTextField1.setText(opera);
        JDlgRegCliente c=new JDlgRegCliente(null,true);
        //c.mostrar(clv,cuenta,nom,dire,tele,rf,col,comu,muni,codigo,tari,fecha);
        //c.mostrar(cuenta,nom,dire,tele,rf,col,comu,muni,codigo,tari,fecha);
        c.mostrar(seleccionado);
        c.mostrar1(opera);
       c.setVisible(true);
        }catch (Exception ex)
         {
        JOptionPane.showMessageDialog( null, "PARA PODER EDITAR UN REGISTRO,\nPRIMERO DEBE SELECCIONAR UNA FILA DE LA TABLA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_JBtnEditarActionPerformed

    private void JBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnEliminarActionPerformed
       
        try
           {        
            try{              
               mtc.borrarFila(JTblClientes.getSelectedRow());
            }catch (Exception ex)
            {
                    JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR ELIMINAR LOS DATOS DE LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
            }    
        }catch (Exception ex)
         {
            JOptionPane.showMessageDialog( null, "PARA PODER ELIMINAR UN REGISTRO,\nPRIMERO DEBE SELECCIONAR UNA FILA DE LA TABLA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_JBtnEliminarActionPerformed

    private void JTBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTBtnBuscarActionPerformed
       if(this.JTBtnBuscar.isSelected())
        {
            this.jLabel1.setVisible(true);
            this.JTxtBuscar.setVisible(true);
            this.JTxtBuscar.requestFocus();
        }
        else
        {
            this.jLabel1.setVisible(false);
            this.JTxtBuscar.setVisible(false);
            this.JTxtBuscar.setText("");
        }
    }//GEN-LAST:event_JTBtnBuscarActionPerformed

    private void JTxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtBuscarKeyTyped
        getJTxtBuscar();
    }//GEN-LAST:event_JTxtBuscarKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mtc = new ModeloTablaCliente();
        JTblClientes.setModel(mtc);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBtnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnNuevoMouseClicked
     
    }//GEN-LAST:event_JBtnNuevoMouseClicked

    private void JBtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnEditarMouseClicked
       
    }//GEN-LAST:event_JBtnEditarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgClientes dialog = new JDlgClientes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnEditar;
    private javax.swing.JButton JBtnEliminar;
    private javax.swing.JButton JBtnNuevo;
    private javax.swing.JButton JBtnSalir;
    private javax.swing.JToggleButton JTBtnBuscar;
    private javax.swing.JTable JTblClientes;
    private javax.swing.JTextField JTxtBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getJTxtBuscar() 
    {
        if (!JTxtBuscar.getText().isEmpty())
        {
            //JTxtBuscar.
            JTxtBuscar.addKeyListener(new java.awt.event.KeyAdapter()
            {
                @Override
                public void keyTyped(java.awt.event.KeyEvent e)
                {
                    final TableRowSorter<TableModel> sorter =new TableRowSorter<TableModel>(JTblClientes.getModel());
                    JTblClientes.setRowSorter(sorter);
                    String nombre = JTxtBuscar.getText();
                    if (nombre.length() == 0)
                    {
                       sorter.setRowFilter(null);
                    }
                    else
                    {
                        try
                        {
                            sorter.setRowFilter(RowFilter.regexFilter("^" + nombre, 1));
                        }
                        catch (Exception ex)
                        {
                            JOptionPane.showMessageDialog( null, "NO EXISTEN DATOS QUE COINCIDAN\nCON LAS PALABRAS ESCRITAS", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                   }
                }
            });
       }
        return JTxtBuscar;
    }

    public void setJTxtBuscar(javax.swing.JTextField JTxtBuscar)
    {
        this.JTxtBuscar = JTxtBuscar;
    }
}

