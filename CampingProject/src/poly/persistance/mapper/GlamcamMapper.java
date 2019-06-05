package poly.persistance.mapper;

import java.util.List;

import config.Mapper;
import jdk.nashorn.internal.runtime.ECMAErrors;
import poly.dto.GlamcamDTO;
import poly.dto.RecommendDTO;

@Mapper("GlamcamMapper")
public interface GlamcamMapper {

	public List<GlamcamDTO> getGlamcamList() throws Exception;




	

	
}

