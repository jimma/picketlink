/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
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
package org.picketlink.test.identity.federation.web.mock;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;

/**
 * Mock Servlet Response
 *
 * @author Anil.Saldhana@redhat.com
 * @since Oct 7, 2009
 */
public class MockHttpServletResponse implements HttpServletResponse {
    private PrintWriter printWriter;

    public void setOutputStream(final OutputStream os) {
        this.outputStream = new ServletOutputStream() {
            @Override
            public void write(int b) throws IOException {
                os.write(b);
            }
        };
    }

    public void setWriter(PrintWriter pw) {
        this.printWriter = pw;
    }

    private int errorCode;
    private ServletOutputStream outputStream;

    public void addCookie(Cookie arg0) {
    }

    public void addDateHeader(String arg0, long arg1) {
    }

    public void addHeader(String arg0, String arg1) {
    }

    public void addIntHeader(String arg0, int arg1) {
    }

    public boolean containsHeader(String arg0) {
        return false;
    }

    public String encodeRedirectURL(String arg0) {

        throw new RuntimeException("NYI");
    }

    public String encodeRedirectUrl(String arg0) {

        throw new RuntimeException("NYI");
    }

    public String encodeURL(String arg0) {

        throw new RuntimeException("NYI");
    }

    public String encodeUrl(String arg0) {

        throw new RuntimeException("NYI");
    }

    public int getError() {
        return this.errorCode;
    }

    public void sendError(int arg0) throws IOException {
        this.errorCode = arg0;
    }

    public void sendError(int arg0, String arg1) throws IOException {
        sendError(arg0);
    }

    public void sendRedirect(String arg0) throws IOException {

    }

    public void setDateHeader(String arg0, long arg1) {

    }

    public void setHeader(String arg0, String arg1) {

    }

    public void setIntHeader(String arg0, int arg1) {

    }

    public void setStatus(int arg0) {

    }

    public void setStatus(int arg0, String arg1) {

    }

    public void flushBuffer() throws IOException {

    }

    public int getBufferSize() {

        return 0;
    }

    public String getCharacterEncoding() {

        throw new RuntimeException("NYI");
    }

    public String getContentType() {

        throw new RuntimeException("NYI");
    }

    public Locale getLocale() {

        throw new RuntimeException("NYI");
    }

    public ServletOutputStream getOutputStream() throws IOException {
        return this.outputStream;
    }

    public PrintWriter getWriter() throws IOException {
        return this.printWriter;
    }

    public boolean isCommitted() {

        return false;
    }

    public void reset() {

    }

    public void resetBuffer() {

    }

    public void setBufferSize(int arg0) {

    }

    public void setCharacterEncoding(String arg0) {

    }

    public void setContentLength(int arg0) {

    }

    public void setContentType(String arg0) {

    }

    public void setLocale(Locale arg0) {
    }

    public int getStatus() {
        return 0;
    }

    public String getHeader(String name) {
        return null;
    }

    public Collection<String> getHeaders(String name) {
        return null;
    }

    public Collection<String> getHeaderNames() {
        return null;
    }

}
