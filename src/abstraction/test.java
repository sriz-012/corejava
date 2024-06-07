package abstraction;

public class test {

	public static void main(String[] args) {
		CentralBank n=new Nic();
		n.getbankname();
		n.getinterestrate();
		
		UserInterface u=new UserInterfaceImpl();
		u.addUser();
		u.deleteUser();
		u.print();
		
//		CommonService cs =new UserInterfaceImpl();
//		cs.print();
	}
}
