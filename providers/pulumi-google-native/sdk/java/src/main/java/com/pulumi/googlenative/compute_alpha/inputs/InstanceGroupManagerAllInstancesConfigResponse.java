// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.InstancePropertiesPatchResponse;
import java.util.Objects;


public final class InstanceGroupManagerAllInstancesConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerAllInstancesConfigResponse Empty = new InstanceGroupManagerAllInstancesConfigResponse();

    /**
     * Properties for instances that are created using this instances config. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting instances_config, you must update your instances to use it; for example, you can use the applyUpdatesToInstances method.
     * 
     */
    @Import(name="properties", required=true)
    private InstancePropertiesPatchResponse properties;

    public InstancePropertiesPatchResponse properties() {
        return this.properties;
    }

    private InstanceGroupManagerAllInstancesConfigResponse() {}

    private InstanceGroupManagerAllInstancesConfigResponse(InstanceGroupManagerAllInstancesConfigResponse $) {
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerAllInstancesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerAllInstancesConfigResponse $;

        public Builder() {
            $ = new InstanceGroupManagerAllInstancesConfigResponse();
        }

        public Builder(InstanceGroupManagerAllInstancesConfigResponse defaults) {
            $ = new InstanceGroupManagerAllInstancesConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder properties(InstancePropertiesPatchResponse properties) {
            $.properties = properties;
            return this;
        }

        public InstanceGroupManagerAllInstancesConfigResponse build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            return $;
        }
    }

}
