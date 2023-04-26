package com.example.hellospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GirlFriend {
	@Autowired
	@Qualifier("bikini")
	Outfit outfit;
	
	public GirlFriend() {
		
	}

	public GirlFriend(Outfit outfit) {
		super();
		this.outfit = outfit;
	}

	public Outfit getOutfit() {
		return outfit;
	}

	public void setOutfit(Outfit outfit) {
		this.outfit = outfit;
	}
	
	
}
