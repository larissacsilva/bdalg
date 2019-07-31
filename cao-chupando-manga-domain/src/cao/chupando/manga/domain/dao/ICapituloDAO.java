package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Capitulo;
import java.util.List;

public interface ICapituloDAO {
    
    public void inserir(Capitulo ent);
    
    public void atualizar(Capitulo ent);
    
    public void remover(int id);
    
    public List<Capitulo> consultar();
    
}
