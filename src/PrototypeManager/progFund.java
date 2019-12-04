package PrototypeManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import PrototypeManager.*;
/**
 *@Description 
 *@Parameters
 *@PreCondition
 *@PostCondition
 *@THrows
 */

/**
 *@Description 
 *@Parameters
 *@PreCondition
 *@PostCondition
 *@THrows
 */
public class progFund extends JFrame implements ActionListener {  
    private JLabel l;  
    private JRadioButton jb[]=new JRadioButton[5];  
    private JButton b1,b2;  
    private ButtonGroup bg;  
    private int count=0,current=0,x=1,y=1,now=0;  
    private int m[]=new int[10];
    private String mode;
    private QuestionCollections questionPFCollections;
    private Sub1 questionPFPack;
    private int rightAnswer;
    
    progFund(String s, String mode){   
        super(s);
        this.mode = mode;
        questionPFPack = new Sub1(mode);
        questionPFCollections = questionPFPack.getCollections();
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup(); 
        
        for(int i=0;i<5;i++){  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
        
        b1=new JButton("Next");  
        b2=new JButton("Bookmark");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        add(b1);add(b2);  
        set();  
        l.setBounds(90,40,450,20);  
        jb[0].setBounds(50,80,200,20);  
        jb[1].setBounds(50,110,200,20);  
        jb[2].setBounds(50,140,200,20);  
        jb[3].setBounds(50,170,200,20);  
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,100,30);  
  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
    }  
    
    public void actionPerformed(ActionEvent e){  
        if(e.getSource()==b1) {  
            if(check())  
                count=count+1;  
            current++;  //increments array questions 
            set();    
            if(current==4) {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        } 
        
        if(e.getActionCommand().equals("Bookmark")){  
            JButton bk=new JButton("Bookmark"+x);  
            bk.setBounds(480,20+30*x,100,30);  
            add(bk);  
            bk.addActionListener(this);  
            m[x]=current;  
            x++;  
            current++;  
            set();    
            if(current==4)  
                b2.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        
        for(int i=0,y=1;i<x;i++,y++){  
        	
        if(e.getActionCommand().equals("Bookmark"+y)){  
            if(check())  
                count=count+1;  
            now=current;  
            current=m[y];  
            set();  
            ((JButton)e.getSource()).setEnabled(false);  
            current=now;  
        	}  
        }  
      
        if(e.getActionCommand().equals("Result")){  
            if(check())  //checking for right answers
                count=count+1;  
            current++;    
            JOptionPane.showMessageDialog(this,"Amount Correct: "+count);
            if (count >= 4) { //check the progress
            	if (SwitchLevel.levelCounter == 3) { //check if user is at last level
            		JOptionPane.showMessageDialog(this,"You have tested out of this subject!");
            		SwitchLevel.levelCounter = 1;
            		Start.closeFrame(); // reset interface
            	}
            	else if (SwitchLevel.confirmSwitchLevel()) { // if user wants to go to the next level
                			SwitchLevel.levelCounter += 1; // increase level counts
                			SwitchLevel.newGameProc("Programming Fundamentals", SwitchLevel.levelCounter); // create new level
                }
            	else {
            		Start.closeFrame(); // reset interface
            		SwitchLevel.levelCounter = 1;
            	}
            }
            else { //if user fail to pass the level
            	JOptionPane.showMessageDialog(this,"Try again next time!");
            	SwitchLevel.levelCounter = 1;
            	Start.closeFrame(); // reset interface
            }
            super.setVisible(false); // turn previous level's interface off 
        }  
    }
    
    void set(){ 
    	
        jb[4].setSelected(true);  
        
        if (current <= 4) {
        	Question question = questionPFCollections.getQuestion();
        	String[] answers = question.getAnswers();
        	rightAnswer = question.getRightAnswer();
        	l.setText(question.getQuestion());
        	for (int i = 0; i < 4; i++) {
        		jb[i].setText(answers[i]);
        	}
        }
        
        l.setBounds(30,40,450,20);  
        
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,300,20);  
        
    }  
    boolean check() {
        if(current <= 4)  
            return(jb[rightAnswer].isSelected());      
        return false;  
    }  
}
