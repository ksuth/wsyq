package util;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.MDC;
/**
 * 功能描述: 日志服务
 *
 * @author shuyuq
 * @date 2018-8-17
 **************************************************/
@Data
public class CASLogger {
    
    /** LOGINDEVICE */
    private static final String LOGINDEVICE="loginDevice";
    /** slf4j */
    private Logger log;

    /**
     * 调用类名
     * @param name String
     */
    public CASLogger(String name) {
        log = org.slf4j.LoggerFactory.getLogger(name);

    }

    /**
     * 此处用于重写需要用的的log方法
     */


}