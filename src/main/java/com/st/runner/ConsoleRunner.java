package com.st.runner;

import java.util.Arrays;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.st.bean.Album;
import com.st.repo.AlbumRepository;

@Component
public class ConsoleRunner implements ApplicationRunner {

	@Autowired
	private AlbumRepository repo;
	@Autowired
	private DataSource ds;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.err.println(repo.getClass().getName());
		System.err.println(ds.getClass().getName());
		repo.findAll().forEach(System.out::println);
	}

}
