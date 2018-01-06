package pl.pkowalczyk.carparts.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pkowalczyk.carparts.demo.model.OrderDetail;
import pl.pkowalczyk.carparts.demo.service.OrderDetailService;

import java.util.List;

@RestController
public class OrderDetailControler {
    @Autowired
    OrderDetailService orderDetailService;

    @ResponseBody
    @GetMapping("/saveOrderDetail")
    public String saveOrderDetail(@RequestParam(value = "order") Long orderId, @RequestParam(value = "part") Long partId) {
        orderDetailService.orderDetailSaveToOrder(orderId,partId);

        return "Ok";
    }

    @GetMapping("/findAllOrderDetails")
    public List<OrderDetail> getAllOrderDetails() {

        return orderDetailService.getAllOrderDetails();
    }
}
