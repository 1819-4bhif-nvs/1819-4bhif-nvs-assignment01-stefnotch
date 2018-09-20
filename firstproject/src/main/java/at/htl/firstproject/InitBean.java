package at.htl.firstproject;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;


@Singleton
@Startup
public class InitBean {
    @PostConstruct
    private void init() {
        System.out.println("\n\n================\nIt works\n================\n\n");
    }
}
