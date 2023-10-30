package com.berhan.Java11SpringMovieApp.mapper;

import com.berhan.Java11SpringMovieApp.dto.request.UserRegisterDto;
import com.berhan.Java11SpringMovieApp.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RegisterMapper {

    RegisterMapper INSTANCE = Mappers.getMapper(RegisterMapper.class);

    User userFromDto(final UserRegisterDto dto);//final zorunlu değildir
}
