package lk.epic.spring.advisor;

import lk.epic.spring.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amayuru indeewara
 * @created 01/12/2022 - 21:24
 * @project EpicLoginApp
 */
@RestController
@CrossOrigin
public class AppWideExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({Exception.class})
    public ResponseUtil exceptionHandler(Exception e){
        return new ResponseUtil(500, e.getMessage(), null);
    }
}
