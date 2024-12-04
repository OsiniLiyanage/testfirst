/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JPanel;

/**
 *
 * @author acer
 */
public class RoundPanel extends JPanel{
    public RoundPanel(){
        init();
    
    }
    
    private void init(){
    this.putClientProperty(FlatClientProperties.STYLE,"arc:20");
    }
    
    
}
