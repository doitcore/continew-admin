package top.doitcore.admin.controller.relationship;

import top.continew.starter.extension.crud.enums.Api;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import top.continew.starter.extension.crud.annotation.CrudRequestMapping;
import top.doitcore.admin.common.controller.BaseController;
import top.doitcore.admin.relationship.model.query.CustomerQuery;
import top.doitcore.admin.relationship.model.req.CustomerReq;
import top.doitcore.admin.relationship.model.resp.CustomerDetailResp;
import top.doitcore.admin.relationship.model.resp.CustomerResp;
import top.doitcore.admin.relationship.service.CustomerService;

/**
 * 客户信息管理 API
 *
 * @author xqsapper
 * @since 2025/02/25 17:34
 */
@Tag(name = "客户信息管理 API")
@RestController
@CrudRequestMapping(value = "/relationship/customer", api = {Api.PAGE, Api.DETAIL, Api.ADD, Api.UPDATE, Api.DELETE, Api.EXPORT})
public class CustomerController extends BaseController<CustomerService, CustomerResp, CustomerDetailResp, CustomerQuery, CustomerReq> {}