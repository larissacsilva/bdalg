package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Volume;
import java.util.List;

public interface IVolumeDAO {
    
    public void inserir(Volume ent);
    
    public void atualizar(Volume ent);
    
    public void remover(int id);
    
    public List<Volume> consultar();
    
}
