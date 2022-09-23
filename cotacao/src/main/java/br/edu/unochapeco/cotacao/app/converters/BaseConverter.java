package br.edu.unochapeco.cotacao.app.converters;

public interface BaseConverter<M, E> {

    public M convertToModel(E entity);

    public E convertToEntity(M model);

}
