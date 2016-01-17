##Exercise: HelloWorld (8 Points)


_**Note** that all assignments must be able to run in the lab. If you do your assignment from home then it must run as if it was done in the lab. Assignments that are not compatible receive no credit and you will not be allowed to resubmit. Please test your code in the lab before submitting it._

The project name of this exercise is **HelloWorld**.

This is your first assignment and this assignment's purpose is to give you some practice using the tools that we will be involved with all semester. This exercise should help you adapt to the class' workflow.

The **first thing you should do** is read the GitHub repository titled "[How to Start Every Project in this Class](https://github.com/sbcc-cs105-spring2016/HowToStartEveryProject)". You can find this page by looking on the class Moodle page, or going to the class [GitHub](https://github.com/sbcc-cs105-spring2016). It should be in the first block.

After you have read that page follow the instructions. The **ProjectName** mentioned on the page is called **HelloWorld** for this assignment. All assignments start with a sentence giving you the name of the project. You can see this above in the bolded word.

Once you have followed the instructions shown on the "How to Start Every Project in this Class" web page you should have a file called **Main.java**. Replace all of the code present in that file with the code shown below.

  
```java
package edu.sbcc.cs105;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, World");

	}
}
```  

You can simply copy the code from the grey box and paste it into the **Main.java** file. Save it. Now run the file by choosing **Run -> Run** in Eclipse. This notation means to go to the Eclipse **Run** menu and select the item called **Run**. You should see an output that says "Hello, World".

Once you've completed this you can go on and answer the following questions. Copy the questions from the block below into the space provided **in Moodle** and then fill in your answers after the questions. **Please don't just put the answers!**

1. What is the name of the source file that you wrote?


2. What version of Java are we using? (Hint: Look after the item called JRE System Library)

###How to turn in this exercise

The first step of turning in your code is to create a **pull request** in GitHub. This action will indicate to the original project that you have finished and create a place to give feedback on a line by line basis. 

Go to **your** repository for this assignment on GitHub and click on the **Pull Request** icon. You should see something similar to this picture:

<img src="https://www.dropbox.com/s/tt3rejkyd8xmxxm/EX02-pull-request.png?dl=1" width="661" height="175" />

1\. Click on **New pull request**

The next screen then shows all or your commits up to this point.  It shows the difference between what you originally forked with what you have committed. This difference, often called a "diff", is what your turning in and what I will be grading. 

This screen should look like this at the top:

<img src="https://www.dropbox.com/s/nxzenwey4fanmsz/EX02-create-pull-request.png?dl=1" width="661" height="171" />

2\. Click on **Create pull request**

This final action "_turns_" in the assignment on GitHub. It also causes your code to be unit tested on a separate server. The result should be exactly the same as when you ran it on your computer.

After grading the exercise, the pull request will be closed without merging back into the original project. This is the normal workflow and does not represent any problem with your code.

Finally, you should receive an email that has links to both the pull request and the results of running your code.

**NOTE** You do not need to anything on Moodle to turn-in your assignment, but your grade will be posted on there so that you mab track your progress throughout the term.
