package constructor;

public class User {
 String userName;
 String pw;
 
 /*User(){
	 userName="hi";
	 pw="hi";
	 
	  void printUser() {
	 System.out.println(userName);
	 System.out.println(pw);
	 
 }
 public static void main(String[] args) {
	User u= new user();
	u.printUser();
}
}
 }
 */
 //-------parameterized constructor------
 User(String u,String p){
	 userName=u;
	 pw=p;
 }
 
 void printUser() {
	 System.out.println(userName);
	 System.out.println(pw);
	 
 }
 public static void main(String[] args) {
	User u= new User("hi","hi");
	u.printUser();
}
}
