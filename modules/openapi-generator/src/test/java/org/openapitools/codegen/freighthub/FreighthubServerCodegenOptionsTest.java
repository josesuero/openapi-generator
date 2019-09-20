package org.openapitools.codegen.freighthub;

import org.openapitools.codegen.AbstractOptionsTest;
import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.languages.FreighthubServerCodegen;
import org.openapitools.codegen.options.FreighthubServerCodegenOptionsProvider;

import mockit.Expectations;
import mockit.Tested;

public class FreighthubServerCodegenOptionsTest extends AbstractOptionsTest {

    @Tested
    private FreighthubServerCodegen codegen;

    public FreighthubServerCodegenOptionsTest() {
        super(new FreighthubServerCodegenOptionsProvider());
    }

    @Override
    protected CodegenConfig getCodegenConfig() {
        return codegen;
    }

    @SuppressWarnings("unused")
    @Override
    protected void setExpectations() {
        // TODO: Complete options
        new Expectations(codegen) {{

        }};
    }
}

