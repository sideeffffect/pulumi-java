// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionInstanceGroupManagerVersionTargetSize;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionInstanceGroupManagerVersion {
    /**
     * - The full URL to an instance template from which all new instances of this version will be created.
     * 
     */
    private final String instanceTemplate;
    /**
     * - Version name.
     * 
     */
    private final @Nullable String name;
    /**
     * - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    private final @Nullable RegionInstanceGroupManagerVersionTargetSize targetSize;

    @OutputCustomType.Constructor
    private RegionInstanceGroupManagerVersion(
        @OutputCustomType.Parameter("instanceTemplate") String instanceTemplate,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("targetSize") @Nullable RegionInstanceGroupManagerVersionTargetSize targetSize) {
        this.instanceTemplate = instanceTemplate;
        this.name = name;
        this.targetSize = targetSize;
    }

    /**
     * - The full URL to an instance template from which all new instances of this version will be created.
     * 
    */
    public String getInstanceTemplate() {
        return this.instanceTemplate;
    }
    /**
     * - Version name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
    */
    public Optional<RegionInstanceGroupManagerVersionTargetSize> getTargetSize() {
        return Optional.ofNullable(this.targetSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceTemplate;
        private @Nullable String name;
        private @Nullable RegionInstanceGroupManagerVersionTargetSize targetSize;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceTemplate = defaults.instanceTemplate;
    	      this.name = defaults.name;
    	      this.targetSize = defaults.targetSize;
        }

        public Builder instanceTemplate(String instanceTemplate) {
            this.instanceTemplate = Objects.requireNonNull(instanceTemplate);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder targetSize(@Nullable RegionInstanceGroupManagerVersionTargetSize targetSize) {
            this.targetSize = targetSize;
            return this;
        }
        public RegionInstanceGroupManagerVersion build() {
            return new RegionInstanceGroupManagerVersion(instanceTemplate, name, targetSize);
        }
    }
}
