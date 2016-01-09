package com.example.weiping_tan.myapplication;

/**
 * Created by weiping-tan on 2/1/2016.
 */
public class Category {
    private int CategoryID;
    private String title , desc ;
 public Category()
 {

 }
    public Category(int categoryID, String title, String desc) {
        CategoryID = categoryID;
        this.title = title;
        this.desc = desc;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
