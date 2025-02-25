package top.doitcore.admin.relationship.model.resp;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;

import top.doitcore.admin.common.model.resp.BaseDetailResp;

import java.io.Serial;
import java.time.*;

/**
 * 客户信息详情信息
 *
 * @author xqsapper
 * @since 2025/02/25 17:21
 */
@Data
@ExcelIgnoreUnannotated
@Schema(description = "客户信息详情信息")
public class CustomerDetailResp extends BaseDetailResp {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @Schema(description = "")
    @ExcelProperty(value = "")
    private String username;

    /**
     * 昵称
     */
    @Schema(description = "昵称")
    @ExcelProperty(value = "昵称")
    private String nickname;

    /**
     * 密码
     */
    @Schema(description = "密码")
    @ExcelProperty(value = "密码")
    private String password;

    /**
     * 性别（0：未知；1：男；2：女）
     */
    @Schema(description = "性别（0：未知；1：男；2：女）")
    @ExcelProperty(value = "性别（0：未知；1：男；2：女）")
    private Integer gender;

    /**
     * 邮箱
     */
    @Schema(description = "邮箱")
    @ExcelProperty(value = "邮箱")
    private String email;

    /**
     * 手机号码
     */
    @Schema(description = "手机号码")
    @ExcelProperty(value = "手机号码")
    private String phone;

    /**
     * 课程数量
     */
    @Schema(description = "课程数量")
    @ExcelProperty(value = "课程数量")
    private Integer courses;

    /**
     * 头像
     */
    @Schema(description = "头像")
    @ExcelProperty(value = "头像")
    private String avatar;

    /**
     * 描述
     */
    @Schema(description = "描述")
    @ExcelProperty(value = "描述")
    private String description;

    /**
     * 状态（1：启用；2：禁用）
     */
    @Schema(description = "状态（1：启用；2：禁用）")
    @ExcelProperty(value = "状态（1：启用；2：禁用）")
    private Integer status;

    /**
     * 最后一次修改密码时间
     */
    @Schema(description = "最后一次修改密码时间")
    @ExcelProperty(value = "最后一次修改密码时间")
    private LocalDateTime pwdResetTime;
}