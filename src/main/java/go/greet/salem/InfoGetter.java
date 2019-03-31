package go.greet.salem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoGetter {

    @Autowired
    InfoRepository infoRepository;

    public String getById(int id) {

        return infoRepository.findById(id);
    }
}
