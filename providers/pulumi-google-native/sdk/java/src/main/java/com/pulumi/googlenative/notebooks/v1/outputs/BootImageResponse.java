// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class BootImageResponse {
    @CustomType.Constructor
    private BootImageResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BootImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(BootImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public BootImageResponse build() {
            return new BootImageResponse();
        }
    }
}
