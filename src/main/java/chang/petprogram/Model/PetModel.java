package chang.petprogram.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PetModel {
    private String PetName;
    private String Gender;
    private String Ligation;
    private String HairLengh;
    private String HairColor;
    private Double Age;
    private String Variety;
    private String Kind;

}
