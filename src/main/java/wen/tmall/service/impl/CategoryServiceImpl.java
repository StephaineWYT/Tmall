package wen.tmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wen.tmall.dao.CategoryDao;
import wen.tmall.pojo.Category;
import wen.tmall.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<Category> list() {
        return categoryDao.list();
    }

    @Override
    public void add(Category category) {
        categoryDao.add(category);
    }

    @Override
    public void delete(int id) {
        categoryDao.delete(id);
    }

    @Override
    public Category get(int id) {
        return categoryDao.get(id);
    }

    @Override
    public void update(Category category) {
        categoryDao.update(category);
    }
}
