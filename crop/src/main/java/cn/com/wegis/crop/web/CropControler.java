package cn.com.wegis.crop.web;

import cn.com.wegis.crop.services.CropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class CropControler {

    @Autowired
    CropService cropService;
    @RequestMapping(value = "home/baseinfo/getindextype", method = RequestMethod.GET)
    @ResponseBody
    public List getIndexTypeHandler(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String callBack = ServletRequestUtils.getStringParameter(request, "callback", "");
       return cropService.getRecordList();
    }
}
