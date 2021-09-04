package phone.phone_market.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import phone.phone_market.Model.Phone;
import phone.phone_market.Service.PhoneService;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/phone")
public class PhoneResource {

    private final Logger log = LoggerFactory.getLogger(PhoneResource.class);

    @Autowired
    PhoneService phoneService;

    @PostMapping("/create")
    public Phone create(@RequestBody Phone phone){
        log.info("the create method was used");
    Phone phone1 = phoneService.save(phone);
    return  phone1;
    }
    @GetMapping("/getbyid/{id}")
    public ResponseEntity getbyid(@PathVariable (value = "id") Integer id){
        log.info("the getbyid method was used");
        Phone phone = phoneService.findByid(id);
        return ResponseEntity.ok(phone);
    }
    @GetMapping("/getbyname/{name}")
    public  ResponseEntity getbyname(@PathVariable (value = "name") String name){
        log.info("the getbyid method was used");
        Phone phone = phoneService.findByname(name);
        return ResponseEntity.ok(phone);
    }
    @GetMapping("/getall")
    public List<Phone> getAll(){
        List<Phone> phoneList = phoneService.getAll();
        return phoneList;
    }

    @PutMapping("/update")
    public  Phone update(@RequestBody Phone phone){
        Phone phone1 = phoneService.update(phone);
        return phone1;

    }

    @DeleteMapping("delete{id}")
    public  ResponseEntity delete(@PathVariable Integer id){
        phoneService.delete(phoneService.findByid(id));
        return  ResponseEntity.ok("Phone removed ");
    }

}
