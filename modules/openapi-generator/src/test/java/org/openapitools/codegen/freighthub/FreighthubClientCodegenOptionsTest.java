package org.openapitools.codegen.freighthub;

import org.openapitools.codegen.AbstractOptionsTest;
import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.languages.FreighthubClientCodegen;
import org.openapitools.codegen.options.FreighthubClientCodegenOptionsProvider;

import mockit.Expectations;
import mockit.Tested;

public class FreighthubClientCodegenOptionsTest extends AbstractOptionsTest {

    @Tested
    private FreighthubClientCodegen codegen;

    public FreighthubClientCodegenOptionsTest() {
        super(new FreighthubClientCodegenOptionsProvider());
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

