// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ShareInfoElementResponse {
    /**
     * A relative URI containing the ID of the VM that has the disk attached.
     * 
     */
    private final String vmUri;

    @CustomType.Constructor
    private ShareInfoElementResponse(@CustomType.Parameter("vmUri") String vmUri) {
        this.vmUri = vmUri;
    }

    /**
     * A relative URI containing the ID of the VM that has the disk attached.
     * 
    */
    public String vmUri() {
        return this.vmUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareInfoElementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vmUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareInfoElementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vmUri = defaults.vmUri;
        }

        public Builder vmUri(String vmUri) {
            this.vmUri = Objects.requireNonNull(vmUri);
            return this;
        }        public ShareInfoElementResponse build() {
            return new ShareInfoElementResponse(vmUri);
        }
    }
}
