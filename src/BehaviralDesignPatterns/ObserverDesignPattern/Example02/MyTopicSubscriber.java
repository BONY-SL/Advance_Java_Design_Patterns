package BehaviralDesignPatterns.ObserverDesignPattern.Example02;

public class MyTopicSubscriber implements ObserverE2{

    private String name;
    private SubjectE2 topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void updateE2() {
        String msg=(String) topic.getUpdate(this);

        if(msg==null){
            System.out.println(name + ":: No new message");
        }else{
            System.out.println(name + ":: Consuming message::" + msg);
        }
    }

    @Override
    public void setSubject(SubjectE2 sub) {
        this.topic=sub;
    }
}
