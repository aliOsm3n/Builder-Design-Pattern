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
public class CDBuilder {
    
          public CDType buildSonyCD(){   
                     CDType cds=new CDType();  
                     cds.addItem((Packing) new Sony());  
                     return cds;  
              }  
              public CDType buildSamsungCD(){  
             CDType cds=new CDType();  
             cds.addItem(new Samsung());  
             return cds;  
              }  
    
}
