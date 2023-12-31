package com.sakura.product.entify;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author Sakura
 * @date 2023/7/28 15:13
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@TableName("t_product")
public class Product extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品编号
     */
    private String productNo;

    /**
     * 单价
     */
    private Integer unitPrice;

    /**
     * 创建日期
     */
    private Date createDt;

    /**
     * 修改日期
     */
    private Date updateDt;

    /**
     * 状态：1正常 0删除
     */
    private Integer status;

}
