
package view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Validation {
    public static String validateData(String a, String b){
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(b);
        if (m.matches()){
            return "Valid";                    
        }
        else{
            return "Invalid";
            
        }
        
    }
    public static Icon validate (String a, String b) {
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(b);
        if (m.matches()){
            Icon icon = (new ImageIcon("/view/icon/smile.png"));
            String image = icon.toString();
            
            return icon;
        }
        else {
            Icon icon = (new ImageIcon("/view/icon/cry.png"));
            String image = icon.toString();
            
            return icon;
        }
        
    }
      
}
