import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

// JA: This should write to the same file
public class prb1211 {
	public static void main(String[] args) throws Exception {
		if (args.length !=2) {
			System.out.println("Incorrect or missing argument(s)");
			System.exit(1);}	
		{
			File myfile=new File(args[1]);
			Scanner finput=new Scanner(myfile);
			String remove=args[0];
			System.out.println("File: "+args[1]+myfile.getName()+"\nWord: "+args[0]+remove);
			System.out.println(finput.nextLine());
			try(PrintWriter newf=new PrintWriter(new File("revised"+myfile.getName()+".txt"));){
				while(finput.hasNext()) {
					String nextline=finput.nextLine();
					System.out.println(nextline);
					String words[]=nextline.split(" ");
					for(int x=0;x<words.length;x++) {
						if(!(remove.equals(words[x]))) {
							newf.write(words[x]+" ");
						}
					}
					newf.println();
				}
			}
		}
	}
}
