package org.joy.litemall.wx.dto;

import lombok.Data;

@Data
public class WxLoginInfo {
    private String code;
    private UserInfo userInfo;

    // 不包括敏感信息的原始数据字符串，用于计算签名
    private String rawData;
    // 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息，详见 用户数据的签名验证和加解密
    private String signature;
    // 包括敏感数据在内的完整用户信息的加密数据，详见 用户数据的签名验证和加解密
    private String encryptedData;
    //加密算法的初始向量，详见 用户数据的签名验证和加解密
    private String iv;

}
