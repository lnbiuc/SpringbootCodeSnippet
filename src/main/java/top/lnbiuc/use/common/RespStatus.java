package top.lnbiuc.use.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName: RespStatus
 * date: 2022/10/6 20:12
 *
 * @author ayanamirei
 */

@Getter
@AllArgsConstructor
public enum RespStatus
{
    
    SUCCESS(200, "success"),
    FAIL(500, "failed"),
    
    HTTP_STATUS_200(200, "ok"),
    // 响应错误
    HTTP_STATUS_400(400, "request error"),
    // 身份认证失败
    HTTP_STATUS_401(401, "no authentication"),
    // 未授权
    HTTP_STATUS_403(403, "no authorities"),
    // 服务器错误
    HTTP_STATUS_500(500, "server error");
    
    private final Integer statusCode;
    
    private final String description;
    
}