package com.fincons.academy.repositories;

public interface GenericRepository<T> {
	Iterable<T> select();

	T create(T object) throws Exception;

	T read(Long id) throws Exception;

	T update(T object) throws Exception;

	T delete(Long id) throws Exception;

}
