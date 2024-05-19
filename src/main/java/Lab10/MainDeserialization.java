package Lab10;

 import com.google.gson.Gson;
 import com.google.gson.reflect.TypeToken;
 import java.io.FileReader;
 import java.io.IOException;
 import java.lang.reflect.Type;
 import java.util.List;

public class MainDeserialization{
    public static void main(String[] args) {
        List<Student> students = readStudentsFromJson("src/main/java/students.json");
        if (students != null) {
            calculateAndPrintAverageGrades(students);
            findAndPrintStudentWithHighestAverage(students);
        }
    }

    private static List<Student> readStudentsFromJson(String filename) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(filename)) {
            Type studentListType = new TypeToken<List<Student>>() {}.getType();
            return gson.fromJson(reader, studentListType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void calculateAndPrintAverageGrades(List<Student> students) {
        for (Student student : students) {
            double average = student.getCourses().stream()
                    .mapToDouble(Course::getCourseGrade)
                    .average()
                    .orElse(0);
            System.out.printf("Average grade for %s: %.2f%n", student.getName(), average);
        }
    }

    private static void findAndPrintStudentWithHighestAverage(List<Student> students) {
        Student topStudent = null;
        double highestAverage = 0;

        for (Student student : students) {
            double average = student.getCourses().stream()
                    .mapToDouble(Course::getCourseGrade)
                    .average()
                    .orElse(0);

            if (average > highestAverage) {
                highestAverage = average;
                topStudent = student;
            }
        }

        if (topStudent != null) {
            System.out.printf("Student with the highest average grade: %s (%.2f)%n", topStudent.getName(), highestAverage);
        }
    }
}
