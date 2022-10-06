package top.lnbiuc.use.service;

import top.lnbiuc.use.entinty.Article;

import java.util.List;

/**
 * ClassName: ArticleMapper
 * date: 2022/10/6 20:39
 *
 * @author ayanamirei
 */

public interface ArticleService
{
    /**
     * 获取所有数据
     * @return 返回所有数据
     */
    List<Article> getAllArticles();
    
}