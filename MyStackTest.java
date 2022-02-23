import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyStackTest {
//    Creating a Stack of 56->30->70 using LinkedList
    @Test
    void given3NosWhenAddedToStackShouldHaveLastAddedNode() {
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        System.out.println(peak.getKey());
        Assert.assertEquals(myThirdNode, peak);
    }

//    Popping out topmost element from the stack
    @Test
    void given3NosWhenPoppedShouldMatchWithLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        System.out.println(myStack.peak().getKey());
        INode pop = myStack.pop();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, pop);
    }
}