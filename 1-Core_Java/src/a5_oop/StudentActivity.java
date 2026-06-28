package a5_oop;

public interface StudentActivity {

    // Every interface variable is implicitly:
    // public static final
    int MAX_ATTENDANCE = 100;

    // Every interface method is implicitly:
    // public abstract
    void attendLecture();

    void submitAssignment();

}