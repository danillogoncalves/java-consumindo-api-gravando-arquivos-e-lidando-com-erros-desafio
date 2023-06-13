package utility;

import com.google.gson.Gson;
import model.Address;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public void create(Address address) {
        try {
            FileWriter file = new FileWriter(address.getCep() + ".json");
            file.write(new Gson().newBuilder().setPrettyPrinting().create().toJson(address));
            file.close();
        } catch (IOException e) {
            throw new RuntimeException("Erro ao criar o arquivo:\n" + e);
        }

    }
}
