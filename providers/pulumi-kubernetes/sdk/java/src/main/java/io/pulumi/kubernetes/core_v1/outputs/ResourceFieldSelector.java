// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceFieldSelector {
    /**
     * Container name: required for volumes, optional for env vars
     * 
     */
    private final @Nullable String containerName;
    /**
     * Specifies the output format of the exposed resources, defaults to "1"
     * 
     */
    private final @Nullable String divisor;
    /**
     * Required: resource to select
     * 
     */
    private final String resource;

    @OutputCustomType.Constructor
    private ResourceFieldSelector(
        @OutputCustomType.Parameter("containerName") @Nullable String containerName,
        @OutputCustomType.Parameter("divisor") @Nullable String divisor,
        @OutputCustomType.Parameter("resource") String resource) {
        this.containerName = containerName;
        this.divisor = divisor;
        this.resource = resource;
    }

    /**
     * Container name: required for volumes, optional for env vars
     * 
    */
    public Optional<String> getContainerName() {
        return Optional.ofNullable(this.containerName);
    }
    /**
     * Specifies the output format of the exposed resources, defaults to "1"
     * 
    */
    public Optional<String> getDivisor() {
        return Optional.ofNullable(this.divisor);
    }
    /**
     * Required: resource to select
     * 
    */
    public String getResource() {
        return this.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceFieldSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerName;
        private @Nullable String divisor;
        private String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceFieldSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.divisor = defaults.divisor;
    	      this.resource = defaults.resource;
        }

        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder divisor(@Nullable String divisor) {
            this.divisor = divisor;
            return this;
        }

        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public ResourceFieldSelector build() {
            return new ResourceFieldSelector(containerName, divisor, resource);
        }
    }
}
