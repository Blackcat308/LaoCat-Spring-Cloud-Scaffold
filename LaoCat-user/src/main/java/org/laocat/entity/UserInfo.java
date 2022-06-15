package org.laocat.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

/**
 * @Description
 * @Author LaoCat
 * @Date 2022-06-15 04:43
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用户信息表")
public class UserInfo extends Model<UserInfo> implements Serializable {

    private static final long serialVersionUID = 97097766963848492L;

    @TableId
    private String id;

    /**
     * 账号
     */
    @ApiModelProperty(value = "账号")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

}