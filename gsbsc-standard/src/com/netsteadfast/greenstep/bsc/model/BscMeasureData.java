/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package com.netsteadfast.greenstep.bsc.model;

public class BscMeasureData implements java.io.Serializable {
	private static final long serialVersionUID = 4898208147104099246L;
	private Object target;
	private Object actual;
	private Object kpi; // 2018-12-02
	
	public Object getTarget() {
		return target;
	}
	
	public void setTarget(Object target) {
		this.target = target;
	}
	
	public Object getActual() {
		return actual;
	}
	
	public void setActual(Object actual) {
		this.actual = actual;
	}

	public Object getKpi() {
		return kpi;
	}

	public void setKpi(Object kpi) {
		this.kpi = kpi;
	}
	
}
