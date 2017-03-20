package com.vonzhou.learn.section7.dependencies;

/**
 * @version 2017/3/20.
 */
public abstract class CommandManager2 {
    public void process() {
        // grab a new instance of the appropriate Command
        AsyncCommand command = createCommand();

        command.execute();
    }

    // okay... but where is the implementation of this method?
    protected abstract AsyncCommand createCommand();
}
