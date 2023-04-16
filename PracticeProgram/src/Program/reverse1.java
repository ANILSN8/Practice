package Program;

public class reverse1 {

	public static void main(String[] args) {
		String s="welcome to banglore";
		String[] s1 = s.split("");
		String rev = "";
        for(int i=s1.length-1;i>=0;i--) {
        	rev=rev+s1;
        }
	}

}
