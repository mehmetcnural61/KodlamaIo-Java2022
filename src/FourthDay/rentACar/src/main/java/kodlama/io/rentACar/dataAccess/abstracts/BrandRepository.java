package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository {
    List<Brand> getAll();
    //getAll çağıran birisi markaları listeler!
}
