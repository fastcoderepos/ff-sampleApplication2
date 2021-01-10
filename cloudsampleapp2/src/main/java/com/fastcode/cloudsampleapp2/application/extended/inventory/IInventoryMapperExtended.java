package com.fastcode.cloudsampleapp2.application.extended.inventory;

import org.mapstruct.Mapper;
import com.fastcode.cloudsampleapp2.application.core.inventory.IInventoryMapper;

@Mapper(componentModel = "spring")
public interface IInventoryMapperExtended extends IInventoryMapper {

}

