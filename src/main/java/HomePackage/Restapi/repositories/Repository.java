package HomePackage.Restapi.repositories;
import HomePackage.Restapi.models.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public class Repository extends JpaRepository<Weather,Integer>{


}
