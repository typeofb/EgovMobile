package egovframework.rte.cmmn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import egovframework.rte.fdl.cmmn.exception.handler.ExceptionHandler;

public class EgovSampleExcepHndlr implements ExceptionHandler {

	protected Log log = LogFactory.getLog(this.getClass());

	public void occur(Exception ex, String packageName) {
		log.debug(" EgovServiceExceptionHandler run...............");

		try {
			log.debug(" EgovServiceExceptionHandler try ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
