package com.souja.lib.widget.cityPicker.style.citypickerview.widget;


public abstract class XCallbackListener {

	protected abstract void callback(Object... obj);

	public void call(Object... obj) {
			callback(obj);
	}

}
