package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Editora;
import java.util.List;

public interface IEditoraDAO {
    
    public void inserir(Editora ent);
    
    public void atualizar(Editora ent);
    
    public void remover(int id);
    
    public List<Editora> consultar();
    
}
