package id.codefun.common.service;

import id.codefun.common.model.request.BaseRequest;
import id.codefun.common.model.response.BaseResponse;

public abstract interface BaseService<input extends BaseRequest, output extends BaseResponse> {
  
    public abstract output execute(input request);

  }