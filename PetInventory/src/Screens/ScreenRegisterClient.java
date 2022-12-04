package Screens;

import Classes.Admin;
import Classes.Client;
import Classes.Lib;
import Classes.PetInventory;
import Classes.TypeRole;
import Classes.Seller;
import javax.swing.JOptionPane;


public class ScreenRegisterClient {


    private PetInventory petInventory;
    private boolean unRegistration;


    public ScreenRegisterClient(PetInventory petInventory, boolean unRegistration) {
        initComponents();
        this.unRegistration = unRegistration;
        this.petInventory = petInventory;
        backButton.setEnabled(!unRegistration);
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        registerButton = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        labelAddress = new javax.swing.JLabel();
        inputAddress = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        inputTelefone = new javax.swing.JTextField();
        labelCpf = new javax.swing.JLabel();
        inputCpf = new javax.swing.JTextField();
        tituleScreen = new javax.swing.JLabel();
        labelTypeAnimal = new javax.swing.JLabel();
        inputTypeAnimal = new javax.swing.JTextField();
        labelPetName = new javax.swing.JLabel();
        inputPetName = new javax.swing.JTextField();
        labelObservation = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        backButton.setText("Register");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        labelName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelName.setText("Name");

        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        labelAddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddress.setText("Address");

        inputAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAddressActionPerformed(evt);
            }
        });

        labelTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTelefone.setText("Telefone*");

        inputTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTelefoneActionPerformed(evt);
            }
        });

        labelCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCpf.setText("CPF*");

        inputCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCpfActionPerformed(evt);
            }
        });

        tituleScreen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituleScreen.setText("Register Clients");

        labelTypeAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTypeAnimal.setText("Type Animal");

        inputTypeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTypeAnimalActionPerformed(evt);
            }
        });

        labelPetName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelPetName.setText("Pet Name");

        inputPetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPetNameActionPerformed(evt);
            }
        });

        labelObservation.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelObservation.setText("*Numbers only");

        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelObservation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTypeAnimal)
                            .addComponent(labelPetName))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPetName)
                            .addComponent(inputTypeAnimal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAddress)
                            .addComponent(labelName)
                            .addComponent(labelTelefone)
                            .addComponent(labelCpf))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputCpf)
                            .addComponent(inputName))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(tituleScreen)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tituleScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelName)
                            .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAddress)
                            .addComponent(inputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelefone)
                            .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCpf)
                            .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPetName)
                            .addComponent(inputPetName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTypeAnimal)
                            .addComponent(inputTypeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelObservation)))
                    .addComponent(backButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void inputAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAddressActionPerformed

    private void inputTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTelefoneActionPerformed

    private void inputCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCpfActionPerformed

    private void inputTypeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTipoPetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTypeAnimalActionPerformed

    private void inputPetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomePetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPetNameActionPerformed

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarMouseClicked
        if (inputName.getText().isEmpty() || inputCpf.getText().isEmpty() || inputAddress.getText().isEmpty() || inputPetName.getText().isEmpty() || inputTelefone.getText().isEmpty() || inputTypeAnimal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Empty text fields exist", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Se o usuário for administrador ou vendedor...
        if (petInventory.getCurrentLogin().getRole() == TypeRole.ADMIN || petInventory.getCurrentLogin().getRole() == TypeRole.SELLER) {

            String name = inputName.getText();
            String typeAnimal = inputTypeAnimal.getText();
            String petName = inputPetName.getText();
            String address = inputAddress.getText();
            long phone = Long.parseLong(inputTelefone.getText());
            long cpf = Long.parseLong(inputCpf.getText());
            TypeRole typeRole = petInventory.getCurrentLogin().getRole();
            //Fazendo o casting para o tipo adequado de usuário
            Client registeredClient
                    = (typeRole == TypeRole.SELLER
                            ? ((Seller) petInventory.getCurrentLogin()) : (Admin) petInventory.getCurrentLogin())
                            .registerClient(petInventory, name, typeAnimal, petName, address, phone, cpf);
            if (registeredClient != null) {
                JOptionPane.showMessageDialog(this, "Successfully registered client", "Register", JOptionPane.INFORMATION_MESSAGE);
                if(unRegistration){
                    petInventory.back();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Client already registered", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            inputName.setText("");
            inputCpf.setText("");
            inputAddress.setText("");
            inputPetName.setText("");
            inputTelefone.setText("");
            inputTypeAnimal.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Acesso negado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoCadastrarMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        petInventory.back();
    }//GEN-LAST:event_backButttonMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton registerButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField inputCpf;
    private javax.swing.JTextField inputAddress;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPetName;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JTextField inputTypeAnimal;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPetName;
    private javax.swing.JLabel labelObservation;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTypeAnimal;
    private javax.swing.JLabel tituleScreen;
}