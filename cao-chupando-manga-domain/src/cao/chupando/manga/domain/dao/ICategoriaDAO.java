
package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Categoria;
import java.util.List;

public interface ICategoriaDAO {
    
    public void inserir(Categoria ent);
    
    public void atualizar(Categoria ent);
    
    public void remover(int id);
    
    public List<Categoria> consultar();

    public void atualizar(String atualizado_com_Sucesso);
    
}
