
	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.io.IOException;
	import java.net.*;
	import javax.swing.JOptionPane;
	/**
	 * Clase que representa el modelo de localización.
	 */
	public class Localizaciones extends javax.swing.JFrame {

			/**
		     * Creates new form
		     */
		    public Localizaciones() {
		        initComponents();
		    }
		    
		    //Envio de datos al servidor
		    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		        try {

		        	
		        	String mensaje = "Localizaciones" + "-" + txtlocaliz_ID.getText() + "-" +
		        										txtloacaliz_ciudad_ID.getText()  + "-" +
		        										txtloacaliz_pais_ID.getText()  + "-" +
		        										txtlocaliz_direccion.getText()
		        										;  
		            
		            Socket socket = new Socket("192.168.1.2",9999);
		            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());    
		           
		            salida.writeUTF(mensaje);
		                        
		            DataInputStream entrada = new DataInputStream(socket.getInputStream());
		            mensaje = entrada.readUTF();
		            JOptionPane.showMessageDialog(null,"Resultado de la operacion : " + mensaje);
		            
		            socket.close();           
		                                    
		        } catch (IOException ex) {
		            JOptionPane.showMessageDialog(null,"Error : " +ex + " No se pudo realizar la conexión . ");
		        }
		    }//GEN-LAST:event_jButton1ActionPerformed
		    
		          
		    

		    /**
		     * This method is called from within the constructor to initialize the form.
		     * WARNING: Do NOT modify this code. The content of this method is always
		     * regenerated by the Form Editor.
		     */
		    @SuppressWarnings("unchecked")
		    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
		    private void initComponents() {

		    	lblTitulo = new javax.swing.JLabel();    	
		    	
		        //jLabel1 = new javax.swing.JLabel();
		        //jTextField1 = new javax.swing.JTextField();
		        
		        lbllocaliz_ID = new javax.swing.JLabel();
		        txtlocaliz_ID = new javax.swing.JTextField();
		        
		        lblloacaliz_ciudad_ID = new javax.swing.JLabel();
		        txtloacaliz_ciudad_ID = new javax.swing.JTextField();
		        
		        lblloacaliz_pais_ID = new javax.swing.JLabel();
		        txtloacaliz_pais_ID = new javax.swing.JTextField();
		        
		        lbllocaliz_direccion = new javax.swing.JLabel();
		        txtlocaliz_direccion = new javax.swing.JTextField();
		        
		        
		        btnEjecutar = new javax.swing.JButton();
		        
		        //jButton1 = new javax.swing.JButton();
		                

		        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		        lblTitulo.setText("Ciudades");
		        lbllocaliz_ID.setText("Id");
		        lblloacaliz_ciudad_ID.setText("id Ciudad");
		        lblloacaliz_pais_ID.setText("id Pais");
		        lbllocaliz_direccion.setText("Direccion");

		        btnEjecutar.setText("Enviar");
		        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton1ActionPerformed(evt);
		            }
		        });

		        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		        getContentPane().setLayout(layout);
		        layout.setHorizontalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            
		            .addGroup(layout.createSequentialGroup()
		                
		            		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    
		            				.addGroup(layout.createSequentialGroup()
		            						.addContainerGap()
		            						.addComponent(lbllocaliz_ID))
		            				
		            				.addGroup(layout.createSequentialGroup()
		            						.addContainerGap()
		            						.addComponent(txtlocaliz_ID))  
		            				
		            				
		            				
		            				.addGroup(layout.createSequentialGroup()
		            						.addContainerGap()
		            						.addComponent(lblloacaliz_ciudad_ID))
		            				
		            				.addGroup(layout.createSequentialGroup()
		            						.addContainerGap()
		            						.addComponent(txtloacaliz_ciudad_ID))
		            				
		            				
		            				
		            				.addGroup(layout.createSequentialGroup()
		            						.addContainerGap()
		            						.addComponent(lblloacaliz_pais_ID))
		            				
		            				.addGroup(layout.createSequentialGroup()
		            						.addContainerGap()
		            						.addComponent(txtloacaliz_pais_ID))	        
		            				
		            				
		            				
		            				.addGroup(layout.createSequentialGroup()
		            						.addContainerGap()
		            						.addComponent(lbllocaliz_direccion))
		            				
		            				.addGroup(layout.createSequentialGroup()
		            						.addContainerGap()
		            						.addComponent(txtlocaliz_direccion))	        
		            				
		            				
		            				
		            				
		            				.addGroup(layout.createSequentialGroup()
		            						.addGap(115, 115, 115)
		            						.addComponent(lblTitulo)
		            						.addGap(0, 0, Short.MAX_VALUE)))
		                
		            		.addContainerGap())
		            
		            .addGroup(layout.createSequentialGroup()
		                .addGap(67, 67, 67)
		                .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addContainerGap(92, Short.MAX_VALUE))
		            
		        );
		        
		        layout.setVerticalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            
		            .addGroup(layout.createSequentialGroup()
		                .addContainerGap()
		                
		                .addComponent(lblTitulo)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                
		                
		                
		                .addComponent(lbllocaliz_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)     
		                
		                .addComponent(txtlocaliz_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)                


		                
		                
		                .addComponent(lblloacaliz_ciudad_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)     
		                               
		                .addComponent(txtloacaliz_ciudad_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                
		                
		                
		                .addComponent(lblloacaliz_pais_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)     
		                               
		                .addComponent(txtloacaliz_pais_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                
		                
		                
		                
		                .addComponent(lbllocaliz_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)     
		                               
		                .addComponent(txtlocaliz_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                
		                
		                
		                                
		                .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addContainerGap(254, Short.MAX_VALUE))
		            
		        );

		        pack();
		    }// </editor-fold>//GEN-END:initComponents

		       
		   

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
		            java.util.logging.Logger.getLogger(Localizaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (InstantiationException ex) {
		            java.util.logging.Logger.getLogger(Localizaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (IllegalAccessException ex) {
		            java.util.logging.Logger.getLogger(Localizaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		            java.util.logging.Logger.getLogger(Localizaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
		        //</editor-fold>

		        /* Cr<eate and display the form */
		        java.awt.EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                new Localizaciones().setVisible(true);
		            }
		        });
		    }

		    // Variables declaration - do not modify//GEN-BEGIN:variables
		    
		    private javax.swing.JLabel lblTitulo;
		    
		    private javax.swing.JLabel lbllocaliz_ID;
		    private javax.swing.JTextField txtlocaliz_ID;
		    
		    private javax.swing.JLabel lblloacaliz_ciudad_ID;
		    private javax.swing.JTextField txtloacaliz_ciudad_ID;
		    
		    private javax.swing.JLabel lblloacaliz_pais_ID;
		    private javax.swing.JTextField txtloacaliz_pais_ID;
		    
		    private javax.swing.JLabel lbllocaliz_direccion;
		    private javax.swing.JTextField txtlocaliz_direccion;		    
		    
		    private javax.swing.JButton btnEjecutar;
		    
		   
		}
