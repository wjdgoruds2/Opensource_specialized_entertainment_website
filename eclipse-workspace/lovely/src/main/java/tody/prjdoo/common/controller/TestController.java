package tody.prjdoo.common.controller;
 
import java.util.Iterator;
import java.util.Map.Entry;
 
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
import tody.prjdoo.common.common.CommandMap;
 
@Controller
public class TestController {
    
    Logger log = Logger.getLogger(this.getClass());
    
    @RequestMapping(value="/testMapArgumentResolver")
    public ModelAndView testMapArgumentResolver(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("");
         
        if(commandMap.isEmpty() == false){
            Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
            Entry<String,Object> entry = null;
            while(iterator.hasNext()){
                entry = iterator.next();
                System.out.println("들어와");
                log.debug("key : "+entry.getKey()+", value : "+entry.getValue());
            }
        }
        return mv;
    }
 
}
