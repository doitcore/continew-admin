/*
 * Copyright (c) 2022-present Charles7c Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package top.doitcore.admin.relationship.model.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.Data;
import top.continew.starter.security.crypto.annotation.FieldEncrypt;
import top.doitcore.admin.common.config.mybatis.BCryptEncryptor;
import top.doitcore.admin.common.enums.DisEnableStatusEnum;
import top.doitcore.admin.common.enums.GenderEnum;
import top.doitcore.admin.common.model.entity.BaseDO;

import java.io.Serial;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 客户信息实体
 *
 * @author xqsapper
 * @since 2025/02/25 17:21
 */
@Data
@TableName("relationship_customer")
public class CustomerDO extends BaseDO {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别（0：未知；1：男；2：女）
     */
    private Integer gender;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 课程数量
     */
    private Integer courses;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 描述
     */
    private String description;

    /**
     * 状态（1：启用；2：禁用）
     */
    private Integer status;

    /**
     * 最后一次修改密码时间
     */
    private LocalDateTime pwdResetTime;
}