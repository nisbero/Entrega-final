	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.io.IOException;
	import java.net.*;
	import javax.swing.JOptionPane;
	/**
	 * Clase que representa la interfaz para cambiar el salario de empleados.
	 */
public class Empleados_Cambio_Salario extends javax.swing.JFrame {

			/**
		     * Creates new form
		     */
		    public Empleados_Cambio_Salario() {
		        initComponents();
		    }
		    
		    //Envio de datos al servidor
		    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		        try {

		        	
		        	String mensaje = "Empleados Cambio Salario" + "-" + txtempl_ID.getText() +  "-" + txtSalario.getText();  
		            
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
		        
		        lblempl_ID = new javax.swing.JLabel();
		        txtempl_ID = new javax.swing.JTextField();
		        
		        
		        lblSalario = new javax.swing.JLabel();
		        txtSalario = new javax.swing.JTextField();
		        
		       		        
		        btnEjecutar = new javax.swing.JButton();
		        
		        //jButton1 = new javax.swing.JButton();
		                

		        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		        lblTitulo.setText("Empleados");
		        lblempl_ID.setText("Id");
		        lblSalario.setText("Salario");
		       
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
		            						.addComponent(lblempl_ID))
		            				
		            				.addGroup(layout.createSequentialGroup()
		            						.addContainerGap()
		            						.addComponent(txtempl_ID))  
		            				
		            				
		            				.addGroup(layout.createSequentialGroup()
		            						.addContainerGap()
		            						.addComponent(lblSalario))
		            				
		            				.addGroup(layout.createSequentialGroup()
		            						.addContainerGap()
		            						.addComponent(txtSalario))  
		            				 				
		            				
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
		                
		                
		                
		                .addComponent(lblempl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)     
		                
		                .addComponent(txtempl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)   
		                
		                
		                .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)     
		                
		                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
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
		            java.util.logging.Logger.getLogger(Empleados_Cambio_Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (InstantiationException ex) {
		            java.util.logging.Logger.getLogger(Empleados_Cambio_Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (IllegalAccessException ex) {
		            java.util.logging.Logger.getLogger(Empleados_Cambio_Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		            java.util.logging.Logger.getLogger(Empleados_Cambio_Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
		        //</editor-fold>

		        /* Cr<eate and display the form */
		        java.awt.EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                new Empleados_Cambio_Salario().setVisible(true);
		            }
		        });
		    }

		    // Variables declaration - do not modify//GEN-BEGIN:variables
		    
		    private javax.swing.JLabel lblTitulo;
		    
		    private javax.swing.JLabel lblempl_ID;
		    private javax.swing.JTextField txtempl_ID;
		    
		    private javax.swing.JLabel lblSalario;
		    private javax.swing.JTextField txtSalario;
		    
		    private javax.swing.JButton btnEjecutar;
		    
		   
		}

