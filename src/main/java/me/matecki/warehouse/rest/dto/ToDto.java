package me.matecki.warehouse.rest.dto;


public interface ToDto<T, F> {

    public T toDto(F from);

}
