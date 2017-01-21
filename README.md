## Exercise: HelloWorld (8 Points)


_**Note** that all assignments must be able to run in the lab. If you do your assignment from home then it must run as if it was done in the lab. Assignments that are not compatible receive no credit and you will not be allowed to resubmit. Please test your code in the lab before submitting it._

The project name of this exercise is **HelloWorld**.

This is your first assignment and this assignment's purpose is to give you some practice using the tools that we will be involved with all semester. This exercise should help you adapt to the class' workflow.

The **first thing you should do** is read the BitBucket repository titled "[How to Start Every Project in this Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToStartEveryProject.md)".

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
 * 1. What is the name of the source file that you wrote?
 *
 * 2. What version of Java are we using? (Hint: Look after the item called JRE System Library)
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

Once you've completed this you can go on and answer the following questions in the header comment. Answer the questions in that block. **Please don't forget to answer thes questions!** 

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

Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **pull request** in the class BitBucket repository. This action will indicate to the original project that you have finished your coding and it will create a place to give feedback on a line by line basis. 

Go to **your** repository for this assignment on BitBucket and click on the **Create pull request** icon. You should see something similar to this picture:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/create-pull-request.png" width="207" height="207" />

1\. Select **master**

The next screen then shows the source and destination of the pull request. Your code is the source and is listed at the top. The destination is the original project that you forked from. The only thing to do on this screen is to select the **master** branch for your project. When you first come to this screen you should see the following:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-screen-first.png" width="600" height="250" />

2\. Select **Select Branch** you should see something like this:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-master.png" width="600" height="250" />

3\. Select **master** 

4\. Press the **Continue** button.

This screen should look like this at the top:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-description.png" width="514" height="325" />

5\. Click on **Create**

After selecting **Create**, you code should build and be tested within a minute or so. If the test is successfull you will see something similar to the following screen:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-submitted.png" width="740" height="350" />

Notice the part on the right hand of the screen that says **3 builds**. If the icon is green your good, if it failed, it will be red. **Note** This one says 3 builds, it might say another number. The important thing is whether it is green or red.

This final action "_turns_" in the assignment on BitBucket. It also causes your code to be unit tested on a separate server. The result should be exactly the same as when you ran it on your computer.

After grading the exercise, the pull request will be closed without merging back into the original project. This is the normal workflow and does not represent any problem with your code.

Finally, you should receive an email that has links to both the pull request and the results of running your code.

**NOTE** You do not need to anything on Canvas to turn-in your assignment, but your grade will be posted on there so that you mab track your progress throughout the term.
