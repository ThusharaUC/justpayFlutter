package lk.sampath.iwallet.smb.services;

//import com.hitachidps.iwallet.smb.model.dto.ResponseLoginUser;
//import com.hitachidps.iwallet.smb.model.dto.VishwaLoginRequest;

import lk.sampath.iwallet.smb.model.dto.ResponseLoginUser;
import lk.sampath.iwallet.smb.model.dto.VishwaLoginRequest;
import lk.sampath.iwallet.smb.rest.dto.NicValidateRes;

public interface VishwaService {

    ResponseLoginUser vishwaLogin(String clientId, String clientSecret, VishwaLoginRequest loginUser) throws Exception;


    NicValidateRes validateNic(String nicType,String nic) throws Exception;


}
