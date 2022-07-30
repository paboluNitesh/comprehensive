package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {
	static Logger log=LogManager.getLogger(Log4j.class);

	public void getInfo(String info) {
		log.info(info);
	}
	public void getwarn(String warn) {
		log.warn(warn);
	}
	public void geterror(String error) {
		log.error(error);
	}
	public void getfatal(String fatal) {
		log.fatal(fatal);
	}
}
