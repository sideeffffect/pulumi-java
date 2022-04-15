// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.endpoints.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.endpoints.inputs.ServiceApiGetArgs;
import io.pulumi.gcp.endpoints.inputs.ServiceEndpointGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceState Empty = new ServiceState();

    /**
     * A list of API objects.
     * 
     */
    @Import(name="apis")
      private final @Nullable Output<List<ServiceApiGetArgs>> apis;

    public Output<List<ServiceApiGetArgs>> apis() {
        return this.apis == null ? Codegen.empty() : this.apis;
    }

    /**
     * The autogenerated ID for the configuration that is rolled out as part of the creation of this resource. Must be provided
     * to compute engine instances as a tag.
     * 
     */
    @Import(name="configId")
      private final @Nullable Output<String> configId;

    public Output<String> configId() {
        return this.configId == null ? Codegen.empty() : this.configId;
    }

    /**
     * The address at which the service can be found - usually the same as the service name.
     * 
     */
    @Import(name="dnsAddress")
      private final @Nullable Output<String> dnsAddress;

    public Output<String> dnsAddress() {
        return this.dnsAddress == null ? Codegen.empty() : this.dnsAddress;
    }

    /**
     * A list of Endpoint objects.
     * 
     */
    @Import(name="endpoints")
      private final @Nullable Output<List<ServiceEndpointGetArgs>> endpoints;

    public Output<List<ServiceEndpointGetArgs>> endpoints() {
        return this.endpoints == null ? Codegen.empty() : this.endpoints;
    }

    /**
     * The full text of the Service Config YAML file (Example located here). If provided, must also provide
     * protoc_output_base64. open_api config must not be provided.
     * 
     */
    @Import(name="grpcConfig")
      private final @Nullable Output<String> grpcConfig;

    public Output<String> grpcConfig() {
        return this.grpcConfig == null ? Codegen.empty() : this.grpcConfig;
    }

    /**
     * The full text of the OpenAPI YAML configuration as described here. Either this, or both of grpc_config and
     * protoc_output_base64 must be specified.
     * 
     */
    @Import(name="openapiConfig")
      private final @Nullable Output<String> openapiConfig;

    public Output<String> openapiConfig() {
        return this.openapiConfig == null ? Codegen.empty() : this.openapiConfig;
    }

    /**
     * The project ID that the service belongs to. If not provided, provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The full contents of the Service Descriptor File generated by protoc. This should be a compiled .pb file,
     * base64-encoded.
     * 
     */
    @Import(name="protocOutputBase64")
      private final @Nullable Output<String> protocOutputBase64;

    public Output<String> protocOutputBase64() {
        return this.protocOutputBase64 == null ? Codegen.empty() : this.protocOutputBase64;
    }

    /**
     * The name of the service. Usually of the form $apiname.endpoints.$projectid.cloud.goog.
     * 
     */
    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName == null ? Codegen.empty() : this.serviceName;
    }

    public ServiceState(
        @Nullable Output<List<ServiceApiGetArgs>> apis,
        @Nullable Output<String> configId,
        @Nullable Output<String> dnsAddress,
        @Nullable Output<List<ServiceEndpointGetArgs>> endpoints,
        @Nullable Output<String> grpcConfig,
        @Nullable Output<String> openapiConfig,
        @Nullable Output<String> project,
        @Nullable Output<String> protocOutputBase64,
        @Nullable Output<String> serviceName) {
        this.apis = apis;
        this.configId = configId;
        this.dnsAddress = dnsAddress;
        this.endpoints = endpoints;
        this.grpcConfig = grpcConfig;
        this.openapiConfig = openapiConfig;
        this.project = project;
        this.protocOutputBase64 = protocOutputBase64;
        this.serviceName = serviceName;
    }

    private ServiceState() {
        this.apis = Codegen.empty();
        this.configId = Codegen.empty();
        this.dnsAddress = Codegen.empty();
        this.endpoints = Codegen.empty();
        this.grpcConfig = Codegen.empty();
        this.openapiConfig = Codegen.empty();
        this.project = Codegen.empty();
        this.protocOutputBase64 = Codegen.empty();
        this.serviceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServiceApiGetArgs>> apis;
        private @Nullable Output<String> configId;
        private @Nullable Output<String> dnsAddress;
        private @Nullable Output<List<ServiceEndpointGetArgs>> endpoints;
        private @Nullable Output<String> grpcConfig;
        private @Nullable Output<String> openapiConfig;
        private @Nullable Output<String> project;
        private @Nullable Output<String> protocOutputBase64;
        private @Nullable Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apis = defaults.apis;
    	      this.configId = defaults.configId;
    	      this.dnsAddress = defaults.dnsAddress;
    	      this.endpoints = defaults.endpoints;
    	      this.grpcConfig = defaults.grpcConfig;
    	      this.openapiConfig = defaults.openapiConfig;
    	      this.project = defaults.project;
    	      this.protocOutputBase64 = defaults.protocOutputBase64;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder apis(@Nullable Output<List<ServiceApiGetArgs>> apis) {
            this.apis = apis;
            return this;
        }
        public Builder apis(@Nullable List<ServiceApiGetArgs> apis) {
            this.apis = Codegen.ofNullable(apis);
            return this;
        }
        public Builder apis(ServiceApiGetArgs... apis) {
            return apis(List.of(apis));
        }
        public Builder configId(@Nullable Output<String> configId) {
            this.configId = configId;
            return this;
        }
        public Builder configId(@Nullable String configId) {
            this.configId = Codegen.ofNullable(configId);
            return this;
        }
        public Builder dnsAddress(@Nullable Output<String> dnsAddress) {
            this.dnsAddress = dnsAddress;
            return this;
        }
        public Builder dnsAddress(@Nullable String dnsAddress) {
            this.dnsAddress = Codegen.ofNullable(dnsAddress);
            return this;
        }
        public Builder endpoints(@Nullable Output<List<ServiceEndpointGetArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(@Nullable List<ServiceEndpointGetArgs> endpoints) {
            this.endpoints = Codegen.ofNullable(endpoints);
            return this;
        }
        public Builder endpoints(ServiceEndpointGetArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder grpcConfig(@Nullable Output<String> grpcConfig) {
            this.grpcConfig = grpcConfig;
            return this;
        }
        public Builder grpcConfig(@Nullable String grpcConfig) {
            this.grpcConfig = Codegen.ofNullable(grpcConfig);
            return this;
        }
        public Builder openapiConfig(@Nullable Output<String> openapiConfig) {
            this.openapiConfig = openapiConfig;
            return this;
        }
        public Builder openapiConfig(@Nullable String openapiConfig) {
            this.openapiConfig = Codegen.ofNullable(openapiConfig);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder protocOutputBase64(@Nullable Output<String> protocOutputBase64) {
            this.protocOutputBase64 = protocOutputBase64;
            return this;
        }
        public Builder protocOutputBase64(@Nullable String protocOutputBase64) {
            this.protocOutputBase64 = Codegen.ofNullable(protocOutputBase64);
            return this;
        }
        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Codegen.ofNullable(serviceName);
            return this;
        }        public ServiceState build() {
            return new ServiceState(apis, configId, dnsAddress, endpoints, grpcConfig, openapiConfig, project, protocOutputBase64, serviceName);
        }
    }
}
