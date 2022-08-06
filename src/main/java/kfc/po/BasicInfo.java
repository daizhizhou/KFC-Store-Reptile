package kfc.po;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.net.HttpCookie;
import java.util.List;

/**
 * @author OnCloud9
 * @description
 * @project RegionReptile-Remaster
 * @date 2022年07月09日 上午 11:52
 */
@Data
@EqualsAndHashCode
@Builder
public class BasicInfo {
    // 存放所有城市名称
    private List<String> cityNames;
    // 存放接口请求需要的Cookie
    private List<HttpCookie> cookies;
}
