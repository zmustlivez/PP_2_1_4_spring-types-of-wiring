package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    @Autowired
    private Death8 death;

/*    @Autowired
    public Needle7(Death8 deth) {
        this.deth = deth;
    }*/

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + death.toString();
    }
}
