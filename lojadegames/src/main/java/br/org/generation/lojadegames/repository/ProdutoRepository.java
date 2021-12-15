package br.org.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.lojadegames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
	
	/**
	 * 
	 *  Encontra todos os produtos que possuem um preço maior do que foi digitado e coloca em ordem crescente
	 *  
	 *  MySQL: select * from tb_produtos where preco > preco order by preco;
	 */
	public List<Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	
	/**
	 * 
	 *  Encontra todos os produtos que possuem um preço maior do que foi digitado e coloca em ordem decrescente
	 *  
	 *  MySQL: select * from tb_produtos where preco < preco order by preco;
	 */
	public List<Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);

}
