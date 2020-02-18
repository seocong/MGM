package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.MemberDto;
import com.gam.mgm.dto.ProProfileDto;

public interface IProProfileService {
	public List<ProProfileDto> proSimple();
	public ProProfileDto proDetail(String id);
}
