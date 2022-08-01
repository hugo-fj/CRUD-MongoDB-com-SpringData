package br.com.techugo.CRUDSpringDataMongoDB.repository;

import br.com.techugo.CRUDSpringDataMongoDB.model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FuncionarioRepository extends MongoRepository<Funcionario,String> {

}
