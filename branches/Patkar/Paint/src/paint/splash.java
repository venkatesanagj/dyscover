package paint;

import com.sun.image.codec.jpeg.*;
import java.awt.*;
import java.awt.Toolkit.*;
import java.awt.Image.*;
import java.io.*;
import java.awt.image.*;

/** This class creates the splash screen which is displayed in the very
 * beginning of executing the Paint program.
 *
 * There are two states, one when displaying the graphic splash screen and one
 * while it is not.
 *
 * There are no constraints of any kind unless a computer cannot properly
 * decode a JPEG graphic file.	Also, not all colors look alike on different
 * monitors so this is a concern.  Otherwise, there are no security concerns.
 * @author  Paint
 * @version 2.0
 */
public class splash extends javax.swing.JWindow {

    //public class viewBitmap extends javax.swing.JDialog {
    /** This field is of type BufferedImage and contains an buffer of the current
     * image.
     */
    BufferedImage main_image;
    /** This field creates a parent of type Frame.
     */
    Frame Parent;

    /** Creates new form splash.
     * There are no OS/Hardware dependencies and no variances.	There is no need for any
     * security constraints and no references to external specifications.
     * @param parent This parameter shows which frame the parent came from.
     * @param modal This perhaps is a model which gives true or false.
     */
    public splash(java.awt.Frame parent, boolean modal) {
        Parent = parent;
        Parent.setVisible(false);
        (new Thread() {

            public void run() {
                try {
                    Thread.sleep(1000 * 2);
                    setVisible(false);
                    //Parent.setVisible(true);
                    dispose();
                } catch (Exception e) {
                }
            }
        }).start();
        initComponents();

        try {
            File greg = new File("./images/paint_splash.jpeg");
            JPEGImageDecoder decoder = JPEGCodec.createJPEGDecoder(new FileInputStream(greg));
            main_image = (BufferedImage) decoder.decodeAsBufferedImage();
        } catch (Exception e) {
            System.out.println("no splash image" + e);
        }
        this.setSize(main_image.getWidth(), main_image.getHeight());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double xMargin = (screenSize.getWidth() - this.getWidth()) / 2;
        double yMargin = (screenSize.getHeight() - this.getHeight()) / 2;
        this.setLocation((int) xMargin, (int) yMargin);
    }

    /** Yet another constructor which takes in three arguments instead of the
     * previous two.  It also constructs a splash screen.  It is AMAZINGLY
     * similar to the previous two-argumented method.  In fact, it is the exact
     * same code.
     * There are no OS/Hardware dependencies and no variances.	There is no need for any
     * security constraints and no references to external specifications.
     * @param parent This parameter is a parent of type Frame.
     * @param modal This is a boolean variable.
     * @param wow This is yet another boolean variable.
     */
    public splash(java.awt.Frame parent, boolean modal, boolean wow) {
        Parent = parent;
        Parent.setVisible(false);
        (new Thread() {

            public void run() {
                try {
                    Thread.sleep(1000 * 20);
                    setVisible(false);
                    dispose();
                } catch (Exception e) {
                }
            }
        }).start();
        initComponents();

        try {
            File greg = new File("./images/paint_splash.jpeg");
            JPEGImageDecoder decoder = JPEGCodec.createJPEGDecoder(new FileInputStream(greg));
            main_image = (BufferedImage) decoder.decodeAsBufferedImage();
        } catch (Exception e) {
            System.out.println("no splash image" + e);
        }
        this.setSize(main_image.getWidth(), main_image.getHeight());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double xMargin = (screenSize.getWidth() - this.getWidth()) / 2;
        double yMargin = (screenSize.getHeight() - this.getHeight()) / 2;
        this.setLocation((int) xMargin, (int) yMargin);
    }

    /** This method paints the splash image on the screen.
     * There are no OS/Hardware dependencies and no variances.	There is no need for any
     * security constraints and no references to external specifications.
     * @param g This parameter is of a type Graphics.
     */
    public void paint(Graphics g) {
        int x = (this.getWidth() - main_image.getWidth()) / 2;
        int y = (this.getHeight() - main_image.getHeight()) / 2;
        System.out.println("this width" + this.getWidth() + "main_image width" + main_image.getWidth());
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawImage((Image) main_image, x, y, main_image.getWidth(), main_image.getHeight(), null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     * There are no OS/Hardware dependencies and no variances.	There is no need for any
     * security constraints and no references to external specifications.
     * This method initializes all the components of the GUI.
     */
    public void initComponents() {
        addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        pack();
    }

    /** This method listens to the user's mouse.  If the mouse is clicked
     * during the time of the splash screen, it will do an event.
     * There are no OS/Hardware dependencies and no variances.	There is no need for any
     * security constraints and no references to external specifications.
     * @param evt This parameter is of type mouse event.
     */
    public void formMouseClicked(java.awt.event.MouseEvent evt) {
        setVisible(false);
        dispose();
    }

    /** This is the main.  It will create a new class of type SPLASH inside the
     * current JFrame and will show it.
     * There are no OS/Hardware dependencies and no variances.	There is no need for any
     * security constraints and no references to external specifications.
     * @param args These are string arguments which are passed.
     */
    public static void main(String args[]) {
        new splash(new javax.swing.JFrame(), true).show();
    }
}
