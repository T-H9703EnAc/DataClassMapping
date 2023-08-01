package app.com.interfaces;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import app.com.beans.DataA;
import app.com.beans.DataB;

@Mapper(componentModel = "default")
public interface ABMapper {
	ABMapper INSTANCE = Mappers.getMapper(ABMapper.class);

	// "id"プロパティを"no"プロパティにマッピング
	@Mapping(source = "id", target = "no")
	@Mapping(source = "name", target = "namae")
	@Mapping(source = "age", target = "nenrei")
	@Mapping(source = "datas", target = "datas")
	DataB aToB(DataA a);
}
