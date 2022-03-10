// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLocationSMBArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLocationSMBArgs Empty = new GetLocationSMBArgs();

    /**
     * The Amazon Resource Name (ARN) of the SMB location that is created.
     * 
     */
    @InputImport(name="locationArn", required=true)
      private final String locationArn;

    public String getLocationArn() {
        return this.locationArn;
    }

    public GetLocationSMBArgs(String locationArn) {
        this.locationArn = Objects.requireNonNull(locationArn, "expected parameter 'locationArn' to be non-null");
    }

    private GetLocationSMBArgs() {
        this.locationArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationSMBArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String locationArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationSMBArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationArn = defaults.locationArn;
        }

        public Builder locationArn(String locationArn) {
            this.locationArn = Objects.requireNonNull(locationArn);
            return this;
        }
        public GetLocationSMBArgs build() {
            return new GetLocationSMBArgs(locationArn);
        }
    }
}
