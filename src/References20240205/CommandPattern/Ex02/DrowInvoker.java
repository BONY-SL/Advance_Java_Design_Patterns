package References20240205.CommandPattern.Ex02;

import java.util.ArrayList;
import java.util.List;

public class DrowInvoker {

    private List<CommandDrow> commandDrowList=new ArrayList<CommandDrow>();

    public void addCommand(CommandDrow c){
        commandDrowList.add(c);
    }

    public void executeCommands(){
        for(CommandDrow c:commandDrowList){
            c.execute();
        }
    }
}
