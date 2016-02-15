package Persistencia;

import Entidades.Item;
import java.util.List;

/**
 *
 * @author dccosta2
 */
public interface IPersistencia {
    
    void GerarArquivo(List<Item> obj, int mesa);
    
    Object LerArquivo(String path);
}
