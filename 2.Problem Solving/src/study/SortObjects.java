package study;
import java.util.*;

class Student{
   private int id;
   private String first_name;
   private double cgpa;
   public Student(int id, String first_name, double cgpa) {
      super();
      this.id = id;
      this.first_name = first_name;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFirst_name() {
      return first_name;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class SortObjects
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String first_name = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, first_name, cgpa);
         studentList.add(st);
         
         testCases--;
      }
       Collections.sort(studentList, new Comparator<Student>() {
              @Override
               public int compare(Student s1, Student s2) {
                    if(s2.getCgpa()>s1.getCgpa()){
                        return 1;
                    }else if(s2.getCgpa()<s1.getCgpa()){
                        return -1;
                    }
                    return s1.getFirst_name().compareTo(s2.getFirst_name());
                }
        });
      
         for(Student st: studentList){
         System.out.println(st.getFirst_name());
      }
   }
}

