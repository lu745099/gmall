package com.lugj.gmall.user.mapper;

import com.lugj.gmall.user.bean.UmsMember;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface UserMapper extends Mapper<UmsMember>{

    //List<UmsMember> selectAllUser();

}
