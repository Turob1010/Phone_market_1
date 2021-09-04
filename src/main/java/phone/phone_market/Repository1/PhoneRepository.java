package phone.phone_market.Repository1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phone.phone_market.Model.Phone;

@Repository
public interface PhoneRepository  extends JpaRepository<Phone,Integer> {

    Phone findByName(String name);
    Phone findByid(Integer id);
}
