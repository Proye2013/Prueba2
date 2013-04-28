package prykualiatl;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.io.File;
import java.text.SimpleDateFormat;

public class JDlgRepPagos extends javax.swing.JDialog
{

    public String clvfolio,clvcliente,nocuenta,nombre,dire,fecharegistros;
    public String rfc,colonia,muni;
    public String fechacubierta,mesestranscurridos,fechadepago,rezago,pagocalculado,recargo,total;
   
    public JDlgRepPagos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jRadioButton1.setSelected(false);
        jLabel5.setVisible(false);
        JTxtNoCliente.setVisible(false);
        JTblPagos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
           JTblPagos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        db.Conectar();
           
        SimpleDateFormat dateformat=new SimpleDateFormat("yyyy/MM/dd");
        JDtChFechaDel.setDateFormat(dateformat);
        JDtChFechaAl.setDateFormat(dateformat);
         setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);
    }

 public void muestra()
    {
        contenido = db.Consultar("SELECT tblpago.ClvFolio,tblpago.NoCuenta,tblcliente.Nombre,tblcliente.Direccion,tblcliente.Colonia,tblcliente.Municipio,tblcliente.Rfc,tblpago.FechaCubierta,tblpago.MesesTranscurridos,tblpago.FechaDePago,tblpago.Rezago,tblpago.PagoCalculado,tblpago.Recargo,tblpago.Total,tblpago.FechaDeRegistro FROM tblcliente,tblpago where tblpago.NoCuenta=tblcliente.NoCuenta and tblpago.FechaDeRegistro >= '"+ this.JTxtFechaDel.getText() +"' AND tblpago.FechaDeRegistro <='"+ this.JTxtFechaAl.getText() +"'");
        titulos = new String[15];
        titulos[0] ="ClvFolio";
       // titulos[1] ="ClvCliente";
        titulos[1] = "NoCuenta";
        titulos[2] ="Nombre";
        titulos[3] ="Direccion";
        titulos[4] ="Colonia";
        titulos[5] ="Municipio";
        titulos[6] ="Rfc";
        titulos[7] ="FechaCubierta";
        titulos[8] ="MesesTranscurridos";
        titulos[9] ="FechaDePago";
        titulos[10] ="Rezago";
        titulos[11] ="PagoCalculado";
        titulos[12] ="Recargo";
        titulos[13] ="Total";
        titulos[14] ="FechaDeRegistro";
        JTblPagos.setModel(new javax.swing.table.DefaultTableModel(contenido, titulos));
    }

 public void muestra2()
    {
        contenido = db.Consultar("SELECT tblpago.ClvFolio,tblpago.NoCuenta,tblcliente.Nombre,tblcliente.Direccion,tblcliente.Colonia,tblcliente.Municipio,tblcliente.Rfc,tblpago.FechaCubierta,tblpago.MesesTranscurridos,tblpago.FechaDePago,tblpago.Rezago,tblpago.PagoCalculado,tblpago.Recargo,tblpago.Total,tblpago.FechaDeRegistro FROM tblpago,tblcliente where tblcliente.NoCuenta='"+ this.JTxtNoCliente.getText() +"'and tblpago.NoCuenta=tblcliente.NoCuenta and tblpago.FechaDeRegistro >= '"+ this.JTxtFechaDel.getText() +"' AND tblpago.FechaDeRegistro 0<='"+ this.JTxtFechaAl.getText() +"'");
        titulos = new String[15];
       titulos[0] ="ClvFolio";
      //  titulos[1] ="ClvCliente";
        titulos[1] = "NoCuenta";
        titulos[2] ="Nombre";
        titulos[3] ="Direccion";
        titulos[4] ="Colonia";
        titulos[5] ="Municipio";
        titulos[6] ="Rfc";
        titulos[7] ="FechaCubierta";
        titulos[8] ="MesesTranscurridos";
        titulos[9] ="FechaDePago";
        titulos[10] ="Rezago";
        titulos[11] ="PagoCalculado";
        titulos[12] ="Recargo";
        titulos[13] ="Total";
        titulos[14] ="FechaDeRegistro";
        JTblPagos.setModel(new javax.swing.table.DefaultTableModel(contenido, titulos));
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTxtFechaDel = new javax.swing.JTextField();
        JTxtFechaAl = new javax.swing.JTextField();
        JDtChFechaDel = new datechooser.beans.DateChooserCombo();
        JDtChFechaAl = new datechooser.beans.DateChooserCombo();
        JBtnCancelar = new javax.swing.JButton();
        JBtnMostrar = new javax.swing.JButton();
        JBtnImprimir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        JTxtNoCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTblPagos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(prykualiatl.PryKualiAtlApp.class).getContext().getResourceMap(JDlgRepPagos.class);
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

        JTxtFechaDel.setFont(resourceMap.getFont("JTxtFechaAl.font")); // NOI18N
        JTxtFechaDel.setText(resourceMap.getString("JTxtFechaDel.text")); // NOI18N
        JTxtFechaDel.setEnabled(false);
        JTxtFechaDel.setName("JTxtFechaDel"); // NOI18N

        JTxtFechaAl.setFont(resourceMap.getFont("JTxtFechaAl.font")); // NOI18N
        JTxtFechaAl.setText(resourceMap.getString("JTxtFechaAl.text")); // NOI18N
        JTxtFechaAl.setEnabled(false);
        JTxtFechaAl.setName("JTxtFechaAl"); // NOI18N

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

        JBtnMostrar.setFont(resourceMap.getFont("JBtnMostrar.font")); // NOI18N
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

        JBtnImprimir.setFont(resourceMap.getFont("JBtnCancelar.font")); // NOI18N
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

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(resourceMap.getFont("jRadioButton1.font")); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText(resourceMap.getString("jRadioButton1.text")); // NOI18N
        jRadioButton1.setName("jRadioButton1"); // NOI18N
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(resourceMap.getFont("jRadioButton1.font")); // NOI18N
        jRadioButton2.setText(resourceMap.getString("jRadioButton2.text")); // NOI18N
        jRadioButton2.setName("jRadioButton2"); // NOI18N
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        JTxtNoCliente.setFont(resourceMap.getFont("JTxtNoCliente.font")); // NOI18N
        JTxtNoCliente.setText(resourceMap.getString("JTxtNoCliente.text")); // NOI18N
        JTxtNoCliente.setName("JTxtNoCliente"); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        JTblPagos.setFont(resourceMap.getFont("JTblPagos.font")); // NOI18N
        JTblPagos.setModel(new javax.swing.table.DefaultTableModel(
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
        JTblPagos.setName("JTblPagos"); // NOI18N
        JTblPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTblPagosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTblPagos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTxtFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDtChFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JTxtFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JDtChFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(JTxtNoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(JBtnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBtnImprimir)
                .addGap(10, 10, 10)
                .addComponent(JBtnCancelar)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(JTxtNoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTxtFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JDtChFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JDtChFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTxtFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBtnCancelar)
                    .addComponent(JBtnImprimir)
                    .addComponent(JBtnMostrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        
        if(jRadioButton2.isSelected())
        {
            jLabel5.setVisible(true);
            JTxtNoCliente.setVisible(true);
        }  
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
       
        if(jRadioButton1.isSelected())
        {
            jLabel5.setVisible(false);
            JTxtNoCliente.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void JTblPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTblPagosMouseClicked
     
  this.clvfolio= String.valueOf(contenido[JTblPagos.getSelectedRow()][0].toString());
 // this.clvcliente= String.valueOf(contenido[JTblPagos.getSelectedRow()][1].toString());
  this.nombre= String.valueOf(contenido[JTblPagos.getSelectedRow()][2].toString());
  this.dire= String.valueOf(contenido[JTblPagos.getSelectedRow()][3].toString());
  this.colonia= String.valueOf(contenido[JTblPagos.getSelectedRow()][4].toString());
  this.muni= String.valueOf(contenido[JTblPagos.getSelectedRow()][5].toString());
  this.rfc= String.valueOf(contenido[JTblPagos.getSelectedRow()][6].toString());
  this.nocuenta= String.valueOf(contenido[JTblPagos.getSelectedRow()][7].toString());
  this.fechacubierta= String.valueOf(contenido[JTblPagos.getSelectedRow()][8].toString());
  this.mesestranscurridos= String.valueOf(contenido[JTblPagos.getSelectedRow()][9].toString());
  this.fechadepago= String.valueOf(contenido[JTblPagos.getSelectedRow()][10].toString());
  this.rezago= String.valueOf(contenido[JTblPagos.getSelectedRow()][11].toString());
  this.pagocalculado= String.valueOf(contenido[JTblPagos.getSelectedRow()][12].toString());
  this.recargo= String.valueOf(contenido[JTblPagos.getSelectedRow()][13].toString());
  this.total= String.valueOf(contenido[JTblPagos.getSelectedRow()][14].toString());
  this.fecharegistros= String.valueOf(contenido[JTblPagos.getSelectedRow()][15].toString());
    }//GEN-LAST:event_JTblPagosMouseClicked

    private void JBtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnMostrarActionPerformed

        if(jRadioButton1.isSelected())
        {
             muestra();
        }
         else
         {
             if(jRadioButton2.isSelected())
             {
               muestra2();
             }
         }
    }//GEN-LAST:event_JBtnMostrarActionPerformed

    private void JDtChFechaDelOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_JDtChFechaDelOnCommit
       
         String []datos=JDtChFechaDel.getText().split("/");

        String Dia, Mes, Ano;

        Ano="";
        Mes="";
        Dia="";

        Ano=datos[0];
        Mes=datos[1];
        Dia=datos[2];

        JTxtFechaDel.setText(Ano+"-" + Mes + "-"+ Dia); //Caja de texto donde va la fecha extraida
    }//GEN-LAST:event_JDtChFechaDelOnCommit

    private void JDtChFechaAlOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_JDtChFechaAlOnCommit
        
          String []datos=JDtChFechaAl.getText().split("/");

        String Dia, Mes, Ano;

        Ano="";
        Mes="";
        Dia="";

        Ano=datos[0];
        Mes=datos[1];
        Dia=datos[2];

        JTxtFechaAl.setText(Ano+"-" + Mes + "-"+ Dia); //Caja de texto donde va la fecha extraida
    }//GEN-LAST:event_JDtChFechaAlOnCommit

    private void JBtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnImprimirActionPerformed

        ExcelTableExporter exportador=new ExcelTableExporter(this.JTblPagos,new File("c:\\reportedepagos.xls"),"prueba");
        boolean exportacionOk=exportador.export();

        if(exportacionOk) {
            JOptionPane.showMessageDialog(this,"LA EXPORTACION DE LOS DATOS A EXCEL SE REALIZO CORRECTAMENTE,\nARCHIVO GUARDADO EN LA UNIDAD C:","EXPORTANDO DATOS",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,"ERROR AL INTENTAR EXPORTAR LOS DATOS A EXCEL","VERIFICAR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBtnImprimirActionPerformed

    private void JBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBtnCancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgRepPagos dialog = new JDlgRepPagos(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable JTblPagos;
    private javax.swing.JTextField JTxtFechaAl;
    private javax.swing.JTextField JTxtFechaDel;
    private javax.swing.JTextField JTxtNoCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private Object contenido [][];
     private String titulos[];
     bdDatos db = new bdDatos();
}
