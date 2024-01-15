import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private final List<String> stackElements;

    public MyStack() {
        stackElements = new ArrayList<>();
    }

    public int getSize() {
        return stackElements.size();
    }

    public void push(String newElement) {
        stackElements.add(newElement);

    }

    public void pop() {
        stackElements.remove(getSize() - 1);
    }
}

