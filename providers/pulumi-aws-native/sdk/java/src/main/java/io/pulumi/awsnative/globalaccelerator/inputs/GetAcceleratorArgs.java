// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAcceleratorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAcceleratorArgs Empty = new GetAcceleratorArgs();

    /**
     * The Amazon Resource Name (ARN) of the accelerator.
     * 
     */
    @InputImport(name="acceleratorArn", required=true)
      private final String acceleratorArn;

    public String getAcceleratorArn() {
        return this.acceleratorArn;
    }

    public GetAcceleratorArgs(String acceleratorArn) {
        this.acceleratorArn = Objects.requireNonNull(acceleratorArn, "expected parameter 'acceleratorArn' to be non-null");
    }

    private GetAcceleratorArgs() {
        this.acceleratorArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acceleratorArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAcceleratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorArn = defaults.acceleratorArn;
        }

        public Builder acceleratorArn(String acceleratorArn) {
            this.acceleratorArn = Objects.requireNonNull(acceleratorArn);
            return this;
        }
        public GetAcceleratorArgs build() {
            return new GetAcceleratorArgs(acceleratorArn);
        }
    }
}
