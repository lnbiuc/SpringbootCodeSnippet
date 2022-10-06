package top.lnbiuc.use.modle.params;

import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.io.Serializable;

import static io.lettuce.core.GeoArgs.Unit.m;

/**
 * ClassName: ReqParamsDemo
 * date: 2022/10/6 21:00
 *
 * @author ayanamirei
 */

@Data
public class ReqParamsDemo implements Serializable
{
    private int id;
    
    @NotEmpty(message = "Name不可为空")
    private String name;
    
    @NotEmpty(message = "phone不可为空")
    @Pattern(regexp = "/(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}/",message = "手机号格式有误")
    private String phoneNum;
    
    @NotEmpty(message = "email不可为空")
    @Email
    private String email;
    
    @Range(min = 0, max = 1, message = "只能是1或0")
    private int gender;
//
    @Max(value = 100,message = "最大支持年龄100")
    private int age;
}