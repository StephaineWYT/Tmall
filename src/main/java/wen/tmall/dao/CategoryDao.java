package wen.tmall.dao;

import wen.tmall.pojo.Category;
import wen.tmall.util.Page;

import java.util.List;

public interface CategoryDao {

    public List<Category> list(Page page);

    public int total();
}
