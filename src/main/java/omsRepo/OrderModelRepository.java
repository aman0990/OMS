package omsRepo;

import omsModel.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderModelRepository extends JpaRepository < OrderModel, Long > {
}