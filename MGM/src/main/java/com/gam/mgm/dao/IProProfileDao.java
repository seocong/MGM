package com.gam.mgm.dao;

import java.util.List;

import com.gam.mgm.dto.MemberDto;
import com.gam.mgm.dto.ProProfileDto;

public interface IProProfileDao {
	public List<ProProfileDto> proSimple();
	public ProProfileDto proDetail(String id);
}
