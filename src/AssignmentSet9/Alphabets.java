package AssignmentSet9;
import java.util.ArrayDeque;
import java.util.Deque;

public class Alphabets {
	public static Deque<Character> updateStack(Deque<Character> inputStack) {
		//Implement your logic here and change the return statement accordingly
		int count = 0;
		while  (count != 3) {
			Character moving = inputStack.removeLast();
			inputStack.addFirst(moving);
			count++;
		}
		return inputStack;
	}
	
	public static void main(String[] args) {
		
		Deque<Character> inputStack = new ArrayDeque<Character>();
		inputStack.push('E');
		inputStack.push('D');
		inputStack.push('C');
		inputStack.push('B');
		inputStack.push('A');
		
		Deque<Character> resultStack = updateStack(inputStack);
		
		System.out.println("The alphabets in updated stack are:");
		for(Character alphabet: resultStack)
		    System.out.println(alphabet);
	}
}
