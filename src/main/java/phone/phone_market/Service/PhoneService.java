package phone.phone_market.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phone.phone_market.Model.Phone;
import phone.phone_market.Repository1.PhoneRepository;

import java.util.List;

@Service
public class PhoneService  {
    @Autowired
    PhoneRepository phoneRepository;

   public Phone save(Phone phone){
    Phone phone1 = phoneRepository.save(phone);
        return phone1;
    }

  public   Phone findByid(Integer id){
        Phone phone = phoneRepository.findByid(id);
        return phone;
    }
   public Phone findByname(String name) {
        Phone phone = phoneRepository.findByName(name);
        return phone;
    }

   public List<Phone> getAll(){
        List<Phone>phoneList = phoneRepository.findAll();
        return phoneList;
    }

   public Phone update(Phone phone){
        Phone phone1 = phoneRepository.save(phone);
        phone1.setId(phone.getId());
        phone1.setConcern(phone.getConcern());
        phone1.setName(phone.getName());
        phone1.setModel(phone.getModel());
        return phone1;
    }

   public void  delete(Phone phone){
       phoneRepository.delete(phone);
   }











}
