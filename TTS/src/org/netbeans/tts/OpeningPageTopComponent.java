package org.netbeans.tts;

import java.io.Serializable;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
import com.sun.speech.freetts.VoiceManager;
import java.util.logging.Logger;
import javax.swing.undo.UndoManager;
import com.sun.speech.freetts.Voice;

/**
 * Top component which displays something.
 */
public class OpeningPageTopComponent extends TopComponent {

    private String Word;
    private Object[] arr;
    private Object cmd;
    private Object selectionfc;
    private UndoManager undo;
    private Object clipboard;
    private Object clipBoard;
    Voice helloVoice;
    String str;
    private static OpeningPageTopComponent instance;
    /** path to the icon used by the component and its open action */
//    static final String ICON_PATH = "SET/PATH/TO/ICON/HERE";
    private static final String PREFERRED_ID = java.util.ResourceBundle.getBundle("org/netbeans/tts/Bundle").getString("OpeningPageTopComponent");

    private OpeningPageTopComponent() {
        initComponents();

        setName(NbBundle.getMessage(OpeningPageTopComponent.class, "CTL_OpeningPageTopComponent"));
        setToolTipText(NbBundle.getMessage(OpeningPageTopComponent.class, "HINT_OpeningPageTopComponent"));
//        setIcon(Utilities.loadImage(ICON_PATH, true));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        playB = new javax.swing.JButton();
        clearB = new javax.swing.JButton();
        synB = new javax.swing.JButton();
        synBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        textArea.setBackground(new java.awt.Color(29, 150, 150));
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        org.openide.awt.Mnemonics.setLocalizedText(playB, org.openide.util.NbBundle.getMessage(OpeningPageTopComponent.class, "BUTTON_PLAY")); // NOI18N
        playB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(clearB, org.openide.util.NbBundle.getMessage(OpeningPageTopComponent.class, "BUTTON_CLEAR")); // NOI18N
        clearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(synB, org.openide.util.NbBundle.getMessage(OpeningPageTopComponent.class, "BUTTON_SYN")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(OpeningPageTopComponent.class, "OpeningPageTopComponent.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playB)
                            .addComponent(clearB)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(synB)
                                .addGap(18, 18, 18)
                                .addComponent(synBox, 0, 134, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clearB, playB, synB});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(playB)
                        .addGap(64, 64, 64)
                        .addComponent(clearB)
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(synB)
                            .addComponent(synBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {clearB, playB, synB});

    }// </editor-fold>//GEN-END:initComponents

private void playBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBActionPerformed
    String s1 = playB.getText();
    if (s1.equals("PLAY")) {
        playB.setText("STOP");
        Thread speakThread = new Thread(new Runnable() {

            public void run() {
                speek();
            }

            private void speek() {
                str = new String(textArea.getText());
                VoiceManager voiceManager = VoiceManager.getInstance();
                helloVoice = voiceManager.getVoice("kevin16");
                helloVoice.allocate();
                helloVoice.speak(str);
                helloVoice.deallocate();
            }
        });
        speakThread.start();
    } else if (s1.equals("STOP")) {
        playB.setText("PLAY");
        stop();
    }// TODO add your handling code here:
}//GEN-LAST:event_playBActionPerformed

private void clearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBActionPerformed
    textArea.setText("");
    synBox.removeAllItems();// TODO add your handling code here:
}//GEN-LAST:event_clearBActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// new PronunciationEditorTopComponent().setVisible(true);
}//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearB;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton playB;
    private javax.swing.JButton synB;
    private javax.swing.JComboBox synBox;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    /**
     * Gets default instance. Do not use directly: reserved for *.settings files only,
     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
     * To obtain the singleton instance, use {@link findInstance}.
     */
    public static synchronized OpeningPageTopComponent getDefault() {
        if (instance == null) {
            instance = new OpeningPageTopComponent();
        }
        return instance;
    }

    /**
     * Obtain the OpeningPageTopComponent instance. Never call {@link #getDefault} directly!
     */
    public static synchronized OpeningPageTopComponent findInstance() {
        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
        if (win == null) {
            Logger.getLogger(OpeningPageTopComponent.class.getName()).warning(
                    "Cannot find " + PREFERRED_ID + " component. It will not be located properly in the window system.");
            return getDefault();
        }
        if (win instanceof OpeningPageTopComponent) {
            return (OpeningPageTopComponent) win;
        }
        Logger.getLogger(OpeningPageTopComponent.class.getName()).warning(
                "There seem to be multiple components with the '" + PREFERRED_ID +
                "' ID. That is a potential source of errors and unexpected behavior.");
        return getDefault();
    }

    @Override
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ALWAYS;
    }

    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    /** replaces this in object stream */
    @Override
    public Object writeReplace() {
        return new ResolvableHelper();
    }

    @Override
    protected String preferredID() {
        return PREFERRED_ID;
    }

    final static class ResolvableHelper implements Serializable {

        private static final long serialVersionUID = 1L;

        public Object readResolve() {
            return OpeningPageTopComponent.getDefault();
        }
    }

    private void stop() {
        helloVoice.deallocate();
    }
}
