package org.healthbeauty.service.impl;

import java.util.List;

import org.healthbeauty.dao.BallMapper;
import org.healthbeauty.pojo.Ball;
import org.healthbeauty.service.BallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ballservice")
public class BallServiceImpl implements BallService{
	
	@Autowired(required=false)
	private BallMapper ballMapper;

	@Override
	public List select(Ball ball) {
		// TODO Auto-generated method stub
		return  ballMapper.select(ball);
	}
	
	

}
