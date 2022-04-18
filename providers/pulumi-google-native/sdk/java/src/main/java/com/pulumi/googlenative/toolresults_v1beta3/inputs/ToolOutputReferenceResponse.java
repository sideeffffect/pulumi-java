// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.FileReferenceResponse;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.TestCaseReferenceResponse;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.TimestampResponse;
import java.util.Objects;


/**
 * A reference to a ToolExecution output file.
 * 
 */
public final class ToolOutputReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ToolOutputReferenceResponse Empty = new ToolOutputReferenceResponse();

    /**
     * The creation time of the file. - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @Import(name="creationTime", required=true)
      private final TimestampResponse creationTime;

    public TimestampResponse creationTime() {
        return this.creationTime;
    }

    /**
     * A FileReference to an output file. - In response: always set - In create/update request: always set
     * 
     */
    @Import(name="output", required=true)
      private final FileReferenceResponse output;

    public FileReferenceResponse output() {
        return this.output;
    }

    /**
     * The test case to which this output file belongs. - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @Import(name="testCase", required=true)
      private final TestCaseReferenceResponse testCase;

    public TestCaseReferenceResponse testCase() {
        return this.testCase;
    }

    public ToolOutputReferenceResponse(
        TimestampResponse creationTime,
        FileReferenceResponse output,
        TestCaseReferenceResponse testCase) {
        this.creationTime = Objects.requireNonNull(creationTime, "expected parameter 'creationTime' to be non-null");
        this.output = Objects.requireNonNull(output, "expected parameter 'output' to be non-null");
        this.testCase = Objects.requireNonNull(testCase, "expected parameter 'testCase' to be non-null");
    }

    private ToolOutputReferenceResponse() {
        this.creationTime = null;
        this.output = null;
        this.testCase = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolOutputReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimestampResponse creationTime;
        private FileReferenceResponse output;
        private TestCaseReferenceResponse testCase;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolOutputReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.output = defaults.output;
    	      this.testCase = defaults.testCase;
        }

        public Builder creationTime(TimestampResponse creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder output(FileReferenceResponse output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }
        public Builder testCase(TestCaseReferenceResponse testCase) {
            this.testCase = Objects.requireNonNull(testCase);
            return this;
        }        public ToolOutputReferenceResponse build() {
            return new ToolOutputReferenceResponse(creationTime, output, testCase);
        }
    }
}
