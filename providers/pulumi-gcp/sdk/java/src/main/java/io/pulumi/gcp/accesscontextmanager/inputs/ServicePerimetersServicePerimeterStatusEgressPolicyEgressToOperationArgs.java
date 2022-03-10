// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs Empty = new ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs();

    /**
     * API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
     */
    @InputImport(name="methodSelectors")
      private final @Nullable Input<List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors;

    public Input<List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs>> getMethodSelectors() {
        return this.methodSelectors == null ? Input.empty() : this.methodSelectors;
    }

    /**
     * The name of the API whose methods or permissions the `IngressPolicy` or
     * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
     * field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    @InputImport(name="serviceName")
      private final @Nullable Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName == null ? Input.empty() : this.serviceName;
    }

    public ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs(
        @Nullable Input<List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors,
        @Nullable Input<String> serviceName) {
        this.methodSelectors = methodSelectors;
        this.serviceName = serviceName;
    }

    private ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs() {
        this.methodSelectors = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors;
        private @Nullable Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methodSelectors = defaults.methodSelectors;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder methodSelectors(@Nullable Input<List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors) {
            this.methodSelectors = methodSelectors;
            return this;
        }

        public Builder methodSelectors(@Nullable List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs> methodSelectors) {
            this.methodSelectors = Input.ofNullable(methodSelectors);
            return this;
        }

        public Builder serviceName(@Nullable Input<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Input.ofNullable(serviceName);
            return this;
        }
        public ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs build() {
            return new ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs(methodSelectors, serviceName);
        }
    }
}
