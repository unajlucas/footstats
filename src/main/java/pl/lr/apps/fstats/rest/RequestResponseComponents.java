package pl.lr.apps.fstats.rest;

import lombok.Data;
import org.springframework.web.servlet.ModelAndView;

@Data
public abstract class RequestResponseComponents {

    protected ModelAndView modelAndViewResponse;
    protected int sid;

    protected RequestResponseComponents(){
        modelAndViewResponse = new ModelAndView();
    }

    protected RequestResponseComponents(String view){
        modelAndViewResponse = new ModelAndView(view);
    }
}
