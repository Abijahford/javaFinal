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
public class dataStruct extends JFrame implements ActionListener {  
    private JLabel l;  
    private JRadioButton jb[]=new JRadioButton[5];  
    private JButton b1,b2;  
    private ButtonGroup bg;  
    private int holdCounter=0,count=0,current=0,x=1,y=1,now=0;  
    private int m[]=new int[10];
    private String mode;
    private QuestionCollections questionDSCollections;
    private Sub1 questionDSPack;
    private int rightAnswer;
    private Question[] bookmarkQuestion = {null,null,null,null,null,null};
    private Question[] onHoldQuestion= {null,null,null,null,null};
    private Question question = null;
    private boolean ifFromSet = false;
    
    dataStruct(String s, String mode){   
        super(s);
        this.mode = mode;
        questionDSPack = new Sub1(mode);
        questionDSCollections = questionDSPack.getCollections();
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
            x++;
            set();    		
              
        } 
        
        if(e.getActionCommand().equals("Bookmark")){  
        	
        	
            JButton bk=new JButton("Bookmark"+x);  
            bk.setBounds(480,20+30*x,100,30);  
            add(bk);  
            bk.addActionListener(this);  
         
            x++;
            set();
            if(current==4)  
                b2.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        
        for(int y = 1; y < 5; y++) {  	
        	if(e.getActionCommand().equals("Bookmark"+y)){
        		if (ifFromSet) {
        			ifFromSet = false;
        		}
        		else {
        			if (check())
        				count += 1;
        		}
        		
        		onHoldQuestion[holdCounter] = question;
        		
        		current -= 1;
        		  
        		//now=current;  
        		//current=m[y];  
        		setTemp(y);  
        		((JButton)e.getSource()).setEnabled(false);  
        		  
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
                			SwitchLevel.newGameProc("Data Structures and Algorithms", SwitchLevel.levelCounter); // create new level
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
    
    void setTemp(int k) {
 
    	
    	jb[4].setSelected(true);  
        
    	String[] answers = bookmarkQuestion[k].getAnswers();
    	rightAnswer = bookmarkQuestion[k].getRightAnswer();
    	l.setText(bookmarkQuestion[k].getQuestion());
    	for (int i = 0; i < 4; i++) {
    		jb[i].setText(answers[i]);
    	}
        
        l.setBounds(30,40,450,20);  
        
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,300,20); 
    }
    
    void set() { 
    	ifFromSet = true;
    	
        jb[4].setSelected(true);  
        
         
        if (current <= 4) {
        	if (onHoldQuestion[holdCounter] != null) {
        		question = onHoldQuestion[holdCounter];
        		holdCounter += 1;
        		x-=1;
        		bookmarkQuestion[x] = question;
        	}
        	else {
        		question = questionDSCollections.getQuestion();
        		bookmarkQuestion[x] = question;
        		
        	}
        	
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
         
        if(x>=5) {    
            b2.setText("Result");  
        }
        
    }
    
    boolean check() {
        return(jb[rightAnswer].isSelected());       
    }  
}
