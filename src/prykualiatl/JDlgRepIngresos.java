package prykualiatl;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import javax.swing.JTable;

public class JDlgRepIngresos extends javax.swing.JDialog
{
public String clvfolio,clvcliente,nocuenta,nombre,dire,fecharegistros;
    public String rfc,colonia,muni;
     public String t;
     public int tt;
     public int del,al;
    public String fechacubierta,mesestranscurridos,fechadepago,rezago,pagocalculado,recargo,total;
    public JDlgRepIngresos(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
         JTblIngresos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
           //JTblIngresos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        SimpleDateFormat dateformat=new SimpleDateFormat("yyyy/MM/dd");
      //  SimpleDateFormat dateformat2=new SimpleDateFormat("yyyy/MM/dd");
        this.JDtChFechaDel.setDateFormat(dateformat);
        this.JDtChFechaAl.setDateFormat(dateformat);

        db.Conectar();

        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);

    }
public void muestra()
    {
        contenido = db.Consultar("SELECT tblpago.NoCuenta,tblcliente.Nombre,tblpago.FechaDeRegistro,tblpago.Total FROM tblcliente,tblpago where tblpago.NoCuenta=tblcliente.Nocuenta and tblpago.FechaDeRegistro >= '"+ this.JTxtFechaDel.getText() +"' AND tblpago.FechaDeRegistro <='"+ this.JTxtFechaAl.getText() +"'");
        titulos = new String[4];
        titulos[0] = "NoCuenta";
        titulos[1] ="Nombre";
        
        titulos[2] ="FechaDeRegistro";
        titulos[3] ="Total";
        JTblIngresos.setModel(new javax.swing.table.DefaultTableModel(contenido, titulos));
   
    }
 public void total()
 {

     try
            {
               bd_manager obj = new bd_manager();
               String sql;
               ResultSet rs;
               sql = ("SELECT sum(tblpago.Total )FROM tblcliente,tblpago where tblpago.NoCuenta=tblcliente.Nocuenta and tblpago.FechaDeRegistro >= '"+ this.JTxtFechaDel.getText() +"' AND tblpago.FechaDeRegistro <='"+ this.JTxtFechaAl.getText() +"'");
               rs= obj.consultar(sql);

              int a;
               while (rs.next())
               {
                   t=rs.getString(1);
                 // a= Integer.parseInt(t);
                      //clavenueva=a+1;
               }
                  this.JTxtTotalIngresos.setText(t);
            }catch (Exception ex) {
                       JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR ABRIR LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
                  }

 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTxtFechaDel = new javax.swing.JTextField();
        JDtChFechaDel = new datechooser.beans.DateChooserCombo();
        jLabel3 = new javax.swing.JLabel();
        JDtChFechaAl = new datechooser.beans.DateChooserCombo();
        JTxtFechaAl = new javax.swing.JTextField();
        JBtnMostrar = new javax.swing.JButton();
        JBtnImprimir = new javax.swing.JButton();
        JBtnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTblIngresos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTxtTotalIngresos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(prykualiatl.PryKualiAtlApp.class).getContext().getResourceMap(JDlgRepIngresos.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        JTxtFechaDel.setFont(resourceMap.getFont("JTxtFechaAl.font")); // NOI18N
        JTxtFechaDel.setText(resourceMap.getString("JTxtFechaDel.text")); // NOI18N
        JTxtFechaDel.setEnabled(false);
        JTxtFechaDel.setName("JTxtFechaDel"); // NOI18N

        JDtChFechaDel.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaDelOnCommit(evt);
            }
        });

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        JDtChFechaAl.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaAlOnCommit(evt);
            }
        });

        JTxtFechaAl.setFont(resourceMap.getFont("JTxtFechaAl.font")); // NOI18N
        JTxtFechaAl.setText(resourceMap.getString("JTxtFechaAl.text")); // NOI18N
        JTxtFechaAl.setEnabled(false);
        JTxtFechaAl.setName("JTxtFechaAl"); // NOI18N

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

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        JTblIngresos.setFont(resourceMap.getFont("JTblIngresos.font")); // NOI18N
        JTblIngresos.setModel(new javax.swing.table.DefaultTableModel(
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
        JTblIngresos.setName("JTblIngresos"); // NOI18N
        JTblIngresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTblIngresosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTblIngresos);

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        JTxtTotalIngresos.setFont(resourceMap.getFont("JTxtTotalIngresos.font")); // NOI18N
        JTxtTotalIngresos.setText(resourceMap.getString("JTxtTotalIngresos.text")); // NOI18N
        JTxtTotalIngresos.setEnabled(false);
        JTxtTotalIngresos.setName("JTxtTotalIngresos"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(JTxtFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JDtChFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(JTxtFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(JDtChFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTxtTotalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(JBtnMostrar)
                        .addGap(3, 3, 3)
                        .addComponent(JBtnImprimir)
                        .addGap(5, 5, 5)
                        .addComponent(JBtnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JDtChFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTxtFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JDtChFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTxtFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTxtTotalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

    private void JBtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnMostrarActionPerformed
        
         muestra();
         total();
        
    }//GEN-LAST:event_JBtnMostrarActionPerformed

    private void JBtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnImprimirActionPerformed

        ExcelTableExporter exportador=new ExcelTableExporter(this.JTblIngresos,new File("c:\\reportedeingresos.xls"),"prueba");
        boolean exportacionOk=exportador.export();

        if(exportacionOk) {
            JOptionPane.showMessageDialog(this,"LA EXPORTACION DE LOS DATOS A EXCEL SE REALIZO CORRECTAMENTE,\nARCHIVO GUARDADO EN LA UNIDAD C:","EXPORTANDO DATOS",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,"ERROR AL INTENTAR EXPORTAR LOS DATOS A EXCEL","VERIFICAR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBtnImprimirActionPerformed

    private void JTblIngresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTblIngresosMouseClicked
  this.nocuenta= String.valueOf(contenido[JTblIngresos.getSelectedRow()][0].toString());
  this.nombre= String.valueOf(contenido[JTblIngresos.getSelectedRow()][1].toString());
  this.total= String.valueOf(contenido[JTblIngresos.getSelectedRow()][2].toString());
  this.fecharegistros= String.valueOf(contenido[JTblIngresos.getSelectedRow()][3].toString());
  
     
    }//GEN-LAST:event_JTblIngresosMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgRepIngresos dialog = new JDlgRepIngresos(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable JTblIngresos;
    private javax.swing.JTextField JTxtFechaAl;
    private javax.swing.JTextField JTxtFechaDel;
    private javax.swing.JTextField JTxtTotalIngresos;
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
