package pl.pkowalczyk.carparts.demo.controler;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;
        import pl.pkowalczyk.carparts.demo.model.Order;
        import pl.pkowalczyk.carparts.demo.service.OrderService;

        import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrderControler {
    @Autowired
    OrderService orderService;

    @GetMapping("/findOrderById/{id}")
    public Order getOrderById(@PathVariable(value = "id") Long id) {

        return orderService.orderGetById(id);
    }

    @GetMapping("/findAllOrders")
    public List<Order> getAllOrders() {

        return orderService.getAllOrders();
    }

    @ResponseBody
    @GetMapping("/saveOrder")
    public String orderSave(@RequestParam(value = "customer") Long customerId) {
        orderService.orderSave(customerId);

        return "Ok";
    }
}
