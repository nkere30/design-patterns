package com.epam.rd.autocode.observer.git;

import java.util.ArrayList;
import java.util.List;

public class RepositoryImplementation implements Repository{
    private List<WebHook> webHookList;
    private List<Commit> commits;
    public RepositoryImplementation() {
        webHookList = new ArrayList<>();
        commits = new ArrayList<>();
    }
    @Override
    public void addWebHook(WebHook webHook) {
        webHookList.add(webHook);
    }

    @Override
    public Commit commit(String branch, String author, String[] changes) {
        Commit commit = new Commit(author, changes);
        commits.add(commit);
        Event event = new Event(Event.Type.COMMIT, branch, commits);
        updateObserversAboutEvent(event);
        return commit;
    }



    @Override
    public void merge(String sourceBranch, String targetBranch) {
        Event event = new Event(Event.Type.MERGE, targetBranch, new ArrayList<>());
        updateObserversAboutEvent(event);
    }

    private void updateObserversAboutEvent(Event event) {
        for (WebHook webHook : webHookList) {
            webHook.onEvent(event);
        }
    }
}
