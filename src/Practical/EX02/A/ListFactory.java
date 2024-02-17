package Practical.EX02.A;

public class ListFactory {

    public List getList(String listName){

        if(listName==null){
            return null;
        } else if (listName.equalsIgnoreCase("MyList")) {
            return new MyList();
        }else if(listName.equalsIgnoreCase("LinkedList")){
            return new LinkedList();
        } else if (listName.equalsIgnoreCase("ArrayList")) {
            return new ArrayList();
        }else {
            return null;
        }
    }
}
