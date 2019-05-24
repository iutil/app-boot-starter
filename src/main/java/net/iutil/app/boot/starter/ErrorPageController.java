package net.iutil.app.boot.starter;

import com.fengwenyi.javalib.result.Result;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Erwin Feng
 * @since 2019-05-24 16:56
 */
@Controller
public class ErrorPageController implements ErrorController {

    /* error path */
    private static final String ERROR_PATH = "/error";

    /* view 404 */
    private static final String VIEW_404 = "error/404";

    /* view 500 */
    private static final String VIEW_500 = "error/500";

    /* view error */
    private static final String VIEW_ERROR = "error/error";

    @RequestMapping(value = ERROR_PATH, produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView handleError(HttpServletRequest request,
                                    HttpServletResponse response) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            int statusCode = Integer.valueOf(status.toString());

            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                return new ModelAndView(VIEW_404);
            }

            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                return new ModelAndView(VIEW_500);
            }
        }
        return new ModelAndView(VIEW_ERROR);
    }

    @RequestMapping(value = ERROR_PATH)
    @ResponseBody
    public Result handleErrorJson(HttpServletRequest request,
                                  HttpServletResponse response) {
        return Result.error();
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}

