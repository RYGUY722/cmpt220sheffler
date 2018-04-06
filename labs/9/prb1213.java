import java.io.File;
import java.util.Scanner;

public class prb1213 {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("Missing argument");
			System.exit(1);}	
		{
			int chars=0;
			int words=0;
			int lines=0;
			File myfile=new File(args[0]);
			Scanner finput=new Scanner(myfile);
			while(finput.hasNext()) {
				String line=finput.nextLine();
				lines++;
				chars+=line.length();
				String allwords[]=line.split("[ -]");
				words+=allwords.length-1;
				System.out.println(allwords.length);
			}
			System.out.println("File "+myfile.getName()+" has \n"+
			chars+" characters \n"+
			words+" words \n"+
			lines+" lines");
		}
	}	

}
