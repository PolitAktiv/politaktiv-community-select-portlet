/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.politaktiv.communityselect.application;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.util.Http;

public class HttpMock implements Http {

	@Override
	public String addParameter(String url, String name, boolean value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addParameter(String url, String name, double value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addParameter(String url, String name, int value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addParameter(String url, String name, long value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addParameter(String url, String name, short value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addParameter(String url, String name, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String decodePath(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String decodeURL(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String decodeURL(String url, boolean unescapeSpaces) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String encodePath(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String encodeURL(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String encodeURL(String url, boolean escapeSpaces) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fixPath(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fixPath(String path, boolean leading, boolean trailing) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCompleteURL(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cookie[] getCookies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDomain(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIpAddress(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getParameter(String url, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getParameter(String url, String name, boolean escaped) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String[]> getParameterMap(String queryString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProtocol(ActionRequest actionRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProtocol(boolean secure) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProtocol(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProtocol(RenderRequest renderRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProtocol(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getQueryString(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRequestURL(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasDomain(String url) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasProtocol(String url) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasProxyConfig() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isNonProxyHost(String host) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isProxyHost(String host) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, String[]> parameterMapFromString(String queryString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String parameterMapToString(Map<String, String[]> parameterMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String parameterMapToString(Map<String, String[]> parameterMap,
			boolean addQuestion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String protocolize(String url, ActionRequest actionRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String protocolize(String url, boolean secure) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String protocolize(String url, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String protocolize(String url, RenderRequest renderRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeDomain(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeParameter(String url, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeProtocol(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setParameter(String url, String name, boolean value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setParameter(String url, String name, double value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setParameter(String url, String name, int value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setParameter(String url, String name, long value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setParameter(String url, String name, short value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setParameter(String url, String name, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] URLtoByteArray(Options options) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] URLtoByteArray(String location) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] URLtoByteArray(String location, boolean post)
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String URLtoString(Options options) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String URLtoString(String location) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String URLtoString(String location, boolean post) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String URLtoString(URL url) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
