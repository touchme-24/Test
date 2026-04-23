package tool;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public abstract class Action {
	public abstract String excecute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception;

}
