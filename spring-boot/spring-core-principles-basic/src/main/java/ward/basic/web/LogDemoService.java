package ward.basic.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;
import ward.basic.common.MyLogger;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final ObjectProvider<MyLogger> myLoggerProvider;
    private final MyLogger myLogger;
    public void logic(String id) {
        myLogger.log("service id = " +id );
    }


}
