package prykualiatl;
import elaprendiz.ControllerCliente;
import elaprendiz.bdmodel.Cliente;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;

//import java.util.logging.Logger;
//import java.util.logging.Level;
//import javax.swing.JTextField;
//import java.lang.*;
//import java.text.*;
import java.text.SimpleDateFormat;
//import javax.swing.InputVerifier;
//import java.awt.event.*;
public class JDlgRegCliente extends javax.swing.JDialog
{
public String claveclientess;
public int clavenueva;
public String operacionn;


 public int y;

    public JDlgRegCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LimpiaCajas();
         ultimoregistro();
         jTextField2.setVisible(false);
         y=0;
         y=1;
        JTxtDireccion.setText("");
        SimpleDateFormat dateformat=new SimpleDateFormat("yyyy/MM/dd");
        this.JDtChFechaRegistro.setDateFormat(dateformat);
         setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);
   
     JTxtNombre.setDocument(new JTextFieldLimit(50));
     this.JTxtDireccion.setDocument(new JTextFieldLimit(50));
     this.JTxtTelefono.setDocument(new JTextFieldLimit(12));
    this.JTxtRfc.setDocument(new JTextFieldLimit(20));
    this.JTxtColonia.setDocument(new JTextFieldLimit(20));
    this.JTxtComunidad.setDocument(new JTextFieldLimit(20));
    this.JTxtMunicipio.setDocument(new JTextFieldLimit(20));
    this.JTxtCodigoPostal.setDocument(new JTextFieldLimit(10));
    //this.JCmbTarifa.setDocument(new JTextFieldLimit(50));
    this.jTextField1.setDocument(new JTextFieldLimit(10));


 
   }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTxtNoCuenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTxtNombre = new javax.swing.JTextField();
        JDtChFechaRegistro = new datechooser.beans.DateChooserCombo();
        jLabel7 = new javax.swing.JLabel();
        JTxtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTxtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JTxtRfc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JTxtColonia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JTxtComunidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JTxtMunicipio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JTxtCodigoPostal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        JCmbTarifa = new javax.swing.JComboBox();
        JBtnGuardar = new javax.swing.JButton();
        JBtnCancelar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(prykualiatl.PryKualiAtlApp.class).getContext().getResourceMap(JDlgRegCliente.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        JTxtNoCuenta.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtNoCuenta.setText(resourceMap.getString("JTxtNoCuenta.text")); // NOI18N
        JTxtNoCuenta.setEnabled(false);
        JTxtNoCuenta.setName("JTxtNoCuenta"); // NOI18N
        JTxtNoCuenta.setNextFocusableComponent(JTxtNombre);
        JTxtNoCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtNoCuentaKeyTyped(evt);
            }
        });

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        JTxtNombre.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtNombre.setText(resourceMap.getString("JTxtNombre.text")); // NOI18N
        JTxtNombre.setName("JTxtNombre"); // NOI18N
        JTxtNombre.setNextFocusableComponent(JTxtDireccion);
        JTxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtNombreKeyTyped(evt);
            }
        });

        JDtChFechaRegistro.setFieldFont(resourceMap.getFont("JDtChFechaRegistro.dch_combo_fieldFont")); // NOI18N
        JDtChFechaRegistro.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaRegistroOnCommit(evt);
            }
        });

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        JTxtDireccion.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtDireccion.setText(resourceMap.getString("JTxtDireccion.text")); // NOI18N
        JTxtDireccion.setName("JTxtDireccion"); // NOI18N
        JTxtDireccion.setNextFocusableComponent(JTxtTelefono);
        JTxtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtDireccionKeyTyped(evt);
            }
        });

        jLabel8.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        JTxtTelefono.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtTelefono.setText(resourceMap.getString("JTxtTelefono.text")); // NOI18N
        JTxtTelefono.setName("JTxtTelefono"); // NOI18N
        JTxtTelefono.setNextFocusableComponent(JTxtRfc);
        JTxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtTelefonoKeyTyped(evt);
            }
        });

        jLabel9.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        JTxtRfc.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtRfc.setText(resourceMap.getString("JTxtRfc.text")); // NOI18N
        JTxtRfc.setName("JTxtRfc"); // NOI18N
        JTxtRfc.setNextFocusableComponent(JTxtColonia);
        JTxtRfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtRfcKeyTyped(evt);
            }
        });

        jLabel10.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        JTxtColonia.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtColonia.setText(resourceMap.getString("JTxtColonia.text")); // NOI18N
        JTxtColonia.setName("JTxtColonia"); // NOI18N
        JTxtColonia.setNextFocusableComponent(JTxtComunidad);
        JTxtColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtColoniaKeyTyped(evt);
            }
        });

        jLabel11.setFont(resourceMap.getFont("jLabel11.font")); // NOI18N
        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        JTxtComunidad.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtComunidad.setText(resourceMap.getString("JTxtComunidad.text")); // NOI18N
        JTxtComunidad.setName("JTxtComunidad"); // NOI18N
        JTxtComunidad.setNextFocusableComponent(JTxtMunicipio);
        JTxtComunidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtComunidadKeyTyped(evt);
            }
        });

        jLabel12.setFont(resourceMap.getFont("jLabel12.font")); // NOI18N
        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N

        JTxtMunicipio.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtMunicipio.setText(resourceMap.getString("JTxtMunicipio.text")); // NOI18N
        JTxtMunicipio.setName("JTxtMunicipio"); // NOI18N
        JTxtMunicipio.setNextFocusableComponent(JTxtCodigoPostal);
        JTxtMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtMunicipioKeyTyped(evt);
            }
        });

        jLabel13.setFont(resourceMap.getFont("jLabel13.font")); // NOI18N
        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N

        JTxtCodigoPostal.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        JTxtCodigoPostal.setText(resourceMap.getString("JTxtCodigoPostal.text")); // NOI18N
        JTxtCodigoPostal.setName("JTxtCodigoPostal"); // NOI18N
        JTxtCodigoPostal.setNextFocusableComponent(JCmbTarifa);
        JTxtCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtCodigoPostalKeyTyped(evt);
            }
        });

        jLabel14.setFont(resourceMap.getFont("jLabel14.font")); // NOI18N
        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N

        JCmbTarifa.setFont(resourceMap.getFont("JCmbTarifa.font")); // NOI18N
        JCmbTarifa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "domestico", "comercial", "industrial", "publico", "insen", "baldio", "especial" }));
        JCmbTarifa.setName("JCmbTarifa"); // NOI18N
        JCmbTarifa.setNextFocusableComponent(JBtnGuardar);
        JCmbTarifa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JCmbTarifaKeyTyped(evt);
            }
        });

        JBtnGuardar.setFont(resourceMap.getFont("JBtnGuardar.font")); // NOI18N
        JBtnGuardar.setIcon(resourceMap.getIcon("JBtnGuardar.icon")); // NOI18N
        JBtnGuardar.setText(resourceMap.getString("JBtnGuardar.text")); // NOI18N
        JBtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnGuardar.setName("JBtnGuardar"); // NOI18N
        JBtnGuardar.setNextFocusableComponent(JBtnCancelar);
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

        jTextField1.setFont(resourceMap.getFont("JTxtColonia.font")); // NOI18N
        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setEnabled(false);
        jTextField1.setName("jTextField1"); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JTxtNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(JDtChFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(43, 43, 43)
                                            .addComponent(JTxtNombre))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel10))
                                            .addGap(27, 27, 27)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(JTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(JTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel9)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(JTxtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(JTxtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JTxtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JCmbTarifa, 0, 171, Short.MAX_VALUE))
                                    .addComponent(JTxtComunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JTxtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBtnCancelar)
                        .addGap(165, 165, 165))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(JTxtNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JDtChFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTxtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTxtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JTxtComunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(JTxtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(JTxtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(JCmbTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtnGuardar)
                    .addComponent(JBtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void mostrar(Cliente cnt)
{
    this.JTxtNoCuenta.setText(cnt.getNroCuenta().toString());
    this.JTxtNombre.setText(cnt.getNombre());
    this.JTxtDireccion.setText(cnt.getDireccion());
    this.JTxtTelefono.setText(cnt.getTelefono().toString());
    this.JTxtRfc.setText(cnt.getRfc());
    this.JTxtColonia.setText(cnt.getColonia());
    this.JTxtComunidad.setText(cnt.getComunidad());
    this.JTxtMunicipio.setText(cnt.getMunicipio());
    this.JTxtCodigoPostal.setText(cnt.getCodPostal());
    this.JCmbTarifa.getModel().setSelectedItem(cnt.getTarifa());
    this.jTextField1.setText(cnt.getFechaFormateada(cnt.getFechaRegistro()));
}
public void mostrar1(String guar)
{
    jTextField2.setText(guar.trim());
}

private void LimpiaCajas()
{
      // JTxtNoCuenta.setText("");
       JTxtNombre.setText("");
       JTxtDireccion.setText("");
       JTxtColonia.setText("");
       JTxtMunicipio.setText("");
       JTxtTelefono.setText("");
       JTxtRfc.setText("");
       JTxtComunidad.setText("");
       JTxtCodigoPostal.setText("");
}

private void ultimoregistro()
{
    try
    {               
      this.JTxtNoCuenta.setText(ControllerCliente.getUltimoRegistro().toString());
    }catch (Exception ex) {
               JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR ABRIR LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
}

    private void JBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnGuardarActionPerformed

 if(     this.jTextField1.getText().equals(""))
       {
       JOptionPane.showMessageDialog( null, "DEBE SELECCIONAR LA FECHA DE REGISTRO", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
       this.jTextField1.requestFocus();
       }
     else
     {
         if(     this.JTxtNombre.getText().equals(""))
         {
             JOptionPane.showMessageDialog( null, "FALTA ESCRIBIR EL NOMBRE DEL CLIENTE", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
             this.JTxtNombre.requestFocus();
         }
     // }
         else
         {
             if(     this.JTxtDireccion.getText().equals(""))
             {
             JOptionPane.showMessageDialog( null, "FALTA ESCRIBIR LA DIRECCION DEL CLIENTE", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
             this.JTxtDireccion.requestFocus();
             }
        // }
            else
            {
                 if(     this.JTxtTelefono.getText().equals(""))
                   {
                 JOptionPane.showMessageDialog( null, "FALTA ESCRIBIR EL TELEFONO DEL CLIENTE", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
                 this.JTxtTelefono.requestFocus();
                   }
          //  }
                 else
                 {
                     if(     this.JTxtRfc.getText().equals(""))
                      {
                      JOptionPane.showMessageDialog( null, "FALTA ESCRIBIR EL RFC DEL CLIENTE", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
                      this.JTxtRfc.requestFocus();
                       }
             //    }
                     else
                     {
                         if(     this.JTxtColonia.getText().equals(""))
                           {
                           JOptionPane.showMessageDialog( null, "FALTA ESCRIBIR LA COLONIA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
                           this.JTxtColonia.requestFocus();
                           }
               //      }
                         else
                         {
                             if(     this.JTxtComunidad.getText().equals(""))
                               {
                               JOptionPane.showMessageDialog( null, "FALTA ESCRIBIR LA COMUNIDAD", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
                               this.JTxtComunidad.requestFocus();
                               }
                   //      }
                             else
                             {
                                 if(     this.JTxtMunicipio.getText().equals(""))
                                   {
                                   JOptionPane.showMessageDialog( null, "FALTA ESCRIBIR EL MUNICIPIO", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
                                   this.JTxtMunicipio.requestFocus();
                                   }
                     //        }
                                 else
                                 {
                                     if(     this.JTxtCodigoPostal.getText().equals(""))
                                       {
                                       JOptionPane.showMessageDialog( null, "FALTA ESCRIBIR EL CODIGO POSTAL", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
                                       this.JTxtCodigoPostal.requestFocus();
                                       }
           
 //}
                                     else
                                      {
                                          
                                    Cliente cliente = new Cliente();
                                    cliente.setNroCuenta(Integer.parseInt(JTxtNoCuenta.getText()));
                                    cliente.setNombre(JTxtNombre.getText());
                                    cliente.setDireccion(JTxtDireccion.getText());
                                    cliente.setTelefono(Double.parseDouble(JTxtTelefono.getText()));
                                    cliente.setRfc(JTxtRfc.getText());
                                    cliente.setColonia(JTxtColonia.getText());
                                    cliente.setComunidad(JTxtComunidad.getText());
                                    cliente.setMunicipio(JTxtMunicipio.getText());
                                    cliente.setCodPostal(JTxtCodigoPostal.getText());
                                    cliente.setTarifa(JCmbTarifa.getModel().getSelectedItem().toString());
                                    cliente.setFechaRegistro(JDtChFechaRegistro.getSelectedDate().getTime());       
                                          

                             if(jTextField2.getText().equals("GUARDAR"))
                              {
                                 try
                                 { 
                                    ControllerCliente cc = new ControllerCliente();
                                    cc.guardarRegistro(cliente);
                                   JOptionPane.showMessageDialog( null, "REGISTRO GUARDADO CORRECTAMENTE", "GUARDANDO", JOptionPane.INFORMATION_MESSAGE);
                                } catch (Exception ex) {
                                    JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR GUARDAR EL REGISTRO", "VERIFICAR", JOptionPane.ERROR_MESSAGE);
                                    
                                }
                             }
                             else
                               {
                                 if(jTextField2.getText().equals("EDITAR"))
                                {
                                    try
                                     {
                                        ControllerCliente cc = new ControllerCliente();
                                        cc.actualizarRegistro(cliente);
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
                         }
                     }
                 }
             }
         }            
                             
                         
                         
                      
                  
             
         
    }//GEN-LAST:event_JBtnGuardarActionPerformed

    private void JDtChFechaRegistroOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_JDtChFechaRegistroOnCommit
        
        String []datos=JDtChFechaRegistro.getText().split("/");
       
        String Dia, Mes, Ano;

        Dia="";
        Mes="";
        Ano="";
        Ano=datos[0];
        Mes=datos[1];
        Dia=datos[2];

        jTextField1.setText(Ano+"-" + Mes + "-"+ Dia); //Caja de texto donde va la fecha extraida
    }//GEN-LAST:event_JDtChFechaRegistroOnCommit

    private void JBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBtnCancelarActionPerformed

    private void JTxtNoCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtNoCuentaKeyTyped
       
      char numero=  evt.getKeyChar();
      if(!(numero>='0' && numero<='9'))
      {
          evt.consume();
      }
      if(numero==10)
      {
          this.jTextField1.requestFocus();
      }


    }//GEN-LAST:event_JTxtNoCuentaKeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
        char numero=  evt.getKeyChar();
        if(numero==10)
      {
          this.JTxtNombre.requestFocus();
      }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void JTxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtNombreKeyTyped
       
        char letra=  evt.getKeyChar();
      if(letra>='0' && letra<='9'||letra>='A' && letra<='Z' )
      {
          evt.consume();
      }
      if(letra==10)
      {
          this.JTxtDireccion.requestFocus();
      }

       // final int MAX_LEN = 10;
     

    }//GEN-LAST:event_JTxtNombreKeyTyped

    private void JTxtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtDireccionKeyTyped
       
        char letra=  evt.getKeyChar();
        if(letra>='A' && letra<='Z' )
      {
          evt.consume();
      }
        if(letra==10)
      {
          this.JTxtTelefono.requestFocus();
      }
    }//GEN-LAST:event_JTxtDireccionKeyTyped

    private void JTxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtTelefonoKeyTyped
       
        char numero=  evt.getKeyChar();
      if(!(numero>='0' && numero<='9'))
      {
          evt.consume();
      }
      if(numero==10)
      {
          this.JTxtRfc.requestFocus();
      }
    }//GEN-LAST:event_JTxtTelefonoKeyTyped

    private void JTxtRfcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtRfcKeyTyped
       
        char numlet=  evt.getKeyChar();
        if(numlet>='A' && numlet<='Z' )
      {
          evt.consume();
      }
        if(numlet==10 )
      {
          this.JTxtColonia.requestFocus();
      }
    }//GEN-LAST:event_JTxtRfcKeyTyped

    private void JTxtColoniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtColoniaKeyTyped
       
        char numlet=  evt.getKeyChar();
        if(numlet>='A' && numlet<='Z' )
      {
          evt.consume();
      }
        if(numlet==10 )
      {
          this.JTxtComunidad.requestFocus();
      }
    }//GEN-LAST:event_JTxtColoniaKeyTyped

    private void JTxtComunidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtComunidadKeyTyped
        
        char numlet=  evt.getKeyChar();
        if(numlet>='A' && numlet<='Z' )
      {
          evt.consume();
      }
        if(numlet==10 )
      {
          this.JTxtMunicipio.requestFocus();
      }
    }//GEN-LAST:event_JTxtComunidadKeyTyped

    private void JTxtMunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtMunicipioKeyTyped
        
        char numlet=  evt.getKeyChar();
        if(numlet>='A' && numlet<='Z' )
      {
          evt.consume();
      }
        if(numlet==10 )
      {
          this.JTxtCodigoPostal.requestFocus();
      }
    }//GEN-LAST:event_JTxtMunicipioKeyTyped

    private void JTxtCodigoPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtCodigoPostalKeyTyped
        
        char numero=  evt.getKeyChar();
      if(!(numero>='0' && numero<='9'))
      {
          evt.consume();
      }
      if(numero==10)
      {
          this.JCmbTarifa.requestFocus();
      }
    }//GEN-LAST:event_JTxtCodigoPostalKeyTyped

    private void JCmbTarifaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JCmbTarifaKeyTyped
        
        char numlet=  evt.getKeyChar();
        if(numlet==10)
      {
          this.JBtnGuardar.requestFocus();
      }
    }//GEN-LAST:event_JCmbTarifaKeyTyped

    private void JBtnGuardarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBtnGuardarKeyTyped
     
        char numlet=  evt.getKeyChar();
        if(numlet==10)
      {
          this.JBtnCancelar.requestFocus();
      }
    }//GEN-LAST:event_JBtnGuardarKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgRegCliente dialog = new JDlgRegCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JBtnGuardar;
    private javax.swing.JComboBox JCmbTarifa;
    private datechooser.beans.DateChooserCombo JDtChFechaRegistro;
    private javax.swing.JTextField JTxtCodigoPostal;
    private javax.swing.JTextField JTxtColonia;
    private javax.swing.JTextField JTxtComunidad;
    private javax.swing.JTextField JTxtDireccion;
    private javax.swing.JTextField JTxtMunicipio;
    private javax.swing.JTextField JTxtNoCuenta;
    private javax.swing.JTextField JTxtNombre;
    private javax.swing.JTextField JTxtRfc;
    private javax.swing.JTextField JTxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    
}
