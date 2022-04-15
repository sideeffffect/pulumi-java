// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterSpecIngressPolicyIngressToOperation;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimeterSpecIngressPolicyIngressTo {
    /**
     * A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ServicePerimeterSpecIngressPolicyIngressToOperation> operations;
    /**
     * A list of resources, currently only projects in the form
     * `projects/<projectnumber>`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    private final @Nullable List<String> resources;

    @CustomType.Constructor
    private ServicePerimeterSpecIngressPolicyIngressTo(
        @CustomType.Parameter("operations") @Nullable List<ServicePerimeterSpecIngressPolicyIngressToOperation> operations,
        @CustomType.Parameter("resources") @Nullable List<String> resources) {
        this.operations = operations;
        this.resources = resources;
    }

    /**
     * A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * 
    */
    public List<ServicePerimeterSpecIngressPolicyIngressToOperation> operations() {
        return this.operations == null ? List.of() : this.operations;
    }
    /**
     * A list of resources, currently only projects in the form
     * `projects/<projectnumber>`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
    */
    public List<String> resources() {
        return this.resources == null ? List.of() : this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecIngressPolicyIngressTo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServicePerimeterSpecIngressPolicyIngressToOperation> operations;
        private @Nullable List<String> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecIngressPolicyIngressTo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operations = defaults.operations;
    	      this.resources = defaults.resources;
        }

        public Builder operations(@Nullable List<ServicePerimeterSpecIngressPolicyIngressToOperation> operations) {
            this.operations = operations;
            return this;
        }
        public Builder operations(ServicePerimeterSpecIngressPolicyIngressToOperation... operations) {
            return operations(List.of(operations));
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }        public ServicePerimeterSpecIngressPolicyIngressTo build() {
            return new ServicePerimeterSpecIngressPolicyIngressTo(operations, resources);
        }
    }
}
