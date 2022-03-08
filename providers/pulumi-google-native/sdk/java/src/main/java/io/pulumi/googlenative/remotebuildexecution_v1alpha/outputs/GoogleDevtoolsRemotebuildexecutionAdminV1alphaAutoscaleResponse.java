// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse {
    /**
     * The maximal number of workers. Must be equal to or greater than min_size.
     * 
     */
    private final String maxSize;
    /**
     * The minimal number of workers. Must be greater than 0.
     * 
     */
    private final String minSize;

    @OutputCustomType.Constructor({"maxSize","minSize"})
    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse(
        String maxSize,
        String minSize) {
        this.maxSize = maxSize;
        this.minSize = minSize;
    }

    /**
     * The maximal number of workers. Must be equal to or greater than min_size.
     * 
    */
    public String getMaxSize() {
        return this.maxSize;
    }
    /**
     * The minimal number of workers. Must be greater than 0.
     * 
    */
    public String getMinSize() {
        return this.minSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maxSize;
        private String minSize;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
        }

        public Builder setMaxSize(String maxSize) {
            this.maxSize = Objects.requireNonNull(maxSize);
            return this;
        }

        public Builder setMinSize(String minSize) {
            this.minSize = Objects.requireNonNull(minSize);
            return this;
        }
        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse(maxSize, minSize);
        }
    }
}
