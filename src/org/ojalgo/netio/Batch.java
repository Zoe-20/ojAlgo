/*
 * Copyright 1997-2020 Optimatika
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
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.ojalgo.netio;

import java.util.ArrayList;
import java.util.Collection;

public class Batch extends ArrayList<Message> {

    private static final long serialVersionUID = 1L;

    public Batch() {
        super();
    }

    public Batch(final Collection<? extends Message> collection) {
        super(collection);
    }

    public Batch(final int anInitialCapacity) {
        super(anInitialCapacity);
    }

    public boolean add(final String command) {
        return super.add(new Message(command));
    }

    public boolean add(final String command, final String anArgument) {
        return super.add(new Message(command, anArgument));
    }

    public boolean add(final String command, final String anArgument, final String aParameter) {
        return super.add(new Message(command, anArgument, aParameter));
    }

    public boolean add(final String[] command) {
        return super.add(new Message(command));
    }

    @Override
    public String toString() {
        return Message.toString(this);
    }

}
