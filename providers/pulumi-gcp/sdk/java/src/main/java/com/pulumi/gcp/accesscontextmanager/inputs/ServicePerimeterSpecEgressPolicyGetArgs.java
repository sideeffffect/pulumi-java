// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromGetArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToGetArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecEgressPolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecEgressPolicyGetArgs Empty = new ServicePerimeterSpecEgressPolicyGetArgs();

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressFrom")
    private @Nullable Output<ServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom;

    public Optional<Output<ServicePerimeterSpecEgressPolicyEgressFromGetArgs>> egressFrom() {
        return Optional.ofNullable(this.egressFrom);
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressTo")
    private @Nullable Output<ServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo;

    public Optional<Output<ServicePerimeterSpecEgressPolicyEgressToGetArgs>> egressTo() {
        return Optional.ofNullable(this.egressTo);
    }

    private ServicePerimeterSpecEgressPolicyGetArgs() {}

    private ServicePerimeterSpecEgressPolicyGetArgs(ServicePerimeterSpecEgressPolicyGetArgs $) {
        this.egressFrom = $.egressFrom;
        this.egressTo = $.egressTo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterSpecEgressPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterSpecEgressPolicyGetArgs $;

        public Builder() {
            $ = new ServicePerimeterSpecEgressPolicyGetArgs();
        }

        public Builder(ServicePerimeterSpecEgressPolicyGetArgs defaults) {
            $ = new ServicePerimeterSpecEgressPolicyGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder egressFrom(@Nullable Output<ServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom) {
            $.egressFrom = egressFrom;
            return this;
        }

        public Builder egressFrom(ServicePerimeterSpecEgressPolicyEgressFromGetArgs egressFrom) {
            return egressFrom(Output.of(egressFrom));
        }

        public Builder egressTo(@Nullable Output<ServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo) {
            $.egressTo = egressTo;
            return this;
        }

        public Builder egressTo(ServicePerimeterSpecEgressPolicyEgressToGetArgs egressTo) {
            return egressTo(Output.of(egressTo));
        }

        public ServicePerimeterSpecEgressPolicyGetArgs build() {
            return $;
        }
    }

}
