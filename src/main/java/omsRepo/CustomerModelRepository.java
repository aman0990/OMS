package omsRepo;

import omsModel.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerModelRepository extends JpaRepository < CustomerModel, Long > {
}