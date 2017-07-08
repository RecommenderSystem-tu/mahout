package io.recommender.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;


@RestController
public class ProjectController {
	
	@Autowired
	private RecommenderEngine engine;
	
	@RequestMapping("/getRecommendation")
	public List<RecommendedItem> getRecommendation() throws TasteException{
		return  RecommenderEngine.getRecommendation(10,20);
	}
}
