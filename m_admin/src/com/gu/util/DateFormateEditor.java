/**
 * tzdeskϵͳƽ̨
 * tzupload
 * com.tz.util
 * DateFormateEditor.java
 * ������:xuchengfei 
 * ʱ�䣺2015��11��13��-����8:56:36 
 * 2015̶�ݽ���˾-��Ȩ����
 */
package com.gu.util;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 
 * 
 * DateFormateEditor
 * 创建人:gulj
 * 时间：2015年12月1日-下午2:30:27 
 * @version 1.0.0
 *
 */
public class DateFormateEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if(GStringUtils.isNotEmpty(text)){
			String pattern = "yyyy-MM-dd";
			if(text.indexOf(":")!=-1)pattern = "yyyy-MM-dd HH:mm:ss";
			try {
				setValue(new SimpleDateFormat(pattern).parse(text));
			} catch (ParseException e) {
				setValue(null);
			}
		}else{
			setValue(null);
		}
	}
}
