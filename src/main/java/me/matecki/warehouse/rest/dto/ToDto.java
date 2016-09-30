package me.matecki.warehouse.rest.dto;


public interface ToDto<T, F> {

    T toDto(F from);

}
