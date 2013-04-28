package prykualiatl;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class JDlgRestaurarBase extends javax.swing.JDialog
{  
    public JDlgRestaurarBase(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(prykualiatl.PryKualiAtlApp.class).getContext().getResourceMap(JDlgRestaurarBase.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jFileChooser1.setControlButtonsAreShown(false);
        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\"));
            jFileChooser1.setFont(resourceMap.getFont("jFileChooser1.font")); // NOI18N
            jFileChooser1.setName("jFileChooser1"); // NOI18N

            jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
            jButton1.setIcon(resourceMap.getIcon("jButton1.icon")); // NOI18N
            jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
            jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton1.setName("jButton1"); // NOI18N
            jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
            jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
            jLabel1.setName("jLabel1"); // NOI18N

            jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
            jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
            jLabel2.setName("jLabel2"); // NOI18N

            jButton2.setFont(resourceMap.getFont("jButton2.font")); // NOI18N
            jButton2.setIcon(resourceMap.getIcon("jButton2.icon")); // NOI18N
            jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
            jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton2.setName("jButton2"); // NOI18N
            jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jTextField1.setText(resourceMap.getString("text")); // NOI18N
            jTextField1.setName(""); // NOI18N

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(183, 183, 183)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(147, 147, 147)
                                            .addComponent(jButton1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton2)))))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        restaurar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void restaurar()
    {
        if(jTextField1.getText().equalsIgnoreCase(""))
        {
           JOptionPane.showMessageDialog(null, "DEBE ELEGIR LA UBICACION DEL ARCHIVO DE RESPALDO", "VERIFICAR",JOptionPane.WARNING_MESSAGE);
        }
        else{
        
                try{
                String ubicacion= String.valueOf(jFileChooser1.getSelectedFile());
                  
                Process child = Runtime.getRuntime().exec("cmd /c mysql --password= --user=root dbkuali<" + ubicacion);
                JOptionPane.showMessageDialog(null, "LA BASE DE DATOS HA SIDO RESTAURADA CORRECTAMENTE", "RESTAURANDO BD",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                JOptionPane.showMessageDialog(null, "ERROR, NO SE PUDO RESTAURAR LA BASE DE DATOS\nPOR EL SIGUIENTE MOTIVO: " + e.getMessage(), "VERIFICAR",JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                }
            }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgRestaurarBase dialog = new JDlgRestaurarBase(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
