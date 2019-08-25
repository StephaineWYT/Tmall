package wen.tmall.service;

import wen.tmall.pojo.Category;
import wen.tmall.util.Page;

import java.util.List;

public interface CategoryService {

    int total();

    List<Category> list(Page page);

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);
}
