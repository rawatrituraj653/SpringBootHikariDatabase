package com.st.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Album {

	@Id
	@NonNull
	private Integer id;
	@NonNull
	private String title;
	@NonNull
	private String gener;
	@NonNull
	private String composer;
	@NonNull @Temporal(TemporalType.DATE)
	private Date  issue;
}
