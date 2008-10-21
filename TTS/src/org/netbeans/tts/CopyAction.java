/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.tts;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

public final class CopyAction extends CallableSystemAction {

    public void performAction() {
        OpeningPageTopComponent op = new OpeningPageTopComponent();
        textArea.copy();

    }

    public String getName() {
        return NbBundle.getMessage(CopyAction.class, "CTL_CopyAction");
    }

    @Override
    protected String iconResource() {
        return "org/netbeans/tts/copy.png";
    }

    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }
}
