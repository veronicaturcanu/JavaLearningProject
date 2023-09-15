package md.tekwill.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "Execute git stash in the console";
        String step2 = "Perform git checkout master - to move to the local master branch";
        String step3 = "Execute git fetch command - to see if the are any changes on remote/origin";
        String step4 = "Execute git pull - this will download the latest changes from origin/master to local master";
        String step5 = "Execute git branch New_Branch_Name command to create a new branch that is same as local master";
        String step6 = "Perform git checkout New_Branch_Name - as result, we are redirected to the newly created branch";
        String step7 = "Add the task related changes in the solution";
        String step8 = "Execute git commit command from the Intellij Idea to sore the changes at a local level - on the current branch";
        String step9 = "Execute git push from Intellij Idea panel - as result, a new remote branch is created with origin/New_Branch_Name";
        String step10 = "Create a pull request from new origin/New_Branch_Name into master";
        String step11= "Add the pull request details like name, description and reviewers";
        String step12 = "If we collect at least one approval then we can merge the changes and continue with another task";
        String step13 = "If someone asks for changes then we should open the project and make sure that we are on the same New_Branch_Name";
        String step14 = "Change the requested line code";
        String step15 = "Perform a git commit amend to change the latest executed commit by adding your requested changes";
        String step16 = "Perform a git force push to update the status of pull request";
        String step17 = "Do not forget that locally you are still on the New_Name_Branch";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
        System.out.println(step16);
        System.out.println(step17);
    }
}
