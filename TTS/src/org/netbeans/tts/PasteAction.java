/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.tts;

import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

public final class PasteAction extends CallableSystemAction {

    public void performAction() {
        // TODO implement action body
    }

    public String getName() {
        return NbBundle.getMessage(PasteAction.class, "CTL_PasteAction");
    }

    @Override
    protected String iconResource() {
        return "org/netbeans/tts/paste.png";
    }

    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }
}
