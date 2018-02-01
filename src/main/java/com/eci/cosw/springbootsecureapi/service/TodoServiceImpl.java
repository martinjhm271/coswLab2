package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
@Service
public class TodoServiceImpl
    implements TodoService
{

    private List<Todo> todos = new ArrayList<>();


    @Autowired
    public TodoServiceImpl()
    {
    }

    @PostConstruct
    private void populateSampleData()
    {
        todos.add( new Todo() );
    }


	@Override
    public List<Todo> getTodoList(){return todos;};
	
	@Override
    public Todo addTodo(Todo todo){todos.add(todo);return todo;};

}
