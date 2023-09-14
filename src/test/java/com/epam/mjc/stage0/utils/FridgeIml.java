package com.epam.mjc.stage0.utils;

import java.util.LinkedList;

public class FridgeIml implements Fridge {

    private final LinkedList<Actions> actionsQueue = new LinkedList<>();

    @Override
    public void open() {
        actionsQueue.add(Actions.OPEN);
    }

    @Override
    public void getMilk() {
        actionsQueue.add(Actions.GET_MILK);
    }

    @Override
    public void openDoor() {

    }

    @Override
    public boolean hasMilk() {
        return false;
    }

    @Override
    public void takeMilk() {

    }

    @Override
    public void closeDoor() {

    }

    @Override
    public void close() {
        actionsQueue.add(Actions.CLOSE);
    }

    public LinkedList<Actions> getActionsQueue() {
        return actionsQueue;
    }

    public enum Actions {
        OPEN,
        CLOSE,
        GET_MILK
    }
}
