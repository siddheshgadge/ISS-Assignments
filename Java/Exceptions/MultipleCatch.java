// Multiple catch statement

import java.io.*;

class MultipleCatch{
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try{
			int num = Integer.parseInt(br.readLine());
			System.out.println("Entered Number -> " + num);
		} catch(IOException ioe){
			System.out.println("Issue -> " + ioe);
		} catch(NumberFormatException noe){
			System.out.println("Please Enter Integer value.");
			System.out.println("Issue -> " + noe);
		} finally{
			System.out.print("Successfully Executed");
		}
	}
}