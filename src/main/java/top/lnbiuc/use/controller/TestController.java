package top.lnbiuc.use.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import top.lnbiuc.use.common.RespData;
import top.lnbiuc.use.entinty.Article;
import top.lnbiuc.use.modle.params.ReqParamsDemo;
import top.lnbiuc.use.service.ArticleService;

import javax.validation.Valid;
import java.util.List;

/**
 * ClassName: TestController
 * date: 2022/10/6 20:30
 *
 * @author ayanamirei
 */

@RestController
@RequestMapping("test")
@Slf4j
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
    
    @PostMapping("add")
    public RespData<String> add(@Valid @RequestBody ReqParamsDemo params
            , BindingResult bindingResult)
    {
        if (bindingResult.hasErrors())
        {
            List<ObjectError> errors = bindingResult.getAllErrors();
            errors.forEach(p ->
            {
                FieldError fieldError = (FieldError) p;
                log.error("Invalid Parameter : object - {},field - {},errorMessage - {}", fieldError.getObjectName(), fieldError.getField(), fieldError.getDefaultMessage());
            });
            return RespData.fail("参数格式有误");
        }
        log.info(params.toString());
        return RespData.success();
    }
}