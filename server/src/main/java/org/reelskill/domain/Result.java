package org.reelskill.domain;

import java.util.ArrayList;
import java.util.List;

public class Result<T> {

    private ResultType type = ResultType.SUCCESS;
    private T payload;
    private final ArrayList<String> messages = new ArrayList<>();

    public boolean isSuccess(){
        return type == ResultType.SUCCESS;
    }

    public ResultType getType() {
        return type;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    public List<String> getMessages() {
        return new ArrayList<>(messages);
    }

    public void addMessage(String message, ResultType type) {
        messages.add(message);
        this.type = type;
    }
}
