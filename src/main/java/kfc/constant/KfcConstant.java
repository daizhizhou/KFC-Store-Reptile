package kfc.constant;

import java.util.regex.Pattern;

/**
 * 常量类
 */
public interface KfcConstant {

    /**
     * 官网门店查询首页
     */
    String KFC_STORE_CLIENT_PAGE = "http://www.kfc.com.cn/kfccda/storelist/index.aspx";

    /**
     * 门店查询接口
     */
    String KFC_STORE_PAGING_QUERY_API = "http://www.kfc.com.cn/kfccda/ashx/GetStoreList.ashx?op=cname";

    /**
     * 默认每页记录数
     */
    Integer PAGE_SIZE = 10;

    /**
     * 获取总记录数的正则表达式
     */
    Pattern TOTAL_PATTERN = Pattern.compile("\"rowcount\":[0-9]+");

}
