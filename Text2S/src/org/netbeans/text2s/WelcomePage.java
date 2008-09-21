import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Document;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
//import T2S.WelcomePage;
import org.netbeans.text2s.PronunciationEditor;
public class WelcomePage extends javax.swing.JFrame {
        private String Word;
    private Object[] arr;
    private Object cmd;
    private Object selectionfc;
    private UndoManager undo;
     private Object clipboard;
    private Object clipBoard;
    Voice helloVoice;
    
    /** Creates new form welcomePage */
    public WelcomePage() {
        initComponents(); 
   //     Play.setText(NbBundle.getMessage("WelcomPage.class","BUTTON_PLAY"))
        undo = new UndoManager();
  Document doc = TextArea.getDocument();
  doc.addUndoableEditListener(new UndoableEditListener() {
  public void undoableEditHappened(UndoableEditEvent evt) {
  undo.addEdit(evt.getEdit()); 
  }
    });
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        Play = new javax.swing.JButton();
        Pause = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Synonyms = new javax.swing.JButton();
        SynBox = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        FileOpen = new javax.swing.JMenuItem();
        FileExit = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        EditUndo = new javax.swing.JMenuItem();
        EditRedo = new javax.swing.JMenuItem();
        EditCut = new javax.swing.JMenuItem();
        EditCopy = new javax.swing.JMenuItem();
        EditPaste = new javax.swing.JMenuItem();
        EditSelectAll = new javax.swing.JMenuItem();
        Option = new javax.swing.JMenu();
        OptionPE = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        Play.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.Play.text")); // NOI18N
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });

        Pause.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.Pause.text")); // NOI18N

        Clear.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.Clear.text")); // NOI18N
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Synonyms.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.Synonyms.text")); // NOI18N

        SynBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        File.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.File.text")); // NOI18N
        File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileActionPerformed(evt);
            }
        });

        FileOpen.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.FileOpen.text")); // NOI18N
        FileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileOpenActionPerformed(evt);
            }
        });
        File.add(FileOpen);

        FileExit.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.FileExit.text")); // NOI18N
        FileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileExitActionPerformed(evt);
            }
        });
        File.add(FileExit);

        jMenuBar1.add(File);

        Edit.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.Edit.text")); // NOI18N

        EditUndo.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.EditUndo.text")); // NOI18N
        EditUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUndoActionPerformed(evt);
            }
        });
        Edit.add(EditUndo);

        EditRedo.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.EditRedo.text")); // NOI18N
        EditRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditRedoActionPerformed(evt);
            }
        });
        Edit.add(EditRedo);

        EditCut.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.EditCut.text")); // NOI18N
        EditCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCutActionPerformed(evt);
            }
        });
        Edit.add(EditCut);

        EditCopy.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.EditCopy.text")); // NOI18N
        EditCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCopyActionPerformed(evt);
            }
        });
        Edit.add(EditCopy);

        EditPaste.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.EditPaste.text")); // NOI18N
        EditPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPasteActionPerformed(evt);
            }
        });
        Edit.add(EditPaste);

        EditSelectAll.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.EditSelectAll.text")); // NOI18N
        EditSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditSelectAllActionPerformed(evt);
            }
        });
        Edit.add(EditSelectAll);

        jMenuBar1.add(Edit);

        Option.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.Option.text")); // NOI18N

        OptionPE.setText(org.openide.util.NbBundle.getMessage(WelcomePage.class, "WelcomePage.OptionPE.text")); // NOI18N
        OptionPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionPEActionPerformed(evt);
            }
        });
        Option.add(OptionPE);

        jMenuBar1.add(Option);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Play)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Synonyms)
                        .addGap(18, 18, 18)
                        .addComponent(SynBox, 0, 105, Short.MAX_VALUE))
                    .addComponent(Clear)
                    .addComponent(Pause))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Play)
                .addGap(33, 33, 33)
                .addComponent(Pause)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(Clear)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Synonyms)
                    .addComponent(SynBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void PauseActionPerformed(java.awt.event.ActionEvent evt) {                                       
helloVoice.deallocate();// TODO add your handling code here:
}    
private void FileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileOpenActionPerformed
                                   
JFileChooser fd = new JFileChooser();
String data="";
String data1="";
            int result = fd.showDialog(null, "Select any document");
        File selectedFile;
            if (result == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = fd.getSelectedFile(); // where this is a class field
                String fileName = selectedFile.getName();
                String filePath=selectedFile.getPath();
              try
			{
                                // Open the file that is the first 
                                // command line parameter
                                FileInputStream fstream = new 
					FileInputStream(filePath);

                                // Convert our input stream to a
                                // DataInputStream
				DataInputStream in = 
                                        new DataInputStream(fstream);

                                // Continue to read lines while 
                                // there are still some left to read
                               while (in.available() !=0)
				{
                                        // Print file line to screen
                              data=(in.readLine());
                                data1=data1+data;
					TextArea.setText(data1);
				} 

				in.close();
			} 
                        catch (Exception e)
			{
				System.err.println("File input error");
			}
              }       
            
}//GEN-LAST:event_FileOpenActionPerformed
private void FileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileExitActionPerformed
System.exit(0);// TODO add your handling code here:
}//GEN-LAST:event_FileExitActionPerformed

private void EditUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUndoActionPerformed
try {
  if (undo.canUndo()) {
  undo.undo();
  }
  } 
  catch (CannotUndoException e) {
  }// TODO add your handling code here:
}//GEN-LAST:event_EditUndoActionPerformed

private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
 Pause.setEnabled(true);
        speek(); // TODO add your handling code here:
}//GEN-LAST:event_PlayActionPerformed

private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
TextArea.setText("");
SynBox.removeAllItems();// TODO add your handling code here:
}//GEN-LAST:event_ClearActionPerformed

private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed
JFileChooser fc = new JFileChooser();
    //Set the file chooser to allow only directory 
    fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);// TODO add your handling code here:
}//GEN-LAST:event_FileActionPerformed

private void EditRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditRedoActionPerformed
try {
  if (undo.canRedo()) {
  undo.redo();
  }
  } 
  catch (CannotRedoException e) {
  }// TODO add your handling code here:
}//GEN-LAST:event_EditRedoActionPerformed

private void OptionPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionPEActionPerformed
setVisible(false);
new PronunciationEditor().setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_OptionPEActionPerformed

private void EditCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCutActionPerformed
TextArea.cut();// TODO add your handling code here:
}//GEN-LAST:event_EditCutActionPerformed

private void EditCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCopyActionPerformed
TextArea.copy();// TODO add your handling code here:
}//GEN-LAST:event_EditCopyActionPerformed

private void EditPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPasteActionPerformed
TextArea.paste();// TODO add your handling code here:
}//GEN-LAST:event_EditPasteActionPerformed

private void EditSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSelectAllActionPerformed
TextArea.selectAll();// TODO add your handling code here:
}//GEN-LAST:event_EditSelectAllActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenuItem EditCopy;
    private javax.swing.JMenuItem EditCut;
    private javax.swing.JMenuItem EditPaste;
    private javax.swing.JMenuItem EditRedo;
    private javax.swing.JMenuItem EditSelectAll;
    private javax.swing.JMenuItem EditUndo;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem FileExit;
    private javax.swing.JMenuItem FileOpen;
    private javax.swing.JMenu Option;
    private javax.swing.JMenuItem OptionPE;
    private javax.swing.JButton Pause;
    private javax.swing.JButton Play;
    private javax.swing.JComboBox SynBox;
    private javax.swing.JButton Synonyms;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void speek() {
        {
       String str=new String(TextArea.getText());
    //   JavaClipAudioPlayer ap=new JavaClipAudioPlayer();
       VoiceManager voiceManager = VoiceManager.getInstance();
      // ap.begin(1);
            helloVoice = voiceManager.getVoice("kevin16");
               helloVoice.allocate();
               helloVoice.speak(str);
               helloVoice.deallocate();
    }
    }
   }


