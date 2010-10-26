package paint;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.image.*;

/** AllLayers is used to create a GUI toolbox to display layers.
 * It works with all operating systems and hardware.
 * The OS is windows.
 * There is no implementation variances.
 * There is no security constaints.
 * There is no external secification.
 */
public class AllLayers extends JDialog {

    /**This method is called by the Paint class and is used to create the toolbox.
     *This executes when the program is started
     *This function calls:
     *initComponents()
     * It should work with all operating systems and hardware.
     * There are no variances and no security constraints.
     * @param parent Frame
     * @param modal boolean
     * @param theCanvas main_canvas
     */
    public AllLayers(java.awt.Frame parent, boolean modal, main_canvas theCanvas) {
        super(parent, modal);
        this.paint = (Paint) parent;
        center = theCanvas;
        this.setLocation((int) this.getLocation().getX() + 600, (int) this.getLocation().getY() + 430);
        this.setTitle("Layers");
        this.setVisible(true);
        initComponents();
    /*FAULT::center=null;*/
    }

    /**This method is called by the AllLayers constructor.
     *This initializes the GUI components used by AllLayers and this
     *calls no functions.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     */
    public void initComponents() {
        currentGroup = new ButtonGroup();
        Layer back = new Layer(center);
        currentGroup.add(back.current);
        back.current.setSelected(true);
        singleLayer = new JPanel();
        groupLayer = new JPanel();
        topLabels = new JPanel();
        function = new JPanel();
        direction = new JPanel();
        curLabel = new JLabel("Current");
        //visLabel = new JLabel("Visible");
        NameLabel = new JLabel("Name");
        add = new JButton("Add");
        // ming 4.27
        remove = new JButton("Remove Layer by Name");
        // ming 4.27 end
        removeCurrent = new JButton("Remove Current Layer");
        flatten = new JButton("Flatten");
        up = new JButton("Move UP");
        down = new JButton("Move DOWN");
        front = new JButton("Move to FRONT");
        bottomMost = new JButton("Move to BACK");
        bottom = new JPanel();
        layout = new JPanel();

        center.nameList.add(back.Name);
        removeCurrent.setPreferredSize(new Dimension(170, 25));
        remove.setPreferredSize(new Dimension(170, 25));
        add.setPreferredSize(new Dimension(170, 25));
        flatten.setPreferredSize(new Dimension(170, 25));

        front.setPreferredSize(new Dimension(120, 25));
        up.setPreferredSize(new Dimension(120, 25));
        down.setPreferredSize(new Dimension(120, 25));
        bottomMost.setPreferredSize(new Dimension(120, 25));

        addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        GridBagConstraints constraints;
        constraints = new GridBagConstraints();

        function.setLayout(new GridBagLayout());
        function.setBorder(new javax.swing.border.TitledBorder("Functions"));
        //Constraints for the add, remove, flatten buttons
        constraints.anchor = GridBagConstraints.SOUTHEAST;
        constraints.gridx = 0;
        constraints.gridy = 0;
        function.add(add, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        function.add(remove, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        function.add(removeCurrent, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        function.add(flatten, constraints);

        add.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        remove.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        removeCurrent.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCurrentActionPerformed(evt);
            }
        });

        flatten.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flattenActionPerformed(evt);
            }
        });




        direction.setLayout(new GridBagLayout());
        direction.setBorder(new javax.swing.border.TitledBorder("Direction"));
        //Constraints for up and down buttons
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.gridx = 0;
        constraints.gridy = 0;
        direction.add(up, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        direction.add(down, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        direction.add(front, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        direction.add(bottomMost, constraints);


        up.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        down.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                downActionPerformed(evt);
            }
        });


        front.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                frontActionPerformed(evt);
            }
        });


        bottomMost.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                bottomMostActionPerformed(evt);
            }
        });


        layout.setLayout(new java.awt.BorderLayout());
        layout.setBorder(new javax.swing.border.TitledBorder("Layers"));
        bottom.add(direction, BorderLayout.WEST);
        bottom.add(function, BorderLayout.EAST);
        layout.add(bottom, BorderLayout.SOUTH);


        topLabels.setLayout(new GridBagLayout());
        //Constraints for the Labels at the top identifying the categories
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 0;
        constraints.gridy = 0;

        topLabels.add(curLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.insets = new Insets(0, 52, 0, 0);
        topLabels.add(NameLabel, constraints);


        singleLayer.setLayout(new GridBagLayout());
        groupLayer.setLayout(new GridBagLayout());
        //Constraints for a single layer with all components
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.insets = new Insets(0, 15, 0, 0);
        singleLayer.add(back.current, constraints);
        //constraints.gridx = 1;
        //constraints.gridy = 1;
        //constraints.insets = new Insets(0,20,0,0);
        //singleLayer.add(back.visible, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.insets = new Insets(0, 43, 0, 0);
        singleLayer.add(back.nameLab, constraints);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.insets = new Insets(0, 25, 0, 0);
        singleLayer.add(back.change, constraints);


        constraints.gridx = 0;
        constraints.gridy = position;
        position++;
        groupLayer.add(topLabels, constraints);





        //HERES WHERE THE LAYERS ARE GROUPED TOGETHER IN THE BOX
        constraints.gridx = 0;
        constraints.gridy = position;
        groupLayer.add(singleLayer, constraints);
        position++;



        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 0;
        constraints.gridy = 1;

        //layout.add(topLabels, BorderLayout.NORTH);
        layout.add(groupLayer, BorderLayout.CENTER);
        holder.add(back);
        getContentPane().add(layout, BorderLayout.CENTER);
        /*FAULT::bottom = null;*/
        pack();
    }

    /**This method is called by several functions to set gridbagconstraints.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints
     */
    public void updateBox() {
        int currentX = 0, currentY = 0, visibleX = 1, visibleY = 0;

    /*
    gridBagConstraints1 = new java.awt.GridBagConstraints();
    gridBagConstraints1.gridx = 0;
    gridBagConstraints1.gridy = 1;
    gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
    ok_cancel.add(cancel, gridBagConstraints1);
    
    
    
    getContentPane().add(currentLayer, java.awt.BorderLayout.WEST);
    pack();
     */
    }

    /**This method is called by addActionPerformed.
     * The new layer function creates a new layer in the GUI toolbox.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints
     */
    public void newLayer() {
        Layer temp = new Layer(center);
        //if (currentGroup.getButtonCount() > 2){
        //  currentGroup.getSelection().setSelected(false);
        //  temp.current.setSelected(true);
        //}
        currentGroup.add(temp.current);
        temp.current.setSelected(true);
        //added
        center.nameList.add(temp.Name);


        holder.add(temp);
        updateBox();


        GridBagConstraints constraints;
        constraints = new GridBagConstraints();

        singleLayer = new JPanel();
        singleLayer.setLayout(new GridBagLayout());

        //Constraints for a single layer with all components
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.insets = new Insets(0, 15, 0, 0);
        singleLayer.add(temp.current, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.insets = new Insets(0, 43, 0, 0);
        singleLayer.add(temp.nameLab, constraints);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.insets = new Insets(0, 25, 0, 0);
        singleLayer.add(temp.change, constraints);

        //HERES WHERE THE LAYERS ARE GROUPED TOGETHER IN THE BOX
        constraints.gridx = 0;
        constraints.gridy = position;
        groupLayer.add(singleLayer, constraints);
        position++;
        layout.add(groupLayer, BorderLayout.CENTER);
        getContentPane().add(layout, BorderLayout.CENTER);
        pack();

    /*FAULT::holder.add(new Object());*/
    }

    /**This method is called by removeActionPerformed.
     *It removes the layer specified and recreates the GUI toolbox correctly without the deleted layer.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     * @param number  an int that represents the layer number to be removed
     */
    public void removeLayer(int number) {

        holder.remove(number);
        updateBox();
        center.removeLayer(number);
        // ming 5.6
        ((Paint) this.getParent()).action_list.remove(number);
        ((Paint) this.getParent()).redo_list.remove(number);
        //  ((Paint)this.getParent()).center.list.remove(number);
        //((Paint)this.getParent()).center.place_list.remove(number);
        // ming 5.6 end

        ((Layer) holder.elementAt(0)).current.setSelected(true);
        // ming 5.6
        ((Paint) this.getParent()).updateUndoList();
        // ming 5.6 end

        center.repaint();
        //FROM HERE ALL NEW
        position--;

        layerGUI();
    /*FAULT::holder.add(new Object());*/
    }

    /**This method is called by the flattenActionPerformed.
     * It combines all layers into one.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     */
    public void flattenLayer() {
        // ming 5.6
        ((Paint) this.getParent()).action_list = new LinkedList();
        ((Paint) this.getParent()).redo_list = new LinkedList();
        ((Paint) this.getParent()).center.list = new LinkedList();
        ((Paint) this.getParent()).center.place_list = new Vector();
        LinkedList list0 = new LinkedList();
        ((Paint) this.getParent()).action_list.add(list0);

        LinkedList list1 = new LinkedList();
        ((Paint) this.getParent()).redo_list.add(list1);

        LinkedList list2 = new LinkedList();
        ((Paint) this.getParent()).center.list.add(list2);

        ((Paint) this.getParent()).center.place_list.add(new Integer(0));
        ((Paint) this.getParent()).updateUndoList();
        // ming 5.6 end
        // Ronald 5.5 starts

        int size = center.layerList.size();
        for (int i = 0; i < size - 1; i++) {
            holder.remove(1);
            updateBox();
            layerGUI();
            center.layerList.remove(1);
            center.nameList.removeElementAt(1);
        }
        ((Layer) holder.elementAt(0)).current.setSelected(true);
        updateBox();
        layerGUI();
        center.main_image = (BufferedImage) center.layerList.get(0);
        position = 2;
        center.currentLayer = 0;
        center.repaint();
    /*FAULT::holder.add(new Object());*/
    // Ronald 5.5 ends
    }

    /**This method is called when the add button is pressed on GUI by user.
     *It calls the main_canvas addLayer, repaint and then newLayer.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     *@param evt ActionEvent
     */
    public void addActionPerformed(ActionEvent evt) {
        center.addLayer();
        center.repaint();
        newLayer();
        // ming 4.26
        LinkedList list0 = new LinkedList();
        ((Paint) this.getParent()).action_list.add(list0);
        LinkedList list1 = new LinkedList();
        ((Paint) this.getParent()).redo_list.add(list1);
        ((Paint) this.getParent()).updateUndoList();
        System.out.println("tested add");
    /*FAULT::holder.remove(0);*/

    // ming 4.26 end
    }

    /**This method is called when the remove button is pressed on GUI by user.
     *It creates a new Frame and asks for layer name and deletes it.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     * @param evt  an ActionEvent object
     */
    public void removeActionPerformed(ActionEvent evt) {
        //if (holder.size() ==1 || holder.size() ==0 ){ // Ronald 5.2
        //    return;  // Ronald 5.2
        //}	     // Ronald 5.2
    /*FAULT::((Layer)holder.elementAt(1)).Name = ((Layer)holder.elementAt(0)).Name;*/
        temp = new JFrame();
        temp.setLocation((int) temp.getLocation().getX() + 300, (int) temp.getLocation().getY() + 300);
        // ming 4.27
        temp.setTitle("Remove Layer by name");
        // ming 4.27 end
        temp.setVisible(true);
        JButton ok = new JButton("OK");
        JButton cancel = new JButton("Cancel");
        JPanel ok_cancel = new JPanel();
        ok_cancel.setLayout(new GridBagLayout());
        GridBagConstraints constraints;
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = java.awt.GridBagConstraints.WEST;
        ok_cancel.add(ok, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        ok_cancel.add(cancel, constraints);

        ok.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        cancel.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        JLabel message = new JLabel("Enter Name Of Layer to be Removed");
        area = new JTextField("", 20);
        JPanel info = new JPanel();
        info.setLayout(new GridBagLayout());
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = java.awt.GridBagConstraints.WEST;
        info.add(message, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = java.awt.GridBagConstraints.WEST;
        info.add(area, constraints);


        temp.getContentPane().add(info, BorderLayout.WEST);
        temp.getContentPane().add(ok_cancel, BorderLayout.EAST);
        temp.pack();


    }

    /**This method is called when the remove current layer is pressed on GUI by user.
     *
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     * @param evt  an ActionEvent object
     */
    public void removeCurrentActionPerformed(ActionEvent evt) {
        if (holder.size() == 1 || holder.size() == 0) {
            center.resetLayer();// Ronald 5.2
            // ming 5.6

            ((Paint) this.getParent()).action_list.remove(0);
            LinkedList list0 = new LinkedList();
            ((Paint) this.getParent()).action_list.add(list0);
            ((Paint) this.getParent()).redo_list.remove(0);
            LinkedList list1 = new LinkedList();
            ((Paint) this.getParent()).redo_list.add(list1);
            ((Paint) this.getParent()).center.list.remove(0);
            LinkedList list2 = new LinkedList();
            ((Paint) this.getParent()).center.list.add(list2);
            ((Paint) this.getParent()).center.place_list.remove(0);
            ((Paint) this.getParent()).center.place_list.add(new Integer(0));
            ((Paint) this.getParent()).updateUndoList();

            /*FAULT::holder.add(new Object());*/
            // ming 5.6 end
            return;
        }
        for (int i = 0; i < holder.size(); i++) {
            if (((Layer) holder.elementAt(i)).current.isSelected()) {
                removeLayer(i);
            }
        }
    }

    /**This method is called by the GUI user pressing on ok in the remove frame.
     *It will store the removal of layer name and remove layer.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     *@param evt ActionEvent
     */
    public void okActionPerformed(ActionEvent evt) {
        String newName = new String();
        newName = area.getText();
        Name = newName;
        temp.setVisible(false);
        temp.dispose();
        // match the name of layer to be removed
		/*FAULT::Name = "popop";*/
        for (int i = 0; i < holder.size(); i++) {

            if (Name.equals((String) ((Layer) holder.elementAt(i)).Name)) { // Ronald
                // 5.2
                // starts

                if (holder.size() == 1 || holder.size() == 0) {
                    center.resetLayer();// Ronald 5.2

                    return;
                }// Ronald 5.2 ends

                removeLayer(i);
            }
        }

    }

    /**
     * This method is called by GUI user pressing on cancel It will not store
     * anything and will close Frame. It should work with all operating systems
     * and hardware. There are no variances and no security constraints.
     *
     * @param evt
     *            ActionEvent
     */
    public void cancelActionPerformed(java.awt.event.ActionEvent evt) {
        temp.setVisible(false);

        temp.dispose();
    /*FAULT::temp.setVisible(true);*/
    }

    /**This method is called by flatten button.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     *@param evt ActionEvent
     */
    public void flattenActionPerformed(ActionEvent evt) {
        // Ronald 5.5 starts
        if (holder.size() == 1 || holder.size() == 0) {
            System.out.println("tested1");
            return;
        }
        center.flattenLayer(new JDialog(paint, false));
        flattenLayer();
    /*FAULT::holder.add(new Object());*/

    // Ronald 5.5 ends
    }

    /**This method is called by up button.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     *@param evt ActionEvent
     */
    public void upActionPerformed(ActionEvent evt) {
        boolean changed = false;
        for (int i = 0; i < holder.size(); i++) {
            if ((((Layer) holder.elementAt(i)).current.isSelected()) && i > 0) {
                changed = true;
                Layer temp;
                temp = (Layer) holder.elementAt(i - 1);
                holder.setElementAt((Layer) holder.elementAt(i), i - 1);
                holder.setElementAt(temp, i);
                // ((Layer) holder.elementAt(i)).layerCanvas.moveUp(i);
                center.moveUp(i);
                // ming 4.27
                LinkedList temp_undolist = (LinkedList) ((Paint) this.getParent()).action_list.get(i);
                ((Paint) this.getParent()).action_list.set(i, ((Paint) this.getParent()).action_list.get(i - 1));
                ((Paint) this.getParent()).action_list.set(i - 1, temp_undolist);
                LinkedList temp_redolist = (LinkedList) ((Paint) this.getParent()).redo_list.get(i);
                ((Paint) this.getParent()).redo_list.set(i, ((Paint) this.getParent()).redo_list.get(i - 1));
                ((Paint) this.getParent()).redo_list.set(i - 1, temp_redolist);
                System.out.println("tested!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            // ming 4.27 end
            }

        }
        /*FAULT::((Layer)holder.elementAt(1)).Name = "momo";*/

        if (changed == true) {
            layerGUI();
        }
    }

    /**This method is called by down button.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     *@param evt ActionEvent
     */
    public void downActionPerformed(ActionEvent evt) {
        boolean changed = false;
        for (int i = 0; i < holder.size(); i++) {
            if ((((Layer) holder.elementAt(i)).current.isSelected()) && i < (holder.size() - 1) && changed == false) {
                changed = true;
                Layer temp;
                temp = (Layer) holder.elementAt(i + 1);
                holder.setElementAt((Layer) holder.elementAt(i), i + 1);
                holder.setElementAt(temp, i);
//		  Object temp = holder.get(i);
//		  holder.set(i, holder.get(i + 1));
//		  holder.set(i + 1, holder);
                ((Layer) holder.elementAt(i)).layerCanvas.moveDown(i);

                // ming 4.27

                LinkedList temp_undolist = (LinkedList) ((Paint) this.getParent()).action_list.get(i);
                ((Paint) this.getParent()).action_list.set(i, ((Paint) this.getParent()).action_list.get(i + 1));
                ((Paint) this.getParent()).action_list.set(i + 1, temp_undolist);
                LinkedList temp_redolist = (LinkedList) ((Paint) this.getParent()).redo_list.get(i);
                ((Paint) this.getParent()).redo_list.set(i, ((Paint) this.getParent()).redo_list.get(i + 1));
                ((Paint) this.getParent()).redo_list.set(i + 1, temp_redolist);

            // ming 4.27 end
            }
        }
        /*FAULT::((Layer)holder.elementAt(2)).Name = "momo";*/

        if (changed == true) {
            layerGUI();
        }


    }

    /**This method is called by front button.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     *@param evt ActionEvent
     */
    public void frontActionPerformed(ActionEvent evt) {
        boolean changed = false;
        for (int i = 0; i < holder.size(); i++) {
            if ((((Layer) holder.elementAt(i)).current.isSelected()) && i > 0) {
                changed = true;
//		  Layer temp;
//		  temp = (Layer) holder.elementAt(0);
//		  holder.setElementAt((Layer) holder.elementAt(i), 0);
//		  holder.setElementAt(temp, i);
                Object temp = holder.remove(i);
                holder.add(0, temp);

                // ming 4.27

                LinkedList temp_undolist = (LinkedList) ((Paint) this.getParent()).action_list.remove(i);
                ((Paint) this.getParent()).action_list.add(0, temp_undolist);
                LinkedList temp_redolist = (LinkedList) ((Paint) this.getParent()).redo_list.remove(i);
                ((Paint) this.getParent()).redo_list.add(0, temp_redolist);

                // ming 4.27 end

                ((Layer) holder.elementAt(i)).layerCanvas.moveFront(i);
            }
        }
        /*FAULT::((Layer)holder.elementAt(0)).Name = "momo";*/

        if (changed == true) {
            layerGUI();
        }
    }

    /**This method is called by bottomMost button.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     *@param evt ActionEvent
     */
    public void bottomMostActionPerformed(ActionEvent evt) {
        boolean changed = false;
        for (int i = 0; i < holder.size(); i++) {
            if ((((Layer) holder.elementAt(i)).current.isSelected()) && i < (holder.size() - 1)) {
                changed = true;
//		  Layer temp;
//		  temp = (Layer) holder.elementAt(holder.size() - 1);
//		  holder.setElementAt((Layer) holder.elementAt(i), holder.size() - 1);
//		  holder.setElementAt(temp, i);
                Object temp = holder.remove(i);
                holder.add(temp);

                // ming 4.27

                LinkedList temp_undolist = (LinkedList) ((Paint) this.getParent()).action_list.remove(i);
                ((Paint) this.getParent()).action_list.add(temp_undolist);
                LinkedList temp_redolist = (LinkedList) ((Paint) this.getParent()).redo_list.remove(i);
                ((Paint) this.getParent()).redo_list.add(temp_redolist);

                // ming 4.27 end

                ((Layer) holder.elementAt(i)).layerCanvas.moveBottom(i);
            }
        }
        /*FAULT::((Layer)holder.elementAt(2)).Name = "momo";*/

        if (changed == true) {
            layerGUI();
        }
    }

    /**This method is called to createlayer box.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     */
    public void layerGUI() {
        int newPlaces = 0;

        GridBagConstraints constraints;
        constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 0;
        constraints.gridy = newPlaces;
        singleLayer = new JPanel();
        singleLayer.setLayout(new GridBagLayout());
        //groupLayer.setLayout(new GridBagLayout());
        groupLayer.removeAll();


        //topLabels.removeAll();
        //topLabels.setLayout(new GridBagLayout());
        //Constraints for the Labels at the top identifying the categories
        constraints.insets = new Insets(0, 24, 0, 0);

        groupLayer.add(topLabels, constraints);
        newPlaces++;


        int placing = 1;
        for (int i = 0; i < holder.size(); i++) {
            System.out.println("tested gui");
            Layer tempo;
            tempo = (Layer) holder.elementAt(i);
            //Constraints for a single layer with all components
            constraints.anchor = GridBagConstraints.WEST;
            constraints.gridx = 0;
            constraints.gridy = placing;
            constraints.insets = new Insets(0, 15, 0, 0);
            singleLayer.add(tempo.current, constraints);
            //constraints.gridx = 1;
            //constraints.gridy = placing;
            //constraints.insets = new Insets(0,20,0,0);
            //singleLayer.add(tempo.visible, constraints);
            constraints.gridx = 1;
            constraints.gridy = placing;
            constraints.insets = new Insets(0, 43, 0, 0);
            singleLayer.add(tempo.nameLab, constraints);
            constraints.gridx = 2;
            constraints.gridy = placing;
            constraints.insets = new Insets(0, 25, 0, 0);
            singleLayer.add(tempo.change, constraints);

            placing++;
            //HERES WHERE THE LAYERS ARE GROUPED TOGETHER IN THE BOX
            constraints.gridx = 0;
            constraints.gridy = newPlaces;
            groupLayer.add(singleLayer, constraints);
            newPlaces++;
        }
        layout.add(groupLayer, BorderLayout.CENTER);
        getContentPane().add(layout, BorderLayout.CENTER);
        pack();
    }

    /** This method closes a dialog window.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     *@param evt WindowEvent
     */
    public void closeDialog(WindowEvent evt) {
        setVisible(false);
        paint.LayerBox.setState(false); // Ronald phase 5

        dispose();
    /*FAULT::setVisible(true);*/
    }

    /**This method is the initializer.
     *It should work with all operating systems and hardware.
     *There are no variances and no security constraints.
     *@param args String[]
     */
    public static void main(String args[]) {
//	  new AllLayers(new JFrame(), true, center).show();
    }
    /** center is a main_canvas value that holds the drawing board.
     */
    public main_canvas center;
    /** paint is a Paint value that holds the drawing board.
     */
    // ming 4.26
    public Paint paint;//Ronald phase 5
    // ming 4.26 end
    /** currentGroup is a ButtonGroup that holds the grouping of current Layer buttons.
     */
    private static ButtonGroup currentGroup;
    /**position is an int that tells of location in GridBagConstraints.
     */
    public int position = 0;
    /** GUI label stating that category is current.
     */
    public JLabel curLabel;
    /**GUI label stating that category is for visible layers.
     */
    public JLabel visLabel;
    /**GUI label stating that category is for Name of layers.
     */
    public JLabel NameLabel;
    /**GUI button that depicting the add a layer function.
     */
    public JButton add;
    /**GUI button that depicts the remove a layer function.
     */
    public JButton remove;
    /**GUI button that depicts the remove current layer function.
     */
    public JButton removeCurrent;
    /**GUI button that depicts the flatten a layer function.
     */
    public JButton flatten;
    /**GUI button that depicts the moving a layer up function.
     */
    public JButton up;
    /**GUI button that depicts moving a layer down function.
     */
    public JButton down;
    /**GUI button that depicts moving a layer to the front function.
     */
    public JButton front;
    /**GUI button that depicts moving layer to bottom function.
     */
    public JButton bottomMost;
    /**GUI panel that groups the functions of layers.
     */
    public JPanel function;
    /**GUI panel that groups the movable directions of layers.
     */
    public JPanel direction;
    /**GUI panel to name the labels of each category for layers.
     */
    public JPanel topLabels;
    /**GUI panel to show the possible layers.
     */
    public JPanel bottom;
    /**GUI panel to group the layout of the toolbox.
     */
    public JPanel layout;
    /**GUI panel to group the different aspects of layer: name, current,change.
     */
    public JPanel singleLayer;
    /**GUI panel to group singleLayer into groups.
     */
    public JPanel groupLayer;
    /**Vector to hold the individual layers together.
     */
    public Vector holder = new Vector();
    /**TextField that takes in the name of removing layer.
     */
    public JTextField area;
    /**GUI Frame to display for remove function.
     */
    public JFrame temp;
    /**GUI label to show category for name.
     */
    public JLabel nameLab;
//    public static int number = 1;
    /**String function to store name.
     */
    public String Name = new String();
}
