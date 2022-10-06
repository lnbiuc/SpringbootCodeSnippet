package top.lnbiuc.use.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import top.lnbiuc.use.common.RespData;

import javax.xml.bind.ValidationException;
import java.net.BindException;

/**
 * ClassName: AllExceptionHandler
 * date: 2022/10/6 21:27
 *
 * @author ayanamirei
 */

@Slf4j
@RestControllerAdvice
public class AllExceptionHandler
{
    
    /**
     * 对所有异常拦截并返回
     * @param e 异常
     * @return 返回异常描述信息
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public RespData<Exception> allException(Exception e)
    {
        log.error(e.getLocalizedMessage(), e);
        return RespData.fail(e, e.getMessage());
    }
    
    
    /**
     * 对于特定状态吗的异常拦截并返回
     * @param e 异常
     * @return 返回异常信息
     */
    @ResponseBody
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = {BindException.class, ValidationException.class, MethodArgumentNotValidException.class})
    public RespData<Exception> badRequest(Exception e)
    {
        log.error(e.getLocalizedMessage(), e);
        return RespData.fail(e, e.getMessage());
    }
    
    
}