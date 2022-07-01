//Program to write read and exit
import java.io.*;
class FileReadWrite {
	public static void main(String args[]) throws IOException {
		Console c = System.console();
		while(true) {
			int op = Integer.parseInt(c.readLine("1.Write 2.Read 3.exit --> "));
			if(op==1) {
				String filename = c.readLine("Enter filename to read --> ");
				File f = new File(filename);
				if(f.exists()) {
					FileWriter fw = new FileWriter(f,true);		//true for append
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw);
					String data = c.readLine("Enter data --> ");
					//fw.write(data);
					pw.println(data);
					pw.close();
				} else {
					System.out.println("File not exists!");
				}
			} else if(op==2) {
				String filename = c.readLine("Enter filename to read --> ");
				File f = new File(filename);
				if(f.exists()) {
					FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					String data = br.readLine();
					while(data != null) {
						System.out.println(data);
						data = br.readLine();
					}
					br.close();
				} else {
					System.out.println("File not exists!");
				}		
			} else if(op ==3 ){
				break;
			} else {
				System.out.println("Invalid options!");
			}
		}
	}
}