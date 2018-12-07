package com.truckerpath.zyhtest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@Value("${tpbucket}")
	private String bucket = "truckloads-files-test";
	@RequestMapping(value = "forum/test", method = RequestMethod.GET)
	public String myTest() {
		return bucket;
	}
}
