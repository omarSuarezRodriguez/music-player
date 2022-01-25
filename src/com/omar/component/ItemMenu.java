package com.omar.component;

import com.omar.model.ModelMenu;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Omar
 */
public class ItemMenu extends javax.swing.JPanel {

   
    private final ModelMenu data;
    private boolean selected;
    
    public void setSelected(boolean selected) {
    
        this.selected = selected;
        if (selected) {
            lblText.setFont(new java.awt.Font("SansSerif", 1, 14)); 
            lblText.setForeground(Color.WHITE);
            lblIcon.setIcon(data.toIconSelected());
        } else {
            lblText.setFont(new java.awt.Font("SansSerif", 0, 14)); 
            lblText.setForeground(new Color(204, 204, 204));
            lblIcon.setIcon(data.toIcon());
        }
        
    }
    
    
    public ItemMenu(ModelMenu data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        lblIcon.setIcon(data.toIcon());
        lblText.setText(data.getMenuName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/omar/icon/albums_selected.png"))); // NOI18N

        lblText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("Item Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(lblText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables

    public boolean isSelected() {
        return selected;
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        
        if (selected) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setColor(Color.WHITE);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.fillRect(0, 0, 2, getHeight());
        } 
        
        super.paintComponent(grphcs); 
    }
    
    
    
    
    
    
}
