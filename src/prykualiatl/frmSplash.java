package prykualiatl;
import elaprendiz.JPanelImagen;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.Toolkit;

public class frmSplash extends javax.swing.JFrame implements ActionListener{
    private Timer timer;
    JFrmMdi main;
    int i=0;
    private int contador = 0;
    private String punto = ".";
    
    public frmSplash()
    {
        initComponents();
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); 
        setIconImage(icon);
        jPanel1.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Backgroundsplash.png")));
    
        timer = new Timer(40,new ActionListener()
        {
            public void actionPerformed(ActionEvent o)
            {
                //contador
                i+=1;
                //al progresbar se le pasa como parametro el contador
                pBar.setValue(i);
                if(contador==45)
                {
                    punto = ".";
                    contador=0;
                    lbMensaje.setText("Cargando");
                }else{
                    punto +=".";
                    lbMensaje.setText("Cargando"+punto);
                }
                
                contador++;
                if(pBar.getValue()>20)
                    pBar.setForeground(Color.ORANGE);                
                
                if(pBar.getValue()>60)
                    pBar.setForeground(Color.BLUE); 
                
                //cuando llega a 100 pone un stop
                cek();
            }
        });
        timer.start();
    }
    //metodo para hacer que haga un stop antes de llegar a 100
    public void cek(){
        if(pBar.getPercentComplete()==1.0){
            timer.stop();            
            main = new JFrmMdi();
            main.setVisible(true);
            //main.login();
            this.dispose();
        }        
    }       
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBar = new javax.swing.JProgressBar();
        jPanel1 = new JPanelImagen();
        lbMensaje = new javax.swing.JLabel();

        setTitle("CARGANDO...");
        setForeground(java.awt.Color.white);
        setUndecorated(true);
        getContentPane().setLayout(null);

        pBar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pBar.setForeground(new java.awt.Color(255, 0, 0));
        pBar.setDoubleBuffered(true);
        pBar.setStringPainted(true);
        getContentPane().add(pBar);
        pBar.setBounds(0, 290, 410, 20);

        jPanel1.setLayout(new java.awt.BorderLayout());

        lbMensaje.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        lbMensaje.setForeground(new java.awt.Color(255, 0, 0));
        lbMensaje.setText("Cargando..");
        jPanel1.add(lbMensaje, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 290);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-410)/2, (screenSize.height-310)/2, 410, 310);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            frmSplash a;
            public void run() {
                a = new frmSplash();
                a.setVisible(true);
            }
        });
    }
    
    public void actionPerformed(ActionEvent e) {
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    /*
    private javax.swing.JPanel jPanel1;
    */
    private JPanelImagen jPanel1;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JProgressBar pBar;
    // End of variables declaration//GEN-END:variables
}
