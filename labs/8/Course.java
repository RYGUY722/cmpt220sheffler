import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList students=new ArrayList();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        numberOfStudents=0;
    }

    public void addStudent(String s) {
    	numberOfStudents++;
//        if (numberOfStudents >= students.length) {
//            String[] temp = new String[students.length + 1];
//            for(int x=0;x<students.length;x++) {
//            	temp[x]=students[x];
//            }
//            students=temp.clone();
//        }
//        students[numberOfStudents-1] = s;
//        System.out.println("Added "+students[numberOfStudents-1]);
    	students.add(s);
    	System.out.println("Added "+students.get(numberOfStudents-1));
    }

    public String[] getStudents() {
    	String trunstudents[]=new String[numberOfStudents-1];
        students.toArray(trunstudents);
        return trunstudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
//    	for(int x=0;x<students.length;x++) {
//    		if(student.equals(students[x])) {
//    			System.out.println("Removed "+students[x]);
//    			students[x]="";
//    			numberOfStudents--;
//    		}
//    	}
    	students.remove(student);
    }
    public void clear() {
    	students.clear();;
    	numberOfStudents=0;
    }
}
