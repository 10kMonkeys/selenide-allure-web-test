package org.example.common;

public class PageProvider { // TODO update

    public <T> T initPage(Class<T> page) {
        T object = null;

        try {
            object = page.newInstance();
        } catch (ReflectiveOperationException e) {
            System.out.println("");
        }

        return object;
    }
}
