package com.hand.exam.bills.controllers;

import com.hand.exam.bills.service.IBillsService;
import org.springframework.stereotype.Controller;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import org.springframework.validation.BindingResult;
import java.util.List;

@Controller
public class BillsController extends BaseController{

    @Autowired
    private IBillsService service;


    @RequestMapping(value = "/xxinv/shiped/bills/query")
    @ResponseBody
    public ResponseData query(BillsController bills, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext,bills,page,pageSize));
    }

    @RequestMapping(value = "/xxinv/shiped/bills/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<BillsController> bills, BindingResult result, HttpServletRequest request){
        getValidator().validate(bills, result);
        if (result.hasErrors()) {
            ResponseData responseData = new ResponseData(false);
            responseData.setMessage(getErrorMessage(result, request));
            return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, bills));
    }

    @RequestMapping(value = "/xxinv/shiped/bills/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<BillsController> bills){
        service.batchDelete(bills);
        return new ResponseData();
    }
}