package chang.petprogram.Controller;

import chang.petprogram.Model.PetModel;
import chang.petprogram.Service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PetController {
    @Autowired
    PetService petService;
    @GetMapping("/pet")
    public String pet(Model model){
        List<PetModel> pets =petService.getPetALL();
        model.addAttribute("pets",pets);
        return "pet_list";
    }

}
