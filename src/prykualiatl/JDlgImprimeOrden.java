package prykualiatl;
import elaprendiz.bdmodel.Orden;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
public class JDlgImprimeOrden extends javax.swing.JDialog implements Printable{

    public JDlgImprimeOrden(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);
    }

    @Override
public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException
{
    try
    {
    if (pageIndex > 0)
    { 
      return NO_SUCH_PAGE;
    }
      Graphics2D g2d = (Graphics2D)graphics;
      g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
      this.printAll(graphics);
      return PAGE_EXISTS;
    }
    catch(Exception ex)
        {
            JOptionPane.showMessageDialog( null, "NO HAY OBJETOS A IMPRIMIR", "ERROR DE IMPRESION", JOptionPane.ERROR_MESSAGE);
        }
    return PAGE_EXISTS;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NoCuenta = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Colonia = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Municipio = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Rfc = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Inspector = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JBtnImprimir = new javax.swing.JButton();
        Folio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(prykualiatl.PryKualiAtlApp.class).getContext().getResourceMap(JDlgImprimeOrden.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jLabel1.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        NoCuenta.setFont(resourceMap.getFont("Rfc.font")); // NOI18N
        NoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NoCuenta.setName("NoCuenta"); // NOI18N

        jLabel8.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        Nombre.setFont(resourceMap.getFont("Rfc.font")); // NOI18N
        Nombre.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Nombre.setName("Nombre"); // NOI18N

        jLabel9.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        Direccion.setFont(resourceMap.getFont("Rfc.font")); // NOI18N
        Direccion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Direccion.setName("Direccion"); // NOI18N

        jLabel10.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        Colonia.setFont(resourceMap.getFont("Rfc.font")); // NOI18N
        Colonia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Colonia.setName("Colonia"); // NOI18N

        jLabel11.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        Municipio.setFont(resourceMap.getFont("Rfc.font")); // NOI18N
        Municipio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Municipio.setName("Municipio"); // NOI18N

        jLabel12.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N

        Telefono.setFont(resourceMap.getFont("Rfc.font")); // NOI18N
        Telefono.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Telefono.setName("Telefono"); // NOI18N

        jLabel13.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N

        Rfc.setFont(resourceMap.getFont("Rfc.font")); // NOI18N
        Rfc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Rfc.setName("Rfc"); // NOI18N

        jLabel15.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel15.setText(resourceMap.getString("jLabel15.text")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N

        Inspector.setFont(resourceMap.getFont("Rfc.font")); // NOI18N
        Inspector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inspector.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Inspector.setName("Inspector"); // NOI18N

        jLabel16.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel16.setText(resourceMap.getString("jLabel16.text")); // NOI18N
        jLabel16.setName("jLabel16"); // NOI18N

        Tipo.setFont(resourceMap.getFont("Rfc.font")); // NOI18N
        Tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tipo.setName("Tipo"); // NOI18N

        jLabel17.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel17.setText(resourceMap.getString("jLabel17.text")); // NOI18N
        jLabel17.setName("jLabel17"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

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

        Folio.setFont(resourceMap.getFont("Rfc.font")); // NOI18N
        Folio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Folio.setName("Folio"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addComponent(Folio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(NoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(Colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(16, 16, 16)
                .addComponent(Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Inspector, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel16)
                .addGap(16, 16, 16)
                .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(JBtnImprimir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(Folio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(NoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(Rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(Inspector, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel17)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(JBtnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnImprimirActionPerformed
       
        try{
    try
    {
      PrinterJob job = PrinterJob.getPrinterJob();
      job.setPrintable(this);
      job.printDialog();
      job.print();
    }
    catch (PrinterException ex)
    {
      JOptionPane.showMessageDialog( null, "NO EXISTEN IMPRESORAS INSTALADAS", "ERROR DE IMPRESION", JOptionPane.ERROR_MESSAGE);
    }
 }
 catch(Exception ex)
        {
            JOptionPane.showMessageDialog( null, "NO EXISTEN IMPRESORAS INSTALADAS", "ERROR DE IMPRESION", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBtnImprimirActionPerformed

    public void mostrar(String folio,String cuentaa,String nombre,String dir,String colonia,String municipio,String tel,String rfc,String inspector,String tipo,String motivo)
    {
        this.Folio.setText(folio);
        this.NoCuenta.setText(cuentaa);
     //   this.NoCliente.setText(clavecli);
        this.Nombre.setText(nombre);
        this.Direccion.setText(dir);
        this.Colonia.setText(colonia);
        this.Municipio.setText(municipio);
        this.Telefono.setText(tel);
        this.Rfc.setText(rfc);
        this.Inspector.setText(inspector);
        this.Tipo.setText(tipo);
        this.jTextArea1.setText(motivo);
    }
    
    public void mostrar(Orden ord)
    {
        this.Folio.setText(ord.getNroOrdern().toString());
        this.NoCuenta.setText(ord.getNorCuenta().toString());    
        this.Nombre.setText(ord.getCliente().getNombre());
        this.Direccion.setText(ord.getCliente().getDireccion());
        this.Colonia.setText(ord.getCliente().getColonia());
        this.Municipio.setText(ord.getCliente().getMunicipio());
        this.Telefono.setText(ord.getCliente().getTelefono().toString());
        this.Rfc.setText(ord.getCliente().getRfc());
        this.Inspector.setText(ord.getInspector());
        this.Tipo.setText(ord.getTipo());
        this.jTextArea1.setText(ord.getMotivoCorte());
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgImprimeOrden dialog = new JDlgImprimeOrden(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Colonia;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Folio;
    private javax.swing.JLabel Inspector;
    private javax.swing.JButton JBtnImprimir;
    private javax.swing.JLabel Municipio;
    private javax.swing.JLabel NoCuenta;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Rfc;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
