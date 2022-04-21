// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusEgressPolicyEgressToGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusEgressPolicyEgressToGetArgs Empty = new ServicePerimeterStatusEgressPolicyEgressToGetArgs();

    /**
     * A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * 
     */
    @Import(name="operations")
    private @Nullable Output<List<ServicePerimeterStatusEgressPolicyEgressToOperationGetArgs>> operations;

    public Optional<Output<List<ServicePerimeterStatusEgressPolicyEgressToOperationGetArgs>>> operations() {
        return Optional.ofNullable(this.operations);
    }

    /**
     * A list of resources, currently only projects in the form
     * `projects/&lt;projectnumber&gt;`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    private ServicePerimeterStatusEgressPolicyEgressToGetArgs() {}

    private ServicePerimeterStatusEgressPolicyEgressToGetArgs(ServicePerimeterStatusEgressPolicyEgressToGetArgs $) {
        this.operations = $.operations;
        this.resources = $.resources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterStatusEgressPolicyEgressToGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterStatusEgressPolicyEgressToGetArgs $;

        public Builder() {
            $ = new ServicePerimeterStatusEgressPolicyEgressToGetArgs();
        }

        public Builder(ServicePerimeterStatusEgressPolicyEgressToGetArgs defaults) {
            $ = new ServicePerimeterStatusEgressPolicyEgressToGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder operations(@Nullable Output<List<ServicePerimeterStatusEgressPolicyEgressToOperationGetArgs>> operations) {
            $.operations = operations;
            return this;
        }

        public Builder operations(List<ServicePerimeterStatusEgressPolicyEgressToOperationGetArgs> operations) {
            return operations(Output.of(operations));
        }

        public Builder operations(ServicePerimeterStatusEgressPolicyEgressToOperationGetArgs... operations) {
            return operations(List.of(operations));
        }

        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        public ServicePerimeterStatusEgressPolicyEgressToGetArgs build() {
            return $;
        }
    }

}
