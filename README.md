## Exercise: HelloWorld (8 Points)


_**Note** that all assignments must be able to run in the lab. If you do your assignment from home then it must run as if it was done in the lab. Assignments that are not compatible receive no credit and you will not be allowed to resubmit. Please test your code in the lab before submitting it._

The project name of this exercise is **HelloWorld**.

This is your first assignment and this assignment's purpose is to give you some practice using the tools that we will be involved with all semester. This exercise should help you adapt to the class' workflow.

The **first thing you should do** is read the BitBucket repository titled "[How to Start Every Project in this Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToStartEveryProject.md)". You can find this page by looking on the class Moodle page, or going to the class [BitBucket](http://crowd.cs.sbcc.edu:7990/projects). It should be in the first block.

After you have read that page follow the instructions. The **ProjectName** mentioned on the page is called **HelloWorld** for this assignment. All assignments start with a sentence giving you the name of the project. You can see this above in the bolded word.

Once you have followed the instructions shown on the "How to Start Every Project in this Class" web page you should have a file called **HelloWorld.java**. Replace all of the code present in that file with the code shown below.

  
```java
package edu.sbcc.cs105;

/**
 * CS 105 Theory & Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: HelloWorld
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
public class HelloWorld {

    public static String helloWorld() {
        return "Hello, World!";
    }
    
    public static void main(String[] args) {
        System.out.println(helloWorld());
    }
}
```  

You can simply copy the code from the grey box and paste it into the **HelloWorld.java** file. Save it. Now run the file by choosing **Run -> Run** in Eclipse. This notation means to go to the Eclipse **Run** menu and select the item called **Run**. You should see an output that says "Hello, World".

Once you've completed this you can go on and answer the following questions. Copy the questions from the block below into the space provided **in Moodle** and then fill in your answers after the questions. **Please don't just put the answers!**

1. What is the name of the source file that you wrote?


2. What version of Java are we using? (Hint: Look after the item called JRE System Library)

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to BitBucket. Once you've completed this step your code will be on BitBucket in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...**. You should see the following dialog:

![Commit dialogue](https://www.dropbox.com/s/lojod76ghyzl626/commit-git.png?dl=1)

Now follow these steps to commit and push your code:

1. Select the files by check marking the files you want to commit. In this case **HelloWorld.java**. 
2. Enter a commit message. The commit message can be anything, but should describe the changes that are begin committed. A good commit message in this case might be "Committing code to check in for assignment"
3. Press **Commit and Push**

You will see a few more dialogs (including ones that may ask for your BitBucket username and password) go by and then you will see something similar to the following:

![Push dialogue](https://www.dropbox.com/s/niao32p4abbx4k2/push-git.png?dl=1)

1. Push **OK** to complete the commit. You may get no confirmation, but you can check BitBucket to see if the code now exists there.

#### Completing the turn-in process

Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **build plan** on Bamboo. This action will create a Bamboo build plan that will build and test your code everytime you push code to your project. You can also run builds manually

Follow the directions in [How to Turn in Every Project in This Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToTurnInEveryProjectInThisClass.md)

**NOTE** You do not need to anything on Canvas to turn-in your assignment, but your grade will be posted on there so that you may track your progress throughout the term.
