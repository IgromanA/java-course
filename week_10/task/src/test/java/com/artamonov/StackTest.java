package com.artamonov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    void testPushAndPop() {
        Stack<Integer> stack = new GenerateStack<>();
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    void testPeek() {
        Stack<String> stack = new GenerateStack<>();
        stack.push("Hello");
        stack.push("World");
        assertEquals("World", stack.peek());
        assertEquals("World", stack.pop());
    }

    @Test
    void testIsEmpty() {
        Stack<Double> stack = new GenerateStack<>();
        assertTrue(stack.isEmpty());
        stack.push(3.14);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testSize() {
        Stack<Integer> stack = new GenerateStack<>();
        assertEquals(0, stack.size());
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
    }

    @Test
    void testPopEmptyStackThrowsException() {
        Stack<Integer> stack = new GenerateStack<>();
        assertThrows(IllegalStateException.class, stack::pop);
    }
}
