/* 
 * The MIT License
 *
 * Copyright 2017 Radomír Černoch (radomir.cernoch at gmail.com).
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.github.cernoch.matrixprint.model;

/**
 * Table which contains descriptions of columns and rows.
 * 
 * <p>Each description can have multiple values.</p>
 *
 * @author Radomír Černoch (radomir.cernoch at gmail.com)
 */
public interface HeadedTable<T> extends Matrix<T> {

    /**
     * Description above columns.
     * 
     * @return non-{@code null} instance
     */
    public StringMatrix colHead();

    /**
     * Description left of rows.
     * 
     * @return non-{@code null} instance
     */
    public StringMatrix rowHead();

    /**
     * Description below columns.
     * 
     * @return non-{@code null} instance
     */
    public StringMatrix colTail();

    /**
     * Description right of rows.
     * 
     * @return non-{@code null} instance
     */
    public StringMatrix rowTail();
}
