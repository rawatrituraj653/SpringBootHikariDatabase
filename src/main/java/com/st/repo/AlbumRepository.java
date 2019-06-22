package com.st.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.bean.Album;

public interface AlbumRepository extends JpaRepository<Album,Integer> {

}
