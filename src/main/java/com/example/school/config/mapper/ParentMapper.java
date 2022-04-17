package com.example.school.config.mapper;

import com.example.school.dto.ParentDTO;
import com.example.school.entity.Parent;
import org.mapstruct.Mapper;

@Mapper
public interface ParentMapper {

    ParentDTO parentToParentDTO(Parent parent);
    Parent parentDTOToParent(ParentDTO parentDTO);

}
