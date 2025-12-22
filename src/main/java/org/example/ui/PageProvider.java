package org.example.ui;


import static com.codeborne.selenide.Selenide.page;

public class PageProvider { // TODO update

    public <T> T initPage(Class<T> pageClass) {
        return page(pageClass);
    }

//    public <T> T initPage(Class<T> page) {
//        T object = null;
//
//        try {
//            object = page.newInstance();
//        } catch (ReflectiveOperationException e) {
//            System.out.println("");
//        }
//
//        return object;
//    }

//
//    private final Map<Class<?>, Object> cache = new HashMap<>();
//
//    public <T> T get(Class<T> page) {
//        return (T) cache.computeIfAbsent(page, this::createPage);
//    }
//
//    private <T> T createPage(Class<T> page) {
//        try {
//            return page.getDeclaredConstructor().newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException("Can't create page: " + page.getName(), e);
//        }
//    }
}
