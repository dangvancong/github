package github;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class tictactoe implements ActionListener {
	JFrame windown=new JFrame("Tic Tac Toe");
	private JButton button1 = new JButton("");
	private JButton button2 = new JButton("");
	private JButton button3 = new JButton("");
	private JButton button4 = new JButton("");
	private JButton button5 = new JButton("");
	private JButton button6 = new JButton("");
	private JButton button7 = new JButton("");
	private JButton button8 = new JButton("");
	private JButton button9 = new JButton("");
	private String letter ="";
	private int count = 0;
	private boolean win =false;


	public tictactoe()
	{
		windown.setLayout(new GridLayout(3, 3));
		windown.setSize(300, 300);
		windown.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		//add button
		windown.add(button1);
		windown.add(button2);
		windown.add(button3);
		windown.add(button4);
		windown.add(button5);
		windown.add(button6);
		windown.add(button7);
		windown.add(button8);
		windown.add(button9);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);


		windown.setVisible(true);

	}





	@Override
	public void actionPerformed(ActionEvent a) {
		count++;
		if(count%2==0)
		{
			letter = "O";
		}
		else
		{
			letter = "X";
		}
		if(a.getSource()==button1)
		{
			button1.setText(letter);
			button1.setEnabled(false);
		}

		if(a.getSource()==button2)
		{
			button2.setText(letter);
			button2.setEnabled(false);
		}

		if(a.getSource()==button3)
		{
			button3.setText(letter);
			button3.setEnabled(false);
		}
		if(a.getSource()==button4)
		{
			button4.setText(letter);
			button4.setEnabled(false);
		}

		if(a.getSource()==button5)
		{
			button5.setText(letter);
			button5.setEnabled(false);
		}

		if(a.getSource()==button6)
		{
			button6.setText(letter);
			button6.setEnabled(false);
		}
		if(a.getSource()==button7)
		{
			button7.setText(letter);
			button7.setEnabled(false);
		}

		if(a.getSource()==button8)
		{
			button8.setText(letter);
			button8.setEnabled(false);
		}

		if(a.getSource()==button9)
		{
			button9.setText(letter);
			button9.setEnabled(false);
		}


		if(button1.getText()==button2.getText()
				&&button2.getText()==button3.getText()
				&&button1.getText()!="")
		{
			win =true;
		}
		else if(button4.getText()==button5.getText()
				&&button5.getText()==button6.getText()
				&&button4.getText()!="")
		{
			win =true;
		}
		else if(button7.getText()==button8.getText()
				&&button8.getText()==button9.getText()
				&&button7.getText()!="")
		{
			win =true;
		}


		//hang doc
		else if(button1.getText()==button4.getText()
				&&button4.getText()==button7.getText()
				&&button1.getText()!="")
		{
			win =true;
		}

		else if(button2.getText()==button5.getText()
				&&button5.getText()==button8.getText()
				&&button2.getText()!="")
		{
			win =true;
		}

		else if(button3.getText()==button6.getText()
				&&button6.getText()==button9.getText()
				&&button3.getText()!="")
		{
			win =true;
		}

		//hang cheo

		else if(button1.getText()==button5.getText()
				&&button5.getText()==button9.getText()
				&&button1.getText()!="")
		{
			win =true;
		}
		else if(button3.getText()==button5.getText()
				&&button5.getText()==button7.getText()
				&&button3.getText()!="")
		{
			win =true;
		}

		else
			win = false;


		if(win==true)
		{
			JOptionPane.showMessageDialog(null, letter+ " WINS");
		}
		else if(count==9&& win == false)
		{
			JOptionPane.showMessageDialog(null, "Game Over");
		}

	}


}



