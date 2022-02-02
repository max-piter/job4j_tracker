package ru.job4j.tracker;

public class ExitAction implements UserAction {

    private  Output out;

    public ExitAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        try {
            tracker.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
