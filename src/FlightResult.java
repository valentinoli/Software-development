/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Notandi
 */
package src;
public class FlightResult extends javax.swing.JPanel {

    /**
     * Creates new form FlightResult
     */
    public FlightResult() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        weekday = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        day = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        weekday.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        weekday.setText("Fri");
        add(weekday, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 0, 30, -1));

        price.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        price.setForeground(new java.awt.Color(153, 51, 0));
        price.setText("$ 250");
        add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 80, 40));

        time.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/departure-13x13-icon.png"))); // NOI18N
        time.setText("06:30 - 15:20");
        add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, -1));

        day.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        day.setText("24 MAR");
        add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel day;
    private javax.swing.JLabel price;
    private javax.swing.JLabel time;
    private javax.swing.JLabel weekday;
    // End of variables declaration//GEN-END:variables



    public javax.swing.JLabel getDay() {
        return day;
    }

    public javax.swing.JLabel getPrice() {
        return price;
    }

    public javax.swing.JLabel getTime() {
        return time;
    }

    public javax.swing.JLabel getWeekday() {
        return weekday;
    }
}
