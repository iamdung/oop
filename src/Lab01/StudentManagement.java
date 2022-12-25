package Lab01;

import java.util.ArrayList;

public class StudentManagement {
    public static boolean sameGroup(Student s1, Student s2){
        if (s1.getGroup().equalsIgnoreCase(s2.getGroup())){
            return true;
        }else {
            return  false;
        }
    }
public ArrayList<Student> students = new ArrayList<>();

    public  void removeStudent(String id){
        for(Student student: this.students){
            if (student.getId().equalsIgnoreCase(id)) {
                students.remove(student);
                break;
            }
        }
    }
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.students.add(new Student("S1", "id1", "em1", "ABC1"));
        studentManagement.students.add(new Student("S2", "id2", "em2", "ABC1"));
        studentManagement.students.add(new Student("S3", "id3", "em3", "ABC2"));
        studentManagement.students.add(new Student("S4", "id4", "em4", "ABC3"));
        studentManagement.students.add(new Student("S5", "id5", "em5", "ABC3"));


        for (int i = 0; i < studentManagement.students.size() ; i++){
            boolean check = true;
            for (int k = 0;k <= i - 1; k++){
                if (sameGroup(studentManagement.students.get(i), studentManagement.students.get(k))){
                        check = false;
                        break;
                }
            }
            if (check){
                    System.out.println(studentManagement.students.get(i).getGroup());
                for (int k = i; k < studentManagement.students.size() ; k++ ){
                    if (sameGroup(studentManagement.students.get(i), studentManagement.students.get(k))){
                        System.out.println(studentManagement.students.get(k).getInfo());
                    }
                }
            }
            for(int x = i - 1; x < studentManagement.students.size();x++){
                studentManagement.students.set(x-1 , studentManagement.students.get(x));
                System.out.println(studentManagement.students.get(x).getInfo());
            }
        }
    }
}
