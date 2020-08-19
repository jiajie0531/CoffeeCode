package org.jiajie.coffeecode.patterns.observer.java;

/**
 * @author jay
 */
public class User implements Observer {

    private String article;
    private Subject blog;

    @Override
    public void update() {
        System.out.println("State change reported by subject");
        article = (String) blog.getUpdate();
    }

    @Override
    public void setSubject(Subject blog) {
        this.blog = blog;
        article = "No new article";
    }

    public String getArticle() {
        return article;
    }
}
