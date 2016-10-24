package au.gov.library.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class DefaultExceptionHandler {

	@ExceptionHandler(Throwable.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) {
		ModelAndView err = new ModelAndView();
		err.addObject("exception", e);
		err.addObject("url", req.getRequestURL());
		err.setViewName("error");
		return err;
	}

}
