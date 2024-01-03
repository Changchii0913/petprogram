package chang.petprogram.Service;

import chang.petprogram.Mapper.PetMapper;
import chang.petprogram.Model.PetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PetService {
    @Autowired
JdbcTemplate jdbcTemplate;

        public List<PetModel>getPetALL(){
            PetMapper pmapper= new PetMapper();
            List<PetModel> PetAll= jdbcTemplate.query("select * from petprogram",pmapper);
            return PetAll;
        }
}
