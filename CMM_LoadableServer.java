package com.company;

/**
 * Any class that is the top level class of a coffee making program must be a subclass of a class
 * in the abstract loadable class role.
 */
public abstract class CMM_LoadableServer {
    private CMM_Program_API_IF env; // the set/ current environment

    public abstract void makeCoffee();
    abstract void setEnvironment(CMM_Program_API_IF cf);
    /**
     * Allow subclasses to fetch the reference to the environment
     *
     */
    protected CMM_Program_API_IF getEnvironment(){
        return env;
    }// getEnvironment

    public abstract String getName();

    public abstract void start(); // ??
}
