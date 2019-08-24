package wen.tmall.dao;

import wen.tmall.pojo.Category;
import wen.tmall.util.Page;

import java.util.List;

public interface CategoryDao {

    List<Category> list(Page page);

    int total();

    void add(Category category);
}
