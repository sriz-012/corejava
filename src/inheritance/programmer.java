package inheritance;

public class programmer extends Employee {
String prolang;
String project;
int bonus;
void print() {
	super.print();
	System.out.println(prolang);
	System.out.println(project);
	System.out.println(bonus);
}
}
