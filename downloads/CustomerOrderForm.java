
/**
 *
 * @author Na'Shea Wiesner
 * @author Jared Kamp
 */
public class CustomerOrderForm extends javax.swing.JFrame {

    /**
     * Creates new form CustomerOrderForm
     */
    private Customer cstmr;
    public CustomerOrderForm(int tableNumber) {
        initComponents();
        
        cstmr = new Customer(tableNumber);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Place Your Order");
        setResizable(false);

        buttonGroup4.add(jRadioButton16);
        jRadioButton16.setText("Ice Cream & Cookie");
        jRadioButton16.setName("IceCreamCookieBtn"); // NOI18N

        buttonGroup4.add(jRadioButton14);
        jRadioButton14.setText("Ice Cream");
        jRadioButton14.setName("IceCreamBtn"); // NOI18N

        buttonGroup4.add(jRadioButton15);
        jRadioButton15.setSelected(true);
        jRadioButton15.setText("None");
        jRadioButton15.setName("NoDessertBtn"); // NOI18N

        buttonGroup3.add(jRadioButton12);
        jRadioButton12.setText("Steak Salad");
        jRadioButton12.setName("SteakSaladBtn"); // NOI18N

        buttonGroup4.add(jRadioButton13);
        jRadioButton13.setText("Cookie");
        jRadioButton13.setName("CookieBtn"); // NOI18N

        buttonGroup3.add(jRadioButton10);
        jRadioButton10.setText("Salad");
        jRadioButton10.setName("SaladBtn"); // NOI18N

        buttonGroup3.add(jRadioButton11);
        jRadioButton11.setSelected(true);
        jRadioButton11.setText("None");
        jRadioButton11.setName("NoEntreeBtn"); // NOI18N

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Beer");
        jRadioButton2.setName("BeerBtn"); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Water");
        jRadioButton1.setName("WaterBtn"); // NOI18N

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setText("Steak");
        jRadioButton9.setName("SteakBtn"); // NOI18N

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("Potato Skins");
        jRadioButton6.setName("PotatoSkinsBtn"); // NOI18N

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Spinach & Artichoke Dip");
        jRadioButton5.setName("SpinachArtichokeDipBtn"); // NOI18N

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("None");
        jRadioButton4.setName("NoDrinkBtn"); // NOI18N

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Whiskey");
        jRadioButton3.setName("WhiskeyBtn"); // NOI18N

        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setText("Buffalo Wings");
        jRadioButton8.setName("BuffaloWingsBtn"); // NOI18N

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setSelected(true);
        jRadioButton7.setText("None");
        jRadioButton7.setName("NoAppetizerBtn"); // NOI18N

        jLabel1.setText("Appetizer");

        jTextField1.setText("Your Name");
        jTextField1.setName("txtName"); // NOI18N

        jLabel2.setText("Drink");

        jLabel3.setText("Name");

        jLabel4.setText("Entree");

        jLabel5.setText("Dessert");
        jLabel5.setToolTipText("");

        jButton1.setText("Place Order");
        jButton1.setName("PlaceOrderBtn"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.setToolTipText("");
        jButton2.setName("ClearBtn"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(32, 32, 32)
                                .addComponent(jRadioButton2)
                                .addGap(94, 94, 94)
                                .addComponent(jRadioButton3)
                                .addGap(56, 56, 56)
                                .addComponent(jRadioButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton6)
                                    .addComponent(jRadioButton14)
                                    .addComponent(jRadioButton10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton5)
                                    .addComponent(jRadioButton13)
                                    .addComponent(jRadioButton9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton8)
                                    .addComponent(jRadioButton12)
                                    .addComponent(jRadioButton16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton15)
                                    .addComponent(jRadioButton11)
                                    .addComponent(jRadioButton7)))
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)
                        .addComponent(jRadioButton3))
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton6)
                        .addComponent(jRadioButton5)
                        .addComponent(jRadioButton8))
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton10)
                            .addComponent(jRadioButton9))
                        .addComponent(jRadioButton12, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jRadioButton11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton14)
                        .addComponent(jRadioButton13)
                        .addComponent(jRadioButton16))
                    .addComponent(jRadioButton15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
    }//GEN-LAST:event_jButton1ActionPerformed
private void close()
    {        
        try
        {
            this.dispose();
            this.removeAll();
            this.validate();
        }
        catch(Exception e)
        {
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
