package prykualiatl;
import elaprendiz.bdmodel.Pago;
import elaprendiz.modelgui.ModeloTablaPago;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class JDlgPagos extends javax.swing.JDialog
{
    public String clvfolio,clvcliente,nocuenta,nombre,dire,fecharegistros;
    public String rfc,colonia,muni;
    public String fechacubierta,mesestranscurridos,fechadepago,rezago,pagocalculado,recargo,total,tel,tari;
     public String operacion;
    public String opera;
    private ModeloTablaPago mtp;
    private Pago seleccionado;

    public JDlgPagos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        mtp = new ModeloTablaPago();
        initComponents();
         JTblPagos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
           JTblPagos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
           this.jLabel1.setVisible(false);
            this.JTxtBuscar.setVisible(false);
            jTextField1.setVisible(false);
              operacion="GUARDAR";
        opera="EDITAR";
        //db.Conectar();
            //muestra();
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);
    }
     public void muestra()
    {
        contenido = db.Consultar("SELECT tblpago.ClvFolio,tblcliente.Nombre,tblcliente.Direccion,tblcliente.Telefono,tblcliente.Colonia,tblcliente.Municipio,tblcliente.Rfc,tblcliente.Tarifa,tblpago.NoCuenta,tblpago.FechaCubierta,tblpago.MesesTranscurridos,tblpago.FechaDePago,tblpago.Rezago,tblpago.PagoCalculado,tblpago.Recargo,tblpago.Total,tblpago.FechaDeRegistro FROM tblcliente,tblpago where tblpago.NoCuenta=tblcliente.NoCuenta");
        titulos = new String[17];
        titulos[0] ="ClvFolio";
      //  titulos[1] ="ClvCliente";
        titulos[1] ="Nombre";
        titulos[2] ="Direccion";
        titulos[3] ="Telefono";
        titulos[4] ="Colonia";
        titulos[5] ="Municipio";
        titulos[6] ="Rfc";
        titulos[7] ="Tarifa";
        titulos[8] ="NoCuenta";
        titulos[9] ="FechaCubierta";
        titulos[10] ="MesesTranscurridos";
        titulos[11] ="FechaDePago";
        titulos[12] ="Rezago";
        titulos[13] ="PagoCalculado";
        titulos[14] ="Recargo";
        titulos[15] ="Total";
        titulos[16] ="FechaDeRegistro";
        JTblPagos.setModel(new javax.swing.table.DefaultTableModel(contenido, titulos));
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
        JTblPagos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTxtBuscar = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(prykualiatl.PryKualiAtlApp.class).getContext().getResourceMap(JDlgPagos.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        JBtnNuevo.setFont(resourceMap.getFont("JBtnEliminar.font")); // NOI18N
        JBtnNuevo.setIcon(resourceMap.getIcon("JBtnNuevo.icon")); // NOI18N
        JBtnNuevo.setText(resourceMap.getString("JBtnNuevo.text")); // NOI18N
        JBtnNuevo.setToolTipText(resourceMap.getString("JBtnNuevo.toolTipText")); // NOI18N
        JBtnNuevo.setFocusable(false);
        JBtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnNuevo.setName("JBtnNuevo"); // NOI18N
        JBtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(JBtnNuevo);

        JBtnEditar.setFont(resourceMap.getFont("JBtnEliminar.font")); // NOI18N
        JBtnEditar.setIcon(resourceMap.getIcon("JBtnEditar.icon")); // NOI18N
        JBtnEditar.setText(resourceMap.getString("JBtnEditar.text")); // NOI18N
        JBtnEditar.setToolTipText(resourceMap.getString("JBtnEditar.toolTipText")); // NOI18N
        JBtnEditar.setFocusable(false);
        JBtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnEditar.setName("JBtnEditar"); // NOI18N
        JBtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        JTblPagos.setFont(resourceMap.getFont("JTblPagos.font")); // NOI18N
        JTblPagos.setModel(mtp);
        JTblPagos.setName("JTblPagos"); // NOI18N
        JTblPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTblPagosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTblPagos);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        JTxtBuscar.setFont(resourceMap.getFont("JTxtBuscar.font")); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))
                            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBtnSalirActionPerformed

    private void JBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnNuevoActionPerformed
        jTextField1.setText(operacion);
        JDlgRegPagos pagos=new JDlgRegPagos(null,true);
        pagos.mostrar1(operacion);
       pagos.setVisible(true); 
    }//GEN-LAST:event_JBtnNuevoActionPerformed

    private void JTblPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTblPagosMouseClicked
      seleccionado = mtp.getFila(JTblPagos.getSelectedRow());
  /*this.clvfolio= String.valueOf(contenido[JTblPagos.getSelectedRow()][0].toString());
 // this.clvcliente= String.valueOf(contenido[JTblPagos.getSelectedRow()][1].toString());
  this.nombre= String.valueOf(contenido[JTblPagos.getSelectedRow()][1].toString());
  this.dire= String.valueOf(contenido[JTblPagos.getSelectedRow()][2].toString());
  this.tel= String.valueOf(contenido[JTblPagos.getSelectedRow()][3].toString());
  this.colonia= String.valueOf(contenido[JTblPagos.getSelectedRow()][4].toString());
  this.muni= String.valueOf(contenido[JTblPagos.getSelectedRow()][5].toString());
  this.rfc= String.valueOf(contenido[JTblPagos.getSelectedRow()][6].toString());
  this.tari= String.valueOf(contenido[JTblPagos.getSelectedRow()][7].toString());
  this.nocuenta= String.valueOf(contenido[JTblPagos.getSelectedRow()][8].toString());
  this.fechacubierta= String.valueOf(contenido[JTblPagos.getSelectedRow()][9].toString());
  this.mesestranscurridos= String.valueOf(contenido[JTblPagos.getSelectedRow()][10].toString());
  this.fechadepago= String.valueOf(contenido[JTblPagos.getSelectedRow()][11].toString());
  this.rezago= String.valueOf(contenido[JTblPagos.getSelectedRow()][12].toString());
  this.pagocalculado= String.valueOf(contenido[JTblPagos.getSelectedRow()][13].toString());
  this.recargo= String.valueOf(contenido[JTblPagos.getSelectedRow()][14].toString());
  this.total= String.valueOf(contenido[JTblPagos.getSelectedRow()][15].toString());
  this.fecharegistros= String.valueOf(contenido[JTblPagos.getSelectedRow()][16].toString());*/
    }//GEN-LAST:event_JTblPagosMouseClicked

    private void JBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnEditarActionPerformed
        try
           {
               jTextField1.setText(opera);
        JDlgRegPagos c=new JDlgRegPagos(null,true);

        //c.mostrar(clvfolio,nombre,dire,tel,colonia,muni,rfc,tari,nocuenta,fechacubierta,mesestranscurridos,fechadepago,rezago,pagocalculado,recargo,total,fecharegistros);
        c.mostrar(seleccionado);
        c.mostrar1(opera);
       c.setVisible(true);
        }catch (Exception ex) {
                        
        JOptionPane.showMessageDialog( null, "PARA PODER EDITAR UN REGISTRO,\nPRIMERO DEBE SELECCIONAR UNA FILA DE LA TABLA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
                  }
    }//GEN-LAST:event_JBtnEditarActionPerformed

    private void JBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnEliminarActionPerformed
        
        try
           {        
           try{
               mtp.borrarFila(JTblPagos.getSelectedRow());
           }catch (Exception ex) {
             
                    JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR ELIMINAR LOS DATOS DE LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
                  }

        }catch (Exception ex) {
             
        JOptionPane.showMessageDialog( null, "PARA PODER ELIMINAR UN REGISTRO,\nPRIMERO DEBE SELECCIONAR UNA FILA DE LA TABLA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
                  }
    }//GEN-LAST:event_JBtnEliminarActionPerformed

    private void JTxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtBuscarKeyTyped
        getJTxtBuscar();
}//GEN-LAST:event_JTxtBuscarKeyTyped

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       mtp = new ModeloTablaPago();
       JTblPagos.setModel(mtp);
        //muestra();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgPagos dialog = new JDlgPagos(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable JTblPagos;
    private javax.swing.JTextField JTxtBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
private Object contenido [][];
     private String titulos[];
     bdDatos db = new bdDatos();

    public javax.swing.JTextField getJTxtBuscar()
    {
        if (JTxtBuscar.getText() != "")
        {
            JTxtBuscar.addKeyListener(new java.awt.event.KeyAdapter()
            {
                @Override
                public void keyTyped(java.awt.event.KeyEvent e)
                {
                    final TableRowSorter<TableModel> sorter =new TableRowSorter<TableModel>(JTblPagos.getModel());
                    JTblPagos.setRowSorter(sorter);
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

    public void setJTxtBuscar(javax.swing.JTextField JTxtBuscar) {
        this.JTxtBuscar = JTxtBuscar;
    }
}
