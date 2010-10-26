package paint;

import java.awt.print.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.geom.*;
import javax.swing.*;

/** Print class provides functionalities of printing the images. It holds a private BufferedImage image
 * that is initialized once it is passed through the constructor.
 * It holds one method called print which is
 * executed if the variable param is passed in as 0. Otherwise it throws a
 * printerException.
 * There are no OS/Hardware dependencies and no variances.  There is no need for any
 * security constraints and no references to external specifications.
 */
public class printer implements Printable {

    /** Contains the image to be printed. */
    BufferedImage image;
    /** Indicates the type of page format to be printed. */
    PageFormat pageFormat = new PageFormat();
    /** Describes the printer job. */
    PrinterJob printerJob = PrinterJob.getPrinterJob();
    /** Print preview frame. */
    JFrame view;
    /** Paint object used to print functionality. */
    Paint parent;

    /** Constructs the BufferedImage that is passed in to image.
     * There are no OS/Hardware dependencies and no variances.	There is no need for any
     * security constraints and no references to external specifications.
     * @param Parent Frame type that sets the field "image" to it.
     */
    public printer(Frame Parent) {
        parent = (Paint) Parent;
    }

    /** Prints the images if the param is passed in as 0. The xMargin and yMargin are
     * doubles.
     * There are no OS/Hardware dependencies and no variances.	There is no need for any
     * security constraints and no references to external specifications.
     * @return the int PAGE_EXISTS. not found in this class
     * @param graphics Is casted to a Graphics2D and set to the variable g.
     * @param page Indicates the selection of page format.
     * @param param Must be set to 0 to print. Otherwise the page does not exist
     * and throws an exception.
     * @throws PrinterException if param is not 0 or unable to print within margins */
    public int print(java.awt.Graphics graphics, java.awt.print.PageFormat page, int param) throws java.awt.print.PrinterException {
        if (param == 0) {
            Graphics2D g = (Graphics2D) graphics;
            double xMargin = (pageFormat.getImageableWidth() - image.getWidth()) / 2;
            double yMargin = (pageFormat.getImageableHeight() - image.getHeight()) / 2;
            g.translate(pageFormat.getImageableX() + xMargin, pageFormat.getImageableY() + yMargin);

            if (pageFormat.getOrientation() == PageFormat.LANDSCAPE) {
                AffineTransform at = new AffineTransform();
                at.rotate(3 * (Math.PI) / 2, (((double) image.getHeight()) / 2),
                        (((double) image.getHeight()) / 2));
                g.drawImage(image, at, null);
            } else {
                g.drawImage(image, 0, 0, null);
            }
            return PAGE_EXISTS;
        }
        throw new java.awt.print.PrinterException("Problem");
    }

    /** Provides the preferred size and source to be printed. Also, orientation is provided such as portrait or landscape type.
     * There are no OS/Hardware dependencies and no variances.	There is no need for any
     * security constraints and no references to external specifications.
     */
    public void pageSetup() {
        PageFormat temp = printerJob.pageDialog(pageFormat);
        pageFormat = temp;
    }

    /** Sets the buffered image to be printed.
     * There are no OS/Hardware dependencies and no variances.	There is no need for any
     * security constraints and no references to external specifications.
     * @param imageToPrint BufferedImage to be set and printed.
     */
    public void setImage(BufferedImage imageToPrint) {
        image = imageToPrint;
    }

    /** Prints the selected image.
     * There are no OS/Hardware dependencies and no variances.	There is no need for any
     * security constraints and no references to external specifications.
     */
    public void printTo() {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        if (pageFormat != printerJob.defaultPage()) {
            if (printerJob.printDialog()) {

                try {
                    printerJob.setPrintable(this);
                    printerJob.print();
                } catch (Exception f) {
                    //  f.printStackTrace();
                }
            }
        }
    }

    /** Shows the previewed image before printing. On preview frame, user can choose either print or close the preview window.
     * There are no OS/Hardware dependencies and no variances.	There is no need for any
     * security constraints and no references to external specifications.
     */
    public void preview() {
        view = new JFrame("Print Preview");
        //view.setSize( new Dimension( parent.getWidth(), parent.getHeight() ) );
        view.setTitle("Paint - Print Preview");
        view.setBackground(java.awt.Color.white);
        view.setForeground(java.awt.Color.white);
        view.setName("frame");
        view.setSize(672, 892);

        view.addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosing(java.awt.event.WindowEvent evt) {
                //TODO: saveChanges
                view.setVisible(false);
                view.dispose();
            }
        });

        //	  GridBagConstraints gbconstraints = new GridBagConstraints();
        //	  GridBagLayout layout = new GridBagLayout();
        //	  bgconstraints.gridx = 0;
        //	  bgconstraints.gridy = 0;

        JButton printbutton = new JButton("Print");

        //	  printbutton.setPreferredSize(new java.awt.Dimension(100, 40));
        printbutton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view.setVisible(false);
                printTo();
            }
        });

        JButton closebutton = new JButton("Close");
        //	  closebutton.setPreferredSize(new java.awt.Dimension(100, 40));
        closebutton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view.setVisible(false);
            }
        });

        Container contains = view.getContentPane();

        JPanel north = new JPanel();

        north.setLayout(new java.awt.BorderLayout());
        north.setBackground(java.awt.Color.lightGray);

        north.setLayout(new GridLayout(1, 2));

        // north.setMinimumSize(new java.awt.Dimension(parent.getWidth(), 100));
        north.setPreferredSize(new java.awt.Dimension(parent.getWidth(), 100));
        north.add(printbutton);
        north.add(closebutton);
        contains.add(north, BorderLayout.NORTH);


        JPanel center = new JPanel();

        //   south.setMinimumSize(new java.awt.Dimension(parent.getWidth(), parent.getHeight()-100));
        center.setPreferredSize(new java.awt.Dimension(parent.getWidth(), parent.getHeight() - 100));

        //	  Graphics2D g = image.createGraphics(); // our image
        ImageIcon imageicon = new ImageIcon(image);

        JButton previewButton = new JButton(imageicon);
        previewButton.setPreferredSize(new Dimension(612, 792));

        view.setSize(612, 815);
        if (pageFormat.getOrientation() == PageFormat.LANDSCAPE) {
            previewButton.setPreferredSize(new Dimension(792, 612));
            view.setSize(792, 635);
        }
        previewButton.setBackground(Color.white);

        center.add(previewButton);

        contains.add(center, BorderLayout.CENTER);


        /*
        g.setColor( Color.white );
        g.fill( new Rectangle( 0,0,611,791));
        
        
        
        g.drawImage(image,
        (612-image.getWidth())/2,
        (792-image.getHeight())/2,
        612-(612-image.getWidth())/2,
        792-(792-image.getHeight())/2,
        0,
        0,
        image.getWidth()-1,
        image.getHeight()-1,
        Color.white,
        contains );
        
        south.paint(g);
        south.repaint();
         */


        view.setVisible(true);


    // 500 is variablee
    }
}
