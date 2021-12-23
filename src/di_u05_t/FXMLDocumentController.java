/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_u05_t;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.AlumnosDAM;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.fxutils.viewer.JasperViewerFX;

/**
 *
 * @author Cristian
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private VBox panel;
    ArrayList<AlumnosDAM> a = null;
    
    @FXML
    public void mostrarListado(ActionEvent e){
        try{
        JRBeanCollectionDataSource bcds = new JRBeanCollectionDataSource(a);
        Node source = (Node) e.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        JasperViewerFX viewerfx;
        viewerfx = new JasperViewerFX (stage, "Gráfico de barras", "/informes/MatriculadosDI.jasper", new HashMap(), bcds);
        viewerfx.show();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
    @FXML
    public void mostrarGraficoSectores(ActionEvent e){
        try{
        JRBeanCollectionDataSource bcds = new JRBeanCollectionDataSource(a);
        Node source = (Node) e.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        JasperViewerFX viewerfx;
        viewerfx = new JasperViewerFX (stage, "Gráfico de barras", "/informes/Sectores.jasper", new HashMap(), bcds);
        viewerfx.show();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    @FXML
    public void mostrarGraficoBarras(ActionEvent e){
        try{
        JRBeanCollectionDataSource bcds = new JRBeanCollectionDataSource(a);
        Node source = (Node) e.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        JasperViewerFX viewerfx;
        viewerfx = new JasperViewerFX (stage, "Gráfico de barras", "/informes/Barras.jasper", new HashMap(), bcds);
        viewerfx.show();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
        
    @FXML
    public void salir(){
        Platform.exit();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        panel.getStylesheets().add("estilos/EstiloBase.css");
        
        a = new ArrayList<AlumnosDAM>();
           
        a.add(new AlumnosDAM("54212045X","DI","Madrid",6.5));
        a.add(new AlumnosDAM("45509237D","DI","Madrid",7.5));
        a.add(new AlumnosDAM("87650923D","DI","Madrid",8.5));
        a.add(new AlumnosDAM("67890923D","DI","Sevilla",6.5));
        a.add(new AlumnosDAM("84350923D","DI","Sevilla",6.6));
        a.add(new AlumnosDAM("87434923D","DI","Sevilla",6.9));
        a.add(new AlumnosDAM("87434453D","DI","Granada",5.9));
        a.add(new AlumnosDAM("87884923D","DI","Granada",9.9));
        a.add(new AlumnosDAM("87439923D","DI","Granada",8));
        a.add(new AlumnosDAM("00434923D","DI","Granada",7));
        
        a.add(new AlumnosDAM("87450966D","PMDM","Madrid",6.5));
        a.add(new AlumnosDAM("55509237D","PMDM","Madrid",7.5));
        a.add(new AlumnosDAM("66650923D","PMDM","Madrid",8.5));
        a.add(new AlumnosDAM("77890923D","PMDM","Sevilla",6.5));
        a.add(new AlumnosDAM("88350923D","PMDM","Sevilla",6.6));
        a.add(new AlumnosDAM("99434923D","PMDM","Sevilla",6.9));
        
        a.add(new AlumnosDAM("87450966D","AD","Madrid",6.5));
        a.add(new AlumnosDAM("55509237D","AD","Madrid",7.5));
        a.add(new AlumnosDAM("66650923D","AD","Madrid",8.5));
        a.add(new AlumnosDAM("77890923D","AD","Sevilla",6.5));
        a.add(new AlumnosDAM("88350923D","AD","Sevilla",6.6));
        
        a.add(new AlumnosDAM("87450966D","PSP","Madrid",6.5));
        a.add(new AlumnosDAM("55509237D","PSP","Madrid",7.5));
        a.add(new AlumnosDAM("66650923D","PSP","Madrid",8.5));
            
    }    
    
}
