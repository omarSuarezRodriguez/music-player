package com.omar.component;

import com.omar.model.ModelMenu;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Omar
 */
public class ListMenu<E extends Object> extends JList<E>{
    
    
    private final DefaultListModel model;
    
    
    public ListMenu() {
        
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
        
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                ModelMenu data;
                if (o instanceof ModelMenu) {
                    data = (ModelMenu) o;
                } else {
                    data = new ModelMenu("No Data", "song");
                }
                
            }
          
        };
    }


    public void addItem(ModelMenu data) {
        model.addElement(data);
    }
    
    
    
    
    
}
