package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Autor;
import java.util.List;

public interface IAutorDAO {
    
    public void inserir(Autor ent);
    
    public void atualizar(Autor ent);
    
    public void remover(int id);
    
    public List<Autor> consultar();
    
}
