package prykualiatl;
import elaprendiz.bdmodel.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
public class JFrmMdi extends JFrameConFondo
{
    private Usuario usuario;
    public JFrmMdi() {
        initComponents();
        setImagen("/Imagenes/SilverLightWithLogo.png");
        setLocationRelativeTo(null);
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        activarMenu();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuArchivo = new javax.swing.JMenu();
        JMItIniciarSesion = new javax.swing.JMenuItem();
        JMItCerrarSesion = new javax.swing.JMenuItem();
        JMItRegUsuarios = new javax.swing.JMenuItem();
        JMItSalir = new javax.swing.JMenuItem();
        JMenuCliente = new javax.swing.JMenu();
        JMItRegCliente = new javax.swing.JMenuItem();
        JMenuPago = new javax.swing.JMenu();
        JMItRegPago = new javax.swing.JMenuItem();
        JMItEmisionOrdenes = new javax.swing.JMenuItem();
        JMenuReportes = new javax.swing.JMenu();
        JMItRepIngresos = new javax.swing.JMenuItem();
        JMItRepPagosCliente = new javax.swing.JMenuItem();
        JMItRepOrdenesEnviadas = new javax.swing.JMenuItem();
        JMenuHerramientas = new javax.swing.JMenu();
        JMItCalculadora = new javax.swing.JMenuItem();
        JMItRespaldoBd = new javax.swing.JMenuItem();
        JMItRestaurarBd = new javax.swing.JMenuItem();
        JMenuAyuda = new javax.swing.JMenu();
        JMItAyuda = new javax.swing.JMenuItem();
        JMItAcercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(prykualiatl.PryKualiAtlApp.class).getContext().getResourceMap(JFrmMdi.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        JMenuArchivo.setIcon(resourceMap.getIcon("JMenuArchivo.icon")); // NOI18N
        JMenuArchivo.setText(resourceMap.getString("JMenuArchivo.text")); // NOI18N
        JMenuArchivo.setFont(resourceMap.getFont("JMenuArchivo.font")); // NOI18N
        JMenuArchivo.setName("JMenuArchivo"); // NOI18N

        JMItIniciarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        JMItIniciarSesion.setFont(resourceMap.getFont("JMItIniciarSesion.font")); // NOI18N
        JMItIniciarSesion.setIcon(resourceMap.getIcon("JMItIniciarSesion.icon")); // NOI18N
        JMItIniciarSesion.setText(resourceMap.getString("JMItIniciarSesion.text")); // NOI18N
        JMItIniciarSesion.setName("JMItIniciarSesion"); // NOI18N
        JMItIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItIniciarSesionActionPerformed(evt);
            }
        });
        JMenuArchivo.add(JMItIniciarSesion);

        JMItCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        JMItCerrarSesion.setFont(resourceMap.getFont("JMItCerrarSesion.font")); // NOI18N
        JMItCerrarSesion.setIcon(resourceMap.getIcon("JMItCerrarSesion.icon")); // NOI18N
        JMItCerrarSesion.setText(resourceMap.getString("JMItCerrarSesion.text")); // NOI18N
        JMItCerrarSesion.setEnabled(false);
        JMItCerrarSesion.setName("JMItCerrarSesion"); // NOI18N
        JMItCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItCerrarSesionActionPerformed(evt);
            }
        });
        JMenuArchivo.add(JMItCerrarSesion);

        JMItRegUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        JMItRegUsuarios.setFont(resourceMap.getFont("JMItRegUsuarios.font")); // NOI18N
        JMItRegUsuarios.setIcon(resourceMap.getIcon("JMItRegUsuarios.icon")); // NOI18N
        JMItRegUsuarios.setText(resourceMap.getString("JMItRegUsuarios.text")); // NOI18N
        JMItRegUsuarios.setEnabled(false);
        JMItRegUsuarios.setName("JMItRegUsuarios"); // NOI18N
        JMItRegUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItRegUsuariosActionPerformed(evt);
            }
        });
        JMenuArchivo.add(JMItRegUsuarios);

        JMItSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        JMItSalir.setFont(resourceMap.getFont("JMItSalir.font")); // NOI18N
        JMItSalir.setIcon(resourceMap.getIcon("JMItSalir.icon")); // NOI18N
        JMItSalir.setText(resourceMap.getString("JMItSalir.text")); // NOI18N
        JMItSalir.setName("JMItSalir"); // NOI18N
        JMItSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItSalirActionPerformed(evt);
            }
        });
        JMenuArchivo.add(JMItSalir);

        jMenuBar1.add(JMenuArchivo);

        JMenuCliente.setIcon(resourceMap.getIcon("JMenuCliente.icon")); // NOI18N
        JMenuCliente.setText(resourceMap.getString("JMenuCliente.text")); // NOI18N
        JMenuCliente.setEnabled(false);
        JMenuCliente.setFont(resourceMap.getFont("JMenuCliente.font")); // NOI18N
        JMenuCliente.setName("JMenuCliente"); // NOI18N

        JMItRegCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        JMItRegCliente.setFont(resourceMap.getFont("JMItRegCliente.font")); // NOI18N
        JMItRegCliente.setIcon(resourceMap.getIcon("JMItRegCliente.icon")); // NOI18N
        JMItRegCliente.setText(resourceMap.getString("JMItRegCliente.text")); // NOI18N
        JMItRegCliente.setName("JMItRegCliente"); // NOI18N
        JMItRegCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItRegClienteActionPerformed(evt);
            }
        });
        JMenuCliente.add(JMItRegCliente);

        jMenuBar1.add(JMenuCliente);

        JMenuPago.setIcon(resourceMap.getIcon("JMenuPago.icon")); // NOI18N
        JMenuPago.setText(resourceMap.getString("JMenuPago.text")); // NOI18N
        JMenuPago.setEnabled(false);
        JMenuPago.setFont(resourceMap.getFont("JMenuPago.font")); // NOI18N
        JMenuPago.setName("JMenuPago"); // NOI18N

        JMItRegPago.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        JMItRegPago.setFont(resourceMap.getFont("JMItRegPago.font")); // NOI18N
        JMItRegPago.setIcon(resourceMap.getIcon("JMItRegPago.icon")); // NOI18N
        JMItRegPago.setText(resourceMap.getString("JMItRegPago.text")); // NOI18N
        JMItRegPago.setName("JMItRegPago"); // NOI18N
        JMItRegPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItRegPagoActionPerformed(evt);
            }
        });
        JMenuPago.add(JMItRegPago);

        JMItEmisionOrdenes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        JMItEmisionOrdenes.setFont(resourceMap.getFont("JMItEmisionOrdenes.font")); // NOI18N
        JMItEmisionOrdenes.setIcon(resourceMap.getIcon("JMItEmisionOrdenes.icon")); // NOI18N
        JMItEmisionOrdenes.setText(resourceMap.getString("JMItEmisionOrdenes.text")); // NOI18N
        JMItEmisionOrdenes.setName("JMItEmisionOrdenes"); // NOI18N
        JMItEmisionOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItEmisionOrdenesActionPerformed(evt);
            }
        });
        JMenuPago.add(JMItEmisionOrdenes);

        jMenuBar1.add(JMenuPago);

        JMenuReportes.setIcon(resourceMap.getIcon("JMenuReportes.icon")); // NOI18N
        JMenuReportes.setText(resourceMap.getString("JMenuReportes.text")); // NOI18N
        JMenuReportes.setEnabled(false);
        JMenuReportes.setFont(resourceMap.getFont("JMenuReportes.font")); // NOI18N
        JMenuReportes.setName("JMenuReportes"); // NOI18N
        JMenuReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuReportesActionPerformed(evt);
            }
        });

        JMItRepIngresos.setFont(resourceMap.getFont("JMItRepIngresos.font")); // NOI18N
        JMItRepIngresos.setIcon(resourceMap.getIcon("JMItRepIngresos.icon")); // NOI18N
        JMItRepIngresos.setText(resourceMap.getString("JMItRepIngresos.text")); // NOI18N
        JMItRepIngresos.setName("JMItRepIngresos"); // NOI18N
        JMItRepIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItRepIngresosActionPerformed(evt);
            }
        });
        JMenuReportes.add(JMItRepIngresos);

        JMItRepPagosCliente.setFont(resourceMap.getFont("JMItRepPagosCliente.font")); // NOI18N
        JMItRepPagosCliente.setIcon(resourceMap.getIcon("JMItRepPagosCliente.icon")); // NOI18N
        JMItRepPagosCliente.setText(resourceMap.getString("JMItRepPagosCliente.text")); // NOI18N
        JMItRepPagosCliente.setName("JMItRepPagosCliente"); // NOI18N
        JMItRepPagosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItRepPagosClienteActionPerformed(evt);
            }
        });
        JMenuReportes.add(JMItRepPagosCliente);

        JMItRepOrdenesEnviadas.setFont(resourceMap.getFont("JMItRepOrdenesEnviadas.font")); // NOI18N
        JMItRepOrdenesEnviadas.setIcon(resourceMap.getIcon("JMItRepOrdenesEnviadas.icon")); // NOI18N
        JMItRepOrdenesEnviadas.setText(resourceMap.getString("JMItRepOrdenesEnviadas.text")); // NOI18N
        JMItRepOrdenesEnviadas.setName("JMItRepOrdenesEnviadas"); // NOI18N
        JMItRepOrdenesEnviadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItRepOrdenesEnviadasActionPerformed(evt);
            }
        });
        JMenuReportes.add(JMItRepOrdenesEnviadas);

        jMenuBar1.add(JMenuReportes);

        JMenuHerramientas.setIcon(resourceMap.getIcon("JMenuHerramientas.icon")); // NOI18N
        JMenuHerramientas.setText(resourceMap.getString("JMenuHerramientas.text")); // NOI18N
        JMenuHerramientas.setEnabled(false);
        JMenuHerramientas.setFont(resourceMap.getFont("JMenuHerramientas.font")); // NOI18N
        JMenuHerramientas.setName("JMenuHerramientas"); // NOI18N

        JMItCalculadora.setFont(resourceMap.getFont("JMItCalculadora.font")); // NOI18N
        JMItCalculadora.setIcon(resourceMap.getIcon("JMItCalculadora.icon")); // NOI18N
        JMItCalculadora.setText(resourceMap.getString("JMItCalculadora.text")); // NOI18N
        JMItCalculadora.setName("JMItCalculadora"); // NOI18N
        JMItCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItCalculadoraActionPerformed(evt);
            }
        });
        JMenuHerramientas.add(JMItCalculadora);

        JMItRespaldoBd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        JMItRespaldoBd.setFont(resourceMap.getFont("JMItRespaldoBd.font")); // NOI18N
        JMItRespaldoBd.setIcon(resourceMap.getIcon("JMItRespaldoBd.icon")); // NOI18N
        JMItRespaldoBd.setText(resourceMap.getString("JMItRespaldoBd.text")); // NOI18N
        JMItRespaldoBd.setName("JMItRespaldoBd"); // NOI18N
        JMItRespaldoBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItRespaldoBdActionPerformed(evt);
            }
        });
        JMenuHerramientas.add(JMItRespaldoBd);

        JMItRestaurarBd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        JMItRestaurarBd.setFont(resourceMap.getFont("JMItRestaurarBd.font")); // NOI18N
        JMItRestaurarBd.setIcon(resourceMap.getIcon("JMItRestaurarBd.icon")); // NOI18N
        JMItRestaurarBd.setText(resourceMap.getString("JMItRestaurarBd.text")); // NOI18N
        JMItRestaurarBd.setName("JMItRestaurarBd"); // NOI18N
        JMItRestaurarBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItRestaurarBdActionPerformed(evt);
            }
        });
        JMenuHerramientas.add(JMItRestaurarBd);

        jMenuBar1.add(JMenuHerramientas);

        JMenuAyuda.setIcon(resourceMap.getIcon("JMenuAyuda.icon")); // NOI18N
        JMenuAyuda.setText(resourceMap.getString("JMenuAyuda.text")); // NOI18N
        JMenuAyuda.setFont(resourceMap.getFont("JMenuAyuda.font")); // NOI18N
        JMenuAyuda.setName("JMenuAyuda"); // NOI18N

        JMItAyuda.setFont(resourceMap.getFont("JMItAyuda.font")); // NOI18N
        JMItAyuda.setIcon(resourceMap.getIcon("JMItAyuda.icon")); // NOI18N
        JMItAyuda.setText(resourceMap.getString("JMItAyuda.text")); // NOI18N
        JMItAyuda.setName("JMItAyuda"); // NOI18N
        JMItAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItAyudaActionPerformed(evt);
            }
        });
        JMenuAyuda.add(JMItAyuda);

        JMItAcercade.setFont(resourceMap.getFont("JMItAcercade.font")); // NOI18N
        JMItAcercade.setIcon(resourceMap.getIcon("JMItAcercade.icon")); // NOI18N
        JMItAcercade.setText(resourceMap.getString("JMItAcercade.text")); // NOI18N
        JMItAcercade.setName("JMItAcercade"); // NOI18N
        JMItAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItAcercadeActionPerformed(evt);
            }
        });
        JMenuAyuda.add(JMItAcercade);

        jMenuBar1.add(JMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMItSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItSalirActionPerformed
        
        int slir = JOptionPane.showConfirmDialog(this, "REALMENTE DESEA CERRAR LA APLICACION","CERRANDO APLICACION",0,3);
        if(slir==JOptionPane.OK_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_JMItSalirActionPerformed

    private void JMItRegClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItRegClienteActionPerformed
       JDlgClientes clientes = new JDlgClientes(null, true);
        clientes.setVisible(true);
    }//GEN-LAST:event_JMItRegClienteActionPerformed

    private void JMItIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItIniciarSesionActionPerformed
      
        JDlgSesion sesion = new JDlgSesion(null, true);
        sesion.setVisible(true);
        this.dispose();
     this.JMItIniciarSesion.getModel().setEnabled(false);
        
    }//GEN-LAST:event_JMItIniciarSesionActionPerformed

    private void JMItRegUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItRegUsuariosActionPerformed
        JDlgUsuarios users = new JDlgUsuarios(this, true);
        users.setVisible(true);
    }//GEN-LAST:event_JMItRegUsuariosActionPerformed

    private void JMItRegPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItRegPagoActionPerformed
       JDlgPagos pagos=new JDlgPagos(null,true);
       pagos.setVisible(true);
    }//GEN-LAST:event_JMItRegPagoActionPerformed

    private void JMItEmisionOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItEmisionOrdenesActionPerformed
      JDlgOrdenes orden = new JDlgOrdenes(null, true);
        orden.setVisible(true);
    }//GEN-LAST:event_JMItEmisionOrdenesActionPerformed

    private void JMItRepIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItRepIngresosActionPerformed
        JDlgRepIngresos ingresos = new JDlgRepIngresos(null, true);
        ingresos.setVisible(true);
    }//GEN-LAST:event_JMItRepIngresosActionPerformed

    private void JMItRepPagosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItRepPagosClienteActionPerformed
        JDlgRepPagos pagos = new JDlgRepPagos(null, true);
        pagos.setVisible(true);
    }//GEN-LAST:event_JMItRepPagosClienteActionPerformed

    private void JMItRepOrdenesEnviadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItRepOrdenesEnviadasActionPerformed
        JDlgRepOrdenes ordenes = new JDlgRepOrdenes(null, true);
        ordenes.setVisible(true);
    }//GEN-LAST:event_JMItRepOrdenesEnviadasActionPerformed

    private void JMenuReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuReportesActionPerformed
      
    }//GEN-LAST:event_JMenuReportesActionPerformed

    private void JMItAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItAyudaActionPerformed
        JOptionPane.showMessageDialog(this,
                                "NO SE HAN ENCONTRADO LOS ARCHIVOS DE AYUDA,\nCONSULTE EL MANUAL DE USUARIO.",
                                "AYUDA DEL SISTEMA",
                                JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_JMItAyudaActionPerformed

    private void JMItAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItAcercadeActionPerformed
       JOptionPane.showMessageDialog(this,
                                "          ''K U A L I  A T L''" +
                                "\nSISTEMA DE PAGOS PARA LA C.A.P.A.S.H.H."+
                                "\nHUEJUTLA DE REYES, HIDALGO"+
                                "\nVERSION: 1.0"+
                                "\nMODIFICADO POR:"+
                                "\nELAPRENDIZ"+
                                "\nBLOG:"+
                                "\nWWW.MINISISTEMAS.BLOGSPOT.COM"+
                                "\nPROHIBIDA LA REPRODUCCION TOTAL O PARCIAL,"+
                                "\nSIN LA AUTORIZACION POR ESCRITO DEL AUTOR...",
                                "ACERCA DE...",
                                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_JMItAcercadeActionPerformed

    private void JMItCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItCalculadoraActionPerformed
        try
        {
        Runtime obj = Runtime.getRuntime();
        obj.exec("C:\\WINDOWS\\system32\\CALC.EXE");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_JMItCalculadoraActionPerformed

    private void JMItRespaldoBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItRespaldoBdActionPerformed
        
        JDlgBackup backup = new JDlgBackup(null, true);
        backup.setVisible(true);
    }//GEN-LAST:event_JMItRespaldoBdActionPerformed

    private void JMItRestaurarBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItRestaurarBdActionPerformed
       
        JDlgRestaurarBase restore = new JDlgRestaurarBase(null, true);
        restore.setVisible(true);
    }//GEN-LAST:event_JMItRestaurarBdActionPerformed

    private void JMItCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItCerrarSesionActionPerformed
this.JMItIniciarSesion.getModel().setEnabled(true);
this.JMenuCliente.getModel().setEnabled(false);
this.JMenuPago.getModel().setEnabled(false);
this.JMenuReportes.getModel().setEnabled(false);
this.JMenuHerramientas.getModel().setEnabled(false);
this.JMItRegUsuarios.getModel().setEnabled(false);
this.JMItCerrarSesion.getModel().setEnabled(false);
    }//GEN-LAST:event_JMItCerrarSesionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmMdi().setVisible(true);
            }
        });
    }
    
    private void activarMenu()
    {
        this.JMItIniciarSesion.getModel().setEnabled(usuario.getIniciarSesion());
        this.JMenuCliente.getModel().setEnabled(usuario.getClientes());
        this.JMenuPago.getModel().setEnabled(usuario.getPagos());
        this.JMenuReportes.getModel().setEnabled(usuario.getReportes());
        this.JMenuHerramientas.getModel().setEnabled(usuario.getHerramientas());        
        
        JMItAcercade.setEnabled(usuario.getAcercaDe());
        JMItAyuda.setEnabled(usuario.getMostrarAyuda());
        JMItCalculadora.setEnabled(usuario.getCalculadora());
        JMItCerrarSesion.setEnabled(usuario.getCerrarSesion());
        JMItEmisionOrdenes.setEnabled(usuario.getEmisionesOrdenes());
        JMItIniciarSesion.setEnabled(usuario.getIniciarSesion());
        JMItRegCliente.setEnabled(usuario.getRegistroDeClientes());
        JMItRegPago.setEnabled(usuario.getRegistroDePagos());
        JMItRegUsuarios.setEnabled(usuario.getRegistroDeUsuario());
        JMItRepIngresos.setEnabled(usuario.getReporteDeIngresos());
        JMItRepOrdenesEnviadas.setEnabled(usuario.getReporteDeOrdenes());
        JMItRepPagosCliente.setEnabled(usuario.getRegistroDePagos());
        JMItRespaldoBd.setEnabled(usuario.getRespaldarBd());
        JMItRestaurarBd.setEnabled(usuario.getRestaurarBd());
        JMItSalir.setEnabled(usuario.getSalirDeAplicacion());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMItAcercade;
    private javax.swing.JMenuItem JMItAyuda;
    private javax.swing.JMenuItem JMItCalculadora;
    private javax.swing.JMenuItem JMItCerrarSesion;
    private javax.swing.JMenuItem JMItEmisionOrdenes;
    private javax.swing.JMenuItem JMItIniciarSesion;
    private javax.swing.JMenuItem JMItRegCliente;
    private javax.swing.JMenuItem JMItRegPago;
    private javax.swing.JMenuItem JMItRegUsuarios;
    private javax.swing.JMenuItem JMItRepIngresos;
    private javax.swing.JMenuItem JMItRepOrdenesEnviadas;
    private javax.swing.JMenuItem JMItRepPagosCliente;
    private javax.swing.JMenuItem JMItRespaldoBd;
    private javax.swing.JMenuItem JMItRestaurarBd;
    private javax.swing.JMenuItem JMItSalir;
    private javax.swing.JMenu JMenuArchivo;
    private javax.swing.JMenu JMenuAyuda;
    private javax.swing.JMenu JMenuCliente;
    private javax.swing.JMenu JMenuHerramientas;
    private javax.swing.JMenu JMenuPago;
    private javax.swing.JMenu JMenuReportes;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
