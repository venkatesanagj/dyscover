/*
 * FillNumber.java
 *
 * Created on August 12, 2008, 9:23 AM
 */

package ashwini;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

/**
 *
 * @author  Preeti
 */

public class FillNumber extends javax.swing.JFrame {
    JTextField[] jtf=new JTextField[30];
    int allNums[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19
                ,20,21,22,23,24,25,26,27,28,29,30};
    /** Creates new form FillNumber */
    public FillNumber() {
        initComponents();
       
         Font myfont= new Font("Sans Serif",Font.BOLD, 14);
        for(int i=0;i<=29;i++){
         jtf[i]=new JTextField(5); 
         jtf[i].setFont(myfont);
         jtf[i].setForeground(Color.black);
         jPanel1.add(jtf[i]);
            
        String s=String.valueOf(allNums[i]);
            jtf[i].setText(s);
           // jtf[i].setText("");
        int in=(int)(Math.random()*i);
         jtf[in].setEnabled(true); 
        jtf[i].setEnabled(false);
         
         
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
        jLabel3 = new javax.swing.JLabel();
        blanklabel = new javax.swing.JLabel();
        wronglabel = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        check = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14));
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("OWN  STUDY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12));
        jLabel2.setForeground(new java.awt.Color(153, 51, 255));
        jLabel2.setText(" * Fill the correct Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12));
        jLabel3.setForeground(new java.awt.Color(204, 0, 255));
        jLabel3.setText("Check the correct Number");

        blanklabel.setBackground(new java.awt.Color(255, 255, 255));
        blanklabel.setFont(new java.awt.Font("Tahoma", 1, 18));
        blanklabel.setOpaque(true);

        wronglabel.setBackground(new java.awt.Color(255, 255, 255));
        wronglabel.setOpaque(true);

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        back.setForeground(new java.awt.Color(0, 153, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check.setText("CHECK");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(139, 139, 139))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(check)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wronglabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(blanklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(check))
                    .addComponent(blanklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wronglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
setVisible(false);
new Learning().setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_backActionPerformed

private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
if(evt.getSource()==check){
    try{
    String one=jtf[0].getText();
    int a=Integer.parseInt(one);
    //int a1=1;
   if(a==allNums[0]){
    wronglabel.setText("Correct");
 }
   else{
        wronglabel.setText("Wrong");
   }

    
String two=jtf[1].getText();
int b=Integer.parseInt(two);
if(b==allNums[1]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}

String three=jtf[2].getText();
 int c=Integer.parseInt(three);
if(c==allNums[2]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}

String four=jtf[3].getText();
  int d=Integer.parseInt(one);
if(d==allNums[3]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}

String five=jtf[4].getText();
  int e=Integer.parseInt(five);
if(e==allNums[4]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}

String six=jtf[5].getText();
int f=Integer.parseInt(six);
if(e==allNums[5]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}
 
 String seven=jtf[6].getText();
int g=Integer.parseInt(seven);
if(g==allNums[6]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}
 
 
 String eigth=jtf[7].getText();
int h=Integer.parseInt(eigth);
if(h==allNums[7]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}
 
 String nine=jtf[8].getText();
int i=Integer.parseInt(nine);
if(i==allNums[8]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}
 
 String ten=jtf[9].getText();
int j=Integer.parseInt(ten);
if(j==allNums[9]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}
 
 String eleven=jtf[10].getText();
int k=Integer.parseInt(eleven);
if(k==allNums[10]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}}
    catch(Exception e){}
 
 /*String twelve=jtf[11].getText();
int l=Integer.parseInt(twelve);
if(l==allNums[11]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}
 
 String thirteen=jtf[12].getText();
int m=Integer.parseInt(thirteen);
if(m==allNums[12]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}
 
 String fourteen=jtf[13].getText();
int n=Integer.parseInt(fourteen);
if(n==allNums[13]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}
 
 String fifteen=jtf[14].getText();
int o=Integer.parseInt(fifteen);
if(o==allNums[14]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}
 
 String sixteen=jtf[15].getText();
int p=Integer.parseInt(sixteen);
if(p==allNums[15]){
    wronglabel.setText("Correct");
 }
else{
            wronglabel.setText("Wrong");
}
  
 
 */
    
}
    // TODO add your handling code here:
}//GEN-LAST:event_checkActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FillNumber().setVisible(true);
            }
        });
    }
    /*class MyWindowAdapter extends WindowAdapter{
        FillNumber fillnumber;
        public MyWindowAdapter(FillNumber fillnumber){
            this.fillnumber=fillnumber;
        }
        @Override
        public void windowClosing(WindowEvent we)
        {
          fillnumber.setVisible(false);  
        }
    }
    class MyMenuHandler implements ActionListener{
     FillNumber fillnumber;
     public MyMenuHandler(FillNumber fillnumber){
         this.fillnumber=fillnumber;
     }

        public void actionPerformed(ActionEvent e) {
            
           // throw new UnsupportedOperationException("Not supported yet.");
        }
    }*/
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel blanklabel;
    private javax.swing.JButton check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel wronglabel;
    // End of variables declaration//GEN-END:variables

}
