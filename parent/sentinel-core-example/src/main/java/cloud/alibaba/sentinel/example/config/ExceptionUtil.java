package cloud.alibaba.sentinel.example.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.context.annotation.Configuration;

/**
 * @author lxt
 * @date 2020-01-10-9:35
 */
@Configuration
public class ExceptionUtil {

    public static String exHandler(BlockException ex) {
        return "ex error";
    }

}
