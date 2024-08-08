package org.example.common;

public class PageProvider {

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
