package javaapplication1;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import org.fife.rsta.ac.html.AttributeCompletion;
import org.fife.rsta.ac.java.JavaLanguageSupport;
import org.fife.rsta.ac.java.JavaSourceCompletion;
import org.fife.rsta.ac.java.JavaTemplateCompletion;
import org.fife.ui.autocomplete.*;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;
import org.json.JSONObject;

public class AutoCompleteDemo extends JFrame {

    public static class WyrmJSONObject extends org.json.JSONObject {

        public WyrmJSONObject() {
            super(new LinkedHashMap<Object, Object>());
        }

    }


    public AutoCompleteDemo() {

    WyrmJSONObject jsonObject;
    
        WyrmTextArea textArea = new WyrmTextArea(10, 20); 
        
        jsonObject = textArea.getObject();
        
        jsonObject.put("element", new WyrmJSONObject());

        jsonObject.getJSONObject("element").put("data", new WyrmJSONObject());
        jsonObject.getJSONObject("element").put("transform", new WyrmJSONObject());
        jsonObject.getJSONObject("element").put("trampoline", new WyrmJSONObject());
        jsonObject.getJSONObject("element").getJSONObject("transform").put("position", new WyrmJSONObject());
        jsonObject.getJSONObject("element").getJSONObject("transform").put("potential", new WyrmJSONObject());
        jsonObject.getJSONObject("element").getJSONObject("transform").put("rotation", new WyrmJSONObject());
        jsonObject.getJSONObject("element").getJSONObject("transform").put("scale", new WyrmJSONObject());
        jsonObject.getJSONObject("element").getJSONObject("trampoline").put("scale", new WyrmJSONObject());

        JPanel contentPane = new JPanel(new BorderLayout());
 
        contentPane.add(textArea.getScrollPane());
        /* try {
            jls.getJarManager().addCurrentJreClassFileSource();
        } catch (IOException ex) {
            Logger.getLogger(AutoCompleteDemo.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        setContentPane(contentPane);
        setTitle("AutoComplete Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {

        // Instantiate GUI on the EDT.
        SwingUtilities.invokeLater(() -> {
            try {
                String laf = UIManager.getSystemLookAndFeelClassName();
                UIManager.setLookAndFeel(laf);
            } catch (Exception e) {
                /* Never happens */ }
            new AutoCompleteDemo().setVisible(true);
        });
    }

}
