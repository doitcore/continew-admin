package top.doitcore.admin.relationship.model.req;

import jakarta.validation.constraints.*;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import org.hibernate.validator.constraints.Length;

import java.io.Serial;
import java.io.Serializable;
import java.time.*;

/**
 * 创建或修改客户信息参数
 *
 * @author xqsapper
 * @since 2025/02/25 17:21
 */
@Data
@Schema(description = "创建或修改客户信息参数")
public class CustomerReq implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 昵称
     */
    @Schema(description = "昵称")
    @NotBlank(message = "昵称不能为空")
    @Length(max = 30, message = "昵称长度不能超过 {max} 个字符")
    private String nickname;

    /**
     * 性别（0：未知；1：男；2：女）
     */
    @Schema(description = "性别（0：未知；1：男；2：女）")
    @NotNull(message = "性别（0：未知；1：男；2：女）不能为空")
    private Integer gender;

    /**
     * 状态（1：启用；2：禁用）
     */
    @Schema(description = "状态（1：启用；2：禁用）")
    @NotNull(message = "状态（1：启用；2：禁用）不能为空")
    private Integer status;

    /**
     * 创建时间
     */
    @Schema(description = "创建时间")
    @NotNull(message = "创建时间不能为空")
    private LocalDateTime createTime;
}