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
	private JTextField majorTextField;
	private JTextField yearTextField;
	private JLabel titleLabel;
	private JLabel yearLabel;
	private JLabel majorLabel;
	private JLabel majorTextLabel;
	private JLabel yearTextLabel;
	private SpringLayout baseLayout;
	
	public MSPanel(MSController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		majorTextField = new JTextField("");
		yearTextField = new JTextField("");
		baseLayout.putConstraint(SpringLayout.NORTH, majorTextField, 0, SpringLayout.NORTH, yearTextField);
		baseLayout.putConstraint(SpringLayout.SOUTH, majorTextField, 0, SpringLayout.SOUTH, yearTextField);
		titleLabel = new JLabel("This is the college major, and year machine.");
		yearLabel = new JLabel("School Year");
		baseLayout.putConstraint(SpringLayout.EAST, yearLabel, -69, SpringLayout.EAST, this);
		majorLabel = new JLabel("Major");
		majorTextLabel = new JLabel("Major:");
		baseLayout.putConstraint(SpringLayout.SOUTH, majorTextLabel, -6, SpringLayout.NORTH, majorTextField);
		baseLayout.putConstraint(SpringLayout.WEST, majorTextField, 0, SpringLayout.WEST, majorTextLabel);
		yearTextLabel = new JLabel("School Year:");
		baseLayout.putConstraint(SpringLayout.NORTH, yearTextLabel, 107, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, yearTextLabel, -150, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, yearTextField, 6, SpringLayout.SOUTH, yearTextLabel);
		baseLayout.putConstraint(SpringLayout.EAST, yearTextField, -10, SpringLayout.EAST, yearTextLabel);
		convertButton = new JButton("Decode.");
		baseLayout.putConstraint(SpringLayout.EAST, majorTextField, -3, SpringLayout.WEST, convertButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, yearTextField, -60, SpringLayout.NORTH, convertButton);
		mCheckBox = new JCheckBox("M", false);
		baseLayout.putConstraint(SpringLayout.WEST, majorLabel, 0, SpringLayout.WEST, mCheckBox);
		cCheckBox = new JCheckBox("CS", false);
		baseLayout.putConstraint(SpringLayout.WEST, majorTextLabel, 46, SpringLayout.EAST, cCheckBox);
		baseLayout.putConstraint(SpringLayout.WEST, yearTextField, 174, SpringLayout.EAST, cCheckBox);
		baseLayout.putConstraint(SpringLayout.SOUTH, majorLabel, -13, SpringLayout.NORTH, cCheckBox);
		iCheckBox = new JCheckBox("IT", false);
		oneCheckBox = new JCheckBox("1st", false);
		baseLayout.putConstraint(SpringLayout.SOUTH, yearLabel, -6, SpringLayout.NORTH, oneCheckBox);
		twoCheckBox = new JCheckBox("2nd", false);
		baseLayout.putConstraint(SpringLayout.EAST, yearTextLabel, -15, SpringLayout.WEST, twoCheckBox);
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
		this.add(majorTextField);
		this.add(yearTextField);
		this.add(titleLabel);
		this.add(majorLabel);
		this.add(yearLabel);
		this.add(majorTextLabel);
		this.add(yearTextLabel);
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
		
	}
	
	private void setupListeners()
	{
		mCheckBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				majorTextField.setText("Mathematics");
			}
		});
		
		cCheckBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				majorTextField.setText("Computer Science");
			}
		});
		
		iCheckBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				majorTextField.setText("Information Technology");
			}
		});
		
		oneCheckBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				yearTextField.setText("Freshman");
			}
		});
		
		twoCheckBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				yearTextField.setText("Sophmore");
			}
		});
		
		threeCheckBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				yearTextField.setText("Junior");
			}
		});
		
		fourCheckBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				yearTextField.setText("Senior");
			}
		});
	}
}
