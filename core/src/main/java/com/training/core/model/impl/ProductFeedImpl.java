package com.training.core.model.impl;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import com.training.core.models.ProductFeed;

@Model(adaptables = Resource.class,
       adapters = ProductFeed.class )
public class ProductFeedImpl implements ProductFeed {
 
	@Inject
	String modelText;
	
	@Inject
	String modelPath;
	
	
	@Override
	public String getModelText() {
		// TODO Auto-generated method stub
		return modelText;
	}

	@Override
	public String getModelPath() {
		// TODO Auto-generated method stub
		return modelPath;
	}

}
