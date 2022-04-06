package com.company;

public interface CMM_LoadableServer_IF {
    public void makeCoffee();
    void setEnvironment(CMM_Program_API_IF cf); //should this return type be env?
}
