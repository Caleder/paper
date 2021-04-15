package com.bingbing.paper.enumType;

public enum RedisBusEnum implements EnumBase<Integer> {
	
	PIC_VERIFICATION_CODE("图形验证码")
	;

	private String message;
	
	RedisBusEnum(String message){
		this.message=message;
	}
	
	@Override
	public String message() {
		// TODO Auto-generated method stub
		return this.message;
	}

	@Override
	public Integer value() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
