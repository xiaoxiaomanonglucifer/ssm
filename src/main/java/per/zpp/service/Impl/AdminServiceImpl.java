package per.zpp.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.zpp.domain.Admin;
import per.zpp.mapper.AdminMapper;
import per.zpp.service.AdminService;

import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin queryByUsernameAndPwd(Admin admin) {
        return adminMapper.selectByUsernameAndPwd(admin);
    }


    @Override
    public int queryCount() {
        return adminMapper.totalAdmin();
    }
}
