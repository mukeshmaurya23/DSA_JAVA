public class Demo {
    public static void main(String[] args) {

    }
}

class phone {
    void call() {
        System.out.println("Calling...");
    }

    void message() {
        System.out.println("Sending message...");
    }

}

class smartphone extends phone {
    void internet() {
        System.out.println("Browsing internet...");
    }

    void camera() {
        System.out.println("Taking picture...");
    }
}