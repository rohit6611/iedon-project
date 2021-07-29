import java.util.LinkedList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class mainframe extends JFrame
	{
	LinkedList<emp> lst=new LinkedList<emp>();
	int index=0;
	int count=0;
	JLabel arrlbl[]=new JLabel[9];
	JTextField arrtxt[]=new JTextField[5];
	JComboBox<String>cbodesignation=new JComboBox<String>();
	JTextArea txtadd=new JTextArea();
	JCheckBox chbFood=new JCheckBox("Food");
	JCheckBox chbTravel=new JCheckBox("Travel");
	JRadioButton rdbmale=new JRadioButton("Male");
	JRadioButton rdbfemale=new JRadioButton("female");
	
	
		public mainframe()
		{
			setLayout(null);
			
			
			String strlblnames[]= {"Emp id","E name","E age","E gender","E designation","E add","E sal","Allowance","HOC"};
			int yposlbl[]= {50,80,110,140,170,200,260,290,320};
			for(int i=0;i<9;i++)
			{
				arrlbl[i]=new JLabel(strlblnames[i]);
				arrlbl[i].setBounds(50,yposlbl[i],100,20);
				add(arrlbl[i]);
			}
			
			int ypostxt[]= {50,80,110,260,320};
			for(int i=0;i<5;i++)
			{
				arrtxt[i]=new JTextField();
				arrtxt[i].setBounds(160,ypostxt[i],100,20);
				add(arrtxt[i]);
			}
			JButton arrbtn[]=new JButton[11];
			String strbtnname[]= {"First","Next","prev","Last","Add","Delete","Update","Sort","Load","Transfer","Save"};
			int xposbtn=50;
			int yposbtn=350;
			for(int i=0;i<11;i++)
			{
				arrbtn[i]=new JButton(strbtnname[i]);
				arrbtn[i].setBounds(xposbtn,yposbtn,70,20);
				add(arrbtn[i]);
				xposbtn+=80;
				if(i==3 || i==7)
				{
					yposbtn+=30;
					xposbtn=50;
					
				}
				arrbtn[i].addActionListener(new buttonhandler (this));
			}
	
			cbodesignation.setBounds(160,170,100,20);
			add(cbodesignation);
			cbodesignation.addItem("Emp");
			cbodesignation.addItem("SM");
			cbodesignation.addItem("GM");
			
			
			JScrollPane jspadd=new JScrollPane(txtadd);
			jspadd.setBounds(160,200,100,20);
			add(jspadd);
			
			  chbTravel.setBounds(260,290,100,20);
			 add(chbTravel);
			 
			 chbFood.setBounds(160,290,100,20);
			 add(chbFood);
			 
			 
			 rdbfemale.setBounds(260,140,100,20);
			 add(rdbfemale);
			 
			 rdbmale.setBounds(160,140,100,20);
			 add(rdbmale);
			 
			 ButtonGroup grp=new ButtonGroup();
			 grp.add(rdbmale);
			 grp.add(rdbfemale);
			 
			 
			
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setVisible(true);
			setTitle("Emp Details");
			setBounds(0,0,700,700);
}
}