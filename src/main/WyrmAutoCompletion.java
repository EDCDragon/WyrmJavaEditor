/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.CompletionProvider;

/**
 *
 * @author Edwin Dubuc-Caldirac
 */
public class WyrmAutoCompletion extends AutoCompletion{

    public WyrmAutoCompletion(CompletionProvider cp) {
        super(cp);
        this.setAutoCompleteSingleChoices(true);
        this.setParameterAssistanceEnabled(true);
        this.setAutoActivationDelay(1);
        this.setAutoActivationEnabled(true);
    }
    
    
    
}
