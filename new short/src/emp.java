
public class emp 
{
String strEmpno,strEname,strEadd,strEdesignation;
int intEage,intEsal,intEHoc,intEall;
boolean blGender;

public emp(String strEmpno, String strEname, String strEadd, String strEdesignation, int intEage, int intEsal,
		int intEHoc, int intEall, boolean blGender)
{
	this.strEmpno = strEmpno;
	this.strEname = strEname;
	this.strEadd = strEadd;
	this.strEdesignation = strEdesignation;
	this.intEage = intEage;
	this.intEsal = intEsal;
	this.intEHoc = intEHoc;
	this.intEall = intEall;
	this.blGender = blGender;
	
}
public void disp()
{
	System.out.println(strEmpno+" "+strEname+" "+strEadd+" "+strEdesignation+" "+intEage+" "+intEsal+" "+intEHoc+" "+intEall+" "+blGender);
}
public String getStrEmpno() {
	return strEmpno;
}

public void setStrEmpno(String strEmpno) {
	this.strEmpno = strEmpno;
}

public String getStrEname() {
	return strEname;
}

public void setStrEname(String strEname) {
	this.strEname = strEname;
}

public String getStrEadd() {
	return strEadd;
}

public void setStrEadd(String strEadd) {
	this.strEadd = strEadd;
}

public String getStrEdesignation() {
	return strEdesignation;
}

public void setStrEdesignation(String strEdesignation) {
	this.strEdesignation = strEdesignation;
}

public int getIntEage() {
	return intEage;
}

public void setIntEage(int intEage) {
	this.intEage = intEage;
}

public int getIntEsal() {
	return intEsal;
}

public void setIntEsal(int intEsal) {
	this.intEsal = intEsal;
}

public int getIntEHoc() {
	return intEHoc;
}

public void setIntEHoc(int intEHoc) {
	this.intEHoc = intEHoc;
}

public int getIntEall() {
	return intEall;
}

public void setIntEall(int intEall) {
	this.intEall = intEall;
}

public boolean isBlGender() {
	return blGender;
}

public void setBlGender(boolean blGender) {
	this.blGender = blGender;
}

public emp() 
{

}
}

