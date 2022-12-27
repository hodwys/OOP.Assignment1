# OOP.Assignment_1
 

 Observe is a design pattern in which the reference object holds a list of objects (in our case a Member) that depends on it (are linked to it) each of which is called an observer for it.
In our code we created an Array List of objects of type Member and later in the code we will see how they are linked to the reference object UndoableStringBuilder.
The reference object "notifies" its observers of changes occurring in it, such as a parameter value change, usually by calling one of their functions.
In order to implement the observer, we have built a function to add and remove members (observers) from the Array List.
After that, we will want to update every operation done in our reference object, for example if any insertion was made in the UndoableStringBuilder, we will want to update all the Members as follows:
We run in a loop and update every object of type Member found in the members Array List we defined.
The update is done using the update function that belongs to the interface Member.
We can think of an example that explains the implementation of the design pattern in our case. For example, the YouTube application - when a certain singer uploads a new video to his YouTube page - the subscribers who follow him are updated. It is very similar to our case, every change made in UndoableStringBuilder will be notified to all members.
