public interface Teacher {
    public void teach();
}

//TODO implement teach()

public class CS50Teacher implements Teacher {
    @Override
    public void teach() {
        ...
    }
}

List<String> strings = new ArrayList<>();

//Lists in Java is actually an interface with a concrete class called Arraylist.