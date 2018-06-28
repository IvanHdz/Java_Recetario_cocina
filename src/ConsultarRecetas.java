/**
 *
 * @author Viruz
 */
public class ConsultarRecetas extends javax.swing.JDialog {
    private Recetas laLista;
    /**
     * Creates new form ConsultarRecetas
     */
    public ConsultarRecetas(java.awt.Frame parent, boolean modal, Recetas laLista) {
        super(parent, modal);
        this.laLista = laLista;
        initComponents();
        mostrarPasos();
        this.setTitle("Viruz Blog: Receta Actual - " + this.laLista.getNombre());
        setBounds(this.getX(), this.getY(), 600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void mostrarPasos() {
        //Obtiene la Información de la Clase Recetas.
        this.jLabel1.setText(laLista.getNombre());
        PasosdeRecetas[] nodos = laLista.getElementos();
        
        //Se asocia los Pasos con la Receta. 
        PasosdeRecetas nodoInicial = nodos[0];
        PasosdeRecetas otroNodo = nodoInicial;

        //Se despliegan los Pasos en el Área de Texto
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Viruz\\Pictures\\Logos\\res2.gif")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 40));

        jButton1.setText("Salir");
        jButton1.setPreferredSize(new java.awt.Dimension(75, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
