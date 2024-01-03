package chang.petprogram.Mapper;

import chang.petprogram.Model.PetModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PetMapper implements RowMapper<PetModel> {
    @Override
    public PetModel mapRow(ResultSet rs, int rowNum) throws SQLException{
                PetModel p= new PetModel();
                p.setPetName(rs.getString("PetName"));
                p.setGender(rs.getString("Gender"));
                p.setLigation(rs.getString("Ligation"));
                p.setHairLengh(rs.getString("HairLengh"));
                p.setHairColor(rs.getString("HairColor"));
                p.setAge(rs.getDouble("Age"));
                p.setVariety(rs.getString("Variety"));
                p.setKind(rs.getString("Kind"));
                return p;

    }
}
