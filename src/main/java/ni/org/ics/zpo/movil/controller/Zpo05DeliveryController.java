package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo05Delivery;
import ni.org.ics.zpo.service.Zpo05DeliveryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zpo05Delivery
 * Created by FIRSTICT on 24/10/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo05DeliveryController {
    @Resource(name = "zpo05DeliveryService")
    private Zpo05DeliveryService zpo05DeliveryService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo05DeliveryController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo05Deliverys", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo05Delivery> getZpo05Deliverys() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo05Delivery");
        List<Zpo05Delivery> zpo05Deliveries = zpo05DeliveryService.getZpo05Delivery();
        if (zpo05Deliveries == null){
            logger.debug("Nulo");
        }
        return zpo05Deliveries;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo05Deliverys/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo05Delivery> getZpo05Deliverys(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo05Delivery para el usuario " +username);
        List<Zpo05Delivery> zpo05Deliveries = zpo05DeliveryService.getZpo05DeliveryByUser(username);
        if (zpo05Deliveries == null){
            logger.debug("Nulo");
        }
        return zpo05Deliveries;
    }

    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de Zpo05Delivery
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo05Deliverys", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo05Deliverys(@RequestBody Zpo05Delivery[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo05Delivery");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo05Delivery> zpo05Deliveries = Arrays.asList(envio);
            for (Zpo05Delivery zpo05Delivery : zpo05Deliveries){
                zpo05DeliveryService.saveZpo05Delivery(zpo05Delivery);
            }
        }
        return "Datos recibidos!";
    }
}
