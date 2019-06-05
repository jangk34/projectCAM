package poly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import poly.dto.AutocamDTO;
import poly.dto.RecommendDTO;
import poly.persistance.mapper.AutocamMapper;
import poly.persistance.mapper.RecommendMapper;
import poly.service.IAutocamService;
import poly.service.IRecommendService;

	@Service("AutocamService")
	public class AutocamService implements IAutocamService {
	
		@Resource(name="AutocamMapper")
		private AutocamMapper autocamMapper;

		@Override
		public List<AutocamDTO> getAutocamList() throws Exception {
			return autocamMapper.getAutocamList();
		}






	
	
}
