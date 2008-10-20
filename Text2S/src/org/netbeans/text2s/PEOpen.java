/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.text2s;

import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

public class PEOpen extends CallableSystemAction {

    public void performAction() {
 PronunciationEditorTopComponent pe=new PronunciationEditorTopComponent();// TODO implement action body
        pe.open();
        pe.requestActive();
        
    }

    public String getName() {
        return NbBundle.getMessage(PEOpen.class, "CTL_PEOpen");
    }

    @Override
    protected void initialize() {
        super.initialize();
        // see org.openide.util.actions.SystemAction.iconResource() Javadoc for more details
        putValue("noIconInMenu", Boolean.TRUE);
    }

    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }
}
