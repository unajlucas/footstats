package pl.lr.apps.fstats.services;

import org.springframework.web.servlet.ModelAndView;

public abstract class ViewAbstract {

    protected ModelAndView model;

    protected void setView(String view) {
        model = new ModelAndView(view);
    }

}
