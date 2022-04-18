// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * ID of the project that produces and owns this service.
     * 
     */
    @Import(name="producerProjectId")
      private final @Nullable Output<String> producerProjectId;

    public Output<String> producerProjectId() {
        return this.producerProjectId == null ? Codegen.empty() : this.producerProjectId;
    }

    /**
     * The name of the service. See the [overview](/service-management/overview) for naming requirements.
     * 
     */
    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName == null ? Codegen.empty() : this.serviceName;
    }

    public ServiceArgs(
        @Nullable Output<String> producerProjectId,
        @Nullable Output<String> serviceName) {
        this.producerProjectId = producerProjectId;
        this.serviceName = serviceName;
    }

    private ServiceArgs() {
        this.producerProjectId = Codegen.empty();
        this.serviceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> producerProjectId;
        private @Nullable Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.producerProjectId = defaults.producerProjectId;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder producerProjectId(@Nullable Output<String> producerProjectId) {
            this.producerProjectId = producerProjectId;
            return this;
        }
        public Builder producerProjectId(@Nullable String producerProjectId) {
            this.producerProjectId = Codegen.ofNullable(producerProjectId);
            return this;
        }
        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Codegen.ofNullable(serviceName);
            return this;
        }        public ServiceArgs build() {
            return new ServiceArgs(producerProjectId, serviceName);
        }
    }
}
