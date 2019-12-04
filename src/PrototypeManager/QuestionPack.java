package PrototypeManager;

public class QuestionPack {
	//Easy question for ProgFund
	 public static String[][][] PFeasyPack = {
		 {{"Which of the following is NOT a type of algorithm?"},{"Program","Flowchart","Decision Table","Pseucode"}},
		 {{"The symbol that represents comments in a flowchart is"},{"A procedure symbol","An annotation symbol","A flow line","A subroutine"}},
		 {{"____________ represent algorithms that involve complex decision-making."},{"Flowcharts","Decision Table","Programs","Pseucode"}},
		 {{"How would you declare a variable to store the gender of a person?"},{"Character nGender","String sGender","Character cGender","Numeric nGender"}},
		 {{"In the following expression z = x + y x and y are called:"},{"Operators","Values","Operands","Literals"}}
	 };
	 public static int[] PFezRightPack = {0, 1, 1, 2, 2};
	 
	 //Medium question for ProgFund
	 public static String[][][] PFmedPack = {
		 {{"Which operators are used to test the relationship between two variables or between a variable and a constant?"},{"Arithmetic operators","Logical operators","Relational operators","Special operators"}},
		 {{"Which of the following is a logical operator?"},{"<=","And","()","+"}},
		 {{"Which of the following is/are relational operator?"},{"=","!=","<=","All of the above"}},
		 {{"If x=2 NOT x=3 will result in:"},{"False","True","Runtime error","Undefined"}},
		 {{"Which operator has the highest precedence level?"},{"()","!","*","%"}}
	 };
	 public static int[] PFmedRightPack = {2, 1, 3, 1, 0};
	 
	 //Hard question for ProgFund
	 public static String[][][] PFhardPack = {
		 {{"Is the following statement true or false? Statement: if constructs and switch...case constructs are decision-making constructs"},{"False","True","Runtime error","Undefined"}},
		 {{"Is the following statement true or false? Statement: The switch construct consists one case statement, a number of switch instructs, and a default statement"},{"False","True","Runtime error","Undefined"}},
		 {{"If an expression contains an addition operator, a less than operator, and a subtraction operator, which operator has a higher priority when evaluating the expression?"},{"Additional operator","Subtraction operator","Less than operator","None of the above"}},
		 {{"The part of a decision table in which all the conditions, based on which a decision is made, are wtitten is:"},{"Condition Stub","Condition Applied","Action Taken","Action Stub"}},
		 {{"The accept keyword in a pseudocode is similar to the _____________ symbol in a flowchart."},{"Output","Input","Subroutine","Decision"}}
	 };
	 public static int[] PFhardRightPack = {1, 0, 0, 0, 1};
		 
	 //Easy questions for ObjOriented
	 public static String[][][] ObjOeasyPack = {
			 {{"What are the main features of OOP?"},{"Encapsulation","Polymorphism","Inheritance","All of the above"}},
			 {{"An _______ cannot provide any code at all, can provide only the signature."},{"Interface","Abstract Class","String","Text"}},
			 {{"Which of the following is not a part of OOP?"},{"Polymorphism","Information Hiding","Multitasking","Type checking"}},
			 {{"Constructors are used to:"},{"To create a subclass","To build a user interface","Free memory","Initialized a newly created object"}},
			 {{"Pick the terms that relates to Polymorphism:"},{"Dynamic Allocation","Static Typing","Static Allocation","Dynamic Binding"}}
		 };
	 public static int[] ObjOezRightPack = {3, 0, 2, 3, 3};
	 
	 //Medium questions for ObjOriented
	 public static String[][][] ObjOmedPack = {
		 {{"What is the purpose of inheritance?"},{"None","Initialize Object","Code Reuse","Override Method"}},
		 {{"Can objects of abstract classes be instantiated?"},{"False","True","Runtime error","Undefined"}},
		 {{"Information Hiding can also be termed as:"},{"Encapsulation","Polymorphism","Routing","Traversal"}},
		 {{"What modifiers are allowed for methods in an Interface? (choose one or more answers)"},{"Private","Abstract","Public","Abstract and Public"}},
		 {{"Two or more methods with the same name in the same class with different arguments are called:"},{"Method overriding","Method overloading","Method hiding","Method revealing"}}
	 };
	 public static int[] ObjOmedRightPack = {2, 0, 0, 3, 1};
	 
	//Hard question for ObjOriented
	public static String[][][] ObjOhardPack = {
			 {{"When sub class declares a method that has the same type arguments as a method declared by one of its superclasses, it is termed as:"},{"Method overloading","Operator overloading","Operator overriding","Method overriding"}},
			 {{"The process by which one object can acquire the properties of another object:"},{"Inheritance","Polymorphism","Encapsulation","None"}},
			 {{"Keyword which is used to access the method or member variables from the superclass:"},{"Is_a","Has_a","Super","Using"}},
			 {{"One or more function that has a different number of argument or different type of argument but all have the same return type is called as:"},{"Function overriding","Function deleting","Function overloading","Function creating"}},
			 {{"Method with the same name or different return type and difference in the parameters either in number or type is known as:"},{"Function overloading","Compile time overloading","Runtime overloading","Compile time overriding"}}
	};
	public static int[] ObjOhardRightPack = {3, 0, 2, 2, 1};
	 
	 //Easy Questions for Data Structures
	 public static String[][][] DataStructeasyPack = {
		 {{"What is the time complexity of bubble sort?"},{"O(n)","O(n^2)","O(log(n))","O(1)"}},
		 {{"What is time complexity for inserting data in an array?"},{"O(n)","O(n^2)","O(log(n))","O(1)"}},
		 {{"What is time complexity for accessing data in an array?"},{"O(n)","O(n^2)","O(log(n))","O(1)"}},
		 {{"What is time complexity for inserting data in a list?"},{"O(n)","O(n^2)","O(log(n))","O(1)"}},
		 {{"What is time complexity for accessing data in a list?"},{"O(n)","O(n^2)","O(log(n))","O(1)"}}
	 };
	 public static int[] DataStructezRightPack = {0, 0, 3, 3, 0};
	 
	 
	//Medium Questions for Data Structures
	public static String[][][] DataStructmedPack = {
			 {{"What are the basic operations of Stack"},{"Pop","Push","Peek","All of the above"}},
			 {{"What are the basic operations of Queue"},{"Enqueue","Dequeue","Front and Rear","All of the above"}},
			 {{"What is the data structure's order of Stack?"},{"LIFO","FIFO","LOFI","FOFI"}},
			 {{"What is the data structure's order of Queue?"},{"LIFO","FIFO","LOFI","FOFI"}},
			 {{"Applications of Stack?"},{"Infix to Postfix Conversion using Stack","Evaluation of Postfix Expression","Reverse a String using Stack","All of the above"}}
	};
	public static int[] DataStructmedRightPack = {3, 3, 0, 1, 3};
	
	//Hard Questions for Data Structures
	public static String[][][] DataStructhardPack = {
			 {{"What are the various operations that can be performed on different Data Structures?"},{"Insertion","Compile","Override","Hiding"}},
			 {{"How many methods could be use to prevent collision for hash table"},{"Open addressing","Seperate Chaining","Both methods","Cannot prevent collision"}},
			 {{"When does the ArrayIndexOutOfBoundsException occur?"},{"Compile time","Runtime","Not an error","Not an exception at all"}},
			 {{"What type of ways could be used for Palindrome problem?"},{"Recursion","Search","Sort","Compare"}},
			 {{"What are the orders for binary tree"},{"postOrder","inOrder","preOrder","All of the orders"}}
	};
	public static int[] DataStructhardRightPack = {0, 2, 1, 0, 3};
}


 