
public class prb109 {
	public static void main(String[] args) {
		Course c1=new Course("Captain 101");
		c1.addStudent("James Kirk");
		c1.addStudent("Jean-Luc Picard");
		c1.addStudent("Benjamin Sisko");
		c1.dropStudent("James Kirk");
		String stulist[]=c1.getStudents().clone();
		for(int x=0;x<stulist.length;x++) {
			System.out.println(stulist[x]);
		}
	}

}
