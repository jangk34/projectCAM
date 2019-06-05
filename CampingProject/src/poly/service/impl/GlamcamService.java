package poly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import poly.dto.GlamcamDTO;
import poly.dto.RecommendDTO;
import poly.persistance.mapper.GlamcamMapper;
import poly.persistance.mapper.RecommendMapper;
import poly.service.IGlamcamService;
import poly.service.IRecommendService;

	@Service("GlamcamService")
	public class GlamcamService implements IGlamcamService {
	
		@Resource(name="GlamcamMapper")
		private GlamcamMapper glamcamMapper;

		@Override
		public List<GlamcamDTO> getGlamcamList() throws Exception {
			return glamcamMapper.getGlamcamList();
		}






	
	
}
