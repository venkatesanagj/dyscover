/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.tts;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;

/**
 * Action which shows PronunciationEditor component.
 */
public class PronunciationEditorAction extends AbstractAction {

    public PronunciationEditorAction() {
        super(NbBundle.getMessage(PronunciationEditorAction.class, "CTL_PronunciationEditorAction"));
//        putValue(SMALL_ICON, new ImageIcon(Utilities.loadImage(PronunciationEditorTopComponent.ICON_PATH, true)));
    }

    public void actionPerformed(ActionEvent evt) {
        TopComponent win = PronunciationEditorTopComponent.findInstance();
        win.open();
        win.requestActive();
    }
}
