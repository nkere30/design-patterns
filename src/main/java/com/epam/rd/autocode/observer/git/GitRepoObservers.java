package com.epam.rd.autocode.observer.git;

public class GitRepoObservers {
    public static Repository newRepository(){
        return new RepositoryImplementation();
    }

    public static WebHook mergeToBranchWebHook(String branchName){
        return new MergeToBranchWebHookImplementation(branchName);
    }

    public static WebHook commitToBranchWebHook(String branchName){
        return new CommitToBranchWebHookImplementation(branchName);
    }
}
