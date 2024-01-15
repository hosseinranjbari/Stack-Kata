import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private final List<String> stackElements;
    private final int stackLimit;

    public MyStack(int stackLimit) {
        this.stackLimit = stackLimit;
        stackElements = new ArrayList<>();
    }

    public int getSize() {
        return stackElements.size();
    }

    public void push(String newElement) {
        if (getSize() < stackLimit) {
            stackElements.add(newElement);
        } else {
            throw new StackOverflowException("stack limit is " + stackLimit + " but you passed it!!!");
        }

    }

    public void pop() {
        stackElements.remove(getSize() - 1);
    }

    public int getStackLimit() {
        return stackLimit;
    }
}

