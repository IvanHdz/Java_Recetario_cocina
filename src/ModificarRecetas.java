import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Viruz
 */
public class ModificarRecetas extends javax.swing.JDialog {
    private Recetas laLista;
    private PasosdeRecetas[] nodos;
    private int paso;
    /**
     * Creates new form ModificarRecetas
     */    
    public ModificarRecetas(java.awt.Frame parent, boolean modal, Recetas laLista) {
        super(parent, modal);
        this.laLista = laLista;
        initComponents();
        modificarPasos();
        this.setTitle("Viruz Blog: Receta Actual - " + this.laLista.getNombre());
        setLocationRelativeTo(null);
        setBounds(this.getX(), this.getY(), 600, 400);
        setVisible(true);
    }
    
    private void modificarPasos() {
        this.jLabel1.setText(laLista.getNombre());
        nodos = laLista.getElementos();
        PasosdeRecetas nodoInicial = nodos[0];
        PasosdeRecetas otroNodo = nodoInicial;
        int contador = 0;
        do {
            this.jTextArea1.append("  "+(contador+1)+".- "+otroNodo.getInformacion());
            this.jTextArea1.append("\n\n");
            contador++;
            otroNodo = otroNodo.getPasos();
        }while (otroNodo != null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Viruz\\Pictures\\Logos\\res4.gif")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 10), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 60));

        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToolBar1.setPreferredSize(new java.awt.Dimension(140, 180));

        jButton1.setText("Modificar Paso");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton1.setPreferredSize(new java.awt.Dimension(120, 30));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText("Eliminar Paso");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton2.setPreferredSize(new java.awt.Dimension(115, 30));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton3.setLabel("Nuevo paso antes");
        jButton3.setPreferredSize(new java.awt.Dimension(135, 30));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setText("Nuevo paso después");
        jButton4.setActionCommand("Nuevo Paso Después ");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton4.setPreferredSize(new java.awt.Dimension(140, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setText("Salir");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton5.setPreferredSize(new java.awt.Dimension(65, 30));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jPanel2.add(jToolBar1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            paso = Integer.parseInt (JOptionPane.showInputDialog("Inserte el Paso a Modificar"));
            if (nodos[paso-1] != null) {
                String nuevoInfor = JOptionPane.showInputDialog(
                        "Inserte la información a cambiar\n\nInformación anterior: "
                         +nodos[paso-1].getInformacion()+"\n\n");
                
                nodos[paso-1].setInformacion(nuevoInfor);
                JOptionPane.showMessageDialog(null,"información modificada");
                this.dispose();
            }else {
                JOptionPane.showMessageDialog (null, "El Paso seleccionado no existe");
            }
        }catch (HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Invalid Input!",  
            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{    
        paso = Integer.parseInt (JOptionPane.showInputDialog("Inserte el Paso a eliminar"));
        
        /***********Validaciones*********/
        if (paso == 1) {
            nodos[paso-1].setInformacion(null);
            nodos[paso-1].setPasos(null);
            nodos[paso-1] = null;
            PasosdeRecetas []listaNueva = new PasosdeRecetas [nodos.length];
            int cont1 = 0;
            int cont2 = 0;
            do {
                if (nodos[cont1] != null) {
                    listaNueva[cont2] = nodos[cont1];
                    cont2++;
                }
                cont1++;
            }while (cont1 < nodos.length);
            laLista.setElementos(listaNueva);
            JOptionPane.showMessageDialog(null,"Paso Eliminado");
            this.dispose();
            return;
        }
        
      if (paso == nodos.length) {
            nodos[paso-2].setPasos(null);
            nodos[paso-1].setInformacion(null);
            nodos[paso-1].setPasos(null);
            nodos[paso-1] = null;
            PasosdeRecetas []listaNueva = new PasosdeRecetas [nodos.length];
            int cont1 = 0;
            int cont2 = 0;
            do {
                if (nodos[cont1] != null) {
                    listaNueva[cont2] = nodos[cont1];
                    cont2++;
                }
                cont1++;
            }while (cont1 < nodos.length);
            laLista.setElementos(listaNueva);
            JOptionPane.showMessageDialog(null,"Paso Eliminado");
            this.dispose();
            return;
        }

        if (nodos[paso-1] != null) {
            nodos[paso-1].setInformacion(null);
            nodos[paso-2].setPasos(nodos[paso]);
            nodos[paso-1].setPasos(null);
            nodos[paso-1] = null;
            PasosdeRecetas []listaNueva = new PasosdeRecetas [nodos.length];
            int cont1 = 0;
            int cont2 = 0;
            do {
                if (nodos[cont1] != null) {
                    listaNueva[cont2] = nodos[cont1];
                    cont2++;
                }
                cont1++;
            }while (cont1 < nodos.length);
            laLista.setElementos(listaNueva);
            JOptionPane.showMessageDialog(null,"Paso Eliminado");
            this.dispose();
        }
        
        else {
            JOptionPane.showMessageDialog (null, "El Paso seleccionado no existe");
        }
        
      }catch (HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Invalid Input!",  
            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            paso = Integer.parseInt (JOptionPane.showInputDialog("Inserte donde desea agregar un Paso " + "'Antes'"));
        
            /***********Validaciones*********/
            if (paso == 1) {
                String infor = JOptionPane.showInputDialog(null, "Ingrese la nueva información") ;
                PasosdeRecetas unNodo = new PasosdeRecetas (infor);
                PasosdeRecetas []listaNueva = new PasosdeRecetas [nodos.length+1];
                listaNueva[0] = unNodo;
                    for (int i = 1; i < listaNueva.length; i++) {
                        listaNueva[i] = nodos[i-1];
                    }
                listaNueva[0].setPasos(listaNueva[1]);
                laLista.setElementos(listaNueva);
                JOptionPane.showMessageDialog(null,"Paso Insertado");
                this.dispose();
                return;
            }

            if (paso == nodos.length) {
                String infor = JOptionPane.showInputDialog(null, "Ingrese la nueva información") ;
                PasosdeRecetas unNodo = new PasosdeRecetas (infor);
                PasosdeRecetas []listaNueva = new PasosdeRecetas [nodos.length+1];

                System.arraycopy(nodos, 0, listaNueva, 0, nodos.length);
                        
                listaNueva[listaNueva.length-2] = unNodo;
                listaNueva[listaNueva.length-1] = nodos[nodos.length-1];
                for (int i = 0; i < (listaNueva.length-1); i++) {
                    listaNueva[i].setPasos(listaNueva[i+1]);
                }
                listaNueva[listaNueva.length-1].setPasos(null);
                laLista.setElementos(listaNueva);
                JOptionPane.showMessageDialog(null,"Paso Insertado");
                this.dispose();
                return;
            }
        
            if (nodos[paso-1] != null) {
                String infor = JOptionPane.showInputDialog(null, "Ingrese la nueva información") ;
                PasosdeRecetas unNodo = new PasosdeRecetas (infor);
                PasosdeRecetas []listaNueva = new PasosdeRecetas [nodos.length+1];
                
                System.arraycopy(nodos, 0, listaNueva, 0, paso-1);
            
                listaNueva[paso-1] = unNodo;
                    for (int i = (paso); i < listaNueva.length; i++) {
                        listaNueva[i] = nodos[i-1];
                    }
            
                listaNueva[paso].setPasos(listaNueva[paso+1]);
                for (int i = 0; i < (listaNueva.length-1); i++) {
                    listaNueva[i].setPasos(listaNueva[i+1]);
                }
            
                listaNueva[listaNueva.length-1].setPasos(null);
                laLista.setElementos(listaNueva);
                JOptionPane.showMessageDialog(null,"Paso Insertado");
                this.dispose();
            }
 
            else {
                JOptionPane.showMessageDialog (null, "El paso seleccionado no existe");
            }
        }catch (HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Invalid Input!",  
            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            paso = Integer.parseInt (JOptionPane.showInputDialog("Inserte donde desea agregar un Paso "+ "'Después'"));
        
            /***********Validaciones*********/
            if (paso == 1) {
                String infor = JOptionPane.showInputDialog(null, "Ingrese la nueva información") ;
                PasosdeRecetas unNodo = new PasosdeRecetas (infor);
                PasosdeRecetas []listaNueva = new PasosdeRecetas [nodos.length+1];
                listaNueva[0] = nodos[0];
                listaNueva[1] = unNodo;

                for (int i = 2; i < listaNueva.length; i++) {
                    listaNueva[i] = nodos[i-1];
                }
                listaNueva[0].setPasos(listaNueva[1]);
                listaNueva[1].setPasos(listaNueva[2]);
                laLista.setElementos(listaNueva);
                JOptionPane.showMessageDialog(null,"Paso Insertado");
                this.dispose();
                return;
            }
        
            if (paso == nodos.length) {
                String infor = JOptionPane.showInputDialog(null, "Ingrese la nueva información") ;
                PasosdeRecetas unNodo = new PasosdeRecetas (infor);
                PasosdeRecetas []listaNueva = new PasosdeRecetas [nodos.length+1];
                listaNueva[listaNueva.length-1] = unNodo;
                listaNueva[listaNueva.length-2] = nodos[nodos.length-1];

                System.arraycopy(nodos, 0, listaNueva, 0, listaNueva.length-2);

                listaNueva[listaNueva.length-2].setPasos(listaNueva[listaNueva.length-1]);
                listaNueva[listaNueva.length-1].setPasos(null);
                laLista.setElementos(listaNueva);
                JOptionPane.showMessageDialog(null,"Paso Insertado");
                this.dispose();
                return;
            }

            if (nodos[paso-1] != null) {
                String infor = JOptionPane.showInputDialog(null, "Ingrese la nueva información") ;
                PasosdeRecetas unNodo = new PasosdeRecetas (infor);
                PasosdeRecetas []listaNueva = new PasosdeRecetas [nodos.length+1];

                System.arraycopy(nodos, 0, listaNueva, 0, paso);

                listaNueva[paso] = unNodo;

                for (int i = (paso+1); i < listaNueva.length; i++) {
                    listaNueva[i] = nodos[i-1];
                }
                listaNueva[paso].setPasos(listaNueva[paso+1]);

                for (int i = 0; i < (listaNueva.length-1); i++) {
                    listaNueva[i].setPasos(listaNueva[i+1]);
                }
                listaNueva[listaNueva.length-1].setPasos(null);

                laLista.setElementos(listaNueva);
                JOptionPane.showMessageDialog(null,"Paso Insertado");
                this.dispose();
            }   
            else {
                JOptionPane.showMessageDialog (null, "El Paso seleccionado no existe");
            }
        }catch (HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Invalid Input!",  
            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}