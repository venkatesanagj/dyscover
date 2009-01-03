package paint;

import java.awt.Toolkit.*;
import java.awt.Image.*;
import java.util.*;
import java.awt.datatransfer.Clipboard.*;
import java.awt.*;
import java.awt.Toolkit.*;
import java.awt.image.*;
import java.awt.geom.*;

/** Stretch class is used to either stretch out the
 * image without affecting the size of the canvas (the image might disappear over
 * the borders) or you can stretch the image out by prolonging the borders.
 *
 * There are two states of this class.	One is being shown but not clicked and one
 * is being shown and clicked.	Once clicked, there will be a menu which asks you
 * how you want to stretch the image.
 *
 * There are no OS dependencies and variances.	No security constraints or external
 * specifications.
 *
 * @author  Paint
 * @version 2.0
 */
public class stretch extends javax.swing.JDialog {

    /** Creates new form stretch.
     *
     * This also initializes all the components and calls the parent's default
     * constructor.
     * There are no OS dependencies and variances.  No security constraints or external
     * specifications.
     * @param parent This parameter sends which frame is the parent.
     * @param modal This parameter could be a model, true or false.
     */
    public stretch(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     *
     * This method initializes the entire form with buttons and new dialoge
     * boxes, etc.  It also sets up constraints.
     * There are no OS dependencies and variances.  No security constraints or external
     * specifications.
     */
    public void initComponents() {
        ok_action = true;
        ok_cancel = new javax.swing.JPanel();
        ok = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        center = new javax.swing.JPanel();
        skew = new javax.swing.JPanel();
        horizontal_skew = new javax.swing.JTextField();
        vertical_skew = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        stretch = new javax.swing.JPanel();
        vertical_stretch = new javax.swing.JTextField();
        horizontal_stretch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        ok_cancel.setLayout(new java.awt.GridBagLayout());
        java.awt.GridBagConstraints gridBagConstraints1;

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        gridBagConstraints1 = new java.awt.GridBagConstraints();
        ok_cancel.add(ok, gridBagConstraints1);

        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 1;
        ok_cancel.add(cancel, gridBagConstraints1);

        getContentPane().add(ok_cancel, java.awt.BorderLayout.EAST);

        center.setLayout(new java.awt.BorderLayout());

        skew.setLayout(new java.awt.GridBagLayout());
        java.awt.GridBagConstraints gridBagConstraints2;

        skew.setBorder(new javax.swing.border.TitledBorder("SKEW"));
        horizontal_skew.setColumns(10);
        horizontal_skew.setText("0");
        horizontal_skew.setMaximumSize(new java.awt.Dimension(4, 20));
        horizontal_skew.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horizontal_skewActionPerformed(evt);
            }
        });

        gridBagConstraints2 = new java.awt.GridBagConstraints();
        gridBagConstraints2.gridx = 1;
        gridBagConstraints2.gridy = 1;
        skew.add(horizontal_skew, gridBagConstraints2);

        vertical_skew.setColumns(10);
        vertical_skew.setText("0");
        vertical_skew.setMaximumSize(new java.awt.Dimension(4, 20));
        vertical_skew.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertical_skewActionPerformed(evt);
            }
        });

        gridBagConstraints2 = new java.awt.GridBagConstraints();
        gridBagConstraints2.gridx = 1;
        gridBagConstraints2.gridy = 2;
        skew.add(vertical_skew, gridBagConstraints2);

        jLabel3.setText("Vertical");
        gridBagConstraints2 = new java.awt.GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 2;
        skew.add(jLabel3, gridBagConstraints2);

        jLabel4.setText("Horizontal");
        gridBagConstraints2 = new java.awt.GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        skew.add(jLabel4, gridBagConstraints2);

        jLabel7.setText("Degrees");
        gridBagConstraints2 = new java.awt.GridBagConstraints();
        gridBagConstraints2.gridx = 2;
        gridBagConstraints2.gridy = 1;
        skew.add(jLabel7, gridBagConstraints2);

        jLabel8.setText("Degrees");
        gridBagConstraints2 = new java.awt.GridBagConstraints();
        gridBagConstraints2.gridx = 2;
        gridBagConstraints2.gridy = 2;
        skew.add(jLabel8, gridBagConstraints2);

        center.add(skew, java.awt.BorderLayout.CENTER);

        stretch.setLayout(new java.awt.GridBagLayout());
        java.awt.GridBagConstraints gridBagConstraints3;

        stretch.setBorder(new javax.swing.border.TitledBorder("STRETCH"));
        vertical_stretch.setColumns(10);
        vertical_stretch.setText("100");
        vertical_stretch.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertical_stretchActionPerformed(evt);
            }
        });

        gridBagConstraints3 = new java.awt.GridBagConstraints();
        gridBagConstraints3.gridx = 1;
        gridBagConstraints3.gridy = 1;
        stretch.add(vertical_stretch, gridBagConstraints3);

        horizontal_stretch.setColumns(10);
        horizontal_stretch.setText("100");
        horizontal_stretch.setMaximumSize(new java.awt.Dimension(4, 20));
        horizontal_stretch.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horizontal_stretchActionPerformed(evt);
            }
        });

        gridBagConstraints3 = new java.awt.GridBagConstraints();
        gridBagConstraints3.gridx = 1;
        gridBagConstraints3.gridy = 0;
        stretch.add(horizontal_stretch, gridBagConstraints3);

        jLabel1.setText("Vertical");
        gridBagConstraints3 = new java.awt.GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 1;
        stretch.add(jLabel1, gridBagConstraints3);

        jLabel2.setText("%");
        gridBagConstraints3 = new java.awt.GridBagConstraints();
        gridBagConstraints3.gridx = 2;
        gridBagConstraints3.gridy = 0;
        stretch.add(jLabel2, gridBagConstraints3);

        jLabel5.setText("%");
        gridBagConstraints3 = new java.awt.GridBagConstraints();
        gridBagConstraints3.gridx = 2;
        gridBagConstraints3.gridy = 1;
        stretch.add(jLabel5, gridBagConstraints3);

        jLabel6.setText("Horizontal");
        gridBagConstraints3 = new java.awt.GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 0;
        stretch.add(jLabel6, gridBagConstraints3);

        center.add(stretch, java.awt.BorderLayout.SOUTH);

        getContentPane().add(center, java.awt.BorderLayout.CENTER);

        pack();
    }

    /** This method executes if the event is a CANCEL button, then it closes the dialog.
     * There are no OS dependencies and variances.  No security constraints or external
     * specifications.
     * @param evt The event of a mouse action.
     */
    public void cancelActionPerformed(java.awt.event.ActionEvent evt) {
        this.closeDialog(new java.awt.event.WindowEvent(this, 0));
    }

    /** This method executes if the event is a OK button.  Then it executes the performed action.
     * In this case, it will stretch the picture
     * accordingly.  If user selected skew instead of stretch, the picture will
     * basically just expand without the borders of the picture to expand.
     *
     * There are no state transitions and no security constraints or OS dependencies.
     *
     * @param evt The event of a mouse action.
     */
    public void okActionPerformed(java.awt.event.ActionEvent evt) {
        BufferedImage im = ((Paint) this.getParent()).center.getBufferedImage();
        Graphics2D g2d = im.createGraphics();
        AffineTransform t = new AffineTransform();
        //AffineTransform t = g2d.getTransform();
        double x = Double.parseDouble(horizontal_stretch.getText());
        double y = Double.parseDouble(vertical_stretch.getText());
        double x1 = Double.parseDouble(horizontal_skew.getText());
        double y1 = Double.parseDouble(vertical_skew.getText());
        //got all the attributes, now lets divide things up
        if (x != 100 || y != 100) { //stretch performed, ignore skew

            t.setToScale(x / 100, y / 100);

            // ming 4.22
            if (im.getWidth() * (x / 100) * im.getHeight() * (y / 100) >= 3000000) {
                ok_action = false;
            } else {
                // ming 4.22 end
                BufferedImage temp = new BufferedImage((int) (im.getWidth() * (x / 100)), (int) (im.getHeight() * (y / 100)), BufferedImage.TYPE_INT_RGB);
                Graphics2D gd = temp.createGraphics();
                gd.drawImage(im, t, null);
                ((Paint) this.getParent()).center.setBufferedImage(temp);
                // ming 4.26
                int cur_layer = ((Paint) this.getParent()).center.currentLayer;
                LinkedList cur_action_list = (LinkedList) (((Paint) this.getParent()).action_list.get(cur_layer));
                LinkedList cur_redo_list = (LinkedList) (((Paint) this.getParent()).redo_list.get(cur_layer));

                int temp1 = cur_redo_list.size();
                for (int i = 0; i < temp1; i++) {
                    cur_redo_list.removeLast();
                }
                cur_action_list.add("Stretch");

                // ming 4.26 end
                ((Paint) this.getParent()).updateUndoList();
                // ming 4.22
                temp.flush();
            }
        // ming 4.22 end

        } else if (x1 != 0 || y1 != 0) {
            //*********Shearing... or Skew
            t.shear(x1 / 100, y1 / 100);
            int newWidth = (int) (im.getWidth());
            int newHeight = (int) (im.getHeight());
            // ming 4.22
            if (newWidth * newHeight < 1500000) {
                // ming 4.22 end
                BufferedImage temp = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
                Graphics2D gd = temp.createGraphics();
                gd.setColor(Color.white);
                gd.fillRect(0, 0, newWidth, newHeight);
                gd.drawImage(im, t, null);
                ((Paint) this.getParent()).center.setBufferedImage(temp);
                // ming 4.26
                int cur_layer = ((Paint) this.getParent()).center.currentLayer;
                LinkedList cur_action_list = (LinkedList) (((Paint) this.getParent()).action_list.get(cur_layer));
                LinkedList cur_redo_list = (LinkedList) (((Paint) this.getParent()).redo_list.get(cur_layer));

                int temp1 = cur_redo_list.size();
                for (int i = 0; i < temp1; i++) {
                    cur_redo_list.removeLast();
                }
                cur_action_list.add("Skew");

                // ming 4.26 end
                ((Paint) this.getParent()).updateUndoList();
            // ming 4.22
            }
        // ming 4.22 end

        }

        this.closeDialog(new java.awt.event.WindowEvent(this, 0));
        im.flush();
    //	  ok_action = true;
    }

    /** This method is for stretching vertically.
     * There are no OS dependencies and variances.  No security constraints or external
     * specifications.
     * @param evt The event of a vertical stretch mouse action.
     */
    public void vertical_stretchActionPerformed(java.awt.event.ActionEvent evt) {
        // Add your handling code here:
    }

    /** This method is for stretching horizontally.
     * There are no OS dependencies and variances.  No security constraints or external
     * specifications.
     * @param evt The event of a horizontal stretch mouse action.
     */
    public void horizontal_skewActionPerformed(java.awt.event.ActionEvent evt) {
        // Add your handling code here:
    }

    /** This method is for skewing vertically.
     * There are no OS dependencies and variances.  No security constraints or external
     * specifications.
     * @param evt The event of an action.
     */
    public void vertical_skewActionPerformed(java.awt.event.ActionEvent evt) {
        // Add your handling code here:
    }

    /** This method is for skewing horizontally.
     * There are no OS dependencies and variances.  No security constraints or external
     * specifications.
     * @param evt The event of an action.
     */
    public void horizontal_stretchActionPerformed(java.awt.event.ActionEvent evt) {
        // Add your handling code here:
    }

    /** Closes the dialog.
     * There are no OS dependencies and variances.  No security constraints or external
     * specifications.
     * @param evt The event of an action.
     */
    public void closeDialog(java.awt.event.WindowEvent evt) {
        setVisible(false);
        dispose();
    }

    /** This method basically creates a new STRETCH object and applies the image
     * into it.	 If there are arguments, it will take them as well.  It will then
     * display the results onto the main canvas.
     * There are no OS dependencies and variances.  No security constraints or external
     * specifications.
     * @param args The command line arguments
     */
    public static void main(String args[]) {
        new stretch(new javax.swing.JFrame(), true).show();
    }
    // Variables declaration - do not modify
    /** Java swing GUI depicting the OK and CANCEL panel.
     */
    private javax.swing.JPanel ok_cancel;
    /** Java swing GUI depicting the OK button.
     */
    private javax.swing.JButton ok;
    /** Java swing GUI depicting the CANCEL button.
     */
    private javax.swing.JButton cancel;
    /** Java swing GUI depicting the CENTER button.
     */
    private javax.swing.JPanel center;
    /** Java swing GUI depicting the SKEW button.
     */
    private javax.swing.JPanel skew;
    /** Java swing GUI depicting the textfield of the horizontal skew.
     */
    private javax.swing.JTextField horizontal_skew;
    /** Java swing GUI depicting the text field of the vertical skew.
     */
    private javax.swing.JTextField vertical_skew;
    /** Java swing GUI depicting the Label 3.
     */
    private javax.swing.JLabel jLabel3;
    /** Java swing GUI depicting the Label 4.
     *
     */
    private javax.swing.JLabel jLabel4;
    /** Java swing GUI depicting the Label 7.
     *
     */
    private javax.swing.JLabel jLabel7;
    /** Java swing GUI depicting the Label 8.
     */
    private javax.swing.JLabel jLabel8;
    /** Java swing GUI depicting the STRETCH panel.
     */
    private javax.swing.JPanel stretch;
    /** Java swing GUI depicting the text field of the vertical stretch.
     */
    private javax.swing.JTextField vertical_stretch;
    /** Java swing GUI depicting the text field of the horizontal stretch.
     */
    private javax.swing.JTextField horizontal_stretch;
    /** Java swing GUI depicting the Label 1.
     */
    private javax.swing.JLabel jLabel1;
    /** Java swing GUI depicting the Label 2.
     */
    private javax.swing.JLabel jLabel2;
    /** Java swing GUI depicting the Label 5.
     */
    private javax.swing.JLabel jLabel5;
    /** Java swing GUI depicting the Label 6.
     */
    private javax.swing.JLabel jLabel6;

    // End of variables declaration
    /** The dialog is closed by OK.
     */
    public boolean ok_action;
}
