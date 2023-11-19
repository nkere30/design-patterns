package com.epam.rd.autocode.observer.git;

import java.util.ArrayList;
import java.util.List;

public class MergeToBranchWebHookImplementation implements WebHook{
    private String branchName;
    private List<Event> eventList;

    public MergeToBranchWebHookImplementation(String branchName) {
        this.branchName = branchName;
        eventList = new ArrayList<>();
    }
    @Override
    public String branch() {
        return branchName;
    }

    @Override
    public Event.Type type() {
        return Event.Type.MERGE;
    }

    @Override
    public List<Event> caughtEvents() {
        return eventList;
    }

    @Override
    public void onEvent(Event event) {
        if (event.type().equals(Event.Type.MERGE) && event.branch().equals(branchName)) {
            eventList.add(event);
        }
    }
}
