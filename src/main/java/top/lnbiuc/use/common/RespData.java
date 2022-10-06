package top.lnbiuc.use.common;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: RespMessage
 * date: 2022/10/6 20:08
 *
 * @author ayanamirei
 */

@Data
@Builder
public class RespData<T>
{
    /*
    状态码
     */
    private Integer code;
    
    /*
    返回消息
     */
    private String message;
    
    /*
    时间标签
     */
    private Date timestamp;
    
    /*
    返回数据
     */
    private T data;
    
    /**
     * 请求成功无返回数据
     * @return null
     * @param <T> RespData.type
     */
    public static <T> RespData<T> success()
    {
        return success(null);
    }
    
    /**
     * 请求成功 返回数据
     * @param data 需要返回的数据
     * @return RespData
     * @param <T> RespData.type
     */
    public static <T> RespData<T> success(T data)
    {
        return RespData.<T>builder().data(data)
                .code(RespStatus.SUCCESS.getStatusCode())
                .message(RespStatus.SUCCESS.getDescription())
                .timestamp(new Date())
                .data(data)
                .build();
                
    }
    
    /**
     * 请求失败
     * @param message 需要返回失败消息
     * @return 返回失败消息
     * @param <T> RespData.type
     */
    public static <T extends Serializable> RespData<T> fail(String message)
    {
        return fail(null,message);
    }
    
    /**
     * 请求失败，返回数据
     * @param data 需要返回的数据
     * @param message 失败信息
     * @return 返回失败消息 + 数据
     * @param <T> RespData.type
     */
    public static <T> RespData<T> fail(T data,String message)
    {
        return RespData.<T>builder()
                .code(RespStatus.FAIL.getStatusCode())
                .message(message)
                .timestamp(new Date())
                .data(data)
                .build();
    }
}