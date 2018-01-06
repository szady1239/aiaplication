package pl.pkowalczyk.carparts.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pkowalczyk.carparts.demo.model.Order;
import pl.pkowalczyk.carparts.demo.model.OrderDetail;
import pl.pkowalczyk.carparts.demo.model.Part;
import pl.pkowalczyk.carparts.demo.repository.OrderDetailRepository;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{
    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Autowired
    PartService partService;

    @Autowired
    OrderService orderService;


    @Override
    public OrderDetail orderDetailSaveToOrder(Long orderId, Long partId) {
        Part part = partService.getPartById(partId);
        Order order = orderService.orderGetById(orderId);
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrder(order);
        orderDetail.setPart(part);
        return orderDetailRepository.save(orderDetail);
    }

    @Override
    public List<OrderDetail> getAllOrderDetails() {
        return orderDetailRepository.findAll();
    }
}
