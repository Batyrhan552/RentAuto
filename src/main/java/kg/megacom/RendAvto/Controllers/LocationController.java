package kg.megacom.RendAvto.Controllers;

import kg.megacom.RendAvto.models.dto.LocationDto;
import kg.megacom.RendAvto.servise.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/save")
    public LocationDto save(@RequestBody LocationDto locationDto){
         return locationService.save(locationDto);
    }
}
