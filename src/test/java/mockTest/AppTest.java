package mockTest;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AppTest
{
    @Test
    public void TestZwracanejWartosci(){
        App2 a = mock(App2.class);
        when(a.zwracamWartosc()).thenReturn(5);
        String wartosc = new App().zwracaString();
        assertEquals("5",wartosc);
    }

}
