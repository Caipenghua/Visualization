package com.xmu.software.mapper;

import com.xmu.software.domain.Country;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CountryMapper {
    List<Country> getAll();

    Country getNewest();
}
