package org.openapitools.codegen.freighthub;

import org.openapitools.codegen.AbstractOptionsTest;
import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.languages.FreighthubDocumentationCodegen;
import org.openapitools.codegen.options.FreighthubDocumentationCodegenOptionsProvider;

import mockit.Expectations;
import mockit.Tested;

public class FreighthubDocumentationCodegenOptionsTest extends AbstractOptionsTest {

    @Tested
    private FreighthubDocumentationCodegen codegen;

    public FreighthubDocumentationCodegenOptionsTest() {
        super(new FreighthubDocumentationCodegenOptionsProvider());
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

