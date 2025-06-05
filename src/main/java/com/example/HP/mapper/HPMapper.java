package com.example.HP.mapper;

import com.example.HP.dto.HPDto;
import com.example.HP.entity.HPEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper (componentModel = "spring")
public interface HPMapper {
    HPDto entityToDto(HPEntity HP);
    HPEntity dtoToEntity(HPDto HP);

    List<HPDto> entitiesToDtos(List<HPEntity> HP);
}
