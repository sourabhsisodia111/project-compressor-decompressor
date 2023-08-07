/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author 100RB
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.accijob.comp_decomp.*;
//import Decomp;

public class AppFrame extends JFrame implements ActionListener{
	JButton compressBtn;
	JButton decompressBtn;
	
	AppFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		compressBtn = new JButton("Select the file to compress");
		compressBtn.setBounds(20, 100, 200, 30);
		compressBtn.addActionListener(this);
		decompressBtn = new JButton("Select the file to decompress");
		decompressBtn.setBounds(250, 100, 200, 30);
		decompressBtn.addActionListener(this);
		this.add(compressBtn);
		this.add(decompressBtn);
		this.setSize(500, 500);
		this.getContentPane().setBackground(Color.green);
		this.setVisible(true);
	}
//	private ActionEvent e;
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
//		this.e = e;
		if(e.getSource()==compressBtn)
		{
			JFileChooser filechooser = new JFileChooser();
			int response = filechooser.showSaveDialog(null);
			if(response==JFileChooser.APPROVE_OPTION)
			{
				File file = new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
				try {
					Comp.method(file);
					JOptionPane.showMessageDialog(null, "File Compressed SuccessFully!");
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, ex.toString());
				}
			}
		}
		if(e.getSource()==decompressBtn)
		{
			JFileChooser filechooser = new JFileChooser();
			int response = filechooser.showSaveDialog(null);
			if(response==JFileChooser.APPROVE_OPTION)
			{
				File file = new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
				try {
					Decomp.method(file);
					JOptionPane.showMessageDialog(null, "File Decompressed SuccessFully!");
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, ex.toString());
				}
			}
		}
	}
}
