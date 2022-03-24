package com.shop.s1.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;

import com.shop.s1.forum.ForumDTO;
import com.shop.s1.forum.ForumService;

@Service
public class ReviewService implements ForumService {

	@Autowired
	private ReviewDAO reviewDAO;

	@Override
	public List<ForumDTO> list() throws Exception {
		return reviewDAO.list();
	}

	@Override
	public ForumDTO detail(ForumDTO forumDTO) throws Exception {
		return reviewDAO.detail(forumDTO);
	}

	@Override
	public int add(ForumDTO forumDTO) throws Exception {
		return reviewDAO.add(forumDTO);
	}

	@Override
	public int update(ForumDTO forumDTO) throws Exception {
		return reviewDAO.update(forumDTO);
	}

	@Override
	public int delete(ForumDTO forumDTO) throws Exception {
		return reviewDAO.delete(forumDTO);
	}
	
	public int reply(ReviewDTO reviewDTO) throws Exception {
		
		// 부모의 정보를 조회(Ref, Step, Depth)
		ForumDTO forumDTO = reviewDAO.detail(reviewDTO);
		ReviewDTO parent = (ReviewDTO)forumDTO;
		
		// 답글의 ref는 부모의 ref값
		reviewDTO.setRef(parent.getRef());
		// 답글의 step은 부모의 step + 1 
		reviewDTO.setStep(parent.getStep() + 1);
		// 답글의 depth는 부모의 depth + 1
		reviewDTO.setDepth(parent.getDepth() + 1);
		// step Update
		int result = reviewDAO.stepUpdate(parent);
		// 답글 Insert
		result = reviewDAO.reply(reviewDTO);
		
		return result;
	}
		
}
