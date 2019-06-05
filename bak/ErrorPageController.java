package net.iutil.app.boot.starter;

import net.iutil.ApiResult;
import org.springframework.beans.factory.annotation.Value;
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
import java.time.LocalDate;

/**
 * controller 错误处理
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

    @Value("${app.version}")
    private String version;

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping(value = ERROR_PATH, produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView handleError(HttpServletRequest request,
                                    HttpServletResponse response) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        ModelAndView mv = new ModelAndView();
        mv.addObject("year", LocalDate.now().getYear());
        mv.addObject("version", version);
        mv.addObject("appName", appName);

        if (status != null) {
            int statusCode = Integer.valueOf(status.toString());

            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                mv.setViewName(VIEW_404);
                return mv;
            }

            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                mv.setViewName(VIEW_500);
                return mv;
            }
        }
        mv.setViewName(VIEW_ERROR);
        return mv;
    }

    @RequestMapping(value = ERROR_PATH)
    @ResponseBody
    public ApiResult handleErrorJson(HttpServletRequest request,
                                     HttpServletResponse response) {
        return ApiResult.error();
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}

