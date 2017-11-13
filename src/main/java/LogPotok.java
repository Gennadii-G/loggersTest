import lombok.SneakyThrows;
import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogPotok implements Runnable{

    @SneakyThrows
    @Synchronized
    public void run() {

        synchronized(this){
            for(int i=0; i < Integer.MAX_VALUE; i++) {
                log.info("iteration - " + i);
                log.info("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur eget erat gravida, aliquam augue id, elementum odio.");
                log.debug("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur eget erat gravida, aliquam augue id, elementum odio.");
                log.trace("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur eget erat gravida, aliquam augue id, elementum odio.");
                log.warn("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur eget erat gravida, aliquam augue id, elementum odio.");
                log.error("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur eget erat gravida, aliquam augue id, elementum odio.");
                this.wait(3000);

            }
        }
    }
}
