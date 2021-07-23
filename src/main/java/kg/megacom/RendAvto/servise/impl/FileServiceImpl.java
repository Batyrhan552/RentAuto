//package kg.megacom.RendAvto.servise.impl;
//
//import kg.megacom.RendAvto.microservices.FileServiceFeign;
//import kg.megacom.RendAvto.microservices.obj.Response;
//import kg.megacom.RendAvto.models.dto.CarDto;
//import kg.megacom.RendAvto.servise.FileService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//@Service
//public class FileServiceImpl implements FileService {
//
//    @Autowired
//    private FileServiceFeign fileServiceFeign;
//
//
//    @Autowired
//    private CarServiseImpl carServise;
//
//    @Override
//    public CarDto uploudLogo(Long id, MultipartFile file) {
//        CarDto carDto = carServise.findById(id);
//        Response response = fileServiceFeign.upload(file);
//        carDto.setLogo(response.getDownloadUri());
//        carDto = carServise.update(carDto);
//        return carDto;
//    }
//}
