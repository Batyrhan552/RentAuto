//package kg.megacom.RendAvto.Controllers;
//
//import kg.megacom.RendAvto.models.dto.CarDto;
//import kg.megacom.RendAvto.servise.FileService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//@RestController
//@RequestMapping(value = "/api/v1/file")
//public class FileController {
//    @Autowired
//    private FileService fileService;
//
//    @PostMapping("/logo")
//    public CarDto uploud(@RequestParam Long carId, @RequestPart MultipartFile file){
//        return fileService.uploudLogo(carId,file);
//    }
//}
