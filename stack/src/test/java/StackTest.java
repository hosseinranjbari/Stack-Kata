import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StackTest {
    MyStack myStack;

    @BeforeEach
    public void init() {
        myStack = new MyStack(5);
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

    @Test
    void when_pushed_passed_limit_should_throw_stack_overflow_exception() {
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        myStack.push("D");
        myStack.push("E");

        assertThatExceptionOfType(StackOverflowException.class)
                .isThrownBy(() -> myStack.push("F"));


    }
}
