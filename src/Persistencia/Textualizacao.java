package Persistencia;

import Entidades.Item;
import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dane
 */
public class Textualizacao implements IPersistencia {

    @Override
    public void GerarArquivo(List<Item> obj, int mesa) {
        Gson gson = new GsonBuilder().create();
        try {
            File file = new File("Mesa" + mesa + ".txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Item m : obj) {
                String jsonObjeto = gson.toJson(m);
                bw.append(jsonObjeto.trim());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object LerArquivo(String path) {
        List<Item> itens = new ArrayList<>();
        try {
            Scanner in = new Scanner(new FileReader(path));
            Gson gson = new GsonBuilder().create();
            while (in.hasNextLine()) {
                String line = in.nextLine();
                if (line.isEmpty()) {
                    return itens;
                }
                Item m = gson.fromJson(line.trim(), Item.class);
                itens.add(m);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itens;
    }
}
