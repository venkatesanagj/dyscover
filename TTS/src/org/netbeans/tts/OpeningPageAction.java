/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.tts;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;
import org.openide.windows.TopComponent;

/**
 * Action which shows OpeningPage component.
 */
public class OpeningPageAction extends AbstractAction {

    public OpeningPageAction() {
        super(NbBundle.getMessage(OpeningPageAction.class, "CTL_OpeningPageAction"));
//        putValue(SMALL_ICON, new ImageIcon(Utilities.loadImage(OpeningPageTopComponent.ICON_PATH, true)));
    }

    public void actionPerformed(ActionEvent evt) {
        TopComponent win = OpeningPageTopComponent.findInstance();
        win.open();
        win.requestActive();
    }
}
