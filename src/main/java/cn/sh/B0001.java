package cn.sh;

import java.time.*;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Timer trigger.
 */
public class B0001 {
    /**
     * This function will be invoked periodically according to the specified schedule.
     */
    @FunctionName("B0001")
    public void run(
        @TimerTrigger(name = "timerInfo", schedule = "0 0/30 * * * *") String timerInfo,
        final ExecutionContext context
    ) {
        context.getLogger().info("Java Timer trigger function executed at: " + LocalDateTime.now());
    }
}
