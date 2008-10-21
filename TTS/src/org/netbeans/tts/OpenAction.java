/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.tts;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

public final class OpenAction extends CallableSystemAction {

    public void performAction() {
         OpeningPageTopComponent op = new OpeningPageTopComponent();
         JFileChooser fd = new JFileChooser();
    String data = "";
    String data1 = "";
    int result = fd.showDialog(null, "Select any document");
    File selectedFile;
    if (result == JFileChooser.APPROVE_OPTION) {
        selectedFile = fd.getSelectedFile(); // where this is a class field
        String fileName = selectedFile.getName();
        String filePath = selectedFile.getPath();
        try {
            // Open the file that is the first
            // command line parameter
            FileInputStream fstream = new FileInputStream(filePath);

            // Convert our input stream to a
            // DataInputStream
            DataInputStream in =
                    new DataInputStream(fstream);

            // Continue to read lines while
            // there are still some left to read
            while (in.available() != 0) {
                // Print file line to screen
                data = (in.readLine());
                data1 = data1 + data;
                textArea.setText(data1);
            }

            in.close();
        } catch (Exception e) {
            System.err.println("File input error");
        }


    }
        // TODO implement action body
    }

    public String getName() {
        return NbBundle.getMessage(OpenAction.class, "CTL_OpenAction");
    }

    @Override
    protected String iconResource() {
        return "org/netbeans/tts/open.png";
    }

    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }
}
