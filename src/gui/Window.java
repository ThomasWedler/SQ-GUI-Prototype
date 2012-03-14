package gui;

// These are imported classes and this comment is for presentation only ;)
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import java.awt.event.InputEvent;

public class Window extends JFrame {
	private static final long serialVersionUID = -6309597902706885398L;

	public static void main(String[] args) {
		new Window();
	}

	protected Window window;
	
	protected Window test;
	
	protected JMenuBar menuBar = new JMenuBar();
	protected JMenu mnEdit = new JMenu("Edit");
	protected JMenu mnFile = new JMenu("File");
	protected JMenu mnHelp = new JMenu("Help");
	protected JMenu mnOptions = new JMenu("Options");
	protected JMenu mnNew = new JMenu("New");
	protected JMenu mnRelation = new JMenu("Relation");
	
	protected JMenuItem mntmOpen = new JMenuItem("Open");
	protected JMenuItem mntmSave = new JMenuItem("Save");

	protected String title = "Awesome GUI";

	protected JPanel leftup = new JPanel();
	protected JPanel right = new JPanel();
	protected JPanel mid = new JPanel();
	protected JPanel leftdown = new JPanel();
	protected JLabel lblOverview = new JLabel("Overview", JLabel.CENTER);
	protected JLabel lblTools = new JLabel("Tools", JLabel.CENTER);
	protected JLabel lblName = new JLabel("Name", JLabel.CENTER);
	protected JTextField name = new JTextField();
	protected JMenuItem mntmGroup = new JMenuItem("Group");
	protected JMenuItem mntmList = new JMenuItem("List");
	protected JMenuItem mntmUndo = new JMenuItem("Undo");
	protected JMenuItem mntmRedo = new JMenuItem("Redo");
	protected JMenuItem mntmCopy = new JMenuItem("Copy");
	protected JMenuItem mntmPaste = new JMenuItem("Paste");
	protected JMenuItem mntmQuit = new JMenuItem("Quit");
	protected JMenuItem mntmHelp = new JMenuItem("Help Contents");
	protected JMenuItem mntmAbout = new JMenuItem("About");
	
	protected JButton btnList = new JButton("List");
	protected JButton btnGroup = new JButton("Group");
	protected JButton btnRelation = new JButton("Relation");
	
	protected JSeparator separator = new JSeparator();
	protected JSeparator separator_1 = new JSeparator();
	protected JSeparator separator_2 = new JSeparator();
	protected JSeparator separator_3 = new JSeparator();
	
	protected SpringLayout springLayout = new SpringLayout();
	protected SpringLayout sl_leftup = new SpringLayout();
	protected SpringLayout sl_mid = new SpringLayout();
	protected SpringLayout sl_right = new SpringLayout();
	protected SpringLayout sl_leftdown = new SpringLayout();
	
	protected JLabel lblList = new JLabel("List");
	protected JLabel lblFolder = new JLabel("Folder");
	protected JLabel lblFile = new JLabel("File");

	protected JPanel namebackground = new JPanel();

	public Window() {

		// initialisation
		window = this;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setSize(1280, 800);
		setResizable(false);

		// putting the items together

		setJMenuBar(menuBar);
		menuBar.add(mnFile);
		menuBar.add(mnEdit);
		menuBar.add(mnOptions);
		menuBar.add(mnHelp);
		
		mnFile.add(mnNew);
		mnNew.add(mntmGroup);
		mnNew.add(mntmList);
		
		mnNew.add(separator_3);
		mnNew.add(mnRelation);
		
		mnFile.add(separator_1);
		mnFile.add(mntmOpen);
		mnFile.add(mntmSave);
		mnFile.add(separator);
		mnFile.add(mntmQuit);
		
		mnEdit.add(mntmUndo);
		mnEdit.add(mntmRedo);
		mnEdit.add(separator_2);
		mnEdit.add(mntmCopy);
		mnEdit.add(mntmPaste);
		
		mnHelp.add(mntmHelp);
		mnHelp.add(mntmAbout);
		
		// hotkeys and mnemonics

		mntmAbout.setMnemonic(KeyEvent.VK_A);
		mntmHelp.setMnemonic(KeyEvent.VK_C);
		mntmPaste.setMnemonic(KeyEvent.VK_P);
		mntmCopy.setMnemonic(KeyEvent.VK_C);
		mntmRedo.setMnemonic(KeyEvent.VK_R);
		mntmUndo.setMnemonic(KeyEvent.VK_U);
		mntmQuit.setMnemonic(KeyEvent.VK_Q);
		mntmSave.setMnemonic(KeyEvent.VK_S);
		mntmOpen.setMnemonic(KeyEvent.VK_O);
		mntmList.setMnemonic(KeyEvent.VK_L);
		mntmGroup.setMnemonic(KeyEvent.VK_G);
		mnNew.setMnemonic(KeyEvent.VK_N);
		mnHelp.setMnemonic(KeyEvent.VK_H);
		mnOptions.setMnemonic(KeyEvent.VK_O);
		mnEdit.setMnemonic(KeyEvent.VK_E);
		mnFile.setMnemonic(KeyEvent.VK_F);
		
		mntmQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mntmGroup.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mntmHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		mntmCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mntmRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_MASK));
		mntmUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mntmList.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));

		// layout
		
		springLayout.putConstraint(SpringLayout.EAST, leftup, 200, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, leftup, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, leftup, 375, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, leftup, 0, SpringLayout.WEST, getContentPane());

		springLayout.putConstraint(SpringLayout.NORTH, leftdown, 0, SpringLayout.SOUTH, leftup);
		springLayout.putConstraint(SpringLayout.WEST, leftdown, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, leftdown, 0, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, leftdown, 0, SpringLayout.WEST, mid);
		
		springLayout.putConstraint(SpringLayout.NORTH, mid, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, mid, 0, SpringLayout.EAST, leftup);
		springLayout.putConstraint(SpringLayout.SOUTH, mid, 0, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, mid, 0, SpringLayout.WEST, right);
		
		springLayout.putConstraint(SpringLayout.SOUTH, right, 0, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, right, 0, SpringLayout.NORTH, leftup);
		springLayout.putConstraint(SpringLayout.WEST, right, 1080, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, right, 0, SpringLayout.EAST, getContentPane());
	
		sl_leftup.putConstraint(SpringLayout.NORTH, lblOverview, 0, SpringLayout.NORTH, leftup);
		sl_leftup.putConstraint(SpringLayout.WEST, lblOverview, 0, SpringLayout.WEST, leftup);
		sl_leftup.putConstraint(SpringLayout.SOUTH, lblOverview, 30, SpringLayout.NORTH, leftup);
		sl_leftup.putConstraint(SpringLayout.HORIZONTAL_CENTER, lblOverview, 0, SpringLayout.HORIZONTAL_CENTER, leftup);
		
		sl_leftup.putConstraint(SpringLayout.NORTH, lblList, 50, SpringLayout.NORTH, leftup);
	    sl_leftup.putConstraint(SpringLayout.WEST, lblList, 25, SpringLayout.WEST, leftup);
	    
	    sl_leftup.putConstraint(SpringLayout.NORTH, lblFolder, 75, SpringLayout.NORTH, leftup);
	    sl_leftup.putConstraint(SpringLayout.WEST, lblFolder, 25, SpringLayout.WEST, leftup);
	    
	    sl_leftup.putConstraint(SpringLayout.NORTH, lblFile, 100, SpringLayout.NORTH, leftup);
	    sl_leftup.putConstraint(SpringLayout.WEST, lblFile, 25, SpringLayout.WEST, leftup);
	    
		sl_right.putConstraint(SpringLayout.NORTH, lblName, 5, SpringLayout.NORTH, right);
		sl_right.putConstraint(SpringLayout.SOUTH, lblName, 25, SpringLayout.NORTH, right);
		sl_right.putConstraint(SpringLayout.WEST, lblName, 0, SpringLayout.WEST, right);
		sl_right.putConstraint(SpringLayout.HORIZONTAL_CENTER, lblName, 0, SpringLayout.HORIZONTAL_CENTER, right);
		
		sl_right.putConstraint(SpringLayout.NORTH, name, 0, SpringLayout.SOUTH, lblName);
		sl_right.putConstraint(SpringLayout.WEST, name, 10, SpringLayout.WEST, right);
		sl_right.putConstraint(SpringLayout.EAST, name, -10, SpringLayout.EAST, right);
		
		sl_right.putConstraint(SpringLayout.NORTH, namebackground, 0, SpringLayout.NORTH, right);
		sl_right.putConstraint(SpringLayout.WEST, namebackground, 0, SpringLayout.WEST, right);
		sl_right.putConstraint(SpringLayout.SOUTH, namebackground, 60, SpringLayout.NORTH, right);
		sl_right.putConstraint(SpringLayout.EAST, namebackground, 0, SpringLayout.EAST, right);
		
		sl_leftdown.putConstraint(SpringLayout.NORTH, lblTools, 0, SpringLayout.NORTH, leftdown);
		sl_leftdown.putConstraint(SpringLayout.WEST, lblTools, 0, SpringLayout.WEST, leftdown);
		sl_leftdown.putConstraint(SpringLayout.SOUTH, lblTools, 30, SpringLayout.NORTH, leftdown);
		sl_leftdown.putConstraint(SpringLayout.HORIZONTAL_CENTER, lblTools, 0, SpringLayout.HORIZONTAL_CENTER, leftdown);
		
		getContentPane().setLayout(springLayout);
		leftup.setLayout(sl_leftup);
		right.setLayout(sl_right);
		mid.setLayout(sl_mid);
		leftdown.setLayout(sl_leftdown);
		
		getContentPane().add(leftup);
		getContentPane().add(right);
		getContentPane().add(mid);
		getContentPane().add(leftdown);
		right.add(lblName);
		leftup.add(lblOverview);
		leftup.add(lblList);
		leftup.add(lblFolder);
		leftup.add(lblFile);
		right.add(name);
		name.setColumns(10);
		leftdown.add(lblTools);
		right.add(namebackground);

		leftup.setBackground(Color.LIGHT_GRAY);
		leftup.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		right.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		right.setBackground(Color.LIGHT_GRAY);
		namebackground.setBackground(SystemColor.scrollbar);
		mid.setBackground(Color.WHITE);
		leftdown.setBackground(Color.LIGHT_GRAY);
		leftdown.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		
		// labels
		
		lblName.setFont(new Font("Dialog Bold", 1, 13));
		
		lblOverview.setFont(new Font("Dialog Bold", 1, 13));
	    lblOverview.setBackground(SystemColor.scrollbar);
	    lblOverview.setOpaque(true);
		
	    lblTools.setBackground(SystemColor.scrollbar);
	    lblTools.setOpaque(true);
		lblTools.setFont(new Font("Dialog Bold", 1, 13));
		
		// toolbuttons
		
		sl_leftdown.putConstraint(SpringLayout.NORTH, btnList, 50, SpringLayout.NORTH, leftdown);
		sl_leftdown.putConstraint(SpringLayout.WEST, btnList, 0, SpringLayout.WEST, leftdown);
		sl_leftdown.putConstraint(SpringLayout.EAST, btnList, 0, SpringLayout.EAST, leftdown);
		leftdown.add(btnList);
		
		sl_leftdown.putConstraint(SpringLayout.NORTH, btnGroup, 0, SpringLayout.SOUTH, btnList);
		sl_leftdown.putConstraint(SpringLayout.WEST, btnGroup, 0, SpringLayout.WEST, leftdown);
		sl_leftdown.putConstraint(SpringLayout.EAST, btnGroup, 0, SpringLayout.EAST, leftdown);
		leftdown.add(btnGroup);
		
		sl_leftdown.putConstraint(SpringLayout.NORTH, btnRelation, 0, SpringLayout.SOUTH, btnGroup);
		sl_leftdown.putConstraint(SpringLayout.WEST, btnRelation, 0, SpringLayout.WEST, leftdown);
		sl_leftdown.putConstraint(SpringLayout.EAST, btnRelation, 0, SpringLayout.EAST, leftdown);
		leftdown.add(btnRelation);

		// images
		
		ImageIcon listimg = Actions.createImageIcon("/resources/List.png", "", this);
		JLabel iconAndText = new JLabel("List", listimg, JLabel.CENTER);
		sl_mid.putConstraint(SpringLayout.NORTH, iconAndText, 20, SpringLayout.NORTH, mid);
		sl_mid.putConstraint(SpringLayout.WEST, iconAndText, 20, SpringLayout.WEST, mid);
		mid.add(iconAndText);

		ImageIcon folderimg = Actions.createImageIcon("/resources/Folder.png", "", this);
		JLabel iconAndText2 = new JLabel("Folder", folderimg, JLabel.CENTER);
		sl_mid.putConstraint(SpringLayout.NORTH, iconAndText2, 20, SpringLayout.NORTH, mid);
		sl_mid.putConstraint(SpringLayout.WEST, iconAndText2, 20, SpringLayout.EAST, iconAndText);
		mid.add(iconAndText2);
		
		ImageIcon fileimg = Actions.createImageIcon("/resources/Vlc.png", "", this);
		JLabel iconAndText3 = new JLabel("File", fileimg, JLabel.CENTER);
		sl_mid.putConstraint(SpringLayout.NORTH, iconAndText3, 20, SpringLayout.NORTH, mid);
		sl_mid.putConstraint(SpringLayout.WEST, iconAndText3, 20, SpringLayout.EAST, iconAndText2);
		mid.add(iconAndText3);
		
		// action listener
		
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
			    int returnVal = chooser.showOpenDialog(getParent());
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			       System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
			    }
			}
		});
		
		validate();
		repaint();

		setVisible(true);
	}
}