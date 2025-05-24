package com.example.utils;


import com.alibaba.fastjson.JSON;
import com.example.ws.pojo.ResultMessage;

public class MessageUtils {
    /**
     *
     * @param isSystemMessage 是不是系统消息
     * @param fromName 发送者
     * @param message 发送的具体消息
     * @return
     */
    public static String getMessage(boolean isSystemMessage, String fromName, Object message){
        ResultMessage result = new ResultMessage();
        result.setSystem(isSystemMessage);
        result.setMessage(message);
        if (fromName != null){
            result.setFromName(fromName);
        }
        return JSON.toJSONString(result);
    }
}
