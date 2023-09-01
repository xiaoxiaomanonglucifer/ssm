package per.zpp.service;

import per.zpp.domain.Admin;

import java.util.Map;

public interface AdminService {

    Admin queryByUsernameAndPwd(Admin admin);

    int queryCount();
}
