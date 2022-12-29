# OOP.Assignment1
 
Observe is pattern type in which the refrenced object holds a list of other objects(in our code a Member objects) that is dependent and related to the observerable type. The observable type keeps updating it's data and each of the updates goes to a notification for the observers. (A follow example below in line 13).

In our code we created an Array List of objects of type Member and later in the code we will see how they are linked to the reference object UndoableStringBuilder.
The reference object "notifies" its observers of changes occurring in it, such as a parameter value change, usually by calling one of its functions.
In order to implement the observer, we have built a function to add and remove members (observers) from the Array List.
After that, we will want to update every operation done in our reference object, for example if any insertion was made in the UndoableStringBuilder, we will want to update all the Members as follows:
We run in a loop and update every object of type Member found in the members Array List we defined.
The update is done using the update function that belongs to the interface Member.
We can think of an example that explains the implementation of the design pattern in our case.

For example, the YouTube application - when a certain singer uploads a new video to his YouTube page - the subscribers who follow him are updated. It is very similar to our case, every change made in UndoableStringBuilder will be notified to all members.

Running our program is done by downloading the files to an empty folder an extract it's files from zip folder. 
After opening the JAVA IDE, you can creat a new GroupAdmin object using-->> <new GroupAdmin NAME_OF_GROUP = new GroupAdmin> 
Likewise creating a ConcreteMember. To register a new member use the "register" method --> NAME_OF_GROUP.register<Member Object>
In the same way you can unregister a member by the "unregister" method. Each of an update of the UndoableStringBuilder object will be automatically updated in the member's data field. 
 
Appended to the projects is our Tests file. We created in it the GroupAdmin and the Member objects, applied the UndoableStringBuilder function (such as remove, delete, appdend and ect..) and using the <logger.info> methods to see the changes in the memory and size of each object in the memory. 
