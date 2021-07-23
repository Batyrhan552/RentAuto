package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.repository.LocationRepo;
import kg.megacom.RendAvto.models.Location;
import kg.megacom.RendAvto.models.dto.LocationDto;
import kg.megacom.RendAvto.servise.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepo locationRepo;

    @Override
    public LocationDto save(LocationDto locationDto) {
        Location location = new Location();
        location.setName(locationDto.getName());
        location = locationRepo.save(location);
        LocationDto locationDto1 = new LocationDto();
        locationDto1.setId(location.getId());
        locationDto1.setName(location.getName());
        return locationDto1;
    }
}
