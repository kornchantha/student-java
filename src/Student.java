import java.sql.SQLOutput;
import java.util.Arrays;

public class Student {
    String name;
    String address;
    int numCourse;
    int currentIndex;
    String [] course;
    double [] grade;


    public Student(String name, String address, int numCourse) {
        this.name = name;
        this.address = address;
        this.numCourse = numCourse;
        this.course = new String[numCourse];
       this.grade = new double[numCourse];
        this.currentIndex=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }
    public void addCourseGrade(String course , double grade){
       if(currentIndex<numCourse){
           this.course[currentIndex] = course;
           this.grade[currentIndex] = grade;
           currentIndex++;
       } else {
           System.out.println("Course is at limit");
       }


    }
    public void printGrade(){
        System.out.println("Name : "+ this.name);
        System.out.println("Address:"+this.address);
        System.out.println("numcourse:"+this.numCourse);
//        System.out.println("allcourse" + Arrays.toString(this.course));
       for (int i = 0; i<currentIndex; i++){
           System.out.println("Course "+i + ": "+this.course[i]+ ", Grade :"+ this.grade[i]);
       }
    }
}
