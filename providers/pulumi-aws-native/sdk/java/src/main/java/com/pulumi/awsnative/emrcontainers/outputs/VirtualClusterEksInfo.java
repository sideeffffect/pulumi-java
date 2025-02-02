// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.emrcontainers.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualClusterEksInfo {
    private final String namespace;

    @CustomType.Constructor
    private VirtualClusterEksInfo(@CustomType.Parameter("namespace") String namespace) {
        this.namespace = namespace;
    }

    public String namespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualClusterEksInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualClusterEksInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }        public VirtualClusterEksInfo build() {
            return new VirtualClusterEksInfo(namespace);
        }
    }
}
