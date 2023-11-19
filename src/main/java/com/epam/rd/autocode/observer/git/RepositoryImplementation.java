package com.epam.rd.autocode.observer.git;

import java.util.ArrayList;
import java.util.List;

public class RepositoryImplementation implements Repository{
    private List<WebHook> webHookList;
    public RepositoryImplementation() {
        webHookList = new ArrayList<>();
    }
    @Override
    public void addWebHook(WebHook webHook) {
        webHookList.add(webHook);
    }

    @Override
    public Commit commit(String branch, String author, String[] changes) {
        Commit commit = new Commit(author, changes);
        Event event = new Event(Event.Type.COMMIT, branch, List.of(commit));
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
