# Sort-Manager-Project

## how to import/use the project
Step-1. click the green code button at the repository.

Step-2. clone the project using the URL or Open with GitHub Desktop.

Step-3. When you run the project you will be asked which sort you would like to use please enter the as shown: "Merge Sort"  "Bubble Sort"  "Binary Tree Sort"

Step-4. once this is done the code will genertae a random array and print it the sort it and print it again now sorted along with the time it took.

## Phase 1
Write a program which will take an array of ints and sort it using a bubble sort algorithm and then a merge sort algorithm.

Classes made for this Phase: BubbleSort and MergeSort.

## Phase 2
Update your project to use MVC and start to incorporate some of the design principles discussed earlier in the course (OOP, SOLID, design patterns). 
Create classes which implements MVC, including SortManager (controller) and a DisplayManager (view) classes. 
The code should include a basic factory pattern to determine which sorter to use. Make sure packages are created properly and the structure follows the MVC pattern. 
Create an interface which both sort classes can implement and make sure your application uses this interface where possible.

Classes mode for this phase: SortController, SortView and names of other classes changed to suit pattern

## Phase 3
Add logging code into the Sort Manager project. Set up log4j in the project and add a properties file. 
Create logs at different levels and fully test the resulting output. Have output going to the console and to a log file created in the resources directory.
Ensure there are meaningful log messages added to the project and that they reflect the needs of the levels for which they are set.

no classes were created here but logging was added to all previously mentioned classes.

## Phase 4
Integrate a new class to implement a binary search tree approach for sorting, so that the BST can be called in the same way as the other sort algorithms.
The new class should implement the current Sorter interface. Add code that calls the BST and passes in the array that will be used to construct the tree and then return a sorted array. Use the Facade design pattern for this step and implement a nested class to represent a node in the tree.

Classes created for this phase: BinaryTreeModel

## Phase 5
Add timing information to the project and allow the user to select multiple algorithms to compare their performance.

no new classes added for this phase. timing addded to all sort methods. testing added.





