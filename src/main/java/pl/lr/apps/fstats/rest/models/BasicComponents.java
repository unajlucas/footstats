package pl.lr.apps.fstats.rest.models;

import lombok.Data;
import org.springframework.web.servlet.ModelAndView;

@Data
public abstract class BasicComponents {

    protected ModelAndView modelAndViewResponse;
    protected int sid;

    protected BasicComponents(){
    }

    protected BasicComponents(String view, int season){
        this.modelAndViewResponse = new ModelAndView(view);
        this.sid = season;
    }
}
