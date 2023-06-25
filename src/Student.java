public class Student {
    private String name;
    private int age;
    private String id;
    private String grade;
    private String teacher;
    private boolean studying;


    public Student(String name, int age, String id, String grade, String teacher, Boolean studying) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.teacher = teacher;
        this.studying = studying;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.name = teacher;
    }
}
