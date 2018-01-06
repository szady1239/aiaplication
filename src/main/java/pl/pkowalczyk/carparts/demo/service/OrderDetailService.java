package pl.pkowalczyk.carparts.demo.service;

import pl.pkowalczyk.carparts.demo.model.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    OrderDetail orderDetailSaveToOrder(Long orderId, Long partId);
    List<OrderDetail> getAllOrderDetails();
}
