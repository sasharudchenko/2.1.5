package koschei.models;

import koschei.KoscheiTheDeathless;
import koschei.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1  {
private AppConfig appConfig;
    @Autowired
    private Island2 island;
//    public void setIsland (Island2 island) {
//        this.island = island;
//    }

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
