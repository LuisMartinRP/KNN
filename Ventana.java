/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
/**
 *
 * @author Luis Martin R.P
 */
public class Ventana extends javax.swing.JFrame {
    static ArrayList<String[]> datos = new ArrayList<String[]>();
    static String[] aux;
    static String archivo="C:\\Users\\Luis Martin R.P\\Desktop\\Iris.csv";
    float x,y,esc=100;
    int K,cont=0;
    double cx=0,cy=0,xm,ym;
    String cordx,cordy,k,clasepred="";
    puntos p=new puntos();
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        addMouseListener(p);
    }

    @Override
    public void paint (Graphics g){
        super.paint(g);

        g.setColor (Color.black);
        g.translate(100, 550);
        //horizontal
        g.drawLine (0, 0, 1000, 0);
        //vertical
        g.drawLine (0, 0, 0, -500);
        
        for(int i=0;i<=1000;i+=100){
            g.fillOval (i-3, -3, 6, 6);
            g.drawString(String.valueOf(cont),i-3, 15);
            if(i<=500){
                g.fillOval (-3, (-1*i)-3, 6, 6);
                g.drawString(String.valueOf(cont),-10,(-1*i)-3);
            }
            cont++;
        }
        cont=0;
        
        for(int i=1;i<datos.size();i++){
            aux=datos.get(i);
            x=Float.valueOf(aux[2]);
            x=x*100;
            y=Float.valueOf(aux[3]);
            y=y*-100;
            
            if(i<51){
                g.setColor (Color.blue);
                g.fillOval (1000-3, -300-3, 6, 6);
                g.drawString(aux[4], 1006, -300);
                
            }
            if(i>=51&&i<101){
                g.setColor (Color.red);
                g.fillOval (1000-3, -400-3, 6, 6);
                g.drawString(aux[4], 1006, -400);
            }
            if(i>=101){
                g.setColor (Color.orange);
                g.fillOval (1000-3, -500-3, 6, 6);
                g.drawString(aux[4], 1006, -500);
            }
            g.fillOval ((int)x-3, (int)y-3, 6, 6);
        }
        switch(clasepred){
            case "Iris-setosa":
                g.setColor (Color.blue);    
                g.fillOval ((int)(cx*100)-3, (int)(-100*cy)-3, 6, 6);
            break;
            case "Iris-versicolor":
                g.setColor (Color.red);    
                g.fillOval ((int)(cx*100)-3, (int)(-100*cy)-3, 6, 6);
            break;
            case "Iris-virginica":
                g.setColor (Color.orange);    
                g.fillOval ((int)(cx*100)-3, (int)(-100*cy)-3, 6, 6);
            break;
            default:
                g.setColor (Color.black);
                g.fillOval ((int)(xm)-3, (int)(-1*ym)-3, 6, 6);
            break;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtv = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jtp = new javax.swing.JTextField();
        jtx = new javax.swing.JTextField();
        jty = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 700));

        jtv.setColumns(20);
        jtv.setRows(5);
        jScrollPane1.setViewportView(jtv);

        jButton1.setText("Clacificar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Coordenada x");

        jLabel2.setText("Coordenada y");

        jLabel3.setText("Clase");

        jLabel4.setText("K");

        jLabel5.setText("petalwidth");

        tp.setText("Tomar punto");
        tp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpActionPerformed(evt);
            }
        });

        jLabel6.setText("petallength");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtx, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jty, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtk, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jtx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cordx=jtx.getText();
        cordy=jty.getText();
        k=jtk.getText();
        cx=Double.valueOf(cordx);
        cy=Double.valueOf(cordy);
        K=Integer.valueOf(k);
        
        Clacifica c=new Clacifica();
        clasepred=c.calculardistancia(datos,cx,cy,K);
        jtp.setText(clasepred);
        jtv.setText(c.vecinos);
        
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpActionPerformed
        // TODO add your handling code here:
        jtv.setText(" ");
        jtx.setText(" ");
        jty.setText(" ");
        clasepred="";
        xm=(p.xm);
        ym=(p.ym);
        System.out.println(xm);
        System.out.println(ym);
        if(xm>=90&&xm<=1100){
            if(ym>=50&&ym<=550){
                xm=xm-100;
                ym=-1*(ym-550);
                jtx.setText(String.valueOf(xm/100));
                jty.setText(String.valueOf(ym/100));
                repaint();
            }else
                jtv.setText("Punto fuera del mapa.");
        }else{
            jtv.setText("Punto fuera del mapa.");
        }
    }//GEN-LAST:event_tpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Leerdatos l=new Leerdatos();
        datos=l.leer(archivo);
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtk;
    private javax.swing.JTextField jtp;
    private javax.swing.JTextArea jtv;
    private javax.swing.JTextField jtx;
    private javax.swing.JTextField jty;
    private javax.swing.JButton tp;
    // End of variables declaration//GEN-END:variables
}
