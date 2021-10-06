package org.iesfm.building;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            Building building = mapper.readValue(new File(Main.class.getResource("/building.json").toURI()), Building.class);
            log.info(building.toString());
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }

    }

}
