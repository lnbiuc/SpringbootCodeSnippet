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
    private String articleId;
    
    private String authorId;
    
    private String title;
    
    private String introduction;
    
    private Date releaseTime;
    
    private Date updateTime;
    
    private Boolean setTop;
    
    private Boolean deleted;
    
    private Integer visitsCount;
    
    private Integer likeCount;
    
    private String bgImg;
}