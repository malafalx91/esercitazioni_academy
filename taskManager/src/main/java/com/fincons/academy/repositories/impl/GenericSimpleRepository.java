package com.fincons.academy.repositories.impl;

import java.util.Map;
import java.util.TreeMap;

import com.fincons.academy.domain.GenericObject;
import com.fincons.academy.repositories.GenericRepository;

public abstract class GenericSimpleRepository<T extends GenericObject> implements GenericRepository<T> {
	private Map<Long, T> container = new TreeMap<>();
	private Long sequence = 0L;

	@Override
	public Iterable<T> select() {
		return container.values();
	}

	@Override
	public T create(T object) throws Exception {
		if (!container.containsValue(object)) {
			object.setId(++sequence);
			container.put(sequence, object);
			return object;
		}
		throw new Exception(object.getClass().getSimpleName() + " already in the system " + object);
	}

	@Override
	public T update(T object) throws Exception {
		return container.put(object.getId(), object);
	}

	@Override
	public T delete(Long id) throws Exception {
		return container.remove(id);
	}

	@Override
	public T read(Long id) throws Exception {
		return container.get(id);
	}
	
	
	
}
