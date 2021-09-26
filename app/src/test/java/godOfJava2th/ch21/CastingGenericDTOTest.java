package godOfJava2th.ch21;

import org.junit.jupiter.api.Test;

class CastingGenericDTOTest {

    @Test
    void checkGenericDTO(){
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<>();
        dto1.setObject(new String());

        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<>();
        dto2.setObject(new StringBuffer());

        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<>();
        dto3.setObject(new StringBuilder());
    }
}