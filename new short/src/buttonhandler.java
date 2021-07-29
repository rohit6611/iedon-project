import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonhandler implements ActionListener
{
mainframe frm;

public  buttonhandler( mainframe f)
{
	frm=f;
}
public void ShowEmpOnFrame(emp e1)
{
	String strEmpno=e1.getStrEmpno(),strEname=e1.getStrEname(),strEadd=e1.getStrEadd(),
			strEdesignation=e1.getStrEdesignation();
	int intEage=e1.getIntEage(),intEsal=e1.getIntEsal(),intEHoc=e1.getIntEHoc(),
			intEall=e1.getIntEall();
	boolean blGender=e1.isBlGender();
	
	frm.arrtxt[0].setText(strEmpno);
	frm.arrtxt[1].setText(strEname);
	frm.arrtxt[2].setText(String.valueOf(intEage));
	frm.txtadd.setText(strEadd);
	frm.arrtxt[3].setText(String.valueOf(intEsal));
	frm.arrtxt[4].setText(String.valueOf(intEHoc));
	
	if(blGender==true)
	{
		frm.rdbfemale.setSelected(false);
		frm.rdbmale.setSelected(true);
	}
	else
	{
		frm.rdbfemale.setSelected(true);
		frm.rdbmale.setSelected(false);
	}
	if(intEall==750)
	{
		frm.chbFood.setSelected(true);
		frm.chbTravel.setSelected(true);
	}
	else if(intEall==500)
	{
		frm.chbFood.setSelected(true);
		frm.chbTravel.setSelected(false);
	}
	else if(intEall==250)
	{
		frm.chbTravel.setSelected(true);
		frm.chbFood.setSelected(false);
	}
	else if(intEall==0)
	{
		frm.chbFood.setSelected(false);
		frm.chbTravel.setSelected(false);
	}	
	}


	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String strAcmd=arg0.getActionCommand();
		if(strAcmd.equals("Add"))
		{
			String strEmpno,strEname,strEadd,strEdesignation;
			int intEage,intEsal,intEHoc,intEall = 0;
			boolean blGender=true;
			strEmpno=frm.arrtxt[0].getText();
			strEname=frm.arrtxt[1].getText();
			intEage=Integer.parseInt(frm.arrtxt[2].getText());
			intEsal=Integer.parseInt(frm.arrtxt[3].getText());
			intEHoc=Integer.parseInt(frm.arrtxt[4].getText());
			strEadd=frm.txtadd.getText();
			
			if(frm.rdbmale.isSelected())
			{
				blGender=true;
			}
			else if(frm.rdbfemale.isSelected())
			{
				blGender=false;
			}
			
			if(frm.chbTravel.isSelected() && frm.chbFood.isSelected())
			{
				intEall=750;
			}
			else if(!frm.chbTravel.isSelected() && frm.chbFood.isSelected())
			{
				intEall=500;
			}
			else if(frm.chbTravel.isSelected() && !frm.chbFood.isSelected())
			{
				intEall=250;
			}
			else if(!frm.chbTravel.isSelected() && !frm.chbFood.isSelected())
			{
				intEall=0;
			}
		
				strEdesignation=(String) frm.cbodesignation.getSelectedItem();
				
			emp e1=new emp(strEmpno, strEname, strEadd, strEdesignation, intEage, intEsal, intEHoc, intEall, blGender);
			e1.disp();
			frm.lst.add(e1);
			frm.count++;
		}
	 if(strAcmd.equals("First"))
	{
		frm.index=0;
		emp e1=frm.lst.getFirst();
		ShowEmpOnFrame(e1);
		e1.disp();
		System.out.println("First clicked");
	}
	else if(strAcmd.equals("Last"))
	{
		frm.index=frm.count-1;
		emp e1=frm.lst.getLast();
		ShowEmpOnFrame(e1);
		e1.disp();
	}
	else if(strAcmd.equals("prev"))
	{
		frm.index--;
		emp e1=frm.lst.get(frm.index);
		ShowEmpOnFrame(e1);
		e1.disp();
	}else if(strAcmd.equals("Next"))
	{
		frm.index++;
		emp e1=frm.lst.get(frm.index);
		ShowEmpOnFrame(e1);
		e1.disp();
	}
	}			
	}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

