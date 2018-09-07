package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestPrintLog {
	
	private static Logger logger=LoggerFactory.getLogger(TestPrintLog.class);

	public static void main(String[] args) {
		test();

	}
	
	public static void test() {
		logger.info("test11234");
		logger.info("nihao");
		logger.error("hellow");
		logger.debug("debug");
		logger.info(" test  44444");
		logger.info("test {} syq","password");
	}

}
