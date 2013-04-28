package prykualiatl;
import elaprendiz.bdmodel.Pago;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class JDlgTicket extends javax.swing.JDialog implements Printable{

    public JDlgTicket(java.awt.Frame parent, boolean modal) {
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
            JOptionPane.showMessageDialog( null, "NO HAY OBJETOS A IMPRIMIR", "ERROR DEIMPRESION", JOptionPane.ERROR_MESSAGE);
        }
    return PAGE_EXISTS;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FechaCubierta = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Rfc = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Folio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NoCuenta = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Rezagos = new javax.swing.JLabel();
        FechaaPagar = new javax.swing.JLabel();
        MesesTransc = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Recargos = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        Subtotal = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Municipio = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Colonia = new javax.swing.JLabel();
        JBtnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(prykualiatl.PryKualiAtlApp.class).getContext().getResourceMap(JDlgTicket.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        FechaCubierta.setFont(resourceMap.getFont("FechaCubierta.font")); // NOI18N
        FechaCubierta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FechaCubierta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FechaCubierta.setName("FechaCubierta"); // NOI18N

        jLabel15.setFont(resourceMap.getFont("jLabel15.font")); // NOI18N
        jLabel15.setText(resourceMap.getString("jLabel15.text")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N

        jLabel14.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N

        Rfc.setBackground(resourceMap.getColor("Rfc.background")); // NOI18N
        Rfc.setFont(resourceMap.getFont("Rfc.font")); // NOI18N
        Rfc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Rfc.setName("Rfc"); // NOI18N

        jLabel13.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N

        jLabel1.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        Folio.setFont(resourceMap.getFont("Folio.font")); // NOI18N
        Folio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Folio.setName("Folio"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        NoCuenta.setBackground(resourceMap.getColor("NoCuenta.background")); // NOI18N
        NoCuenta.setFont(resourceMap.getFont("NoCuenta.font")); // NOI18N
        NoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NoCuenta.setName("NoCuenta"); // NOI18N

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel5.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel18.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel18.setText(resourceMap.getString("jLabel18.text")); // NOI18N
        jLabel18.setName("jLabel18"); // NOI18N

        Rezagos.setFont(resourceMap.getFont("Rezagos.font")); // NOI18N
        Rezagos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rezagos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Rezagos.setName("Rezagos"); // NOI18N

        FechaaPagar.setFont(resourceMap.getFont("FechaaPagar.font")); // NOI18N
        FechaaPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FechaaPagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FechaaPagar.setName("FechaaPagar"); // NOI18N

        MesesTransc.setFont(resourceMap.getFont("MesesTransc.font")); // NOI18N
        MesesTransc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MesesTransc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MesesTransc.setName("MesesTransc"); // NOI18N

        jLabel17.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel17.setText(resourceMap.getString("jLabel17.text")); // NOI18N
        jLabel17.setName("jLabel17"); // NOI18N

        jLabel16.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel16.setText(resourceMap.getString("jLabel16.text")); // NOI18N
        jLabel16.setName("jLabel16"); // NOI18N

        Recargos.setFont(resourceMap.getFont("Recargos.font")); // NOI18N
        Recargos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Recargos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Recargos.setName("Recargos"); // NOI18N

        jLabel10.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        jLabel19.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel19.setText(resourceMap.getString("jLabel19.text")); // NOI18N
        jLabel19.setName("jLabel19"); // NOI18N

        Direccion.setBackground(resourceMap.getColor("Direccion.background")); // NOI18N
        Direccion.setFont(resourceMap.getFont("Direccion.font")); // NOI18N
        Direccion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Direccion.setName("Direccion"); // NOI18N

        Subtotal.setFont(resourceMap.getFont("Subtotal.font")); // NOI18N
        Subtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtotal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Subtotal.setName("Subtotal"); // NOI18N

        jLabel20.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel20.setText(resourceMap.getString("jLabel20.text")); // NOI18N
        jLabel20.setName("jLabel20"); // NOI18N

        jLabel8.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        Nombre.setBackground(resourceMap.getColor("Nombre.background")); // NOI18N
        Nombre.setFont(resourceMap.getFont("Nombre.font")); // NOI18N
        Nombre.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Nombre.setName("Nombre"); // NOI18N

        jLabel11.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        jLabel21.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel21.setText(resourceMap.getString("jLabel21.text")); // NOI18N
        jLabel21.setName("jLabel21"); // NOI18N

        Municipio.setBackground(resourceMap.getColor("Municipio.background")); // NOI18N
        Municipio.setFont(resourceMap.getFont("Municipio.font")); // NOI18N
        Municipio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Municipio.setName("Municipio"); // NOI18N

        Total.setFont(resourceMap.getFont("Total.font")); // NOI18N
        Total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Total.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Total.setName("Total"); // NOI18N

        jLabel12.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N

        Telefono.setBackground(resourceMap.getColor("Telefono.background")); // NOI18N
        Telefono.setFont(resourceMap.getFont("Telefono.font")); // NOI18N
        Telefono.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Telefono.setName("Telefono"); // NOI18N

        Colonia.setBackground(resourceMap.getColor("Colonia.background")); // NOI18N
        Colonia.setFont(resourceMap.getFont("Colonia.font")); // NOI18N
        Colonia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Colonia.setName("Colonia"); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(Folio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(NoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)
                        .addGap(29, 29, 29)
                        .addComponent(Colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11)
                        .addGap(20, 20, 20)
                        .addComponent(Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addGap(23, 23, 23)
                        .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addComponent(Rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FechaCubierta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16)
                        .addGap(10, 10, 10)
                        .addComponent(FechaaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(MesesTransc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18)
                        .addGap(140, 140, 140)
                        .addComponent(Rezagos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel19)
                        .addGap(132, 132, 132)
                        .addComponent(Recargos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel20)
                        .addGap(136, 136, 136)
                        .addComponent(Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel21)
                        .addGap(155, 155, 155)
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(JBtnImprimir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Folio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(NoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(Colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(Rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel14)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(FechaCubierta, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(FechaaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesesTransc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(Rezagos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(Recargos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(JBtnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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


    public void mostrar(String folio,String cuenta,String nombre,String dir,String colonia,String municipio,String tel,String rfc,String fechacub,String fechaapag,String mesestransc,String rezago,String recargo,String sub,String total)
    {
        this.Folio.setText(folio);
        this.NoCuenta.setText(cuenta);
       // this.NoCliente.setText(clavecli);
        this.Nombre.setText(nombre);
        this.Direccion.setText(dir);
        this.Colonia.setText(colonia);
        this.Municipio.setText(municipio);
        this.Telefono.setText(tel);
        this.Rfc.setText(rfc);
        this.FechaCubierta.setText(fechacub);
        this.FechaaPagar.setText(fechaapag);
        this.MesesTransc.setText(mesestransc);
        this.Rezagos.setText(rezago);
        this.Recargos.setText(recargo);
        this.Subtotal.setText(sub);
        this.Total.setText(total);
    }
    
    public void mostrar(Pago pg)
    {
        this.Folio.setText(pg.getCivFolio().toString());
        this.NoCuenta.setText(pg.getNorCuenta().toString());
        this.Nombre.setText(pg.getCliente().getNombre());
        this.Direccion.setText(pg.getCliente().getDireccion());
        this.Telefono.setText(pg.getCliente().getTelefono().toString());
        this.Colonia.setText(pg.getCliente().getColonia());
        this.Municipio.setText(pg.getCliente().getMunicipio());
        this.Rfc.setText(pg.getCliente().getRfc());        
        this.FechaCubierta.setText(pg.getFechaCubierta());
        this.MesesTransc.setText(pg.getMesesTranscurridos().toString());
        this.FechaaPagar.setText(pg.getFechaPago());
        this.Rezagos.setText(pg.getRezago().toString());
        this.Subtotal.setText(pg.getPagoCalculado().toString());
        this.Recargos.setText(pg.getRecargo().toString());
        this.Total.setText(pg.getTotal().toString());        
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgTicket dialog = new JDlgTicket(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel FechaCubierta;
    private javax.swing.JLabel FechaaPagar;
    private javax.swing.JLabel Folio;
    private javax.swing.JButton JBtnImprimir;
    private javax.swing.JLabel MesesTransc;
    private javax.swing.JLabel Municipio;
    private javax.swing.JLabel NoCuenta;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Recargos;
    private javax.swing.JLabel Rezagos;
    private javax.swing.JLabel Rfc;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
