package top.lnbiuc.use.entinty;

import com.baomidou.mybatisplus.annotation.TableId;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: Article
 * date: 2022/10/6 20:34
 *
 * @author ayanamirei
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article
{
    
    @TableId
    public String articleId;
    
    public String authorId;
    
    public String title;
    
    public String introduction;
    
    public Date releaseTime;
    
    public Date updateTime;
    
    public Boolean setTop;
    
    public Boolean deleted;
    
    public Integer visitsCount;
    
    public Integer likeCount;
    
    public String bgImg;
}