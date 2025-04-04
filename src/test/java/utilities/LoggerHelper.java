package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerHelper {

    // Bu logger sınıf ismine göre çalışır, örnek kullanım: Logger logger = LoggerHelper.getLogger();
    public static Logger getLogger() {
        return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
    }
}
