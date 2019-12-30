package StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class Repository {
    private Map<String, Student> storage;

    public Repository() {
        this.storage = new HashMap<>();
    }

    public boolean exists(String name){
        return this.storage.containsKey(name);
    }

    public Student getByName(String name){
        return this.storage.get(name);
    }

    public void save(Student student){
        storage.put(student.getName(), student);
    }
}
