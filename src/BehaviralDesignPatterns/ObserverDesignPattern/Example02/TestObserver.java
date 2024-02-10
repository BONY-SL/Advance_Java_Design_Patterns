package BehaviralDesignPatterns.ObserverDesignPattern.Example02;

public class TestObserver {

    public static void main(String[] args) {

        //create subject
        MyTopic topic = new MyTopic();

        //create observers
        ObserverE2 obj1 = new MyTopicSubscriber("Obj1");


        //register observers to the subject
        topic.register(obj1);

        //attach observer to subject
        obj1.setSubject(topic);


        //check if any update is available
        obj1.updateE2();

        //now send message to subject
        topic.postMessage("Create Obj1 One");


        topic.unregister(obj1);
    }
}
