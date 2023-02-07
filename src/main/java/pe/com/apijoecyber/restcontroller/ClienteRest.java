package pe.com.apijoecyber.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.apijoecyber.entity.base.gestion.ClienteEntity;
import pe.com.apijoecyber.service.gestion.ClienteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteRest {
    
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<ClienteEntity> findAll(){
        return service.findAll();
    }
        
    @GetMapping("/custom")
    public List<ClienteEntity> findAllCustom(){
        return service.findAllCustom();
    }

    @PostMapping
    public ClienteEntity add(@RequestBody ClienteEntity r){
        return service.add(r);
    }

    @GetMapping("/{id}")
    public Optional<ClienteEntity> findById(@PathVariable long id){
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public ClienteEntity update(@PathVariable long id, @RequestBody ClienteEntity r){
        r.setCodigo(id);
        return service.update(r);
    }

    @DeleteMapping("/{id}")
    public ClienteEntity delete(@PathVariable long id){
        ClienteEntity objcli = new ClienteEntity();
        objcli.setCodigo(id);
        return service.delete(ClienteEntity.builder().codigo(id).build());
    }
}
