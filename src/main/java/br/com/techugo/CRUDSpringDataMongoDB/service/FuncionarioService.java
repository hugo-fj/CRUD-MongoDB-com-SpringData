package br.com.techugo.CRUDSpringDataMongoDB.service;

import br.com.techugo.CRUDSpringDataMongoDB.model.Funcionario;

import java.util.List;

public interface FuncionarioService {
    public List<Funcionario> obterTodos();
    public Funcionario obterPorCodigo(String codigo);
    public Funcionario criar(Funcionario funconario);
}
