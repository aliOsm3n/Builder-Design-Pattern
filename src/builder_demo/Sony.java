/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder_demo;

/**
 *
 * @author Ali Othman
 */
public class Sony extends Company{

    @Override
    public int price() {
          return 20;  
    }

    @Override
    public String pack() {
        return "Sony CD";  
    }
    
}
