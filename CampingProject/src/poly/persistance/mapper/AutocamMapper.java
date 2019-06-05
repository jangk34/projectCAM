package poly.persistance.mapper;

import java.util.List;

import config.Mapper;
import jdk.nashorn.internal.runtime.ECMAErrors;
import poly.dto.AutocamDTO;
import poly.dto.RecommendDTO;

@Mapper("AutocamMapper")
public interface AutocamMapper {

	public List<AutocamDTO> getAutocamList() throws Exception;




	

	
}

