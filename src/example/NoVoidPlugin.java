package example;

import arc.util.*;
import mindustry.*;
import mindustry.gen.*;
import mindustry.mod.*;

public class NoVoidPlugin extends Plugin{
    //called when game initializes
    @Override
    public void init(){
        new AntiVoid();
    }

    class AntiVoid{
        Timer.Task task;
        public AntiVoid(){
            int refreshInterval = 4; int buffer=5;
            int h1 = -buffer;
            int w1 = -buffer;
            this.task = Timer.schedule(() -> {
                int h2 = Vars.world.height()*8+buffer;
                int w2 = Vars.world.width()*8+buffer;
                Groups.unit.each(u -> ((u.x<w1) || (u.x>w2) || (u.y<h1) || (u.y>h2))
                        , u -> { //Call.sendMessage("Unit Out of Bounds. YEET.");
                    u.kill();});
            }, refreshInterval, refreshInterval);
        }
    }
}
