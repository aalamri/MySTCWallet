package com.demo.MySTCWallet.dto;

public class CreateCustomerResponseDTO extends BaseResponse {

    private CustomerDTO data;

    public CustomerDTO getData() {
        return data;
    }

    public void setData(CustomerDTO data) {
        this.data = data;
    }
}
