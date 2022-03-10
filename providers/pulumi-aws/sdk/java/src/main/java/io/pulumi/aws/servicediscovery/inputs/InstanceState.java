// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * A map contains the attributes of the instance. Check the [doc](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#API_RegisterInstance_RequestSyntax) for the supported attributes and syntax.
     * 
     */
    @InputImport(name="attributes")
      private final @Nullable Input<Map<String,String>> attributes;

    public Input<Map<String,String>> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    /**
     * The ID of the service instance.
     * 
     */
    @InputImport(name="instanceId")
      private final @Nullable Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId == null ? Input.empty() : this.instanceId;
    }

    /**
     * The ID of the service that you want to use to create the instance.
     * 
     */
    @InputImport(name="serviceId")
      private final @Nullable Input<String> serviceId;

    public Input<String> getServiceId() {
        return this.serviceId == null ? Input.empty() : this.serviceId;
    }

    public InstanceState(
        @Nullable Input<Map<String,String>> attributes,
        @Nullable Input<String> instanceId,
        @Nullable Input<String> serviceId) {
        this.attributes = attributes;
        this.instanceId = instanceId;
        this.serviceId = serviceId;
    }

    private InstanceState() {
        this.attributes = Input.empty();
        this.instanceId = Input.empty();
        this.serviceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> attributes;
        private @Nullable Input<String> instanceId;
        private @Nullable Input<String> serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.instanceId = defaults.instanceId;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder attributes(@Nullable Input<Map<String,String>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder attributes(@Nullable Map<String,String> attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder instanceId(@Nullable Input<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = Input.ofNullable(instanceId);
            return this;
        }

        public Builder serviceId(@Nullable Input<String> serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder serviceId(@Nullable String serviceId) {
            this.serviceId = Input.ofNullable(serviceId);
            return this;
        }
        public InstanceState build() {
            return new InstanceState(attributes, instanceId, serviceId);
        }
    }
}
