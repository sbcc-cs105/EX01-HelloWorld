## Exercise: edu.vcccd.vc.csv40.HelloWorld (8 Points)


_**Note:** All assignments must be able to run in the SBCC Computer lab. If you do your assignment from home then you must verify that it will work in the lab. Assignments that do not run in the SBCC Computer lab will potentially receive no credit and you will not be allowed to resubmit. Please test your code in the lab before submitting it._
,
The project name of this exercise is **edu.vcccd.vc.csv40.HelloWorld**.

This is your first assignment and this assignment's purpose is to give you some practice using the tools that we will use all semester. This exercise should help you adapt to the class' _workflow_.

The **first thing you should do** is read the BitBucket repository titled "[How to Start Every Project in this Class](http://209.129.49.15:7990/projects/CS105/repos/allan.knight/browse/HowToStartEveryProject.md)".

After you have read that page, follow the instructions. The **ProjectName** mentioned on the page is called **edu.vcccd.vc.csv40.HelloWorld** for this assignment. All assignments start with a sentence giving you the name of the project. You can see this above in bold text.

Once you have followed the instructions shown on the "How to Start Every Project in this Class" web page you should have a file called **edu.vcccd.vc.csv40.HelloWorld.java**. Replace all of the code present in that file with the code shown below.

  
```java
package edu.vcccd.vc.cs40;

/**
 * CS V40 Beginning Java
 * Assignment: edu.vcccd.vc.csv40.HelloWorld
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 *
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
public class edu.vcccd.vc.csv40.HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```  

You can simply copy the code from the grey box and paste it into the **edu.vcccd.vc.csv40.HelloWorld.java** file. Save it. Now run the file by choosing **Run -> Run** in Eclipse. This notation means to go to the Eclipse **Run** menu and select the item called **Run**. You should see an output, in the console window at he botom of Eclipse, that says "Hello, World!".

Once you've completed this you can go on and answer the following questions in the header comment. Answer the questions in that block. **Please don't forget to answer these questions!** 

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to BitBucket. Once you've completed this step your code will be on BitBucket in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...**. You should see the following dialog:

![Commit dialogue](https://www.dropbox.com/s/lojod76ghyzl626/commit-git.png?dl=1)

Now follow these steps to commit and push your code:

1. Select the files by check marking the files you want to commit. In this case **edu.vcccd.vc.csv40.HelloWorld.java**. 
2. Enter a commit message. The commit message can be anything, but should describe the changes that are begin committed. A good commit message in this case might be "Committing code to check in for assignment"
3. Press **Commit and Push**

You will see a few more dialogs (including ones that may ask for your BitBucket username and password) go by and then you will see something similar to the following:

![Push dialogue](https://www.dropbox.com/s/niao32p4abbx4k2/push-git.png?dl=1)

1. Push **OK** to complete the commit. You may get no confirmation, but you can check BitBucket to see if the code now exists there.

#### Completing the turn-in process

Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **pull request** in the class BitBucket repository. This action will indicate to the original project that you have finished your coding and it will create a place to give feedback on a line by line basis. 

Go to **your** repository or the repository for this assignment on BitBucket (the project you forked to create your project).

<img src="https://www.dropbox.com/s/p40wg00a72khhpv/create-pull-request.png?dl=1" width="207" height="207" />

1\. Click on the **Create pull request** icon. 

You should see something similar to this picture:


<img src="https://www.dropbox.com/s/rrgmvpc9wtfjqrr/pull-request-screen-first.png?dl=1" width="600" height="250" />

The next screen then shows the source and destination of the pull request. Your code is the source and is listed at the top. The destination is the original project that you forked from. The only thing to do on this screen is to select the **master** branch for your project. Once you select **Select Branch**, as directed below, you should see the following:

<img src="https://www.dropbox.com/s/r9cmia1ixppglko/pull-request-master.png?dl=1" width="600" height="250" />

2\. Select **Select Branch** you should see something like this:

3\. Select **master** 

4\. Press the **Continue** button.

Once you've followed these steps you should see this at the top:

<img src="https://www.dropbox.com/s/mglhiaeqd2qn72p/pull-request-description.png?dl=1" width="514" height="325" />

5\. Under **Title**, give the pull request a meaningful title. It's mostly for your benefit.

6\. Under **Description**, describe the purpose of this pull request. Usually it's just to submit the assignment. However, you can also use this field to let me know anything that might be wrong or different with your code.

7\. Finally, click on **Create**

After selecting **Create**, you code should build and be tested within a minute or so. If the test is successful you will see something similar to the following screen:

<img src="https://www.dropbox.com/s/sy4c82pi4glk5pu/pull-request-submitted.png?dl=1" width="740" height="350" />

Notice the part on the right hand of the screen that says **3 builds**. If the icon is green your good, if it failed, it will be red. **Note** This one says 3 builds, it might say another number. The important thing is whether it is green or red.

This final action "_turns_" in the assignment on BitBucket. It also causes your code to be unit tested on a separate server. The result should be exactly the same as when you ran it on your computer.

After grading the exercise, the pull request will be closed without merging back into the original project. This is the normal workflow and does not represent any problem with your code.

**NOTE** You do not need to anything on Canvas to turn-in your assignment, but your grade will be posted on there so that you can track your progress throughout the term.
