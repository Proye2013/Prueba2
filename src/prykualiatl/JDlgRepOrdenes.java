package prykualiatl;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTable;
import java.io.File;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
public class JDlgRepOrdenes extends javax.swing.JDialog {

     public String clvfolio,clvcliente,nocuenta,nombre,dire,fecharegistros;
    public String rfc,colonia,muni,noorden,fecha,tipo,inspector,tele;
    public String fechacubierta,mesestranscurridos,fechadepago,rezago,pagocalculado,recargo,total;

    public JDlgRepOrdenes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        JRbMostrarTodos.setSelected(false);
        jLabel4.setVisible(false);
        JTxtNoCliente.setVisible(false);
        JTblOrdenes.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
           JTblOrdenes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        db.Conectar();
        SimpleDateFormat dateformat=new SimpleDateFormat("yyyy/MM/dd");
        JDtChFechaDel.setDateFormat(dateformat);
        JDtChFechaAl.setDateFormat(dateformat);
          setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);
    }

public void muestra()
    {
        contenido = db.Consultar("SELECT tblorden.NoOrden,tblorden.Fecha,tblorden.Tipo,tblorden.Inspector,tblorden.NoCuenta,tblcliente.Nombre,tblcliente.Direccion,tblcliente.Colonia,tblcliente.Municipio,tblcliente.Telefono,tblcliente.Rfc FROM tblcliente,tblorden where tblorden.NoCuenta=tblcliente.NoCuenta and tblorden.Fecha between '"+ this.JTxtFechaDel.getText() +"' AND '"+ this.JTxtFechaAl.getText() +"'");
        titulos = new String[11];
        titulos[0] ="NoOrden";
        titulos[1] ="Fecha";
        titulos[2] ="Tipo";
        titulos[3] ="Inspector";
       // titulos[4] ="ClvCliente";
        titulos[4] ="NoCuenta";
        titulos[5] ="Nombre";
        titulos[6] ="Direccion";
        titulos[7] ="Colonia";
        titulos[8] ="Municipio";
        titulos[9] ="Telefono";
        titulos[10] ="Rfc";
        JTblOrdenes.setModel(new javax.swing.table.DefaultTableModel(contenido, titulos));
    }

public void muestra2()
    {
        contenido = db.Consultar("SELECT tblorden.NoOrden,tblorden.Fecha,tblorden.Tipo,tblorden.Inspector,tblorden.NoCuenta,tblcliente.Nombre,tblcliente.Direccion,tblcliente.Colonia,tblcliente.Municipio,tblcliente.Telefono,tblcliente.Rfc FROM tblcliente,tblorden where tblcliente.NoCuenta='"+ this.JTxtNoCliente.getText() +"' and tblorden.NoCuenta=tblcliente.NoCuenta and tblorden.Fecha between '"+ this.JTxtFechaDel.getText() +"' AND '"+ this.JTxtFechaAl.getText() +"'");
        titulos = new String[12];
        titulos[0] ="NoOrden";
        titulos[1] ="Fecha";
        titulos[2] ="Tipo";
        titulos[3] ="Inspector";
       // titulos[4] ="ClvCliente";
        titulos[4] ="NoCuenta";
        titulos[5] ="Nombre";
        titulos[6] ="Direccion";
        titulos[7] ="Colonia";
        titulos[8] ="Municipio";
        titulos[9] ="Telefono";
        titulos[10] ="Rfc";
        JTblOrdenes.setModel(new javax.swing.table.DefaultTableModel(contenido, titulos));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JDtChFechaDel = new datechooser.beans.DateChooserCombo();
        JDtChFechaAl = new datechooser.beans.DateChooserCombo();
        JTxtFechaDel = new javax.swing.JTextField();
        JTxtFechaAl = new javax.swing.JTextField();
        JBtnCancelar = new javax.swing.JButton();
        JBtnMostrar = new javax.swing.JButton();
        JBtnImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTblOrdenes = new javax.swing.JTable();
        JRbMostrarTodos = new javax.swing.JRadioButton();
        JRbMostrarPorCliente = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        JTxtNoCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(prykualiatl.PryKualiAtlApp.class).getContext().getResourceMap(JDlgRepOrdenes.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jLabel1.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        JDtChFechaDel.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaDelOnCommit(evt);
            }
        });

        JDtChFechaAl.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaAlOnCommit(evt);
            }
        });

        JTxtFechaDel.setFont(resourceMap.getFont("JTxtFechaAl.font")); // NOI18N
        JTxtFechaDel.setText(resourceMap.getString("JTxtFechaDel.text")); // NOI18N
        JTxtFechaDel.setEnabled(false);
        JTxtFechaDel.setName("JTxtFechaDel"); // NOI18N

        JTxtFechaAl.setFont(resourceMap.getFont("JTxtFechaAl.font")); // NOI18N
        JTxtFechaAl.setText(resourceMap.getString("JTxtFechaAl.text")); // NOI18N
        JTxtFechaAl.setEnabled(false);
        JTxtFechaAl.setName("JTxtFechaAl"); // NOI18N

        JBtnCancelar.setFont(resourceMap.getFont("JBtnCancelar.font")); // NOI18N
        JBtnCancelar.setIcon(resourceMap.getIcon("JBtnCancelar.icon")); // NOI18N
        JBtnCancelar.setText(resourceMap.getString("JBtnCancelar.text")); // NOI18N
        JBtnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnCancelar.setName("JBtnCancelar"); // NOI18N
        JBtnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnCancelarActionPerformed(evt);
            }
        });

        JBtnMostrar.setFont(resourceMap.getFont("JBtnCancelar.font")); // NOI18N
        JBtnMostrar.setIcon(resourceMap.getIcon("JBtnMostrar.icon")); // NOI18N
        JBtnMostrar.setText(resourceMap.getString("JBtnMostrar.text")); // NOI18N
        JBtnMostrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnMostrar.setName("JBtnMostrar"); // NOI18N
        JBtnMostrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnMostrarActionPerformed(evt);
            }
        });

        JBtnImprimir.setFont(resourceMap.getFont("JBtnImprimir.font")); // NOI18N
        JBtnImprimir.setIcon(resourceMap.getIcon("JBtnImprimir.icon")); // NOI18N
        JBtnImprimir.setText(resourceMap.getString("JBtnImprimir.text")); // NOI18N
        JBtnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnImprimir.setName("JBtnImprimir"); // NOI18N
        JBtnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnImprimirActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        JTblOrdenes.setModel(new javax.swing.table.DefaultTableModel(
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
        JTblOrdenes.setName("JTblOrdenes"); // NOI18N
        JTblOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTblOrdenesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTblOrdenes);

        buttonGroup1.add(JRbMostrarTodos);
        JRbMostrarTodos.setFont(resourceMap.getFont("JRbMostrarTodos.font")); // NOI18N
        JRbMostrarTodos.setSelected(true);
        JRbMostrarTodos.setText(resourceMap.getString("JRbMostrarTodos.text")); // NOI18N
        JRbMostrarTodos.setName("JRbMostrarTodos"); // NOI18N
        JRbMostrarTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JRbMostrarTodosMouseClicked(evt);
            }
        });

        buttonGroup1.add(JRbMostrarPorCliente);
        JRbMostrarPorCliente.setFont(resourceMap.getFont("JRbMostrarPorCliente.font")); // NOI18N
        JRbMostrarPorCliente.setText(resourceMap.getString("JRbMostrarPorCliente.text")); // NOI18N
        JRbMostrarPorCliente.setName("JRbMostrarPorCliente"); // NOI18N
        JRbMostrarPorCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JRbMostrarPorClienteMouseClicked(evt);
            }
        });

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        JTxtNoCliente.setFont(resourceMap.getFont("JTxtNoCliente.font")); // NOI18N
        JTxtNoCliente.setText(resourceMap.getString("JTxtNoCliente.text")); // NOI18N
        JTxtNoCliente.setName("JTxtNoCliente"); // NOI18N

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JRbMostrarTodos)
                                            .addComponent(JRbMostrarPorCliente))
                                        .addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(JTxtFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(JDtChFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(JTxtNoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(JTxtFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JDtChFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(JBtnMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBtnImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBtnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRbMostrarTodos)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRbMostrarPorCliente)
                    .addComponent(JTxtNoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTxtFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JDtChFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JDtChFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTxtFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBtnMostrar)
                    .addComponent(JBtnImprimir)
                    .addComponent(JBtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBtnCancelarActionPerformed

    private void JRbMostrarTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JRbMostrarTodosMouseClicked
        
        if(JRbMostrarTodos.isSelected())
        {
            jLabel4.setVisible(false);
            JTxtNoCliente.setVisible(false);
        }
    }//GEN-LAST:event_JRbMostrarTodosMouseClicked

    private void JRbMostrarPorClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JRbMostrarPorClienteMouseClicked
        
        if(JRbMostrarPorCliente.isSelected())
        {
            jLabel4.setVisible(true);
            JTxtNoCliente.setVisible(true);
        }
    }//GEN-LAST:event_JRbMostrarPorClienteMouseClicked

    private void JTblOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTblOrdenesMouseClicked
        
  this.noorden= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][0].toString());
  this.fecha= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][1].toString());
  this.tipo= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][2].toString());
  this.inspector= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][3].toString());
  //this.clvcliente= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][4].toString());
  this.nocuenta= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][4].toString());
  this.nombre= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][5].toString());
  this.dire= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][6].toString());
  this.colonia= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][7].toString());
  this.muni= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][8].toString());
  this.tele= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][9].toString());
  this.rfc= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][10].toString());
    }//GEN-LAST:event_JTblOrdenesMouseClicked

    private void JBtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnMostrarActionPerformed
       if(JRbMostrarTodos.isSelected())
        {
             muestra();
        }
         else
         {
             if(JRbMostrarPorCliente.isSelected())
             {
               muestra2();
             }
         }
    }//GEN-LAST:event_JBtnMostrarActionPerformed

    private void JDtChFechaDelOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_JDtChFechaDelOnCommit

        String []datos=JDtChFechaDel.getText().split("/");

        String Dia, Mes, Ano;

        Dia="";
        Mes="";
        Ano="";

        Ano=datos[0];
        Mes=datos[1];
        Dia=datos[2];

        JTxtFechaDel.setText(Ano+"-" + Mes + "-"+ Dia); //Caja de texto donde va la fecha extraida
    }//GEN-LAST:event_JDtChFechaDelOnCommit

    private void JDtChFechaAlOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_JDtChFechaAlOnCommit

        String []datos=JDtChFechaAl.getText().split("/");

        String Dia, Mes, Ano;

        Dia="";
        Mes="";
        Ano="";

        Ano=datos[0];
        Mes=datos[1];
        Dia=datos[2];

        JTxtFechaAl.setText(Ano+"-" + Mes + "-"+ Dia); //Caja de texto donde va la fecha extraida
    }//GEN-LAST:event_JDtChFechaAlOnCommit

    private void JBtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnImprimirActionPerformed

        ExcelTableExporter exportador=new ExcelTableExporter(this.JTblOrdenes,new File("c:\\reportedeordenes.xls"),"prueba");
        boolean exportacionOk=exportador.export();

        if(exportacionOk) {
            JOptionPane.showMessageDialog(this,"LA EXPORTACION DE LOS DATOS A EXCEL SE REALIZO CORRECTAMENTE,\nARCHIVO GUARDADO EN LA UNIDAD C:","EXPORTANDO DATOS",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,"ERROR AL INTENTAR EXPORTAR LOS DATOS A EXCEL","VERIFICAR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBtnImprimirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgRepOrdenes dialog = new JDlgRepOrdenes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JBtnCancelar;
    private javax.swing.JButton JBtnImprimir;
    private javax.swing.JButton JBtnMostrar;
    private datechooser.beans.DateChooserCombo JDtChFechaAl;
    private datechooser.beans.DateChooserCombo JDtChFechaDel;
    private javax.swing.JRadioButton JRbMostrarPorCliente;
    private javax.swing.JRadioButton JRbMostrarTodos;
    private javax.swing.JTable JTblOrdenes;
    private javax.swing.JTextField JTxtFechaAl;
    private javax.swing.JTextField JTxtFechaDel;
    private javax.swing.JTextField JTxtNoCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private Object contenido [][];
     private String titulos[];
     bdDatos db = new bdDatos();
}
