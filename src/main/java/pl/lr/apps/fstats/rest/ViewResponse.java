package pl.lr.apps.fstats.rest;

import lombok.Data;
import org.springframework.web.servlet.ModelAndView;

@Data
public abstract class ViewResponse {

    protected ModelAndView modelAndViewResponse;
    protected int s_id;

    protected ViewResponse(){
        modelAndViewResponse = new ModelAndView();
    }

    protected ViewResponse(String view){
        modelAndViewResponse = new ModelAndView(view);
    }
}
