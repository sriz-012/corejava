package abstraction;

public class UserInterfaceImpl implements UserInterface,CommonService{

	@Override
	public void addUser() {
		System.out.println("added succcess");
		
	}

	@Override
	public void deleteUser() {
		System.out.println("deleted success");
		
	}

	@Override
	public void print() {
		System.out.println("printing");
		
	}

}
