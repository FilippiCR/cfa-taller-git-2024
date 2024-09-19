package py.edu.uc.lp3.apirest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class VendibleController {


    @GetMapping("/vendibles")
    public ResponseEntity<List<Vendible>> mostrarVendibles() {
        List<Vendible> vendibles = new ArrayList<>();
        Subfusil subfusil = new Subfusil(1700, 5); // Assuming Subfusil class exists
        vendibles.add(subfusil);
        subfusil.setDescripcion("MP7");

        Subfusil subfusil2 = new Subfusil(5000, 10); // Assuming Subfusil class exists
        vendibles.add(subfusil2);
        subfusil2.setDescripcion("MP5");



        // Explicitly return 200 OK status code
        return new ResponseEntity<>(vendibles, HttpStatus.OK);
    }


}

