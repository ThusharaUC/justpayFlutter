package lk.sampath.iwallet.smb.services;

import lk.sampath.iwallet.smb.util.jpy.JPBank;

import javax.xml.ws.Response;
import java.util.List;


public interface JpyService {

    List<JPBank> getBankList();
//    Response registerAccount(PostAccount account);
}
