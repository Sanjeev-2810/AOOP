package Proj2;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String taskName;
    private String status;
    private List<Observer> observers;

    public Task(String taskName) {
        this.taskName = taskName;
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getStatus() {
        return status;
    }

    public String getTaskName() {
        return taskName;
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(taskName, status);
        }
    }
}
