package com.omar.model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Omar
 */
public class ModelMenu {
    
    private String menuName;
    private String icon;

    
    public ModelMenu() {
        
    }
    
    
    public ModelMenu(String menuName, String icon) {
        
        this.menuName = menuName;
        this.icon = icon;
        
    }
    
    
    public Icon toIcon() {
        return new ImageIcon(getClass().getResource("/com/omar/icon/" + icon + ".png"));
    }
    
    
    public Icon toIconSelected() {
        return new ImageIcon(getClass().getResource("/com/omar/icon/" + icon + "_selected.png"));
    }
    

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    
}
