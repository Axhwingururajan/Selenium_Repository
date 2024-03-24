package week1.day1;
public class Student {
public static void main (String[] args) {
	String studentName="ASHWIN L";
	int rollNo=20240315;
	String collegeName="RMK COLLEGE OF ENGINEERING AND TECHNOLOGY, KAVARAIPETTAI, THIRUVALLUR-601203.";
	int languageMark=91;
	int pythonMark=89;
	int physicsMark=90;
	int mathsMark=70;
	int engineeringGraphicsMark=97;
	int chemistryMark=98;
	float cgpa=8.78f;
	System.out.println("STUDENT NAME: "+ studentName) ;
	System.out.println("ROLL NO: "+ rollNo);
	System.out.println("COLLEGE NAME: "+ collegeName) ;
	System.out.println("");
	System.out.println("---------- SUBJECT MARKS-----------");
	System.out.println("COMMUNICATIVE ENGLISH: "+ languageMark);
	System.out.println("PYTHON PROGRAMMING: "+ pythonMark);
	System.out.println("ENGINEERING PHYSICS: " + physicsMark);
	System.out.println("ENGINEERING MATHS: "+ mathsMark);
	System.out.println("ENGINEERING GRAPHICS:" + engineeringGraphicsMark);
	System.out.println("ENGINEERING CHEMISTRY: "+ chemistryMark);
	System.out.println("-------Total CGPA--------: "+ cgpa);
}
}