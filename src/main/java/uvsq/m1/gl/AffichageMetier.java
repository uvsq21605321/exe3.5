package uvsq.m1.gl;

import java.time.LocalDateTime;
import java.util.logging.Logger;

import com.sun.org.slf4j.internal.LoggerFactory;




public class AffichageMetier implements InterfaceAffichage{

	private static final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(AffichageMetier.class);
	
	@Override
	public void printBegin() {
		logger.info(LocalDateTime.now()+ " :the begining ");
		
	}

	@Override
	public void printEnd() {
		logger.info(LocalDateTime.now()+ " :the end ");
		
	}

}
