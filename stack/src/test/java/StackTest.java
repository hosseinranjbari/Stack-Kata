import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StackTest {
    MyStack myStack;

    @BeforeEach
    public void init() {
        myStack = new MyStack();
    }


    @Test
    void newly_created_stacks_should_be_empty() {
        assertThat(myStack.getSize()).isEqualTo(0);
    }

    @Test
    void after_one_push_stack_size_should_be_one() {
        myStack.push("A");

        assertThat(myStack.getSize()).isEqualTo(1);
    }

    @Test
    void after_one_push_and_one_pop_should_be_empty() {
        myStack.push("A");
        myStack.pop();

        assertThat(myStack.getSize()).isEqualTo(0);
    }
}
