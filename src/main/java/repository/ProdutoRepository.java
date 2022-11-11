package repository;

import br.edu.iesp.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

    List<Produto> findByNomeLikeIgnoreCase(String nome);
}
