/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_genealogico_lab1_datos2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class ArbolG extends javax.swing.JFrame {

    Nodo raiz = new Nodo("raiz");
    Funciones f = new Funciones();
    int selecnar = 0;
    int anchoselecnar = 0;
    int altoselecnar = 0;
    int nivelselecnar = 0;
    String nomselecnar = "";
    int selecver = 0;
    int anchoselecver = 0;
    int altoselecver = 0;
    int nivelselecver = 0;
    String nomselecver = "";
    ArrayList<Coornod> cn = new ArrayList<Coornod>();

    /**
     * Creates new form ArbolG
     */
    public ArbolG() {
        initComponents();
        f.CustomFont();
        this.CrearArbol.setFont(f.MyFont(1, 20));
        this.AggHijo.setFont(f.MyFont(1, 20));
        this.Relacion.setFont(f.MyFont(1, 20));
        this.relaciontxt.setFont(f.MyFont(1, 20));
        this.relaciontxt.setForeground(Color.orange);
        this.instrucciones.setFont(f.MyFont(1, 20));
        this.jLabel2.setFont(f.MyFont(1, 20));
        this.jLabel3.setFont(f.MyFont(1, 15));
        this.jLabel10.setFont(f.MyFont(1, 15));
        this.jLabel11.setFont(f.MyFont(1, 15));
        this.jLabel12.setFont(f.MyFont(1, 15));
        this.jLabel13.setFont(f.MyFont(1, 15));
        this.jLabel4.setFont(f.MyFont(1, 15));
        this.jLabel5.setFont(f.MyFont(1, 15));
        this.jLabel6.setFont(f.MyFont(1, 15));
        this.jLabel7.setFont(f.MyFont(1, 15));
        this.jLabel8.setFont(f.MyFont(1, 15));
        this.jLabel9.setFont(f.MyFont(1, 15));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Instrucciones = new javax.swing.JFrame();
        Instru = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CrearArbol = new javax.swing.JLabel();
        Arbol = new javax.swing.JPanel();
        AggHijo = new javax.swing.JLabel();
        Relacion = new javax.swing.JLabel();
        relaciontxt = new javax.swing.JLabel();
        instrucciones = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        Instrucciones.setMaximumSize(new java.awt.Dimension(680, 480));
        Instrucciones.setMinimumSize(new java.awt.Dimension(680, 480));
        Instrucciones.setPreferredSize(new java.awt.Dimension(680, 480));
        Instrucciones.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Instru.setMaximumSize(new java.awt.Dimension(680, 480));
        Instru.setMinimumSize(new java.awt.Dimension(680, 480));
        Instru.setPreferredSize(new java.awt.Dimension(680, 480));
        Instru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Instrucciones");
        Instru.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("1. Bienvenido a su arbol genealogico, para comenzar su");
        Instru.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("2. Para agregar un hijo seleccione con el click derecho al");
        Instru.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("3.Para saber el parentesco de dos miembros seleccione");
        Instru.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("4.En caso de querer desceleccionar los nodos de click");
        Instru.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("seleccionados, click derecho verde y click izquierdo naranja");
        Instru.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("el nombre del primer miembro del árbol");
        Instru.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("botón \"Agregar hijo\"");
        Instru.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("arbol presione el boton \"crear nuevo arbol\" y digite");
        Instru.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("miembro al que desea agregarle el hijo y presione el");
        Instru.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("uno con el click izquierdo y el otro con el click derecho");
        Instru.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("dentro del panel con el click que desee que no hayan");
        Instru.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arbol_genealogico_lab1_datos2/pierdaminecraft (1).jpg"))); // NOI18N
        Instru.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Instrucciones.getContentPane().add(Instru, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arbol Genealogico");
        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1200, 620));
        setMinimumSize(new java.awt.Dimension(1200, 620));
        setPreferredSize(new java.awt.Dimension(1200, 620));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CrearArbol.setForeground(new java.awt.Color(255, 255, 255));
        CrearArbol.setText("Crear nuevo arbol ");
        CrearArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearArbolMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CrearArbolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrearArbolMouseExited(evt);
            }
        });
        getContentPane().add(CrearArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 220, -1, 26));

        Arbol.setBackground(new java.awt.Color(255, 255, 255));
        Arbol.setMaximumSize(new java.awt.Dimension(900, 400));
        Arbol.setMinimumSize(new java.awt.Dimension(900, 400));
        Arbol.setPreferredSize(new java.awt.Dimension(900, 400));
        Arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArbolMouseClicked(evt);
            }
        });
        Arbol.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Arbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        AggHijo.setForeground(new java.awt.Color(255, 255, 255));
        AggHijo.setText("Agregar hijo");
        AggHijo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AggHijoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AggHijoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AggHijoMouseExited(evt);
            }
        });
        getContentPane().add(AggHijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 300, -1, 26));

        Relacion.setForeground(new java.awt.Color(255, 255, 255));
        Relacion.setText("Relacion:");
        getContentPane().add(Relacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 390, 200, -1));

        relaciontxt.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(relaciontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, 230, 20));

        instrucciones.setForeground(new java.awt.Color(255, 255, 255));
        instrucciones.setText("Instrucciones");
        instrucciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instruccionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                instruccionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                instruccionesMouseExited(evt);
            }
        });
        getContentPane().add(instrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, 240, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arbol_genealogico_lab1_datos2/minecraft (1).png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearArbolMouseClicked
        String nomraiz = JOptionPane.showInputDialog("Escriba el nombre del padre");
        if (nomraiz != null && !nomraiz.isEmpty()) {
            raiz.nombre = nomraiz;
            raiz.derecho = null;
            raiz.izquierdo = null;
            int AnchoPanel = Arbol.getWidth();
            int AltoPanel = Arbol.getHeight();
            Graphics g = Arbol.getGraphics();
            g.setColor(Color.white);
            g.fillRect(0, 0, 900, 400);
            cn.clear();
            selecnar = 0;
            selecver = 0;
            g.setColor(Color.black);
            g.drawRect((AnchoPanel / 2) - 25, 50, 50, 20);
            Coornod c = new Coornod(nomraiz, (AnchoPanel / 2) - 25, 50);
            cn.add(c);
            g.drawString(nomraiz, (AnchoPanel / 2) - 25 + 2, 62);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
        }
    }//GEN-LAST:event_CrearArbolMouseClicked

    private void AggHijoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AggHijoMouseClicked
        if (selecnar == 1) {
            int AnchoPanel = Arbol.getWidth();
            String nombre = "";
            String aux = JOptionPane.showInputDialog("Escriba el nombre del hijo");
            if (aux != null) {
                nombre = aux;
            }
            if (!nombre.isEmpty()) {
                int j = 0;
                for (Coornod cnd : cn) {
                    if ((cnd.nombre).equals(nombre)) {
                        j = 1;
                    }
                }
                if (j == 0) {
                    String nompadre = nomselecnar;
                    Nodo padre = f.buscar(raiz, nompadre);
                    if (padre.derecho == null || padre.izquierdo == null) {
                        f.insertar(raiz, nompadre, nombre);
                        padre = f.buscar(raiz, nompadre);
                        Graphics g = Arbol.getGraphics();
                        if (padre.derecho != null && ((padre.derecho).nombre).equals(nombre)) {
                            int k = 1;
                            for (int i = 0; i < nivelselecnar; i++) {
                                k = k * 2;
                            }
                            k = k * 2;
                            k = AnchoPanel / k;
                            g.drawRect(anchoselecnar + k - 25, altoselecnar + 50, 50, 20);
                            g.drawLine(anchoselecnar, altoselecnar + 20, anchoselecnar + k, altoselecnar + 50);
                            Coornod c = new Coornod(nombre, anchoselecnar + k - 25, altoselecnar + 50);
                            g.drawString(nombre, c.x + 2, c.y + 12);
                            System.out.println(nombre);
                            cn.add(c);
                        } else {
                            if (padre.izquierdo != null && ((padre.izquierdo).nombre).equals(nombre)) {
                                int k = 1;
                                for (int i = 0; i < nivelselecnar; i++) {
                                    k = k * 2;
                                }
                                k = k * 2;
                                k = AnchoPanel / k;
                                g.drawRect(anchoselecnar - k - 25, altoselecnar + 50, 50, 20);
                                g.drawLine(anchoselecnar, altoselecnar + 20, anchoselecnar - k, altoselecnar + 50);
                                Coornod c = new Coornod(nombre, anchoselecnar - k - 25, altoselecnar + 50);
                                g.drawString(nombre, c.x + 2, c.y + 12);
                                cn.add(c);
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ya existe una persona con ese nombre");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No ingresó ningún nombre");
            }
        }
    }//GEN-LAST:event_AggHijoMouseClicked

    private void ArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArbolMouseClicked
        int AnchoPanel = Arbol.getWidth();
        int AltoPanel = Arbol.getHeight();
        int AnchoPanelClick = evt.getX();
        int AltoPanelClick = evt.getY();
        int mouse = evt.getButton();
        Graphics g = Arbol.getGraphics();
        int sw = 0;
        int n = 2;
        int m = 1;
        if (mouse == 1 && selecnar == 1) {
            g.setColor(Color.white);
            g.fillRect(anchoselecnar - 25, altoselecnar, 50, 20);
            g.setColor(Color.black);
            g.drawRect(anchoselecnar - 25, altoselecnar, 50, 20);
            g.drawString(nomselecnar, anchoselecnar - 25 + 2, altoselecnar + 12);
            selecnar = 0;
        }
        if (mouse == 3 && selecver == 1) {
            g.setColor(Color.white);
            g.fillRect(anchoselecver - 25, altoselecver, 50, 20);
            g.setColor(Color.black);
            g.drawRect(anchoselecver - 25, altoselecver, 50, 20);
            g.drawString(nomselecver, anchoselecver - 25 + 2, altoselecver + 12);
            selecver = 0;
        }
        while (sw == 0 && m < 20) {
            int k = 1;
            for (int i = 0; i < m; i++) {
                k = k * 2;
            }
            for (int i = 0; i < k; i++) {
                if ((AnchoPanelClick > ((AnchoPanel / n) * (i + 1)) - 25) && (AnchoPanelClick < ((AnchoPanel / n) * (i + 1)) + 25) && AltoPanelClick > 50 * m && AltoPanelClick < 50 * m + 50) {
                    for (Coornod c : cn) {
                        if (c.x < AnchoPanelClick && c.x + 50 > AnchoPanelClick && c.y < AltoPanelClick && c.y + 50 > AltoPanelClick) {
                            Color naranja = new Color(255, 204, 102);
                            Color verde = new Color(204, 255, 204);
                            if (mouse == 1) {
                                g.setColor(naranja);
                                nomselecnar = c.nombre;
                                anchoselecnar = c.x + 25;
                                altoselecnar = c.y;
                                nivelselecnar = m;
                                selecnar = 1;
                                g.fillRect(c.x, c.y, 50, 20);
                                sw = 1;
                                g.setColor(Color.black);
                                g.drawString(c.nombre, c.x + 2, c.y + 12);
                                i = k + 1;
                                if (selecver == 1 && nomselecnar.equals(nomselecver)) {
                                    selecver = 0;
                                }
                            } else {
                                if (mouse == 3) {
                                    g.setColor(verde);
                                    nomselecver = c.nombre;
                                    anchoselecver = c.x + 25;
                                    altoselecver = c.y;
                                    nivelselecver = m;
                                    selecver = 1;
                                    g.fillRect(c.x, c.y, 50, 20);
                                    sw = 1;
                                    g.setColor(Color.black);
                                    g.drawString(c.nombre, c.x + 2, c.y + 12);
                                    i = k + 1;
                                    if (selecnar == 1 && nomselecnar.equals(nomselecver)) {
                                        selecnar = 0;
                                    }
                                }
                            }

                        }
                    }
                }
            }
            m = m + 1;
            n = n * 2;
            int l = 0;
            if (selecnar == 1 && selecver == 1) {
                if (f.tio(raiz, nomselecnar, nomselecver) == true || f.tio(raiz, nomselecver, nomselecnar) == true) {
                    relaciontxt.setText("Tio y Sobrino");
                    l = 1;
                }
                if (f.abuelo(raiz, nomselecnar, nomselecver) || f.abuelo(raiz, nomselecver, nomselecnar)) {
                    relaciontxt.setText("Abuelo y Nieto");
                    l = 1;
                }
                if (f.primo(raiz, nomselecnar, nomselecver) || f.primo(raiz, nomselecver, nomselecnar)) {
                    relaciontxt.setText("Primos");
                    l = 1;
                }
                if (f.hermano(raiz, nomselecnar, nomselecver) || f.hermano(raiz, nomselecver, nomselecnar)) {
                    relaciontxt.setText("Hermanos");
                    l = 1;
                }
                if (nomselecver.equals(f.padre(raiz, nomselecnar)) || nomselecnar.equals(f.padre(raiz, nomselecver))) {
                    relaciontxt.setText("Padre e Hijo");
                    l = 1;
                }
                if (l == 0) {
                    relaciontxt.setText("Ninguna relacion");
                }
            } else {
                relaciontxt.setText("");
            }

        }
    }//GEN-LAST:event_ArbolMouseClicked

    private void CrearArbolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearArbolMouseEntered
        CrearArbol.setForeground(Color.orange);
    }//GEN-LAST:event_CrearArbolMouseEntered

    private void CrearArbolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearArbolMouseExited
        CrearArbol.setForeground(Color.white);
    }//GEN-LAST:event_CrearArbolMouseExited

    private void AggHijoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AggHijoMouseEntered
        AggHijo.setForeground(Color.orange);
    }//GEN-LAST:event_AggHijoMouseEntered

    private void AggHijoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AggHijoMouseExited
        AggHijo.setForeground(Color.white);
    }//GEN-LAST:event_AggHijoMouseExited

    private void instruccionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instruccionesMouseEntered
        instrucciones.setForeground(Color.orange);
    }//GEN-LAST:event_instruccionesMouseEntered

    private void instruccionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instruccionesMouseExited
        instrucciones.setForeground(Color.white);
    }//GEN-LAST:event_instruccionesMouseExited

    private void instruccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instruccionesMouseClicked
        this.Instrucciones.setVisible(true);
        this.Instrucciones.setLocationRelativeTo(null);
    }//GEN-LAST:event_instruccionesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ArbolG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArbolG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArbolG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArbolG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArbolG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AggHijo;
    private javax.swing.JPanel Arbol;
    private javax.swing.JLabel CrearArbol;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Instru;
    private javax.swing.JFrame Instrucciones;
    private javax.swing.JLabel Relacion;
    private javax.swing.JLabel instrucciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel relaciontxt;
    // End of variables declaration//GEN-END:variables
}
