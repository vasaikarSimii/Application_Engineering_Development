/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
/**
 *
 * @author Seemin
 */

public class VitalSignsHistory {
    //variable definition
    
    private ArrayList<VitalSigns> vitalSignsHistory;
    
    public ArrayList<VitalSigns> getVitalSignsHistory()
    {
    return vitalSignsHistory;
    }
     public ArrayList<VitalSigns> setVitalSignsHistory()
    {
    return vitalSignsHistory;
    }

    public VitalSignsHistory() {
        vitalSignsHistory = new ArrayList<VitalSigns>();
    }
    
    //data type is VitalSigns arraylist
    
    
    
    public VitalSigns addVital() {
        VitalSigns vs = new VitalSigns();
        //adding obj
        vitalSignsHistory.add(vs);
        //
        return vs;
    }

    public void deleteVital(VitalSigns v){
            vitalSignsHistory.remove(v);
              
    }
    
}
