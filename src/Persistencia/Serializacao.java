package Persistencia;

import Entidades.Item;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dane
 */
public class Serializacao implements IPersistencia {

    @Override
    public void GerarArquivo(List<Item> obj, int mesa) {
        FileOutputStream outFile;
        try {
            outFile = new FileOutputStream("ArqConvMesa" + (mesa + 1));
            ObjectOutputStream s = new ObjectOutputStream(outFile);
            s.writeObject(obj);
            s.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object LerArquivo(String path) {
        FileInputStream inFile;
        try {
            inFile = new FileInputStream(path);
            ObjectInputStream d = new ObjectInputStream(inFile);
            Object o = d.readObject();
            d.close();
            return o;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Serializacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
