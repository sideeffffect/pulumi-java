// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs extends ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs Empty = new ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs();

    /**
     * API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
     */
    @Import(name="methodSelectors")
    private @Nullable Output<List<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs>> methodSelectors;

    /**
     * @return API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs>>> methodSelectors() {
        return Optional.ofNullable(this.methodSelectors);
    }

    /**
     * The name of the API whose methods or permissions the `IngressPolicy` or
     * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
     * field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The name of the API whose methods or permissions the `IngressPolicy` or
     * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
     * field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    private ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs() {}

    private ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs(ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs $) {
        this.methodSelectors = $.methodSelectors;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs $;

        public Builder() {
            $ = new ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs();
        }

        public Builder(ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs defaults) {
            $ = new ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param methodSelectors API methods or permissions to allow. Method or permission must belong
         * to the service specified by `serviceName` field. A single MethodSelector
         * entry with `*` specified for the `method` field will allow all methods
         * AND permissions for the service specified in `serviceName`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder methodSelectors(@Nullable Output<List<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs>> methodSelectors) {
            $.methodSelectors = methodSelectors;
            return this;
        }

        /**
         * @param methodSelectors API methods or permissions to allow. Method or permission must belong
         * to the service specified by `serviceName` field. A single MethodSelector
         * entry with `*` specified for the `method` field will allow all methods
         * AND permissions for the service specified in `serviceName`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder methodSelectors(List<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs> methodSelectors) {
            return methodSelectors(Output.of(methodSelectors));
        }

        /**
         * @param methodSelectors API methods or permissions to allow. Method or permission must belong
         * to the service specified by `serviceName` field. A single MethodSelector
         * entry with `*` specified for the `method` field will allow all methods
         * AND permissions for the service specified in `serviceName`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder methodSelectors(ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs... methodSelectors) {
            return methodSelectors(List.of(methodSelectors));
        }

        /**
         * @param serviceName The name of the API whose methods or permissions the `IngressPolicy` or
         * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
         * field set to `*` will allow all methods AND permissions for all services.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API whose methods or permissions the `IngressPolicy` or
         * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
         * field set to `*` will allow all methods AND permissions for all services.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs build() {
            return $;
        }
    }

}
