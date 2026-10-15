package problem4.after;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("SAFI Amal");
        Professor professor = new Professor("KALLOUBI");
        TeachingAssistant assistant = new TeachingAssistant("ALAMI Samir");

        Registrar registrar = new Registrar();
        ExamBoard examBoard = new ExamBoard();

        List<Learner> learners = Arrays.asList(student, assistant);
        List<Teacher> teachers = Arrays.asList(professor, assistant);

        registrar.enrollAll(learners, "SE101");
        examBoard.collectGrades(teachers, "SE101");
    }
}