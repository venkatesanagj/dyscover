/*
 * IntroToNum.java
 *
 * Created on October 13, 2008, 10:37 PM
 */

package org.netbeans.learn1;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author  Preeti
 */
public class IntroToNum extends javax.swing.JFrame {
 JButton[] label=new JButton[11];
    /** Creates new form IntroToNum */
    public IntroToNum() {
        initComponents();
        for(int i=1;i<=10;i++){
           String s=String.valueOf(i);
            label[i]=new JButton(s);
           
         
         label[i].setForeground(Color.red);
         
         textpanel.add(label[i]); 
         textpanel.setBackground(Color.yellow);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textpanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        ten = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        numlabel = new javax.swing.JLabel();
        imagelabel = new javax.swing.JLabel();
        wordlabel = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14));
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "IntroToNum.jLabel1.text_1")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "LABEL_CLICK_FOR_NUM")); // NOI18N

        textpanel.setLayout(new java.awt.GridLayout());

        one.setBackground(new java.awt.Color(51, 255, 0));
        one.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        one.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "BUTTON_1")); // NOI18N
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(102, 255, 0));
        two.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        two.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "BUTTON_2")); // NOI18N
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(102, 255, 51));
        three.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        three.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "BUTTON_3")); // NOI18N
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(102, 255, 51));
        four.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        four.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "BUTTON_4")); // NOI18N
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(102, 255, 51));
        five.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        five.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "BUTTON_5")); // NOI18N
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(51, 255, 51));
        six.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        six.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "BUTTON_6")); // NOI18N
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(51, 255, 51));
        seven.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        seven.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "BUTTON_7")); // NOI18N
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(51, 255, 51));
        eight.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        eight.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "BUTTON_8")); // NOI18N
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(102, 255, 51));
        nine.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nine.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "BUTTON_9")); // NOI18N
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        ten.setBackground(new java.awt.Color(51, 255, 51));
        ten.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ten.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "BUTTON_10")); // NOI18N
        ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(51, 255, 0));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 0, 102));
        jButton21.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "BUTTON_ABC")); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(one)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(two)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(six)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four)
                    .addComponent(five)
                    .addComponent(six)
                    .addComponent(eight)
                    .addComponent(ten)
                    .addComponent(jButton21)
                    .addComponent(one)
                    .addComponent(two)
                    .addComponent(three)
                    .addComponent(nine)
                    .addComponent(seven))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        numlabel.setBackground(new java.awt.Color(255, 255, 255));
        numlabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12));
        numlabel.setOpaque(true);

        imagelabel.setBackground(new java.awt.Color(255, 255, 255));
        imagelabel.setOpaque(true);

        wordlabel.setBackground(new java.awt.Color(0, 0, 255));
        wordlabel.setFont(new java.awt.Font("Tahoma", 1, 36));
        wordlabel.setForeground(new java.awt.Color(255, 0, 0));
        wordlabel.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(576, 576, 576)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wordlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(numlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wordlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        back.setBackground(new java.awt.Color(153, 51, 255));
        back.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14));
        back.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "IntroToNum.back.text")); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(153, 0, 204));
        jButton24.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14));
        jButton24.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "IntroToNum.jButton24.text")); // NOI18N

        exit.setBackground(new java.awt.Color(153, 0, 255));
        exit.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        exit.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "IntroToNum.exit.text")); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 102, 255));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton1.setText(org.openide.util.NbBundle.getMessage(IntroToNum.class, "BUTTON_SPEECH")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(textpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(jButton24)
                    .addComponent(exit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
ImageIcon ic1 =new ImageIcon("D:\\Ash\\PROJECT\\images\\Letter\\one.jpeg");
ImageIcon ic2=new ImageIcon("D:\\Ash\\PROJECT\\images\\one ball.jpeg");
wordlabel.setText("         One   ");
Image image1=ic1.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
Image image2=ic2.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
ImageIcon icon1=new ImageIcon(image1);
ImageIcon icon2=new ImageIcon(image2);
numlabel.setIcon(icon1);
imagelabel.setIcon(icon2);
    // TODO add your handling code here:
}//GEN-LAST:event_oneActionPerformed

private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
ImageIcon ic3 =new ImageIcon("D:\\Ash\\PROJECT\\images\\Letter\\two.jpeg");
ImageIcon ic4=new ImageIcon("D:\\Ash\\PROJECT\\images\\two ball.jpeg");
wordlabel.setText("         Two   ");
Image image3=ic3.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
Image image4=ic4.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
ImageIcon icon3=new ImageIcon(image3);
ImageIcon icon4=new ImageIcon(image4);
numlabel.setIcon(icon3);
imagelabel.setIcon(icon4);
    // TODO add your handling code here:
}//GEN-LAST:event_twoActionPerformed

private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
ImageIcon ic5 =new ImageIcon("D:\\Ash\\PROJECT\\images\\Letter\\three.jpeg");
ImageIcon ic6=new ImageIcon("D:\\Ash\\PROJECT\\images\\three ball.jpeg");
wordlabel.setText("         Three   ");
Image image5=ic5.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
Image image6=ic6.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
ImageIcon icon5=new ImageIcon(image5);
ImageIcon icon6=new ImageIcon(image6);
numlabel.setIcon(icon5);
imagelabel.setIcon(icon6);
    
    // TODO add your handling code here:
}//GEN-LAST:event_threeActionPerformed

private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
ImageIcon ic7 =new ImageIcon("D:\\Ash\\PROJECT\\images\\Letter\\four.jpeg");
ImageIcon ic8=new ImageIcon("D:\\Ash\\PROJECT\\images\\four ice-cream.jpeg");
wordlabel.setText("         Four   ");
Image image7=ic7.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
Image image8=ic8.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
ImageIcon icon7=new ImageIcon(image7);
ImageIcon icon8=new ImageIcon(image8);
numlabel.setIcon(icon7);
imagelabel.setIcon(icon8);
    
    // TODO add your handling code here:
}//GEN-LAST:event_fourActionPerformed

private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
ImageIcon ic9 =new ImageIcon("D:\\Ash\\PROJECT\\images\\Letter\\five.jpeg");
ImageIcon ic10=new ImageIcon("D:\\Ash\\PROJECT\\images\\five balls.jpeg");
wordlabel.setText("         Five   ");
Image image9=ic9.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
Image image10=ic10.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
ImageIcon icon9=new ImageIcon(image9);
ImageIcon icon10=new ImageIcon(image10);
numlabel.setIcon(icon9);
imagelabel.setIcon(icon10);
    
    // TODO add your handling code here:
}//GEN-LAST:event_fiveActionPerformed

private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
ImageIcon ic11 =new ImageIcon("D:\\Ash\\PROJECT\\images\\Letter\\six.jpeg");
ImageIcon ic12=new ImageIcon("D:\\Ash\\PROJECT\\images\\six balls.jpeg");
wordlabel.setText("         Six   ");
Image image11=ic11.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
Image image12=ic12.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);

ImageIcon icon11=new ImageIcon(image11);
ImageIcon icon12=new ImageIcon(image12);
numlabel.setIcon(icon11);
imagelabel.setIcon(icon12);
    
    // TODO add your handling code here:
}//GEN-LAST:event_sixActionPerformed

private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
ImageIcon ic13 =new ImageIcon("D:\\Ash\\PROJECT\\images\\Letter\\seven.jpeg");
ImageIcon ic14=new ImageIcon("D:\\Ash\\PROJECT\\images\\seven balls.jpeg");
wordlabel.setText("         Seven   ");
Image image13=ic13.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
Image image14=ic14.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
ImageIcon icon13=new ImageIcon(image13);
ImageIcon icon14=new ImageIcon(image14);
numlabel.setIcon(icon13);
imagelabel.setIcon(icon14);
    // TODO add your handling code here:
}//GEN-LAST:event_sevenActionPerformed

private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
ImageIcon ic15 =new ImageIcon("D:\\Ash\\PROJECT\\images\\Letter\\eight.jpeg");
ImageIcon ic16=new ImageIcon("D:\\Ash\\PROJECT\\images\\eight balls.jpeg");
wordlabel.setText("         Eight   ");
Image image15=ic15.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
Image image16=ic16.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
ImageIcon icon15=new ImageIcon(image15);
ImageIcon icon16=new ImageIcon(image16);
numlabel.setIcon(icon15);
imagelabel.setIcon(icon16);
    // TODO add your handling code here:
}//GEN-LAST:event_eightActionPerformed

private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
ImageIcon ic17 =new ImageIcon("D:\\Ash\\PROJECT\\images\\Letter\\nine.jpeg");
ImageIcon ic18=new ImageIcon("D:\\Ash\\PROJECT\\images\\nine balls.jpeg");
wordlabel.setText("         Nine   ");
Image image17=ic17.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
Image image18=ic18.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
ImageIcon icon17=new ImageIcon(image17);
ImageIcon icon18=new ImageIcon(image18);
numlabel.setIcon(icon17);
imagelabel.setIcon(icon18);
    // TODO add your handling code here:
}//GEN-LAST:event_nineActionPerformed

private void tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenActionPerformed
ImageIcon ic19 =new ImageIcon("D:\\Ash\\PROJECT\\images\\Letter\\ten.jpeg");
ImageIcon ic20=new ImageIcon("D:\\Ash\\PROJECT\\images\\ten balls.jpeg");
wordlabel.setText("         Ten   ");
Image image19=ic19.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
Image image20=ic20.getImage().getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_AREA_AVERAGING);
ImageIcon icon19=new ImageIcon(image19);
ImageIcon icon20=new ImageIcon(image20);
numlabel.setIcon(icon19);
imagelabel.setIcon(icon20);
    // TODO add your handling code here:
}//GEN-LAST:event_tenActionPerformed

private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
setVisible(false);
    new IntroToAlphas().setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton21ActionPerformed

private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
setVisible(false);
    new Learning().setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_backActionPerformed

private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
System.exit(0);
    // TODO add your handling code here:
}//GEN-LAST:event_exitActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntroToNum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton eight;
    private javax.swing.JButton exit;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton24;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton nine;
    private javax.swing.JLabel numlabel;
    private javax.swing.JButton one;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton ten;
    private javax.swing.JPanel textpanel;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JLabel wordlabel;
    // End of variables declaration//GEN-END:variables

}
