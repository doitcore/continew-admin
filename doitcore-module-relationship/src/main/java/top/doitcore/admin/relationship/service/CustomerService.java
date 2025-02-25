package top.doitcore.admin.relationship.service;

import top.continew.starter.extension.crud.service.BaseService;
import top.doitcore.admin.relationship.model.query.CustomerQuery;
import top.doitcore.admin.relationship.model.req.CustomerReq;
import top.doitcore.admin.relationship.model.resp.CustomerDetailResp;
import top.doitcore.admin.relationship.model.resp.CustomerResp;

/**
 * 客户信息业务接口
 *
 * @author xqsapper
 * @since 2025/02/25 17:34
 */
public interface CustomerService extends BaseService<CustomerResp, CustomerDetailResp, CustomerQuery, CustomerReq> {}