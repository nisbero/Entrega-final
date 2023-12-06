import java.net.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.swing.JOptionPane;

/**
 * Clase que representa el servidor de la aplicación.
 * Esta clase implementa la interfaz Runnable para permitir su ejecución en un hilo separado.
 */
/**
 *
 * @author Gloria Velasquez
 */
public class Servidor extends javax.swing.JFrame implements Runnable{

	
	  @Override
	    public void run() {
		  
		  String resultado = "";
		  
	      try{	     
	    	  
	          ServerSocket servidor = new ServerSocket(9999); 
	          	              
	              while(true){
	                  
	            	  Socket misocket = servidor.accept();

	                  DataInputStream entrada = new DataInputStream(misocket.getInputStream());
	                  String mensaje = entrada.readUTF();      
	                  
	                  resultado = SQL_Operaciones(mensaje);    
	                                 
	  	              DataOutputStream salida = new DataOutputStream(misocket.getOutputStream()); 	  	            
	  	              salida.writeUTF(resultado);
	
	                  misocket.close(); 
	  	              
	              }   
	              
		      }
		      catch(IOException e)
	      	  {
		          JOptionPane.showMessageDialog(null,"Error run server : " +e);
		      }
	      	          
	      
	    }
	    
	  
	    
	    public String SQL_Operaciones(String mensaje) {
	    	
	    	String resultado = "";
	    	
	    	try {    
	    		
	    		ConexionSQL_CRUD objCRUD = new ConexionSQL_CRUD();
	    		
	    		String[] operacion = mensaje.split("-");
	    		
	    		switch (operacion[0]) {
	            
	    		case "Paises":
	    			
	            	PaisModel pais = new PaisModel();    
	            	
	            	pais.pais_ID =Integer.parseInt(operacion[1]) ;
	            	pais.pais_nombre = operacion[2];	           
	            	
	            	objCRUD.Pais_Insert(pais);
	            	resultado = "\n " + operacion[0] + " - Proceso Terminado Exitosamente";
	            
	                break;
	                
	                
	            case "Ciudades":
	            	CiudadModel ciudad = new CiudadModel();    
	            	
	            	ciudad.ciud_ID =Integer.parseInt(operacion[1]);
	            	ciudad.ciud_pais_ID = Integer.parseInt(operacion[2]);  
	            	ciudad.ciud_nombre = operacion[3];
	            	
	            	objCRUD.Ciudad_Insert(ciudad);
	            	resultado = "\n " + operacion[0] + " - Proceso Terminado Exitosamente";
	            	
	                break;
	                
	                
	                
	            case "Localizaciones":
	            	LocalizacionModel Localizacion = new LocalizacionModel();    
	            	
	            	Localizacion.localiz_ID =Integer.parseInt(operacion[1]);
	            	Localizacion.loacaliz_ciudad_ID = Integer.parseInt(operacion[2]);  
	            	Localizacion.loacaliz_pais_ID = Integer.parseInt(operacion[3]); 
	            	Localizacion.localiz_direccion = operacion[4];
	            	
	            	objCRUD.Localizacion_Insert(Localizacion);
	            	resultado = "\n " + operacion[0] + " - Proceso Terminado Exitosamente";
	            	
	                break;
	                
	                
	            case "Departamentos":
	            	DepartamentoModel Departamento = new DepartamentoModel();    
	            	
	            	Departamento.dpto_ID =Integer.parseInt(operacion[1]);
	            	Departamento.dpto_nombre = operacion[2];  
	            	Departamento.dpto_localiz_ID = Integer.parseInt(operacion[3]); 
	            	
	            	//JOptionPane.showMessageDialog(null, Integer.toString(Departamento.dpto_ID) + "-" + Departamento.dpto_nombre + "-" + Integer.toString(Departamento.dpto_localiz_ID));
	            	
	            	objCRUD.Departamento_Insert(Departamento);
	            	resultado = "\n " + operacion[0] + " - Proceso Terminado Exitosamente";
	            	
	                break;
	                
	                
	              
	            case "Cargos":
	            	CargoModel Cargo = new CargoModel();    
	            	
	            	Cargo.cargo_ID =Integer.parseInt(operacion[1]);
	            	Cargo.cargo_nombre = operacion[2];  
	            	Cargo.cargo_sueldo_minimo = Integer.parseInt(operacion[3]); 
	            	Cargo.cargo_suedlo_maximo = Integer.parseInt(operacion[4]);
	            	
	            	objCRUD.Cargo_Insert(Cargo);
	            	resultado = "\n " + operacion[0] + " - Proceso Terminado Exitosamente";
	            	
	                break;
	                
	                
	            case "Empleados":
	            	EmpleadoModel Empleado = new EmpleadoModel();    
	            	
	            	Empleado.empl_ID =Integer.parseInt(operacion[1]);
	            	Empleado.empl_primer_nombre = operacion[2];  
	            	Empleado.empl_segundo_nombre = operacion[3]; 
	            	Empleado.empl_email = (operacion[4]);
	            	Empleado.empl_fecha_nac = operacion[5];	
	            	Empleado.empl_sueldo = Integer.parseInt(operacion[6]);
	            	Empleado.empl_comision = Integer.parseInt(operacion[7]);
	            	Empleado.empl_cargo_ID = Integer.parseInt(operacion[8]);
	            	Empleado.empl_dpto_ID = Integer.parseInt(operacion[9]);
	            	
	            	objCRUD.Empleado_Insert(Empleado);
	            	resultado = "\n " + operacion[0] + " - Proceso Terminado Exitosamente";
	            	
	            case "Empleados Consulta":	            		            	
	            	ResultSet rs = null;    	            
	            	int id = Integer.parseInt(operacion[1]);	            	
	            	rs = objCRUD.Empleado_Select(id);
	            	
	            	
	            	if (rs.next()) { // Verificar si hay al menos una fila en el ResultSet	  
	                    resultado = "\n " + operacion[0] + " - Proceso Terminado Exitosamente \n Empleado: \n  " +
	                    		rs.getString("empl_ID") + "-" +
	                    		rs.getString("empl_primer_nombre") + "-" +
	                    		rs.getString("empl_segundo_nombre") + "-" +
	                    		rs.getString("empl_email") + "-" +
	                    		rs.getString("empl_fecha_nac") + "-" +
	                    		rs.getString("empl_sueldo") + "-" +
	                    		rs.getString("empl_comision") + "-" +
	                    		rs.getString("empl_cargo_ID") + "-" +
	                    		rs.getString("empl_dpto_ID")
	                    		;
	                    
	                    
	                } else {
	                    jTextArea1.append("\n No se encontraron resultados para el empleado con ID " + id);
	                }
	            		            	
	                break;
	                
	            case "Empleados Borrado":
	            		            	
	            	int idEmpl = Integer.parseInt(operacion[1]);	   
	            	objCRUD.Empleado_Borrado(idEmpl);
	            	resultado = "\n " + operacion[0] + " - Proceso Terminado Exitosamente";
	            	break;  
	            	
	            case "Empleados Cambio Salario":
	            	
	            	int idEmplCambio = Integer.parseInt(operacion[1]);
	            	int salario = Integer.parseInt(operacion[2]);
	            		   
	            	objCRUD.Empleado_Cambio_Salario(salario, idEmplCambio);
	            	resultado = "\n " + operacion[0] + " - Proceso Terminado Exitosamente";
	            	break;  
	                
	            default:
	                System.out.println("Opción no válida");
	                break;
	        }	    			    		
	    		
	    	}
	    	catch(Exception e) {
	    		resultado = "Error en switch: " + e;	    		
	    	}
	    	
	    	return resultado;
	    
	    }
	    
	
	
    /**
     * Creates new form Servidor
     */
    public Servidor() {
        initComponents();
        Thread mihilo = new Thread(this);
        mihilo.start();
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
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
  
    
}
