package prykualiatl;
import elaprendiz.ControllerCliente;
import elaprendiz.ControllerPagos;
import elaprendiz.bdmodel.Cliente;
import elaprendiz.bdmodel.Pago;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JDlgRegPagos extends javax.swing.JDialog {

    public String claveclientess,clavefechass;
    public int clavenueva,clavenuevas;
    public String folio,cuenta,cliente,nom,dire,col;
    public String muni,tel,rfc,fechacub,fechaapagar,mesestransc;
    public String rezagos,recargos,subtotal,total;
    public String fecha1,fecha2,mes1,mes2;
    public int mesuno,mesdos,totmeses;
     public int fec;
     private Pago pago;
     private ControllerPagos cp;
   
    public JDlgRegPagos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cp = new ControllerPagos();
        jTextField2.setVisible(false);
        dateChooserCombo2.setEnabled(false);
        LimpiaCajas();
        ultimoregistro();
     JBtnPagar.setEnabled(false);
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);
        //Date calendario=new Date();
        SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat dateformat2=new SimpleDateFormat("yyyy/MM/dd");
        JDtChFechaaPagar.setDateFormat(dateformat);
        this.dateChooserCombo1.setDateFormat(dateformat2);
        this.dateChooserCombo2.setDateFormat(dateformat);
    }

public void ActivaBotones(boolean cal,boolean p,boolean i,boolean c)
{
    JBtnCalcular.setEnabled(cal);
    JBtnPagar.setEnabled(p);
    JBtnImprimeRecibo.setEnabled(i);
    JBtnCancelar.setEnabled(c);
}
private void LimpiaCajas()
{
     //  JTxtNoCliente.setText("");
       //JTxtNoCuenta.setText("");
       JTxtNombre.setText("");
       JTxtDireccion.setText("");
       JTxtColonia.setText("");
       JTxtMunicipio.setText("");
       JTxtTelefono.setText("");
       JTxtRfc.setText("");
       JTxtFechaaPagar.setText("");
       JTxtRecargos.setText("");
       JTxtRezagos.setText("");
       JTxtSubtotal.setText("");
       JTxtTotal.setText("");
}
public void mostrar(String clvfolioo,String nombree,String diree,String te,String coloniaa,String munii,String rfcc,String tar,String nocuentaa,String fechacubiertaa,String mesestranscurridoss,String fechadepagoa,String rezagoo,String pagocalculadoo,String recargoo,String totall,String fecharegis)
{
        this.JTxtFolio.setText(clvfolioo.trim());
//        this.JTxtNoCliente.setText(clvclientee.trim());
   //     this.JTxtNoCliente.setText(clvclientee.trim());
        this.JTxtNoCuenta.setText(nocuentaa.trim());
        this.JTxtNombre.setText(nombree.trim());
        this.JTxtDireccion.setText(diree.trim());
        this.JTxtTelefono.setText(te.trim());
        this.JTxtColonia.setText(coloniaa.trim());
        this.JTxtMunicipio.setText(munii.trim());
        this.JTxtRfc.setText(rfcc.trim());
         this.JTxtTarifa.setText(tar.trim());
        this.JTxtFechaCubierta.setText(fechacubiertaa.trim());
        this.JTxtMesesTranscurridos.setText(mesestranscurridoss.trim());
        this.JTxtFechaaPagar.setText(fechadepagoa.trim());
        this.JTxtRezagos.setText(rezagoo.trim());
        this.JTxtSubtotal.setText(pagocalculadoo.trim());
        this.JTxtRecargos.setText(recargoo.trim());
        this.JTxtTotal.setText(totall.trim());
        this.jTextField1.setText(fecharegis.trim());
       
 }

public void mostrar(Pago pg)
{
    this.JTxtFolio.setText(pg.getCivFolio().toString());
    this.JTxtNoCuenta.setText(pg.getNorCuenta().toString());
    this.JTxtNombre.setText(pg.getCliente().getNombre());
    this.JTxtDireccion.setText(pg.getCliente().getDireccion());
    this.JTxtTelefono.setText(pg.getCliente().getTelefono().toString());
    this.JTxtColonia.setText(pg.getCliente().getColonia());
    this.JTxtMunicipio.setText(pg.getCliente().getMunicipio());
    this.JTxtRfc.setText(pg.getCliente().getRfc());
     this.JTxtTarifa.setText(pg.getCliente().getTarifa());
    this.JTxtFechaCubierta.setText(pg.getFechaCubierta());
    this.JTxtMesesTranscurridos.setText(pg.getMesesTranscurridos().toString());
    this.JTxtFechaaPagar.setText(pg.getFechaPago());
    this.JTxtRezagos.setText(pg.getRezago().toString());
    this.JTxtSubtotal.setText(pg.getPagoCalculado().toString());
    this.JTxtRecargos.setText(pg.getRecargo().toString());
    this.JTxtTotal.setText(pg.getTotal().toString());
    this.jTextField1.setText(pg.getFechaFormateada(pg.getFechaRegistro()));
       
}



public void mostrar1(String guar)
{
    jTextField2.setText(guar.trim());
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTxtFolio = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JTxtNoCuenta = new javax.swing.JTextField();
        JBtnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JTxtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTxtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTxtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTxtRfc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        JTxtColonia = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        JTxtMunicipio = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        JTxtTarifa = new javax.swing.JTextField();
        JBtnBuscar2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        JTxtFechaCubierta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JTxtRezagos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JTxtMesesTranscurridos = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JTxtRecargos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JTxtFechaaPagar = new javax.swing.JTextField();
        JDtChFechaaPagar = new datechooser.beans.DateChooserCombo();
        jLabel14 = new javax.swing.JLabel();
        JTxtSubtotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        JTxtTotal = new javax.swing.JTextField();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        JBtnCalcular = new javax.swing.JButton();
        JBtnPagar = new javax.swing.JButton();
        JBtnImprimeRecibo = new javax.swing.JButton();
        JBtnCancelar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(prykualiatl.PryKualiAtlApp.class).getContext().getResourceMap(JDlgRegPagos.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        JTxtFolio.setFont(resourceMap.getFont("JTxtMunicipio.font")); // NOI18N
        JTxtFolio.setText(resourceMap.getString("JTxtFolio.text")); // NOI18N
        JTxtFolio.setEnabled(false);
        JTxtFolio.setName("JTxtFolio"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel1.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel1.border.titleFont"))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        JTxtNoCuenta.setFont(resourceMap.getFont("JTxtMunicipio.font")); // NOI18N
        JTxtNoCuenta.setText(resourceMap.getString("JTxtNoCuenta.text")); // NOI18N
        JTxtNoCuenta.setName("JTxtNoCuenta"); // NOI18N
        JTxtNoCuenta.setNextFocusableComponent(jCheckBox1);

        JBtnBuscar.setIcon(resourceMap.getIcon("JBtnBuscar.icon")); // NOI18N
        JBtnBuscar.setText(resourceMap.getString("JBtnBuscar.text")); // NOI18N
        JBtnBuscar.setName("JBtnBuscar"); // NOI18N
        JBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        JTxtNombre.setFont(resourceMap.getFont("JTxtMunicipio.font")); // NOI18N
        JTxtNombre.setText(resourceMap.getString("JTxtNombre.text")); // NOI18N
        JTxtNombre.setEnabled(false);
        JTxtNombre.setName("JTxtNombre"); // NOI18N

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        JTxtDireccion.setFont(resourceMap.getFont("JTxtMunicipio.font")); // NOI18N
        JTxtDireccion.setText(resourceMap.getString("JTxtDireccion.text")); // NOI18N
        JTxtDireccion.setEnabled(false);
        JTxtDireccion.setName("JTxtDireccion"); // NOI18N

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        JTxtTelefono.setFont(resourceMap.getFont("JTxtMunicipio.font")); // NOI18N
        JTxtTelefono.setText(resourceMap.getString("JTxtTelefono.text")); // NOI18N
        JTxtTelefono.setEnabled(false);
        JTxtTelefono.setName("JTxtTelefono"); // NOI18N

        jLabel8.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        JTxtRfc.setFont(resourceMap.getFont("JTxtMunicipio.font")); // NOI18N
        JTxtRfc.setText(resourceMap.getString("JTxtRfc.text")); // NOI18N
        JTxtRfc.setEnabled(false);
        JTxtRfc.setName("JTxtRfc"); // NOI18N

        jLabel16.setFont(resourceMap.getFont("jLabel16.font")); // NOI18N
        jLabel16.setText(resourceMap.getString("jLabel16.text")); // NOI18N
        jLabel16.setName("jLabel16"); // NOI18N

        JTxtColonia.setFont(resourceMap.getFont("JTxtMunicipio.font")); // NOI18N
        JTxtColonia.setText(resourceMap.getString("JTxtColonia.text")); // NOI18N
        JTxtColonia.setEnabled(false);
        JTxtColonia.setName("JTxtColonia"); // NOI18N

        jLabel17.setFont(resourceMap.getFont("jLabel17.font")); // NOI18N
        jLabel17.setText(resourceMap.getString("jLabel17.text")); // NOI18N
        jLabel17.setName("jLabel17"); // NOI18N

        JTxtMunicipio.setFont(resourceMap.getFont("JTxtMunicipio.font")); // NOI18N
        JTxtMunicipio.setText(resourceMap.getString("JTxtMunicipio.text")); // NOI18N
        JTxtMunicipio.setEnabled(false);
        JTxtMunicipio.setName("JTxtMunicipio"); // NOI18N

        jLabel19.setFont(resourceMap.getFont("jLabel19.font")); // NOI18N
        jLabel19.setText(resourceMap.getString("jLabel19.text")); // NOI18N
        jLabel19.setName("jLabel19"); // NOI18N

        JTxtTarifa.setText(resourceMap.getString("JTxtTarifa.text")); // NOI18N
        JTxtTarifa.setEnabled(false);
        JTxtTarifa.setName("JTxtTarifa"); // NOI18N

        JBtnBuscar2.setIcon(resourceMap.getIcon("JBtnBuscar2.icon")); // NOI18N
        JBtnBuscar2.setText(resourceMap.getString("JBtnBuscar2.text")); // NOI18N
        JBtnBuscar2.setName("JBtnBuscar2"); // NOI18N
        JBtnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnBuscar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTxtNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBtnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JTxtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTxtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JTxtNombre)
                                    .addComponent(JTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTxtTarifa)
                            .addComponent(JTxtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTxtRfc, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                        .addGap(90, 90, 90))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTxtNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JBtnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(JBtnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(JTxtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(JTxtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(JTxtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(JTxtTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel2.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        jLabel9.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        JTxtFechaCubierta.setFont(resourceMap.getFont("JTxtMesesTranscurridos.font")); // NOI18N
        JTxtFechaCubierta.setText(resourceMap.getString("JTxtFechaCubierta.text")); // NOI18N
        JTxtFechaCubierta.setEnabled(false);
        JTxtFechaCubierta.setName("JTxtFechaCubierta"); // NOI18N
        JTxtFechaCubierta.setNextFocusableComponent(JTxtMesesTranscurridos);

        jLabel10.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        JTxtRezagos.setFont(resourceMap.getFont("JTxtMesesTranscurridos.font")); // NOI18N
        JTxtRezagos.setText(resourceMap.getString("JTxtRezagos.text")); // NOI18N
        JTxtRezagos.setEnabled(false);
        JTxtRezagos.setName("JTxtRezagos"); // NOI18N
        JTxtRezagos.setNextFocusableComponent(JTxtRecargos);

        jLabel11.setFont(resourceMap.getFont("jLabel11.font")); // NOI18N
        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        JTxtMesesTranscurridos.setFont(resourceMap.getFont("JTxtMesesTranscurridos.font")); // NOI18N
        JTxtMesesTranscurridos.setText(resourceMap.getString("JTxtMesesTranscurridos.text")); // NOI18N
        JTxtMesesTranscurridos.setEnabled(false);
        JTxtMesesTranscurridos.setName("JTxtMesesTranscurridos"); // NOI18N
        JTxtMesesTranscurridos.setNextFocusableComponent(JTxtFechaaPagar);

        jLabel12.setFont(resourceMap.getFont("jLabel12.font")); // NOI18N
        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N

        JTxtRecargos.setFont(resourceMap.getFont("JTxtMesesTranscurridos.font")); // NOI18N
        JTxtRecargos.setText(resourceMap.getString("JTxtRecargos.text")); // NOI18N
        JTxtRecargos.setEnabled(false);
        JTxtRecargos.setName("JTxtRecargos"); // NOI18N
        JTxtRecargos.setNextFocusableComponent(JTxtSubtotal);

        jLabel13.setFont(resourceMap.getFont("jLabel13.font")); // NOI18N
        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N

        JTxtFechaaPagar.setFont(resourceMap.getFont("JTxtMesesTranscurridos.font")); // NOI18N
        JTxtFechaaPagar.setText(resourceMap.getString("JTxtFechaaPagar.text")); // NOI18N
        JTxtFechaaPagar.setEnabled(false);
        JTxtFechaaPagar.setName("JTxtFechaaPagar"); // NOI18N
        JTxtFechaaPagar.setNextFocusableComponent(JTxtRezagos);

        JDtChFechaaPagar.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaaPagarOnCommit(evt);
            }
        });

        jLabel14.setFont(resourceMap.getFont("jLabel14.font")); // NOI18N
        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N

        JTxtSubtotal.setFont(resourceMap.getFont("JTxtMesesTranscurridos.font")); // NOI18N
        JTxtSubtotal.setText(resourceMap.getString("JTxtSubtotal.text")); // NOI18N
        JTxtSubtotal.setEnabled(false);
        JTxtSubtotal.setName("JTxtSubtotal"); // NOI18N
        JTxtSubtotal.setNextFocusableComponent(JTxtTotal);

        jLabel15.setFont(resourceMap.getFont("jLabel15.font")); // NOI18N
        jLabel15.setText(resourceMap.getString("jLabel15.text")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N

        JTxtTotal.setFont(resourceMap.getFont("JTxtMesesTranscurridos.font")); // NOI18N
        JTxtTotal.setText(resourceMap.getString("JTxtTotal.text")); // NOI18N
        JTxtTotal.setEnabled(false);
        JTxtTotal.setName("JTxtTotal"); // NOI18N
        JTxtTotal.setNextFocusableComponent(JBtnCalcular);

        dateChooserCombo2.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                dateChooserCombo2OnCommit(evt);
            }
        });

        jLabel20.setFont(resourceMap.getFont("jLabel20.font")); // NOI18N
        jLabel20.setText(resourceMap.getString("jLabel20.text")); // NOI18N
        jLabel20.setName("jLabel20"); // NOI18N

        jLabel21.setFont(resourceMap.getFont("jLabel21.font")); // NOI18N
        jLabel21.setText(resourceMap.getString("jLabel21.text")); // NOI18N
        jLabel21.setName("jLabel21"); // NOI18N

        jLabel22.setFont(resourceMap.getFont("jLabel22.font")); // NOI18N
        jLabel22.setText(resourceMap.getString("jLabel22.text")); // NOI18N
        jLabel22.setName("jLabel22"); // NOI18N

        jLabel23.setFont(resourceMap.getFont("jLabel23.font")); // NOI18N
        jLabel23.setText(resourceMap.getString("jLabel23.text")); // NOI18N
        jLabel23.setName("jLabel23"); // NOI18N

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTxtFechaCubierta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTxtMesesTranscurridos, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(JTxtFechaaPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateChooserCombo2, 0, 0, Short.MAX_VALUE)
                            .addComponent(JDtChFechaaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JTxtRecargos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTxtRezagos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTxtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(JTxtSubtotal))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(JTxtRezagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(JTxtRecargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(JTxtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(JTxtFechaCubierta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTxtMesesTranscurridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(JTxtFechaaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JDtChFechaaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JBtnCalcular.setFont(resourceMap.getFont("JBtnCalcular.font")); // NOI18N
        JBtnCalcular.setIcon(resourceMap.getIcon("JBtnCalcular.icon")); // NOI18N
        JBtnCalcular.setText(resourceMap.getString("JBtnCalcular.text")); // NOI18N
        JBtnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnCalcular.setName("JBtnCalcular"); // NOI18N
        JBtnCalcular.setNextFocusableComponent(JBtnPagar);
        JBtnCalcular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnCalcularActionPerformed(evt);
            }
        });

        JBtnPagar.setFont(resourceMap.getFont("JBtnCancelar.font")); // NOI18N
        JBtnPagar.setIcon(resourceMap.getIcon("JBtnPagar.icon")); // NOI18N
        JBtnPagar.setText(resourceMap.getString("JBtnPagar.text")); // NOI18N
        JBtnPagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnPagar.setName("JBtnPagar"); // NOI18N
        JBtnPagar.setNextFocusableComponent(JBtnImprimeRecibo);
        JBtnPagar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnPagarActionPerformed(evt);
            }
        });

        JBtnImprimeRecibo.setFont(resourceMap.getFont("JBtnCancelar.font")); // NOI18N
        JBtnImprimeRecibo.setIcon(resourceMap.getIcon("JBtnImprimeRecibo.icon")); // NOI18N
        JBtnImprimeRecibo.setText(resourceMap.getString("JBtnImprimeRecibo.text")); // NOI18N
        JBtnImprimeRecibo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnImprimeRecibo.setName("JBtnImprimeRecibo"); // NOI18N
        JBtnImprimeRecibo.setNextFocusableComponent(JBtnCancelar);
        JBtnImprimeRecibo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnImprimeRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnImprimeReciboActionPerformed(evt);
            }
        });

        JBtnCancelar.setFont(resourceMap.getFont("JBtnCancelar.font")); // NOI18N
        JBtnCancelar.setIcon(resourceMap.getIcon("JBtnCancelar.icon")); // NOI18N
        JBtnCancelar.setText(resourceMap.getString("JBtnCancelar.text")); // NOI18N
        JBtnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnCancelar.setName("JBtnCancelar"); // NOI18N
        JBtnCancelar.setNextFocusableComponent(JTxtNoCuenta);
        JBtnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnCancelarActionPerformed(evt);
            }
        });

        jLabel18.setFont(resourceMap.getFont("jLabel18.font")); // NOI18N
        jLabel18.setText(resourceMap.getString("jLabel18.text")); // NOI18N
        jLabel18.setName("jLabel18"); // NOI18N

        dateChooserCombo1.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                dateChooserCombo1OnCommit(evt);
            }
        });

        jTextField1.setFont(resourceMap.getFont("JTxtMunicipio.font")); // NOI18N
        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setEnabled(false);
        jTextField1.setName("jTextField1"); // NOI18N
        jTextField1.setNextFocusableComponent(JTxtNoCuenta);

        jCheckBox1.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox1.setText(resourceMap.getString("jCheckBox1.text")); // NOI18N
        jCheckBox1.setName("jCheckBox1"); // NOI18N
        jCheckBox1.setNextFocusableComponent(JTxtFechaCubierta);
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(JTxtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel18)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jCheckBox1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(JBtnCalcular)
                        .addGap(11, 11, 11)
                        .addComponent(JBtnPagar)
                        .addGap(3, 3, 3)
                        .addComponent(JBtnImprimeRecibo)
                        .addGap(9, 9, 9)
                        .addComponent(JBtnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(JTxtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBtnCalcular)
                    .addComponent(JBtnPagar)
                    .addComponent(JBtnImprimeRecibo)
                    .addComponent(JBtnCancelar))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnBuscarActionPerformed
       
        String b;
        if(JTxtNoCuenta.getText().equals(""))
        {
            JOptionPane.showMessageDialog( null, "DEBE ESCRIBIR NUMERO DE CUENTA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            JTxtNoCuenta.requestFocus();
            JBtnPagar.setEnabled(false);
        }
        else
        {
//            if(JTxtNoCuenta.getText()!="")
//            {
        //}
        if(JBtnBuscar.isEnabled())
        {
            try
            {
                 ControllerCliente cc = new ControllerCliente();
                 Cliente cli = (Cliente) cc.getRegistro(Integer.parseInt(JTxtNoCuenta.getText()));
                 if(cli != null)
                 {
                     JTxtNombre.setText(cli.getNombre());
                     JTxtDireccion.setText(cli.getDireccion());
                     JTxtColonia.setText(cli.getColonia());
                     JTxtMunicipio.setText(cli.getMunicipio());
                     JTxtTelefono.setText(cli.getTelefono().toString());
                     JTxtRfc.setText(cli.getRfc());
                     JTxtTarifa.setText(cli.getTarifa()); 
                     JBtnPagar.setEnabled(true);
                 }else
                 {
                     JOptionPane.showMessageDialog( null, "NO SE ENCUENTRA O NO EXISTE EL NUMERO DE CUENTA", "BUSCANDO", JOptionPane.ERROR_MESSAGE);
                     JTxtNoCuenta.requestFocus();
                     JBtnPagar.setEnabled(false);
                 }


            }catch (Exception ex) {
                    
                    JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR ABRIR LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
                  }
            ultimafecha();    
        }
       //  JBtnPagar.setEnabled(true);
        }
           
    }//GEN-LAST:event_JBtnBuscarActionPerformed

private void ultimoregistro()
{
    try
    {
      this.JTxtFolio.setText(ControllerPagos.getUltimoRegistro().toString());
    }catch (Exception ex) {
              JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR ABRIR LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
}

public void ultimafecha()
{
    try
    {                       
       JTxtFechaCubierta.setText(cp.getFechaRegistro(this.JTxtNoCuenta.getText()).getFechaCubierta());

    }catch (Exception ex) {
               JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR ABRIR LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
}
    private void JBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnCancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_JBtnCancelarActionPerformed

    private void JDtChFechaaPagarOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_JDtChFechaaPagarOnCommit
       
         String []datos=JDtChFechaaPagar.getText().split("/");

        String Dia, Mes, Ano;

        Dia="";
        Mes="";
        Ano="";

        Dia=datos[0];
        Mes=datos[1];
        Ano=datos[2];

        JTxtFechaaPagar.setText(Dia+"-" + Mes + "-"+ Ano); //Caja de texto donde va la fecha extraida
    }//GEN-LAST:event_JDtChFechaaPagarOnCommit

    private void JBtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnCalcularActionPerformed

        calcular();
      
    }//GEN-LAST:event_JBtnCalcularActionPerformed

    public void calcular()
    {
//         float costo=0,total=0;
//         float recar=0,rec=0;
//         int numero=0;
//         int numero2=0;
//         float iva=0;
//         float total2=0;
//         fecha1=this.JTxtFechaCubierta.getText();
//         mes1= fecha1.substring(3,5);
//
//         fecha2=this.JTxtFechaaPagar.getText();
//         mes2= fecha2.substring(3, 5);
//
//         mesuno= Integer.parseInt(mes1);
//        mesdos= Integer.parseInt(mes2);
//
//        totmeses=mesdos-mesuno;
         if(     this.JTxtNoCuenta.getText().equals(""))
               {
               JOptionPane.showMessageDialog( null, "DEBE ESCRIBIR NUMERO DE CUENTA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
               this.JTxtNoCuenta.requestFocus();
               }
          else
             {
             if(     this.JTxtNoCuenta.getText()!="")
             {
               float costo=0,total=0;
         float recar=0,rec=0;
         int numero=0;
         int numero2=0;
         float iva=0;
         float total2=0;
//         fecha1=this.JTxtFechaCubierta.getText();
//         //mes1= fecha1.substring(3,5);
//
//         fecha2=this.JTxtFechaaPagar.getText();
//         mes2= fecha2.substring(3, 5);

         mesuno= dateChooserCombo2.getSelectedDate().get(Calendar.MONTH)+1;
        mesdos= JDtChFechaaPagar.getSelectedDate().get(Calendar.MONTH)+1;
        
        totmeses=mesdos-mesuno;
         if(JTxtFechaCubierta.getText().equals(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("domestico"))
        {
            costo=(float) (61.50 *1);
            recar=(float) (61.50 *1)*(float)0.03;
            numero = (int)(recar * 100);
             rec =(float)(numero/100.0);
             iva=(float)0+(float)0;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);
              this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
          this.JTxtRezagos.setText(Float.toString(costo));
          this.JTxtRecargos.setText(Float.toString(rec));
          this.JTxtTotal.setText(Float.toString(total2));
          this.JTxtSubtotal.setText(Float.toString(iva));
        }
         else
         {
            { if(JTxtFechaCubierta.getText()!=(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("domestico"))
            costo=(float) (61.50 *totmeses);
            recar=(float) (61.50 *totmeses)*(float)0.03;
            numero = (int)(recar * 100);
            rec =(float)(numero/100.0);
            iva=(float)0+(float)0;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);

             this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
             this.JTxtRezagos.setText(Float.toString(costo));
             this.JTxtRecargos.setText(Float.toString(rec));
             this.JTxtTotal.setText(Float.toString(total2));
             this.JTxtSubtotal.setText(Float.toString(iva));
         }
         }
       if(JTxtFechaCubierta.getText().equals(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("comercial"))
        {
             costo=(float) (202.00 *1);
            recar=(float) (202.00 *1)*(float)0;
            numero = (int)(recar * 100);
            rec =(float)(numero/100.0);
            iva=(float)0+(float).16;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);
       this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
      this.JTxtRezagos.setText(Float.toString(costo));
        this.JTxtRecargos.setText(Float.toString(rec));
         this.JTxtTotal.setText(Float.toString(total2));
          this.JTxtSubtotal.setText(Float.toString(iva));
        }
       else
       {

           { if(JTxtFechaCubierta.getText()!=(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("comercial"))
            costo=(float) (202.00 *totmeses);
            recar=(float) (202.00 *totmeses)*(float)0.03;
            numero = (int)(recar * 100);
            rec =(float)(numero/100.0);
            iva=(float)0+(float).16;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);

             this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
             this.JTxtRezagos.setText(Float.toString(costo));
             this.JTxtRecargos.setText(Float.toString(rec));
             this.JTxtTotal.setText(Float.toString(total2));
             this.JTxtSubtotal.setText(Float.toString(iva));
         }
       }
      if(JTxtFechaCubierta.getText().equals(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("industrial"))
        {
            costo=(float) (790.00 *totmeses);
            recar=(float) (790.00 *totmeses)*(float)0.03;
            numero = (int)(recar * 100);
            rec =(float)(numero/100.0);
            iva=(float)0+(float).16;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);
              this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
              this.JTxtRezagos.setText(Float.toString(costo));
                this.JTxtRecargos.setText(Float.toString(rec));
                 this.JTxtTotal.setText(Float.toString(total2));
                  this.JTxtSubtotal.setText(Float.toString(iva));
           
        }
      else
      {
             { if(JTxtFechaCubierta.getText()!=(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("industrial"))
            costo=(float) (790.00 *totmeses);
            recar=(float) (790.00 *totmeses)*(float)0.03;
            numero = (int)(recar * 100);
            rec =(float)(numero/100.0);
            iva=(float)0+(float).16;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);

             this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
             this.JTxtRezagos.setText(Float.toString(costo));
             this.JTxtRecargos.setText(Float.toString(rec));
             this.JTxtTotal.setText(Float.toString(total2));
             this.JTxtSubtotal.setText(Float.toString(iva));
         }
      }

       if(JTxtFechaCubierta.getText().equals(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("publico"))
        {
            costo=(float) (550.00 *1);
            recar=(float) (550.00 *1)*(float)0.03;
            numero = (int)(recar * 100);
             rec =(float)(numero/100.0);
             iva=(float)0+(float)0;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);
              this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
          this.JTxtRezagos.setText(Float.toString(costo));
          this.JTxtRecargos.setText(Float.toString(rec));
          this.JTxtTotal.setText(Float.toString(total2));
          this.JTxtSubtotal.setText(Float.toString(iva));
        }
         else
         {
            { if(JTxtFechaCubierta.getText()!=(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("publico"))
            costo=(float) (550.00 *totmeses);
            recar=(float) (550.00 *totmeses)*(float)0.03;
            numero = (int)(recar * 100);
            rec =(float)(numero/100.0);
            iva=(float)0+(float)0;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);

             this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
             this.JTxtRezagos.setText(Float.toString(costo));
             this.JTxtRecargos.setText(Float.toString(rec));
             this.JTxtTotal.setText(Float.toString(total2));
             this.JTxtSubtotal.setText(Float.toString(iva));
         }
         }
      if(JTxtFechaCubierta.getText().equals(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("insen"))
        {
            costo=(float) (42.50 *1);
            recar=(float) (45.50 *1)*(float)0.03;
            numero = (int)(recar * 100);
             rec =(float)(numero/100.0);
             iva=(float)0+(float)0;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);
              this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
          this.JTxtRezagos.setText(Float.toString(costo));
          this.JTxtRecargos.setText(Float.toString(rec));
          this.JTxtTotal.setText(Float.toString(total2));
          this.JTxtSubtotal.setText(Float.toString(iva));
        }
         else
         {
            { if(JTxtFechaCubierta.getText()!=(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("insen"))
            costo=(float) (42.50 *totmeses);
            recar=(float) (42.50 *totmeses)*(float)0.03;
            numero = (int)(recar * 100);
            rec =(float)(numero/100.0);
            iva=(float)0+(float)0;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);

             this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
             this.JTxtRezagos.setText(Float.toString(costo));
             this.JTxtRecargos.setText(Float.toString(rec));
             this.JTxtTotal.setText(Float.toString(total2));
             this.JTxtSubtotal.setText(Float.toString(iva));
         }
         }
        if(JTxtFechaCubierta.getText().equals(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("baldio"))
        {
            costo=(float) (20.00 *1);
            recar=(float) (20.00 *1)*(float)0.03;
            numero = (int)(recar * 100);
             rec =(float)(numero/100.0);
             iva=(float)0+(float)0;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);
              this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
          this.JTxtRezagos.setText(Float.toString(costo));
          this.JTxtRecargos.setText(Float.toString(rec));
          this.JTxtTotal.setText(Float.toString(total2));
          this.JTxtSubtotal.setText(Float.toString(iva));
        }
         else
         {
            { if(JTxtFechaCubierta.getText()!=(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("baldio"))
            costo=(float) (20.00 *totmeses);
            recar=(float) (20.00 *totmeses)*(float)0.03;
            numero = (int)(recar * 100);
            rec =(float)(numero/100.0);
            iva=(float)0+(float)0;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);

             this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
             this.JTxtRezagos.setText(Float.toString(costo));
             this.JTxtRecargos.setText(Float.toString(rec));
             this.JTxtTotal.setText(Float.toString(total2));
             this.JTxtSubtotal.setText(Float.toString(iva));
         }
         }
        if(JTxtFechaCubierta.getText().equals(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("especial"))
        {
            costo=(float) (1500.00 *1);
            recar=(float) (1500.00 *1)*(float)0.03;
            numero = (int)(recar * 100);
             rec =(float)(numero/100.0);
             iva=(float)0+(float)0;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);
              this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
          this.JTxtRezagos.setText(Float.toString(costo));
          this.JTxtRecargos.setText(Float.toString(rec));
          this.JTxtTotal.setText(Float.toString(total2));
          this.JTxtSubtotal.setText(Float.toString(iva));
        }
         else
         {
            { if(JTxtFechaCubierta.getText()!=(JTxtFechaaPagar.getText()) & JTxtTarifa.getText().equals("especial"))
            costo=(float) (1500.00 *totmeses);
            recar=(float) (1500.00 *totmeses)*(float)0.03;
            numero = (int)(recar * 100);
            rec =(float)(numero/100.0);
            iva=(float)0+(float)0;
             total= costo+rec+iva;
             numero2= (int)(total*100);
             total2=(float)(numero2/100.0);

             this.JTxtMesesTranscurridos.setText(Integer.toString(totmeses));
             this.JTxtRezagos.setText(Float.toString(costo));
             this.JTxtRecargos.setText(Float.toString(rec));
             this.JTxtTotal.setText(Float.toString(total2));
             this.JTxtSubtotal.setText(Float.toString(iva));
         }
         }
             }
          }
                
            
    }
    private void dateChooserCombo1OnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dateChooserCombo1OnCommit
        
         String []datos=dateChooserCombo1.getText().split("/");

        String Dia, Mes, Ano;

        Dia="";
        Mes="";
        Ano="";

        Ano=datos[0];
        Mes=datos[1];
        Dia=datos[2];

        jTextField1.setText(Ano+"-" + Mes + "-"+ Dia); //Caja de texto donde va la fecha extraida
    }//GEN-LAST:event_dateChooserCombo1OnCommit

    private void JBtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnPagarActionPerformed
       
          if(this.jTextField1.getText().equals(""))
       {
       JOptionPane.showMessageDialog( null, "DEBE SELECCIONAR LA FECHA DE REGISTRO", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
       this.jTextField1.requestFocus();
       }
        else
        {
             if(     this.JTxtNoCuenta.getText().equals(""))
               {
               JOptionPane.showMessageDialog( null, "DEBE ESCRIBIR NUMERO DE CUENTA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
               this.JTxtNoCuenta.requestFocus();
               }
             else
             {
                 if(     this.JTxtFechaCubierta.getText().equals(""))
               {
               JOptionPane.showMessageDialog( null, "DEBE SELECCIONAR LA FECHA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
               this.JTxtFechaCubierta.requestFocus();
               }
                 else
                 {
                  if(     this.JTxtFechaaPagar.getText().equals(""))
               {
               JOptionPane.showMessageDialog( null, "DEBE SELECCIONAR LA FECHA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
               this.JTxtFechaaPagar.requestFocus();
               } else
                 {
                    pago =new Pago();
                    pago.setCivFolio(Integer.parseInt(JTxtFolio.getText()));
                    pago.setNorCuenta(Integer.parseInt(JTxtNoCuenta.getText()));
                    pago.setFechaCubierta(JTxtFechaCubierta.getText());
                    pago.setMesesTranscurridos(Integer.parseInt(JTxtMesesTranscurridos.getText()));
                    pago.setFechaPago(JTxtFechaaPagar.getText());
                    pago.setRezago(Float.parseFloat(JTxtRezagos.getText()));
                    pago.setPagoCalculado(Float.parseFloat(JTxtSubtotal.getText()));
                    pago.setRecargo(Float.parseFloat(JTxtRecargos.getText()));
                    pago.setTotal(Float.parseFloat(JTxtTotal.getText()));
                    pago.setFechaRegistro(dateChooserCombo1.getSelectedDate().getTime());                     
                   if(jTextField2.getText().equals("GUARDAR"))
                  {
                     try
                     {
                         cp.guardarRegistro(pago);                       
                        JOptionPane.showMessageDialog( null, "REGISTRO DEL PAGO SE GUARDO CORRECTAMENTE", "GUARDANDO", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR REGISTRAR EL PAGO", "VERIFICAR", JOptionPane.ERROR_MESSAGE);
                    }
                     }else
                     {
                         if(jTextField2.getText().equals("EDITAR"))
                         {
                              try
                             {
                                 cp.actualizarRegistro(pago);                               
                                JOptionPane.showMessageDialog( null, "REGISTRO DEL PAGO SE ACTUALIZO CORRECTAMENTE", "ACTUALIZANDO", JOptionPane.INFORMATION_MESSAGE);
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR ACTUALIZAR EL PAGO", "VERIFICAR", JOptionPane.ERROR_MESSAGE);
                                //ex.printStackTrace();
                            }
                             }
                        }
                     }
                    }
                 }
             }

    }//GEN-LAST:event_JBtnPagarActionPerformed

    private void dateChooserCombo2OnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dateChooserCombo2OnCommit
        
        String []datos=dateChooserCombo2.getText().split("/");

        String Dia, Mes, Ano;

        Dia="";
        Mes="";
        Ano="";

        Dia=datos[0];
        Mes=datos[1];
        Ano=datos[2];

        JTxtFechaCubierta.setText(Dia+"-" + Mes + "-"+ Ano); //Caja de texto donde va la fecha extraida
    }//GEN-LAST:event_dateChooserCombo2OnCommit

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        
        if(jCheckBox1.isSelected())
        {
        dateChooserCombo2.setEnabled(true);
        }
        else
        {
            dateChooserCombo2.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void JBtnImprimeReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnImprimeReciboActionPerformed
       this.folio=String.valueOf(this.JTxtFolio.getText());
        this.cuenta=String.valueOf(this.JTxtNoCuenta.getText());
      //  this.cliente=String.valueOf(this.JTxtNoCliente.getText());
        this.nom=String.valueOf(this.JTxtNombre.getText());
        this.dire=String.valueOf(this.JTxtDireccion.getText());
        this.col=String.valueOf(this.JTxtColonia.getText());
        this.muni=String.valueOf(this.JTxtMunicipio.getText());
        this.tel=String.valueOf(this.JTxtTelefono.getText());
        this.rfc=String.valueOf(this.JTxtRfc.getText());
        this.fechacub=String.valueOf(this.JTxtFechaCubierta.getText());
        this.fechaapagar=String.valueOf(this.JTxtFechaaPagar.getText());
        this.mesestransc=String.valueOf(this.JTxtMesesTranscurridos.getText());
        this.rezagos=String.valueOf(this.JTxtRezagos.getText());
        this.recargos=String.valueOf(this.JTxtRecargos.getText());
        this.subtotal=String.valueOf(this.JTxtSubtotal.getText());
        this.total=String.valueOf(this.JTxtTotal.getText());
        
        pago =new Pago();
        Cliente cli = new Cliente();
        pago.setCivFolio(Integer.parseInt(JTxtFolio.getText()));
        pago.setNorCuenta(Integer.parseInt(JTxtNoCuenta.getText()));
        pago.setFechaCubierta(JTxtFechaCubierta.getText());
        pago.setMesesTranscurridos(Integer.parseInt(JTxtMesesTranscurridos.getText()));
        pago.setFechaPago(JTxtFechaaPagar.getText());
        pago.setRezago(Float.parseFloat(JTxtRezagos.getText()));
        pago.setPagoCalculado(Float.parseFloat(JTxtSubtotal.getText()));
        pago.setRecargo(Float.parseFloat(JTxtRecargos.getText()));
        pago.setTotal(Float.parseFloat(JTxtTotal.getText()));
        pago.setFechaRegistro(dateChooserCombo1.getSelectedDate().getTime());        
        
        cli.setNombre(this.JTxtNombre.getText());
        cli.setDireccion(this.JTxtDireccion.getText());
        cli.setColonia(this.JTxtColonia.getText());
        cli.setMunicipio(this.JTxtMunicipio.getText());
        cli.setTelefono(Double.parseDouble(this.JTxtTelefono.getText()));
        cli.setRfc(this.JTxtRfc.getText());
        pago.setCliente(cli);

        try
        {
            JDlgTicket c=new JDlgTicket(null,true);
            //c.mostrar(folio, cuenta, nom, dire, col, muni, tel, rfc, fechacub, fechaapagar, mesestransc, rezagos, recargos, subtotal, total);
            c.mostrar(pago);
            c.setVisible(true);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog( null, "ERROR AL GENERAR EL RECIBO DEL PAGO", "VERIFICAR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBtnImprimeReciboActionPerformed

    private void JBtnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnBuscar2ActionPerformed
        // TODO add your handling code here:
        JDlgClientes clientes = new JDlgClientes(null, true);
        clientes.setVisible(true);
    }//GEN-LAST:event_JBtnBuscar2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgRegPagos dialog = new JDlgRegPagos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JBtnBuscar;
    private javax.swing.JButton JBtnBuscar2;
    private javax.swing.JButton JBtnCalcular;
    private javax.swing.JButton JBtnCancelar;
    private javax.swing.JButton JBtnImprimeRecibo;
    private javax.swing.JButton JBtnPagar;
    private datechooser.beans.DateChooserCombo JDtChFechaaPagar;
    private javax.swing.JTextField JTxtColonia;
    private javax.swing.JTextField JTxtDireccion;
    private javax.swing.JTextField JTxtFechaCubierta;
    private javax.swing.JTextField JTxtFechaaPagar;
    private javax.swing.JTextField JTxtFolio;
    private javax.swing.JTextField JTxtMesesTranscurridos;
    private javax.swing.JTextField JTxtMunicipio;
    private javax.swing.JTextField JTxtNoCuenta;
    private javax.swing.JTextField JTxtNombre;
    private javax.swing.JTextField JTxtRecargos;
    private javax.swing.JTextField JTxtRezagos;
    private javax.swing.JTextField JTxtRfc;
    private javax.swing.JTextField JTxtSubtotal;
    private javax.swing.JTextField JTxtTarifa;
    private javax.swing.JTextField JTxtTelefono;
    private javax.swing.JTextField JTxtTotal;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
