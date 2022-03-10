// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetStudioComponentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStudioComponentArgs Empty = new GetStudioComponentArgs();

    @InputImport(name="studioComponentId", required=true)
      private final String studioComponentId;

    public String getStudioComponentId() {
        return this.studioComponentId;
    }

    /**
     * <p>The studioId. </p>
     * 
     */
    @InputImport(name="studioId", required=true)
      private final String studioId;

    public String getStudioId() {
        return this.studioId;
    }

    public GetStudioComponentArgs(
        String studioComponentId,
        String studioId) {
        this.studioComponentId = Objects.requireNonNull(studioComponentId, "expected parameter 'studioComponentId' to be non-null");
        this.studioId = Objects.requireNonNull(studioId, "expected parameter 'studioId' to be non-null");
    }

    private GetStudioComponentArgs() {
        this.studioComponentId = null;
        this.studioId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStudioComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String studioComponentId;
        private String studioId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStudioComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.studioComponentId = defaults.studioComponentId;
    	      this.studioId = defaults.studioId;
        }

        public Builder studioComponentId(String studioComponentId) {
            this.studioComponentId = Objects.requireNonNull(studioComponentId);
            return this;
        }

        public Builder studioId(String studioId) {
            this.studioId = Objects.requireNonNull(studioId);
            return this;
        }
        public GetStudioComponentArgs build() {
            return new GetStudioComponentArgs(studioComponentId, studioId);
        }
    }
}
