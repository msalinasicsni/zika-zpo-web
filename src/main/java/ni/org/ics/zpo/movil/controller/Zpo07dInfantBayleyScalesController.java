package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo07dInfantBayleyScales;
import ni.org.ics.zpo.service.Zpo07dInfantBayleyScalesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zpo07dInfantBayleyScales
 * Created by ics on 24/10/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo07dInfantBayleyScalesController {

    @Resource(name = "zpo07dInfantBayleyScalesService")
    private Zpo07dInfantBayleyScalesService zpo07dInfantBayleyScalesService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo07dInfantBayleyScalesController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo07dInfantBayleyScales", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo07dInfantBayleyScales> getZpo07dInfantBayleyScales() {
        logger.info("Descargando toda la informacion de los datos de los formulario zpo07dInfantBayleyScales");
        List<Zpo07dInfantBayleyScales> zpo07dInfantBayleyScales = zpo07dInfantBayleyScalesService.getZpo07dInfantBayleyScales();
        if (zpo07dInfantBayleyScales == null){
            logger.debug("Nulo");
        }
        return zpo07dInfantBayleyScales;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo07dInfantBayleyScales/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo07dInfantBayleyScales> getZpo07dInfantBayleyScales(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo07dInfantBayleyScales para el usuario " +username);
        List<Zpo07dInfantBayleyScales> zpo07dInfantBayleyScales = zpo07dInfantBayleyScalesService.getZpo07dInfantBayleyScalesByUser(username);
        if (zpo07dInfantBayleyScales == null){
            logger.debug("Nulo");
        }
        return zpo07dInfantBayleyScales;
    }

    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zpo07dInfantBayleyScales
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo07dInfantBayleyScales", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo07dInfantBayleyScales(@RequestBody Zpo07dInfantBayleyScales[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo07dInfantBayleyScales");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo07dInfantBayleyScales> zpo07dInfantBayleyScales = Arrays.asList(envio);
            for (Zpo07dInfantBayleyScales zpo07dInfantBayleySc : zpo07dInfantBayleyScales){
                zpo07dInfantBayleyScalesService.saveZpo07dInfantBayleyScales(zpo07dInfantBayleySc);
            }
        }
        return "Datos recibidos!";
    }
}
