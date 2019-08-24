package wen.tmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wen.tmall.dao.CategoryDao;
import wen.tmall.pojo.Category;
import wen.tmall.service.CategoryService;
import wen.tmall.util.Page;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<Category> list(Page page) {
        return categoryDao.list(page);
    }

    @Override
    public int total() {
        return categoryDao.total();
    }

    @Override
    public void add(Category category) {
        categoryDao.add(category);
    }
}
