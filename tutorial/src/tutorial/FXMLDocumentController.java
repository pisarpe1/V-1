/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author frantisek
 */
public class FXMLDocumentController implements Initializable {
    
    int step = 0;   // variable indexing steps
    String slideName = ""; //variable for image adress
    
    @FXML   private ImageView slide;
    @FXML   private ImageView arrowRight;
    @FXML   private ImageView arrowLeft;  
    
        
    @FXML
    public void rightArrowClicked(){
        //System.out.println("You clicked Right arrow!");
        step = step + 1;
        doStuff(step);
    }
    
    @FXML
    public void leftArrowClicked(){
        //System.out.println("You clicked Left arrow!");
        step = step - 1;
        doStuff(step);
    }
    
    @FXML
    void doStuff(int step) {
        //System.out.println(String.format("slide%s.jpg", step));
        
        // Create actual slide name
        slideName = String.format("v2slide%s.jpg", step);
        
        // Hide left arrow on first slide        
        if (step == 0) {  
            arrowLeft.setVisible(false);
        } else {
            arrowLeft.setVisible(true);
        }
        
        // Hide right arrow on last slide
        if (step == 9) {  
            arrowRight.setVisible(false);
        } else {
            arrowRight.setVisible(true);
        }
        
        slide.setImage(new Image(getClass().getResourceAsStream(slideName)));        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}