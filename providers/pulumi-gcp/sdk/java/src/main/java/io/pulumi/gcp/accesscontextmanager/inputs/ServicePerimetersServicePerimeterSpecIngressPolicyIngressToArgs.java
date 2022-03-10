// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs Empty = new ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs();

    /**
     * A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * 
     */
    @InputImport(name="operations")
      private final @Nullable Input<List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs>> operations;

    public Input<List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs>> getOperations() {
        return this.operations == null ? Input.empty() : this.operations;
    }

    /**
     * A list of resources, currently only projects in the form
     * `projects/<projectnumber>`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    @InputImport(name="resources")
      private final @Nullable Input<List<String>> resources;

    public Input<List<String>> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    public ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs(
        @Nullable Input<List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs>> operations,
        @Nullable Input<List<String>> resources) {
        this.operations = operations;
        this.resources = resources;
    }

    private ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs() {
        this.operations = Input.empty();
        this.resources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs>> operations;
        private @Nullable Input<List<String>> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operations = defaults.operations;
    	      this.resources = defaults.resources;
        }

        public Builder operations(@Nullable Input<List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs>> operations) {
            this.operations = operations;
            return this;
        }

        public Builder operations(@Nullable List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs> operations) {
            this.operations = Input.ofNullable(operations);
            return this;
        }

        public Builder resources(@Nullable Input<List<String>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder resources(@Nullable List<String> resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }
        public ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs build() {
            return new ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs(operations, resources);
        }
    }
}
