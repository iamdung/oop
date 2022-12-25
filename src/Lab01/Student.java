package Lab01;

public class Student {
    private String name, id, group, email;


    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getInfo(){
       return "Name: "+ this.name+ "\nId: "+ this.id+ "\nGroup: "+ this.group+ "\nEmail: "+ this.email;
    }
    public Student(){
        this.name = "Student";
        this.id = "000";
        this.email = "uet@vnu.edu.vn";
        this.group = "K59CB";

    };
    public Student(String name, String id, String email, String group){
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group;
    }

    public Student(Student s){
        this.name = s.getName() ;
        this.id = s.getId() ;
        this.email = s.getEmail();
        this.group = s.getGroup();
    }
//    public  boolean sameGroup(Student s1){
//        if (this.getGroup().equalsIgnoreCase(s1.getGroup())){
//            return true;
//        }else {
//            return  false;
//        }
//    }
}

