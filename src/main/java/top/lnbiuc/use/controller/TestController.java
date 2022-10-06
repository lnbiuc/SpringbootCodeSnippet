package top.lnbiuc.use.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lnbiuc.use.common.RespData;
import top.lnbiuc.use.entinty.Article;
import top.lnbiuc.use.service.ArticleService;

import java.util.List;

/**
 * ClassName: TestController
 * date: 2022/10/6 20:30
 *
 * @author ayanamirei
 */

@RestController
@RequestMapping("test")
public class TestController
{
    
    private final ArticleService articleService;
    
    public TestController(ArticleService articleService)
    {
        this.articleService = articleService;
    }
    
    @GetMapping("get")
    public RespData<List<Article>> get()
    {
        List<Article> articles = articleService.getAllArticles();
        return RespData.success(articles);
    }
}