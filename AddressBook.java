
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ubuntu
 */
public class AddressBook extends javax.swing.JFrame {

    /**
     * Creates new form AddressBook
     */
    public AddressBook() {
        initComponents();
    }
    
    ArrayList<String> list;
    ArrayList<Address> list2;
    boolean flag = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        streetTF = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showArea = new javax.swing.JTextArea();
        showButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        editTF = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        updateNameTF = new javax.swing.JTextField();
        updatePhoneTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        updateEmailTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        updateStreetTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        confirmUpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 11)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 11)); // NOI18N
        jLabel2.setText("Phone");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 11)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 11)); // NOI18N
        jLabel4.setText("Street address");

        nameTF.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        phoneTF.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        emailTF.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });

        streetTF.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        saveButton.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        showArea.setColumns(20);
        showArea.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        showArea.setRows(5);
        jScrollPane1.setViewportView(showArea);

        showButton.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        showButton.setText("Show all info");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel6.setText("Enter name");

        searchTF.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        searchButton.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel5.setText("Search result :");

        resultArea.setColumns(20);
        resultArea.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        resultArea.setRows(5);
        jScrollPane2.setViewportView(resultArea);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel7.setText("Enter the Phone n. of person to edit info");

        editTF.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        editButton.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        editButton.setText("OK");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        messageLabel.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        messageLabel.setText("  ");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel8.setText("Message:");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel9.setText("Edit name");

        updateNameTF.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        updatePhoneTF.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel10.setText("Edit phone");

        updateEmailTF.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel11.setText("Edit email");

        updateStreetTF.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel12.setText("Edit street add.");

        confirmUpdateButton.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        confirmUpdateButton.setText("Confirm updates");
        confirmUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(phoneTF)
                    .addComponent(emailTF)
                    .addComponent(streetTF))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editTF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editButton))
                    .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateStreetTF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(showButton)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel6)
                        .addGap(162, 162, 162)
                        .addComponent(searchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(confirmUpdateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(saveButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(showButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(searchButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(editButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(messageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(updateNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(updatePhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(updateEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(updateStreetTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirmUpdateButton)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTFActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        String name = searchTF.getText();
        searchTF.setText("");
        
        try{
            int a = 0;
            BufferedReader reader = new BufferedReader(new FileReader("addressBook.txt"));
            String s;
            resultArea.setText("");
            while((s=reader.readLine())!=null) {
                String [] st = s.split(";"); 
                s = "";
                for(int i=0; i<st.length; i++){
                    s = s + st[i] + " ";
                }
                if(name.equals(st[0])){
                    a = 1;
                    resultArea.append(s);
                    resultArea.append("\n");
                }
            }
            if(a==0) resultArea.setText("Data not found");
        }
        catch(IOException e){
            
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        String name = nameTF.getText() + ";";
        String email = emailTF.getText() + ";";
        String phone = phoneTF.getText() + ";";
        String street = streetTF.getText() + ";";
        
        try{
            FileWriter f = new FileWriter("addressBook.txt", true);
            PrintWriter out = new PrintWriter(f);
            
            out.println(name + phone + email + street);
            nameTF.setText("");
            phoneTF.setText("");
            emailTF.setText("");
            streetTF.setText("");
            
            f.close();
            out.close();
        }
        catch(IOException e){
            
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        
        try{           
            list2 = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("addressBook.txt"));
	    String s;
            showArea.setText("");
            while((s=reader.readLine())!=null) {                              
                String [] st = s.split(";"); 
                list2.add(new Address(st[0], st[1], st[2], st[3]));                
            }
   
            list2.sort(new Comparator<Address>() {
            	public int compare(Address o1, Address o2) {
                    String name1 = o1.name;
                    String name2 = o2.name;
                    return name1.compareTo(name2);
            	}
            });
            
            for(Address lists : list2){
                String temp = lists.name + " " + lists.phone + " "+lists.email+" "+lists.street;
                showArea.append(temp);
                showArea.append("\n");
            }
            list2 = null;
        }
        catch(IOException e){

        }
    }//GEN-LAST:event_showButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        
        String phone = editTF.getText();
        list = new ArrayList<>();
        
        try{
            
            File f = new File("addressBook.txt");
            Scanner sc = new Scanner(f);           
            flag = false;
            
            while(sc.hasNext()){
                String line = sc.nextLine();
                if(line.contains(phone)){
                    
                    messageLabel.setText("Data matched, now you can edit or keep the datas unchanged");                          
                    String [] st = line.split(";");
                                                       
                    flag = true;
                    
                    updateNameTF.setText(st[0]);
                    updatePhoneTF.setText(st[1]);
                    updateEmailTF.setText(st[2]);
                    updateStreetTF.setText(st[3]);
                }
                list.add(line);               
            }
            if(!flag) messageLabel.setText("Data not matched, can't do any edition");          
        }
        catch(IOException e){

        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void confirmUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmUpdateButtonActionPerformed
        
        if(flag == true){
            
            String pn = editTF.getText();
            String newName = updateNameTF.getText() + ";";
            String newPhone = updatePhoneTF.getText() + ";";
            String newEmail = updateEmailTF.getText() + ";";
            String newStreet = updateStreetTF.getText() + ";";
            String newLine = newName + newPhone + newEmail + newStreet;
                            

            try{
                
                FileWriter f1 = new FileWriter("addressBook.txt");
                PrintWriter out1 = new PrintWriter(f1);
            
                out1.flush();
                out1.close();
                f1.close();
                
                
                FileWriter f2 = new FileWriter("addressBook.txt", true);
                PrintWriter out2 = new PrintWriter(f2);
                               
                for(String lists : list){
                    String [] temp = lists.split(";");     
                    String x = temp[1];
                    if(pn.equals(x)){      
                        out2.println(newLine);                      
                    }
                    else {
                        out2.println(lists);
                    }
                }
                                                              
                editTF.setText("");
                messageLabel.setText("");
                updateNameTF.setText("");
                updatePhoneTF.setText("");
                updateEmailTF.setText("");
                updateStreetTF.setText("");
                list = null;               
                out2.close();
                f2.close();
            }
            catch(IOException e){
            
            }
        }
        
    }//GEN-LAST:event_confirmUpdateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddressBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmUpdateButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField editTF;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JTextArea resultArea;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTF;
    private javax.swing.JTextArea showArea;
    private javax.swing.JButton showButton;
    private javax.swing.JTextField streetTF;
    private javax.swing.JTextField updateEmailTF;
    javax.swing.JTextField updateNameTF;
    private javax.swing.JTextField updatePhoneTF;
    private javax.swing.JTextField updateStreetTF;
    // End of variables declaration//GEN-END:variables
}

class Address{
    public String name,phone,email,street;
    public Address(String a, String b, String c, String d){
        name = a; phone = b; email = c; street = d;
    }
}