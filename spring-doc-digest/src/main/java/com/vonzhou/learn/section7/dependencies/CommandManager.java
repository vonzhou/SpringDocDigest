package com.vonzhou.learn.section7.dependencies;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/** 依赖 Spring API
 * @version 2017/3/20.
 */
public class CommandManager implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public void process(int commandState) {
        // grab a new instance of the appropriate Command
        Command command = createCommand();

        command.execute();

        // set the state on the (hopefully brand new) Command instance
        command.setState(commandState);
    }

    protected Command createCommand() {
        // notice the Spring API dependency!
        return this.applicationContext.getBean("command", Command.class);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
