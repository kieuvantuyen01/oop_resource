public class Student {
    private String id;
    private String name;
    private String group;
    private String email;

    Student(String _name, String _id, String _group, String _email) {
        this.id = _id;
        this.name = _name;
        this.group = _group;
        this.email = _email;
    }

    Student(String _name, String _id, String _email) {
        this.id = _id;
        this.name = _name;
        this.group = "K62CB";
        this.email = _email;
    }

    Student() {
        this("000","Student","K62CB","uet@vnu.edu.vn");
    }

    Student(Student sv) {
        this(sv.name, sv.id, sv.group,sv.email);
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getGroup() {
        return group;
    }

    void setGroup(String group) {
        this.group = group;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    public String getInfo(){
        return name + " - " + id + " - " + group + " - " + email;
    }
}
