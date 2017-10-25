package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo02BiospecimenCollection;
import ni.org.ics.zpo.service.Zpo02BiospecimenCollectionService;
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
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zpo02BiospecimenCollection
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo02BiospecimenCollectionController {

    @Resource(name = "zpo02BiospecimenCollectionService")
    private Zpo02BiospecimenCollectionService zpo02BiospecimenCollectionService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo02BiospecimenCollectionController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo02BiospecimenCollections", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo02BiospecimenCollection> getZpo02BiospecimenCollections() {
        logger.info("Descargando toda la informacion de los formulario Zpo02BiospecimenCollections");
        List<Zpo02BiospecimenCollection> zpo02BiospecimenCollections = zpo02BiospecimenCollectionService.getZpo02BiospecimenCollection();
        if (zpo02BiospecimenCollections == null){
            logger.debug("Nulo");
        }
        return zpo02BiospecimenCollections;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo02BiospecimenCollections/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo02BiospecimenCollection> getZpo02BiospecimenCollections(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los formulario Zpo02BiospecimenCollections para el usuario " +username);
        List<Zpo02BiospecimenCollection> zpo02BiospecimenCollections = zpo02BiospecimenCollectionService.getZpo02BiospecimenCollectionByUser(username);
        if (zpo02BiospecimenCollections == null){
            logger.debug("Nulo");
        }
        return zpo02BiospecimenCollections;
    }

    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de Zpo02BiospecimenCollection
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo02BiospecimenCollections", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo02BiospecimenCollections(@RequestBody Zpo02BiospecimenCollection[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo02BiospecimenCollections");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo02BiospecimenCollection> zpo02BiospecimenCollections = Arrays.asList(envio);
            for (Zpo02BiospecimenCollection zpo02BiospecimenCollection : zpo02BiospecimenCollections){
                zpo02BiospecimenCollectionService.saveZpo02BiospecimenCollection(zpo02BiospecimenCollection);
            }
        }
        return "Datos recibidos!";
    }

}
