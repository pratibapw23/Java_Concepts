package customException;

class MyException extends Exception{
	private static final long serialVersionUID = 1L;

	public MyException(String args) {
		
	}
}
public class CustomException {

	public static void main(String[] args)  {
		int i=11;
		if(i>10) {
			try {
				throw new MyException("my exception is thrown");
			}
			catch(MyException e) {
				System.out.println(e);
			}
			
		}
	}

}
