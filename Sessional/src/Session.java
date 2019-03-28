
public class Session {

	public static void main(String[] args) {
		

	}

	public static int getIndex(String s, char ch){
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)==ch){
				return i;
		}
		
	}
		return -1;
	}
	}
