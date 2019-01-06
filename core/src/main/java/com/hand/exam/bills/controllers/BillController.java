package com.hand.exam.bills.controllers;

import com.hand.exam.bills.dto.Bill;
import com.hand.exam.bills.dto.DocLine;
import com.hand.exam.bills.service.IBillService;
import com.hand.exam.bills.service.IDocLineService;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class BillController extends BaseController{
    @Autowired
    private IBillService billService;

    @RequestMapping("/bill/query")
    @ResponseBody
    public ResponseData selectList(HttpServletRequest request, Bill condition,
                                   @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                   @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize) {
        IRequest iRequest = createRequestContext(request);
        List<Bill> datas = billService.selectByBill(iRequest, condition, page,
                pagesize);
        for (Bill bill : datas)
            System.out.println(bill);
        return new ResponseData(datas);
    }

    @RequestMapping(value = "/bill/submit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData submit(HttpServletRequest request, @RequestBody
            List<Bill> bills) {

        IRequest iRequest = createRequestContext(request);
        List<Bill> datas = billService.batchUpdate(iRequest, bills);
        return new ResponseData(datas);
    }

    @RequestMapping(value = "/bill/remove", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody
            List<Bill> bills) {
        IRequest iRequest = createRequestContext(request);
        billService.batchDelete(bills);
        return new ResponseData();
    }
    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

}