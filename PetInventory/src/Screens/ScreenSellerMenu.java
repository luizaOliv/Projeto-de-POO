package Screens;

import Classes.Lib;
import Classes.PetInventory;
import Classes.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ScreenSellerMenu extends javax.swing.JFrame {
    PetInventory petInventory;
    /**
     * Creates new form ScreenSellerMenu
     */
    public ScreenSellerMenu(PetInventory petInventory) {
        initComponents();
        this.petInventory = petInventory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonNewClient = new javax.swing.JButton();
        jButtonSellProduct = new javax.swing.JButton();
        jButtonSellTask = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Seller Menu");

        jButtonNewClient.setText("New Client");
        jButtonNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jButtonNewClientActionPerformed(evt);
            }
        });

        jButtonSellProduct.setText("Sell Product");
        jButtonSellProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              //  jButtonSellProductActionPerformed(evt);
            }
        });

        jButtonSellTask.setText("Sell Task");
        jButtonSellTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jButtonSellTaskActionPerformed(evt);
            }
        });

        jButtonBack.setText("BACK");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButtonSellTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButtonSellProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButtonNewClient, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jButtonNewClient, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSellProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSellTask, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButtonBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
        String message = "Do you really want to exit the Seller Menu?";
        String title = "Confirmation";
        int answer = JOptionPane.showConfirmDialog(this,  message, title, JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION){
            petInventory.back();
        }
    }

    private void jButtonNewClientActionPerformed(java.awt.event.ActionEvent evt) {
        petInventory.goFor(new ScreenRegisterClient(petInventory, false)); 
    }

   // private void jButtonSellProductActionPerformed(java.awt.event.ActionEvent evt) {
     //   ArrayList<Product> carrinho = new ArrayList<>();
       // petInventory.next(new ScreenSellProduct(petInventory, carrinho)); 
   // }

    //private void jButtonSellTaskActionPerformed(java.awt.event.ActionEvent evt) {
     //   petInventory.next(new ScreenSellTask(petInventory)); 
    //}
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNewClient;
    private javax.swing.JButton jButtonSellProduct;
    private javax.swing.JButton jButtonSellTask;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

