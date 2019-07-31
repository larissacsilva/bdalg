package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Manga;
import java.util.List;

public interface IMangaDAO {
    
    public void inserir(Manga ent);
    
    public void atualizar(Manga ent);
    
    public void remover(int id);
    
    public List<Manga> consultar();
    
}
