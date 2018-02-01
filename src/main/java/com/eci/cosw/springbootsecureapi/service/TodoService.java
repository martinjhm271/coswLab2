package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Todo;

import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
public interface TodoService
{
    List<Todo> getTodoList();
 Todo addTodo( Todo todo );
}
