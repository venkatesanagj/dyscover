/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.tts;

import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

public final class UndoAction extends CallableSystemAction {

    public void performAction() {
         OpeningPageTopComponent op = new OpeningPageTopComponent();
        // TODO implement action body
    }

    public String getName() {
        return NbBundle.getMessage(UndoAction.class, "CTL_UndoAction");
    }

    @Override
    protected String iconResource() {
        return "org/netbeans/tts/undo.png";
    }

    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }
}
