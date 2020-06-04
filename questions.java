package com.example.user.quizquest;

public class questions {
public String mQuestions[]=
        {"Stack is a ?",
        "Postorder Traversal",
         "Inorder Traversal",
         "Which of the following is linear datatype",
         "Which of the following is Primitive datatype",
        "PreOrder Traversal?",
        "Postfix notation is also known as?",
        "Best Case of Quick Sort",
        "Which of the following application makes use of a circular linked list?",
        "Which is not a DFS traversal",
        "Degree of a leaf node",
        "Value of 6,3,1,*,-",
        "Worst case of BubbleSort",
        "Recursion can’t be used for",
        "BST",
        "Not a Binary tree?",
        "Height of tree=2\n" +
        "Degree of root?\n",
        "In A Linked List (head==NULL )or( start==NULL) indicates_____.",
        "Prefix notation is also known as?",
        "Not a tree traversal",
        "strcmp(Cat,cat)=?",
        "Which sorting algorithm uses divide and conquer?",
        "The essential condition which is checked before deletion in a linked STACK is?",
        "Best cases of RadixSort",
        "What is the value of the postfix expression ab*cd*- when a=2,b=5,c=7,d=3",
        "Queue is___data Structure",
        "Insertion of an element into stack  is____?",
        "Adding an element to the Queue?",
        "The no.of nodes that Binary tree can has____?",
        "Which of the following sorting algorithms can be used to sort a random linked list with minimum time complexity?",
        "In linked list implementation of queue, if only front pointer is maintained, which of the following is worst case linear time?",
        "In linked list implementation of a queue, where does a new element be inserted?",
        "In linked list implementation of a queue, from where is the item deleted?",
        "Which of these is an application of linked lists?",
        "Which data structure is appropriate to store patients in an emergency room?",
        "New nodes are added to the ……… of the queue.",
        "Which of the following name does not relate to stacks?",
        };
private String mChoices[][]={
        {"NonLinear DataStructure","Linear DataStructure","Both","None"},
        {"Left,Right,Root","Root,Right,Left","Left,Root,Right","Root,Left,Right"},
        {"Left,Right,Root","Root,Right,Left","Left,Root,Right","Root,Left,Right"},
        {"graph","tree","linked list","doesnt exist"},
        {"structure","File","uninon","pointer"},
        {"Left,Right,Root","Root,Right,Left","Left,Right,Root","Root,Left,Right"},
        {"ReversePolish Notation","Polish Notation","Both","None"},
        {"0(logn)","0(n2logn)","0(nlogn)","0(n)"},
        {"Recursive function calls","Undo operation in a text editor","Allocating CPU to resources","All of these"},
        {"PreOrder","Level order","PostOrder","InOrder"},
        {"0","1","2","3"},
        {"-12","-3","3","12"},
        {"O(n2)","O(n)","O(logn)","O(n-1)"},
        {"LOT traversal","Finding if a no.Is prime or not","Finding factorial","None of the following"},
        {"Busy Sub Tree","Binary Search Tree","Binary Sort Technique","Binary Sort Tree"},
        {"GST","Full Tree","Complete Tree","BST"},
        {"Depends","more than 0","less than 0","0"},
        {" None of it","Linked List empty"," Linked List half fillled","Linked List Full"},
        {"Both","ReversePolish Notation","None","Polish Notation"},
        {"DFS","LOT","Inorder traversal","BST"},
        {"0","greater than 0","less than 0","Not Defined"},
        {"Merge Sort","Insertion Sort","Radix Sort","None of the above"},
        {"At the tail of the link list","At the centre position in the link list","None","At the head or start of link list"},
        {"O(n/k)","O(n*k)","O(n+k)","O(n-k)"},
        {"11","3","-3","-11"},
        {"Linear","Nonlinear","both","none"},
        {"push","pop","Enqueue","Dequeue"},
        {"push","pop","Enqueue","Dequeue"},
        {"0,2,3","0,1","0,1,2","2"},
        {"Insertion Sort", "Quick Sort", "Heap Sort", "Merge Sort"},
        {"Insertion", "Deletion", "To empty a queue" ,"Both a and c"},
        {"At the head of link list"," At the centre position in the link list", "At the tail of the link list","None of the mentioned"},
        {"At the head of link list" ,"At the centre position in the link list" ,"At the tail of the link list","None of the mentioned"},
        {"To implement file systems","For separate chaining in hash-tables","To implement non-binary trees","All of the mentioned"},
        {"Stack","Queue","Priority Queue","Linked List"},
        {"Front","Back","Middle","Both A and B"},
        {"FIFO lists","LIFO lists","Piles","Push down lists"},
        };


private String mCorrectAnswers[]={
        "Linear DataStructure",
        "Left,Right,Root",
        "Left,Root,Right",
        "linked list",
        "pointer",
        "Root,Left,Right",
        "ReversePolish Notation",
        "0(nlogn)",
        "Allocating CPU to resources",
        "Level order",
        "0",
        "3",
        "O(n2)",
        "None of the following",
        "Binary Search Tree",
        "GST",
        "more than 0",
        "Linked List empty",
        "Polish Notation",
        "BST",
        "less than 0",
        "Merge Sort",
        "At the head or start of link list",
        "O(n*k)",
        "-11",
        "Linear",
        "push",
        "Enqueue",
        "0,1,2",
        "Merge Sort",
        "Both a and c",
        "At the tail of the link list",
        "At the head of link list",
        "All of the mentioned",
        "Priority Queue",
        "Back",
        "FIFO lists"
        };

public String getQuestion(int a){
        String question=mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice=mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice=mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice=mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice=mChoices[a][3];
        return choice;
    }

    public  String getCorrectAnswer(int a){
        String answer=mCorrectAnswers[a];
        return answer;
    }


}
