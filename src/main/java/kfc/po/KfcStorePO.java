package kfc.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author OnCloud9
 * @description
 * @project RegionReptile-Remaster
 * @date 2022年07月09日 上午 11:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class KfcStorePO {
    // 门店名称
    private String storeName;
    // 省份名
    private String provinceName;
    // 城市名称
    private String cityName;
    // 这个门店可支持的功能描述
    private String pro;
    // 详细地址
    private String addressDetail;
    // 创建时间
    private LocalDateTime genTime;
}
