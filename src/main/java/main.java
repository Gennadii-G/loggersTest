import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import java.io.File

@Slf4j
public class main {
    public static void main (String[] args){
        log.info("start app");
      new Thread(new LogPotok()).start();

    }
}
