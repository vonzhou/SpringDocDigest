package com.vonzhou.learn.section7.dependencies;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @version 2017/3/20.
 */
public class ComplexObject {
    private Properties adminEmails;
    private List<Object> someList;
    private Map<Object, Object> someMap;
    private Set<Object> someSet;

    public Properties getAdminEmails() {
        return adminEmails;
    }

    public void setAdminEmails(Properties adminEmails) {
        this.adminEmails = adminEmails;
    }

    public List<Object> getSomeList() {
        return someList;
    }

    public void setSomeList(List<Object> someList) {
        this.someList = someList;
    }

    public Map<Object, Object> getSomeMap() {
        return someMap;
    }

    public void setSomeMap(Map<Object, Object> someMap) {
        this.someMap = someMap;
    }

    public Set<Object> getSomeSet() {
        return someSet;
    }

    public void setSomeSet(Set<Object> someSet) {
        this.someSet = someSet;
    }
}
