/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author seemin
 */
public class DeliverManRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    
}
