package com.lugj.gmall.user.service;

import com.lugj.gmall.user.bean.UmsMember;
import com.lugj.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
