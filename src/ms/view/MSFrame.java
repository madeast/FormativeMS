package ms.view;

import javax.swing.JFrame;
import ms.controller.MSController;

public class MSFrame extends JFrame
{
	private MSController baseController;
	private MSPanel basePanel;
	
	public MSFrame(MSController baseController)
	{
		this.baseController = baseController;
		basePanel = new MSPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setTitle("Major/Year Calculator");
		this.setResizable(false);
		this.setVisible(true);
	}
}
