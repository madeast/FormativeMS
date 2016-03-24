package ms.view;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;


import ms.controller.MSController;

public class MSPanel extends JPanel
{
	private MSController baseController;
	private JButton convertButton;
	private JCheckBox mCheckBox;
	private JCheckBox cCheckBox;
	private JCheckBox iCheckBox;
	private JCheckBox oneCheckBox;
	private JCheckBox twoCheckBox;
	private JCheckBox threeCheckBox;
	private JCheckBox fourCheckBox;
	private JTextField convertTextField;
	private JLabel titleLabel;
	private SpringLayout baseLayout;
	
	public MSPanel(MSController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		convertTextField = new JTextField("");
		titleLabel = new JLabel("This is the college major, and year machine.");
		convertButton = new JButton("Decode.");
		mCheckBox = new JCheckBox("M", false);
		cCheckBox = new JCheckBox("CS", false);
		iCheckBox = new JCheckBox("IT", false);
		oneCheckBox = new JCheckBox("1st", false);
		twoCheckBox = new JCheckBox("2nd", false);
		threeCheckBox = new JCheckBox("3rd", false);
		fourCheckBox = new JCheckBox("4th", false);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(convertTextField);
		this.add(titleLabel);
		this.add(convertButton);
		this.add(mCheckBox);
		this.add(cCheckBox);
		this.add(iCheckBox);
		this.add(oneCheckBox);
		this.add(twoCheckBox);
		this.add(threeCheckBox);
		this.add(fourCheckBox);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, convertButton, 178, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, convertButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, titleLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 117, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, convertTextField, 53, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, iCheckBox, 0, SpringLayout.NORTH, fourCheckBox);
		baseLayout.putConstraint(SpringLayout.NORTH, fourCheckBox, 196, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, fourCheckBox, 328, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, threeCheckBox, -6, SpringLayout.NORTH, fourCheckBox);
		baseLayout.putConstraint(SpringLayout.WEST, threeCheckBox, 328, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, twoCheckBox, -6, SpringLayout.NORTH, threeCheckBox);
		baseLayout.putConstraint(SpringLayout.WEST, twoCheckBox, 328, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, oneCheckBox, 0, SpringLayout.WEST, twoCheckBox);
		baseLayout.putConstraint(SpringLayout.SOUTH, oneCheckBox, -8, SpringLayout.NORTH, twoCheckBox);
		baseLayout.putConstraint(SpringLayout.WEST, iCheckBox, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, mCheckBox, -6, SpringLayout.NORTH, iCheckBox);
		baseLayout.putConstraint(SpringLayout.WEST, cCheckBox, 0, SpringLayout.WEST, mCheckBox);
		baseLayout.putConstraint(SpringLayout.SOUTH, cCheckBox, -6, SpringLayout.NORTH, mCheckBox);
		baseLayout.putConstraint(SpringLayout.WEST, mCheckBox, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, convertTextField, 0, SpringLayout.WEST, convertButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, convertTextField, -142, SpringLayout.NORTH, convertButton);
		baseLayout.putConstraint(SpringLayout.EAST, convertTextField, 73, SpringLayout.WEST, convertButton);
		
	}
	
	private void setupListeners()
	{
		mCheckBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				convertTextField.setText("Mathematics");
			}
		});
	}
}
