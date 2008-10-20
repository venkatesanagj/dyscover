/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.text2s;

import java.io.Serializable;
import java.util.logging.Logger;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
//import org.openide.util.Utilities;

/**
 * Top component which displays something.
 */
public class PronunciationEditorTopComponent extends TopComponent {

public static PronunciationEditorTopComponent instance;
    /** path to the icon used by the component and its open action */
//    static final String ICON_PATH = "SET/PATH/TO/ICON/HERE";

public static final String PREFERRED_ID = "PronunciationEditorTopComponent";

   public PronunciationEditorTopComponent() {
        initComponents();
        setName(NbBundle.getMessage(PronunciationEditorTopComponent.class, "CTL_PronunciationEditorTopComponent"));
        setToolTipText(NbBundle.getMessage(PronunciationEditorTopComponent.class, "HINT_PronunciationEditorTopComponent"));
//        setIcon(Utilities.loadImage(ICON_PATH, true));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wordL = new javax.swing.JLabel();
        pronunciationL = new javax.swing.JLabel();
        synonymusL = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        wordT = new javax.swing.JTextField();
        synT = new javax.swing.JTextField();
        pronunciationT = new javax.swing.JTextField();

        wordL.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(wordL, org.openide.util.NbBundle.getMessage(PronunciationEditorTopComponent.class, "LABEL_WORD")); // NOI18N

        pronunciationL.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(pronunciationL, org.openide.util.NbBundle.getMessage(PronunciationEditorTopComponent.class, "LABEL_PRON")); // NOI18N

        synonymusL.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(synonymusL, org.openide.util.NbBundle.getMessage(PronunciationEditorTopComponent.class, "LABL_SYN")); // NOI18N

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 1, 20)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(PronunciationEditorTopComponent.class, "BUTTON_TEST")); // NOI18N

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 1, 20)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton2, org.openide.util.NbBundle.getMessage(PronunciationEditorTopComponent.class, "BUTTON_NEW")); // NOI18N

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 1, 20)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton3, org.openide.util.NbBundle.getMessage(PronunciationEditorTopComponent.class, "BUTTON_APPLY")); // NOI18N

        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 1, 20)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton4, org.openide.util.NbBundle.getMessage(PronunciationEditorTopComponent.class, "BUTTON_DONE")); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        wordT.setText(org.openide.util.NbBundle.getMessage(PronunciationEditorTopComponent.class, "PronunciationEditorTopComponent.wordT.text")); // NOI18N

        synT.setText(org.openide.util.NbBundle.getMessage(PronunciationEditorTopComponent.class, "PronunciationEditorTopComponent.synT.text")); // NOI18N

        pronunciationT.setText(org.openide.util.NbBundle.getMessage(PronunciationEditorTopComponent.class, "PronunciationEditorTopComponent.pronunciationT.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER, false)
                            .addComponent(pronunciationL)
                            .addComponent(wordL)
                            .addComponent(synonymusL)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pronunciationT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(synT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(wordT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pronunciationL, synonymusL, wordL});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pronunciationT, synT, wordT});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wordT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wordL)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(synonymusL)
                                            .addComponent(synT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(pronunciationL)
                                            .addComponent(pronunciationT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pronunciationL, synonymusL, wordL});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pronunciationT, synT, wordT});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel pronunciationL;
    private javax.swing.JTextField pronunciationT;
    private javax.swing.JTextField synT;
    private javax.swing.JLabel synonymusL;
    private javax.swing.JLabel wordL;
    private javax.swing.JTextField wordT;
    // End of variables declaration//GEN-END:variables
    /**
     * Gets default instance. Do not use directly: reserved for *.settings files only,
     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
     * To obtain the singleton instance, use {@link findInstance}.
     */
    public static synchronized PronunciationEditorTopComponent getDefault() {
        if (instance == null) {
            instance = new PronunciationEditorTopComponent();
        }
        return instance;
    }

    /**
     * Obtain the PronunciationEditorTopComponent instance. Never call {@link #getDefault} directly!
     */
    public static synchronized PronunciationEditorTopComponent findInstance() {
        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
        if (win == null) {
            Logger.getLogger(PronunciationEditorTopComponent.class.getName()).warning(
                    "Cannot find " + PREFERRED_ID + " component. It will not be located properly in the window system.");
            return getDefault();
        }
        if (win instanceof PronunciationEditorTopComponent) {
            return (PronunciationEditorTopComponent) win;
        }
        Logger.getLogger(PronunciationEditorTopComponent.class.getName()).warning(
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
            return PronunciationEditorTopComponent.getDefault();
        }
    }
}
