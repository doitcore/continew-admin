package top.doitcore.admin.relationship.model.resp;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import top.doitcore.admin.common.model.resp.BaseResp;

import java.io.Serial;
import java.time.*;

/**
 * 客户信息信息
 *
 * @author xqsapper
 * @since 2025/02/25 17:21
 */
@Data
@Schema(description = "客户信息信息")
public class CustomerResp extends BaseResp {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @Schema(description = "")
    private String username;

    /**
     * 昵称
     */
    @Schema(description = "昵称")
    private String nickname;

    /**
     * 密码
     */
    @Schema(description = "密码")
    private String password;

    /**
     * 性别（0：未知；1：男；2：女）
     */
    @Schema(description = "性别（0：未知；1：男；2：女）")
    private Integer gender;

    /**
     * 邮箱
     */
    @Schema(description = "邮箱")
    private String email;

    /**
     * 手机号码
     */
    @Schema(description = "手机号码")
    private String phone;

    /**
     * 课程数量
     */
    @Schema(description = "课程数量")
    private Integer courses;

    /**
     * 头像
     */
    @Schema(description = "头像")
    private String avatar;

    /**
     * 描述
     */
    @Schema(description = "描述")
    private String description;

    /**
     * 状态（1：启用；2：禁用）
     */
    @Schema(description = "状态（1：启用；2：禁用）")
    private Integer status;

    /**
     * 修改人
     */
    @Schema(description = "修改人")
    private Long updateUser;

    /**
     * 修改时间
     */
    @Schema(description = "修改时间")
    private LocalDateTime updateTime;

    /**
     * 最后一次修改密码时间
     */
    @Schema(description = "最后一次修改密码时间")
    private LocalDateTime pwdResetTime;
}