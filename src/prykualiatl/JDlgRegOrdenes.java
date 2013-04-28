package prykualiatl;
import elaprendiz.ControllerCliente;
import elaprendiz.ControllerOrden;
import elaprendiz.bdmodel.Cliente;
import elaprendiz.bdmodel.Orden;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
public class JDlgRegOrdenes extends javax.swing.JDialog {

    public String claveclientess;
    public int clavenueva;
    public String folioo,cuentaa,cliente,nom,dire,col;
    public String muni,tele,rfcc,inspectorr,tipoo,motivos;

    public JDlgRegOrdenes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LimpiaCajas();
        ultimoregistro();
        jTextField1.setVisible(false);
        SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yy");
        JDtChFecha.setDateFormat(dateformat);
         setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);
JBtnGuardar.setEnabled(false);
        this.JTxtNoCuenta.setDocument(new JTextFieldLimit(4));
        this.JTxtInspector.setDocument(new JTextFieldLimit(30));
        this.JTxtMotivo.setDocument(new JTextFieldLimit(50));
        this.JTxtFecha.setDocument(new JTextFieldLimit(10));
    }

public void ActivaBotones(boolean cal,boolean p,boolean i,boolean c)
{
    JBtnGuardar.setEnabled(cal);
    JBtnCancelar.setEnabled(p);
}

private void LimpiaCajas()
{
     //  JTxtNoCliente.setText("");
       JTxtNoCuenta.setText("");
       JTxtNombre.setText("");
       JTxtDireccion.setText("");
       JTxtColonia.setText("");
       JTxtMunicipio.setText("");
       JTxtTelefono.setText("");
       JTxtRfc.setText("");
       JTxtInspector.setText("");
       JTxtFecha.setText("");
       
}


public void mostrar(Orden ord)
{
    this.JTxtNoOrden.setText(ord.getNroOrdern().toString());
    this.JTxtFecha.setText(ord.getFechaFormateada(ord.getFecha()));
    this.JCmbTipo.getModel().setSelectedItem(ord.getTipo());
    this.JTxtInspector.setText(ord.getInspector());
    this.JTxtNoCuenta.setText(ord.getNorCuenta().toString());
    this.JTxtNombre.setText(ord.getCliente().getNombre());
    this.JTxtDireccion.setText(ord.getCliente().getDireccion());
    this.JTxtColonia.setText(ord.getCliente().getColonia());
    this.JTxtMunicipio.setText(ord.getCliente().getMunicipio());
    this.JTxtTelefono.setText(ord.getCliente().getTelefono().toString());
    this.JTxtRfc.setText(ord.getCliente().getRfc());
    this.JTxtMotivo.setText(ord.getMotivoCorte()); 
}

public void mostrar1(String guar)
{
    jTextField1.setText(guar.trim());
}

private void ultimoregistro()
{
    try
    {
      this.JTxtNoOrden.setText(ControllerOrden.getUltimoRegistro().toString());
    }catch (Exception ex) {
               JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR ABRIR LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTxtNoOrden = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        JTxtNoCuenta = new javax.swing.JTextField();
        JBtnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        JTxtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JTxtDireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JTxtTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JTxtRfc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JTxtColonia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        JTxtMunicipio = new javax.swing.JTextField();
        JBtnBuscar2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JTxtFecha = new javax.swing.JTextField();
        JDtChFecha = new datechooser.beans.DateChooserCombo();
        jLabel5 = new javax.swing.JLabel();
        JTxtInspector = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JCmbTipo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        JBtnGuardar = new javax.swing.JButton();
        JBtnImprimir = new javax.swing.JButton();
        JBtnCancelar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        JTxtMotivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(prykualiatl.PryKualiAtlApp.class).getContext().getResourceMap(JDlgRegOrdenes.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        JTxtNoOrden.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtNoOrden.setText(resourceMap.getString("JTxtNoOrden.text")); // NOI18N
        JTxtNoOrden.setEnabled(false);
        JTxtNoOrden.setName("JTxtNoOrden"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel1.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel1.border.titleFont"))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        JTxtNoCuenta.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtNoCuenta.setText(resourceMap.getString("JTxtNoCuenta.text")); // NOI18N
        JTxtNoCuenta.setName("JTxtNoCuenta"); // NOI18N
        JTxtNoCuenta.setNextFocusableComponent(JTxtInspector);
        JTxtNoCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtNoCuentaKeyTyped(evt);
            }
        });

        JBtnBuscar.setIcon(resourceMap.getIcon("JBtnBuscar.icon")); // NOI18N
        JBtnBuscar.setText(resourceMap.getString("JBtnBuscar.text")); // NOI18N
        JBtnBuscar.setToolTipText(resourceMap.getString("JBtnBuscar.toolTipText")); // NOI18N
        JBtnBuscar.setName("JBtnBuscar"); // NOI18N
        JBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnBuscarActionPerformed(evt);
            }
        });
        JBtnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JBtnBuscarKeyTyped(evt);
            }
        });

        jLabel9.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        JTxtNombre.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtNombre.setText(resourceMap.getString("JTxtNombre.text")); // NOI18N
        JTxtNombre.setEnabled(false);
        JTxtNombre.setName("JTxtNombre"); // NOI18N

        jLabel10.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        JTxtDireccion.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtDireccion.setText(resourceMap.getString("JTxtDireccion.text")); // NOI18N
        JTxtDireccion.setEnabled(false);
        JTxtDireccion.setName("JTxtDireccion"); // NOI18N

        jLabel11.setFont(resourceMap.getFont("jLabel11.font")); // NOI18N
        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        JTxtTelefono.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtTelefono.setText(resourceMap.getString("JTxtTelefono.text")); // NOI18N
        JTxtTelefono.setEnabled(false);
        JTxtTelefono.setName("JTxtTelefono"); // NOI18N

        jLabel12.setFont(resourceMap.getFont("jLabel12.font")); // NOI18N
        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N

        JTxtRfc.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtRfc.setText(resourceMap.getString("JTxtRfc.text")); // NOI18N
        JTxtRfc.setEnabled(false);
        JTxtRfc.setName("JTxtRfc"); // NOI18N

        jLabel13.setFont(resourceMap.getFont("jLabel13.font")); // NOI18N
        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N

        JTxtColonia.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtColonia.setText(resourceMap.getString("JTxtColonia.text")); // NOI18N
        JTxtColonia.setEnabled(false);
        JTxtColonia.setName("JTxtColonia"); // NOI18N

        jLabel14.setFont(resourceMap.getFont("jLabel14.font")); // NOI18N
        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N

        JTxtMunicipio.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtMunicipio.setText(resourceMap.getString("JTxtMunicipio.text")); // NOI18N
        JTxtMunicipio.setEnabled(false);
        JTxtMunicipio.setName("JTxtMunicipio"); // NOI18N

        JBtnBuscar2.setIcon(resourceMap.getIcon("JBtnBuscar2.icon")); // NOI18N
        JBtnBuscar2.setText(resourceMap.getString("JBtnBuscar2.text")); // NOI18N
        JBtnBuscar2.setToolTipText(resourceMap.getString("JBtnBuscar2.toolTipText")); // NOI18N
        JBtnBuscar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnBuscar2.setName("JBtnBuscar2"); // NOI18N
        JBtnBuscar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTxtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(JTxtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTxtRfc, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(JTxtMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JTxtNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBtnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JTxtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTxtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JTxtNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBtnBuscar)
                            .addComponent(JBtnBuscar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(JTxtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(JTxtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTxtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        JTxtFecha.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtFecha.setText(resourceMap.getString("JTxtFecha.text")); // NOI18N
        JTxtFecha.setEnabled(false);
        JTxtFecha.setName("JTxtFecha"); // NOI18N
        JTxtFecha.setNextFocusableComponent(JTxtNoCuenta);
        JTxtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtFechaKeyTyped(evt);
            }
        });

        JDtChFecha.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaOnCommit(evt);
            }
        });

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        JTxtInspector.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtInspector.setText(resourceMap.getString("JTxtInspector.text")); // NOI18N
        JTxtInspector.setName("JTxtInspector"); // NOI18N
        JTxtInspector.setNextFocusableComponent(JCmbTipo);
        JTxtInspector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtInspectorKeyTyped(evt);
            }
        });

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        JCmbTipo.setFont(resourceMap.getFont("JCmbTipo.font")); // NOI18N
        JCmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "corte", "reconexion" }));
        JCmbTipo.setName("JCmbTipo"); // NOI18N
        JCmbTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JCmbTipoKeyTyped(evt);
            }
        });

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        JBtnGuardar.setFont(resourceMap.getFont("JBtnGuardar.font")); // NOI18N
        JBtnGuardar.setIcon(resourceMap.getIcon("JBtnGuardar.icon")); // NOI18N
        JBtnGuardar.setText(resourceMap.getString("JBtnGuardar.text")); // NOI18N
        JBtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnGuardar.setName("JBtnGuardar"); // NOI18N
        JBtnGuardar.setNextFocusableComponent(JBtnImprimir);
        JBtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnGuardarActionPerformed(evt);
            }
        });
        JBtnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JBtnGuardarKeyTyped(evt);
            }
        });

        JBtnImprimir.setFont(resourceMap.getFont("JBtnImprimir.font")); // NOI18N
        JBtnImprimir.setIcon(resourceMap.getIcon("JBtnImprimir.icon")); // NOI18N
        JBtnImprimir.setText(resourceMap.getString("JBtnImprimir.text")); // NOI18N
        JBtnImprimir.setActionCommand(resourceMap.getString("JBtnImprimir.actionCommand")); // NOI18N
        JBtnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnImprimir.setName("JBtnImprimir"); // NOI18N
        JBtnImprimir.setNextFocusableComponent(JBtnCancelar);
        JBtnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnImprimirActionPerformed(evt);
            }
        });
        JBtnImprimir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JBtnImprimirKeyTyped(evt);
            }
        });

        JBtnCancelar.setFont(resourceMap.getFont("JBtnCancelar.font")); // NOI18N
        JBtnCancelar.setIcon(resourceMap.getIcon("JBtnCancelar.icon")); // NOI18N
        JBtnCancelar.setText(resourceMap.getString("JBtnCancelar.text")); // NOI18N
        JBtnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnCancelar.setName("JBtnCancelar"); // NOI18N
        JBtnCancelar.setNextFocusableComponent(JTxtFecha);
        JBtnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnCancelarActionPerformed(evt);
            }
        });

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N

        JTxtMotivo.setColumns(10);
        JTxtMotivo.setFont(resourceMap.getFont("JTxtMotivo.font")); // NOI18N
        JTxtMotivo.setText(resourceMap.getString("JTxtMotivo.text")); // NOI18N
        JTxtMotivo.setName("JTxtMotivo"); // NOI18N
        JTxtMotivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtMotivoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel1)
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTxtNoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JDtChFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(JBtnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBtnImprimir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBtnCancelar))
                            .addComponent(JTxtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTxtInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JCmbTipo, 0, 223, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(JTxtNoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(JDtChFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(JTxtInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(JCmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTxtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBtnGuardar)
                            .addComponent(JBtnImprimir)
                            .addComponent(JBtnCancelar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBtnCancelarActionPerformed

    private void JBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnBuscarActionPerformed
        
    String b;
    if(JTxtNoCuenta.getText().equals(""))
        {
            JOptionPane.showMessageDialog( null, "DEBE ESCRIBIR NUMERO DE CUENTA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            JTxtNoCuenta.requestFocus();
           JBtnGuardar.setEnabled(false);
        }
        else
        {
        if(JBtnBuscar.isEnabled())
        {
            ControllerCliente cc = new ControllerCliente();
            try
            {
                Cliente cli = (Cliente) cc.getRegistro(Integer.parseInt(JTxtNoCuenta.getText()));
                            
                  if(cli!= null){
                     JTxtNombre.setText(cli.getNombre());
                     JTxtDireccion.setText(cli.getDireccion());
                     JTxtColonia.setText(cli.getColonia());
                     JTxtMunicipio.setText(cli.getMunicipio());
                     JTxtTelefono.setText(cli.getTelefono().toString());
                     JTxtRfc.setText(cli.getRfc());
                     
                     JBtnGuardar.setEnabled(true);
                  }else
                  {
                     JOptionPane.showMessageDialog( null, "NO SE ENCUENTRA O NO EXISTE EL NUMERO DE CUENTA", "BUSCANDO", JOptionPane.ERROR_MESSAGE);
                     JTxtNoCuenta.requestFocus();
                     JBtnGuardar.setEnabled(false);
                  }
                
            }catch (Exception ex) {
                        //  Logger.getLogger(JDlgClientes.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR ABRIR LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
                  }
        }
        }
    }//GEN-LAST:event_JBtnBuscarActionPerformed

    private void JBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnGuardarActionPerformed
        if(     this.JTxtFecha.getText().equals(""))
       {
       JOptionPane.showMessageDialog( null, "DEBE SELECCIONAR LA FECHA DE REGISTRO", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
       this.JTxtFecha.requestFocus();
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
                 if(     this.JTxtInspector.getText().equals(""))
               {
               JOptionPane.showMessageDialog( null, "DEBE ESCRIBIR EL NOMBRE DEL INSPECTOR", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
               this.JTxtInspector.requestFocus();
               }
                 else
                 {
                 if(this.JTxtMotivo.getText().equals(""))
                   {
                   JOptionPane.showMessageDialog( null, "DEBE ESCRIBIR EL MOTIVO DE LA ORDEN", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
                   this.JTxtMotivo.requestFocus();
                   }else{
                     
                     Orden ord = new Orden();
                     ord.setNroOrdern(Integer.parseInt(JTxtNoOrden.getText()));
                     ord.setFecha(JDtChFecha.getSelectedDate().getTime());
                     ord.setInspector(JTxtInspector.getText());
                     ord.setNorCuenta(Integer.parseInt(JTxtNoCuenta.getText()));
                     ord.setTipo(JCmbTipo.getModel().getSelectedItem().toString());
                     ord.setMotivoCorte(JTxtMotivo.getText());
                     ControllerOrden co = new ControllerOrden();

                if(jTextField1.getText().equals("GUARDAR"))
                 {
                                try
                                 {
                                   co.guardarRegistro(ord);
                                 JOptionPane.showMessageDialog( null, "REGISTRO GUARDADO CORRECTAMENTE", "GUARDANDO", JOptionPane.INFORMATION_MESSAGE);
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR GUARDAR EL REGISTRO", "VERIFICAR", JOptionPane.ERROR_MESSAGE);
                           // ex.printStackTrace();
                        }
                  }else
                {
                  if(    jTextField1.getText().equals("EDITAR"))
                   {
                      try
                         {
                           co.actualizarRegistro(ord);
                 JOptionPane.showMessageDialog( null, "REGISTRO ACTUALIZADO CORRECTAMENTE", "ACTUALIZANDO", JOptionPane.INFORMATION_MESSAGE);
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR ACTUALIZAR EL REGISTRO", "VERIFICAR", JOptionPane.ERROR_MESSAGE);
                        }
                  }
                }
}
                      }
                 }
             }
        
    }//GEN-LAST:event_JBtnGuardarActionPerformed

    private void JDtChFechaOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_JDtChFechaOnCommit
        
        String []datos=JDtChFecha.getText().split("/");

        String Dia, Mes, Ano;

        Dia="";
        Mes="";
        Ano="";

        Dia=datos[0];
        Mes=datos[1];
        Ano=datos[2];

        JTxtFecha.setText(Dia+"-" + Mes + "-"+ Ano); //Caja de texto donde va la fecha extraida
    }//GEN-LAST:event_JDtChFechaOnCommit

    private void JTxtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtFechaKeyTyped
      
        char numlet=  evt.getKeyChar();
        if(numlet==10)
      {
          this.JTxtNoCuenta.requestFocus();
      }
    }//GEN-LAST:event_JTxtFechaKeyTyped

    private void JTxtNoCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtNoCuentaKeyTyped
       
        char numero=  evt.getKeyChar();
      if(!(numero>='0' && numero<='9'))
      {
          evt.consume();
      }
      if(numero==10)
      {
          this.JBtnBuscar.requestFocus();
      }
    }//GEN-LAST:event_JTxtNoCuentaKeyTyped

    private void JBtnBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBtnBuscarKeyTyped
      
        char numlet=  evt.getKeyChar();
        if(numlet==10)
      {
          this.JTxtInspector.requestFocus();
      }
    }//GEN-LAST:event_JBtnBuscarKeyTyped

    private void JTxtInspectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtInspectorKeyTyped
      
        char numlet=  evt.getKeyChar();
        if( numlet>='0' && numlet<='9'|| numlet>='A' && numlet<='Z' )
      {
          evt.consume();
      }
        if(numlet==10)
      {
          this.JCmbTipo.requestFocus();
      }
    }//GEN-LAST:event_JTxtInspectorKeyTyped

    private void JCmbTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JCmbTipoKeyTyped
        
        char numlet=  evt.getKeyChar();
        
        if(numlet==10)
      {
          this.JTxtMotivo.requestFocus();
      }
    }//GEN-LAST:event_JCmbTipoKeyTyped

    private void JBtnGuardarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBtnGuardarKeyTyped
       
        char numlet=  evt.getKeyChar();
        if(numlet==10)
      {
          this.JBtnImprimir.requestFocus();
      }
    }//GEN-LAST:event_JBtnGuardarKeyTyped

    private void JBtnImprimirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBtnImprimirKeyTyped
       
        char numlet=  evt.getKeyChar();
        if(numlet==10)
      {
          this.JBtnCancelar.requestFocus();
      }
    }//GEN-LAST:event_JBtnImprimirKeyTyped

    private void JBtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnImprimirActionPerformed
                 
       
        Orden ord = new Orden();
         ord.setNroOrdern(Integer.parseInt(JTxtNoOrden.getText()));
         ord.setNorCuenta(Integer.parseInt(JTxtNoCuenta.getText()));
         ord.setTipo(JCmbTipo.getModel().getSelectedItem().toString());
         ord.setMotivoCorte(JTxtMotivo.getText());
         ord.setInspector(this.JTxtInspector.getText());
         
          Cliente cli = new Cliente();
          cli.setNombre(this.JTxtNombre.getText());
          cli.setDireccion(this.JTxtDireccion.getText());
          cli.setColonia(this.JTxtColonia.getText());
          cli.setMunicipio(this.JTxtMunicipio.getText());
          cli.setTelefono(Double.parseDouble(this.JTxtTelefono.getText()));
          cli.setRfc(this.JTxtRfc.getText());
          
         ord.setCliente(cli);
         

        try
        {
            JDlgImprimeOrden c=new JDlgImprimeOrden(null,true);
            //c.mostrar(folioo,cuentaa, nom, dire, col, muni, tele, rfcc, inspectorr, tipoo, motivos);
            c.mostrar(ord);
            c.setVisible(true);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog( null, "ERROR AL GENERAR LA ORDEN", "VERIFICAR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBtnImprimirActionPerformed

    private void JBtnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnBuscar2ActionPerformed
JDlgClientes clientes = new JDlgClientes(null, true);
        clientes.setVisible(true);

    }//GEN-LAST:event_JBtnBuscar2ActionPerformed

    private void JTxtMotivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtMotivoKeyTyped
        // TODO add your handling code here:
        char numlet=  evt.getKeyChar();
        if(numlet>='0' && numlet<='9'|| numlet>='A' && numlet<='Z' )
      {
          evt.consume();
      }
        if(numlet==10)
      {
          this.JBtnGuardar.requestFocus();
      }
    }//GEN-LAST:event_JTxtMotivoKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgRegOrdenes dialog = new JDlgRegOrdenes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JBtnCancelar;
    private javax.swing.JButton JBtnGuardar;
    private javax.swing.JButton JBtnImprimir;
    private javax.swing.JComboBox JCmbTipo;
    private datechooser.beans.DateChooserCombo JDtChFecha;
    private javax.swing.JTextField JTxtColonia;
    private javax.swing.JTextField JTxtDireccion;
    private javax.swing.JTextField JTxtFecha;
    private javax.swing.JTextField JTxtInspector;
    private javax.swing.JTextField JTxtMotivo;
    private javax.swing.JTextField JTxtMunicipio;
    private javax.swing.JTextField JTxtNoCuenta;
    private javax.swing.JTextField JTxtNoOrden;
    private javax.swing.JTextField JTxtNombre;
    private javax.swing.JTextField JTxtRfc;
    private javax.swing.JTextField JTxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
