package IOPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferWriterwithtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileReader f = new FileReader("C:\\Users\\Mourya Raj\\Desktop\\dummy.txt");
				BufferedReader br = new BufferedReader(f);
				FileWriter fw=new FileWriter("C:\\Users\\Mourya Raj\\Desktop\\dummy2.txt");BufferedWriter bw=new BufferedWriter(fw);){
			
			
				bw.write(br.readLine());
		}catch(Exception e) {}
		
	}

}
