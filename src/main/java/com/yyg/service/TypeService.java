package com.yyg.service;

import com.yyg.po.Type;
import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Page<Type> listType(Pageable pageable);

    Type updateType(Long id,Type type) throws NotFoundException;

    void deleteType(Long id);

    Type getTypeByName(String name);

}
