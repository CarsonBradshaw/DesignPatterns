package proxy;

import proxy.virtual.Subject;

public class App {
    public static void main(String[] args) {
        Subject subjectUsed = SubjectFactory.getSubject();
        Subject subjectNotUsed = SubjectFactory.getSubject();

        subjectUsed.request();
    }
}
