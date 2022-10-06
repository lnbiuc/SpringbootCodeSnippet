package top.lnbiuc.use.service.impl;

import org.springframework.stereotype.Service;
import top.lnbiuc.use.entinty.Article;
import top.lnbiuc.use.mapper.ArticleMapper;
import top.lnbiuc.use.service.ArticleService;

import java.util.List;

/**
 * ClassName: ArticleServiceImpl
 * date: 2022/10/6 20:40
 *
 * @author ayanamirei
 */

@Service
public class ArticleServiceImpl implements ArticleService
{
    private final ArticleMapper articleMapper;
    
    public ArticleServiceImpl(ArticleMapper articleMapper)
    {
        this.articleMapper = articleMapper;
    }
    
    /**
     * 获取所有数据
     *
     * @return 返回所有数据
     */
    @Override
    public List<Article> getAllArticles()
    {
        return articleMapper.selectList(null);
    }
}