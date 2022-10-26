package kodlama.io.rentACar.entities.concretes;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Brand {
    private int id;
    private String name;



    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

