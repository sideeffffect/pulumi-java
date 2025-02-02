// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.InstancePropertiesPatchResponse;
import java.util.Objects;

@CustomType
public final class InstanceGroupManagerAllInstancesConfigResponse {
    /**
     * @return Properties for instances that are created using this instances config. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting instances_config, you must update your instances to use it; for example, you can use the applyUpdatesToInstances method.
     * 
     */
    private final InstancePropertiesPatchResponse properties;

    @CustomType.Constructor
    private InstanceGroupManagerAllInstancesConfigResponse(@CustomType.Parameter("properties") InstancePropertiesPatchResponse properties) {
        this.properties = properties;
    }

    /**
     * @return Properties for instances that are created using this instances config. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting instances_config, you must update your instances to use it; for example, you can use the applyUpdatesToInstances method.
     * 
     */
    public InstancePropertiesPatchResponse properties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerAllInstancesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePropertiesPatchResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerAllInstancesConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder properties(InstancePropertiesPatchResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }        public InstanceGroupManagerAllInstancesConfigResponse build() {
            return new InstanceGroupManagerAllInstancesConfigResponse(properties);
        }
    }
}
