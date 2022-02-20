package cscd212.iodecorator;

import java.io.FilterInputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStream extends FilterInputStream {
    public UpperCaseInputStream(final InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toUpperCase((char)c));
    }

    @Override
    public int read(final byte[] b, final int offset, final int len) throws IOException {
        int result = super.read(b, offset, len);
        for(int i = offset; i < offset + result; i++) {
            b[i] = (byte)Character.toUpperCase((char)b[i]);
        }
        return result;
    }
}
