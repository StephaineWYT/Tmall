package wen.tmall.service;

import wen.tmall.pojo.Category;
import wen.tmall.util.Page;

import java.util.List;

public interface CategoryService {

    int total();

    List<Category> list(Page page);

    void add(Category category);
}
