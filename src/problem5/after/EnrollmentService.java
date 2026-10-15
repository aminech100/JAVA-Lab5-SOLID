package problem5.after;

public class EnrollmentService {
    private final StudentRepository store;
    private final Notifier notifier;

    public EnrollmentService(StudentRepository store, Notifier notifier) {
        this.store = store;
        this.notifier = notifier;
    }

    public void enroll(String cne, String name, String email) {
        if (cne == null || cne.isBlank())
            throw new IllegalArgumentException("CNE is required");
        if (store.exists(cne))
            throw new IllegalStateException("Already enrolled: " + cne);
        store.save(cne, name, email);
        notifier.notify(email, "Welcome " + name + ", you are enrolled.");
    }
}
