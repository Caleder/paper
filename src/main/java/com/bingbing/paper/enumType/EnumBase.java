package com.bingbing.paper.enumType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public interface EnumBase<T> {

	/**
	 * 
	 * 
	 * @return
	 */
	@JsonGetter("name")
	public String name();

	/**
	 * 
	 * 
	 * @return
	 */
	@JsonGetter("message")
	public String message();

	/**
	 * 
	 * @return
	 */
	@JsonGetter("value")
	public T value();

}
