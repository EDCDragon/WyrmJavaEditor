/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 *
 * @author Edwin Dubuc-Caldirac
 */
public class WyrmTextArea extends RSyntaxTextArea {
 
       private RTextScrollPane scrollPane;
        
    private WyrmCompletionProvider provider;

    private WyrmAutoCompletion ac;

    private AutoCompleteDemo.WyrmJSONObject object;

    public WyrmTextArea(int rows, int cols) {
        super(rows, cols); 
    }

    public void init() {
        super.init();
        this.object = new AutoCompleteDemo.WyrmJSONObject();

        this.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        this.setCodeFoldingEnabled(true);

        this.provider = new WyrmCompletionProvider(object);

        this.ac = new WyrmAutoCompletion(provider);

        this.scrollPane = new RTextScrollPane(this);
        
        ac.install(this);
    } 

    public RTextScrollPane getScrollPane() {
        return scrollPane;
    }

    public AutoCompleteDemo.WyrmJSONObject getObject() {
        return object;
    }


    
    
}
