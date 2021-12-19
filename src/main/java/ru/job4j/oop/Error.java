package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Active error: " + active);
        System.out.println("Error's status: " + status);
        System.out.println("Description: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error404 = new Error(true, 404, "Not Found");
        Error error502 = new Error(false, 502, "Bad Gateway");
        Error error408 = new Error(true, 408, "Request Timeout");

        error404.printInfo();
        error408.printInfo();
        error502.printInfo();
    }
}
