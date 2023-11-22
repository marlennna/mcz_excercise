import java.util.*;

public class ActionProvider {
    public static void registerAction(String key, ActionBase action){
        actionMap.put(key,action);
    }
    public static Optional<ActionBase> get(String action_key){
        if(actionMap.containsKey(action_key)){
            return Optional.of(actionMap.get(action_key));
        }else {
            return Optional.empty();
        }
    }

    private static Map<String,ActionBase> actionMap = new HashMap<String, ActionBase>();

}
