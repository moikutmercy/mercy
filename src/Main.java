import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            Student student1 = new Student("Beryl Dande", 20, "S001", "8", "Mr Kariuki",false);

            Student student2 = new Student("Edna Dee", 19, "S002", "5", "Mrs Lorna",true);

            Student student3 = new Student("Fefi", 26, "S003", "12", "Mr Barbie",true);

            Student student4 = new Student("Edidan", 23, "S004", "10", "Mrs Mickey",true);



            List<Student> students = new ArrayList<>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student4);

            String json = new Gson().toJson(students);
            System.out.println(json);

        }
    }