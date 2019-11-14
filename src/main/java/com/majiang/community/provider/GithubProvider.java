package com.majiang.community.provider;
import com.alibaba.fastjson.JSON;
import com.majiang.community.dto.AccessTokenDTO;
import com.majiang.community.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @program: community
 * @description
 * @author: tina.liu
 * @create: 2019-11-14 14:12
 **/
@Component
public class GithubProvider {

    public  String getAccessToken (AccessTokenDTO accessTokenDTO) {

        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            System.out.println("string的值为："+string);
            String token = string.split("&")[0].split("=")[1];
            System.out.println(" 第2步accessToken 的值为："+token);
            return  token;
        } catch (Exception e) {
        }
        return null;
    }//方法的大括号

    public GithubUser getUser(String accessToken) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user?access_token=" +accessToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String string = response.body().string();
            GithubUser githubUser = JSON.parseObject(string, GithubUser.class);
            System.out.println(" 第3步githubUser 的值为："+githubUser);
            return  githubUser;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}//类的大括号

























