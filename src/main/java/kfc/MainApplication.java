package kfc;

import kfc.po.BasicInfo;
import kfc.util.KfcUtil;

import java.net.HttpCookie;
import java.util.List;

import static kfc.util.KfcUtil.getBasicInfo;
import static kfc.util.KfcUtil.getPagingData;

/**
 * @author OnCloud9
 * @description
 * @project KFC-Store-Reptile
 * @date 2022年08月06日 上午 10:08
 */
public class MainApplication {

    public static void main(String[] args) {

        // 初始化表
        KfcUtil.initialTableSpace();

        // 获取基础信息
        final BasicInfo basicInfo = getBasicInfo();
        final List<String> cityNames = basicInfo.getCityNames();
        final List<HttpCookie> cookies = basicInfo.getCookies();

        // 读取门店，并写入
        cityNames.forEach(cityName -> getPagingData(cityName, 1, 50, cookies));
    }
}
