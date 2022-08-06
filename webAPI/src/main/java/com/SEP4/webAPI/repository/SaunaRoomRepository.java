package com.SEP4.webAPI.repository;

import com.SEP4.webAPI.entity.Measurements;
import com.SEP4.webAPI.entity.SaunaRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaunaRoomRepository extends JpaRepository<SaunaRoom,Integer> {

}
