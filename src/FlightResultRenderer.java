

import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class FlightResultRenderer extends FlightResult implements ListCellRenderer {
    
    private final Color background = new Color(140, 200, 255);
    
    
    @Override
    public Component getListCellRendererComponent (JList list, Object value, int index, boolean isSelected, boolean hasFocus) {
        //if (value == null) return new JLabel();
        
        if (index % 2 == 0) {
            setBackground(new Color(230, 230, 230));
            //setForeground(Color.GREEN);
        }
        else {
            setBackground(new Color(220, 220, 220));
        }
        
        if (isSelected) {
           // setOpaque(true);
            setBackground(new Color(180, 200, 190));
            setForeground(list.getForeground());
        }
 
        
        return this;
    }
}