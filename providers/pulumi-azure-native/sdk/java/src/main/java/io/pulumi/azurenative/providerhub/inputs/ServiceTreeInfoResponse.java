// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTreeInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceTreeInfoResponse Empty = new ServiceTreeInfoResponse();

    @InputImport(name="componentId")
      private final @Nullable String componentId;

    public Optional<String> getComponentId() {
        return this.componentId == null ? Optional.empty() : Optional.ofNullable(this.componentId);
    }

    @InputImport(name="serviceId")
      private final @Nullable String serviceId;

    public Optional<String> getServiceId() {
        return this.serviceId == null ? Optional.empty() : Optional.ofNullable(this.serviceId);
    }

    public ServiceTreeInfoResponse(
        @Nullable String componentId,
        @Nullable String serviceId) {
        this.componentId = componentId;
        this.serviceId = serviceId;
    }

    private ServiceTreeInfoResponse() {
        this.componentId = null;
        this.serviceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTreeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String componentId;
        private @Nullable String serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTreeInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentId = defaults.componentId;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder componentId(@Nullable String componentId) {
            this.componentId = componentId;
            return this;
        }

        public Builder serviceId(@Nullable String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public ServiceTreeInfoResponse build() {
            return new ServiceTreeInfoResponse(componentId, serviceId);
        }
    }
}
