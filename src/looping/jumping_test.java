package looping;

public class jumping_test {
	/*
	 * break->exits from loop
	 * continue->skip values 
	 * return->exist from method
	 */
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("end of loop");
		for(int i=1;i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("end of loop");
		for(int i=1;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("end of loop");
		for(int i=1;i<10;i++) {
			if(i==5) {
				return;
			}
			System.out.println(i);
		}
		System.out.println("end of loop");
	}

}
