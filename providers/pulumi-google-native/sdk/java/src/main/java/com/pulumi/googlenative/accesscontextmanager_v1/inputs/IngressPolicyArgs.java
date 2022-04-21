// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.accesscontextmanager_v1.inputs.IngressFromArgs;
import com.pulumi.googlenative.accesscontextmanager_v1.inputs.IngressToArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Policy for ingress into ServicePerimeter. IngressPolicies match requests based on `ingress_from` and `ingress_to` stanzas. For an ingress policy to match, both the `ingress_from` and `ingress_to` stanzas must be matched. If an IngressPolicy matches a request, the request is allowed through the perimeter boundary from outside the perimeter. For example, access from the internet can be allowed either based on an AccessLevel or, for traffic hosted on Google Cloud, the project of the source network. For access from private networks, using the project of the hosting network is required. Individual ingress policies can be limited by restricting which services and/or actions they match using the `ingress_to` field.
 * 
 */
public final class IngressPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressPolicyArgs Empty = new IngressPolicyArgs();

    /**
     * Defines the conditions on the source of a request causing this IngressPolicy to apply.
     * 
     */
    @Import(name="ingressFrom")
    private @Nullable Output<IngressFromArgs> ingressFrom;

    public Optional<Output<IngressFromArgs>> ingressFrom() {
        return Optional.ofNullable(this.ingressFrom);
    }

    /**
     * Defines the conditions on the ApiOperation and request destination that cause this IngressPolicy to apply.
     * 
     */
    @Import(name="ingressTo")
    private @Nullable Output<IngressToArgs> ingressTo;

    public Optional<Output<IngressToArgs>> ingressTo() {
        return Optional.ofNullable(this.ingressTo);
    }

    private IngressPolicyArgs() {}

    private IngressPolicyArgs(IngressPolicyArgs $) {
        this.ingressFrom = $.ingressFrom;
        this.ingressTo = $.ingressTo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressPolicyArgs $;

        public Builder() {
            $ = new IngressPolicyArgs();
        }

        public Builder(IngressPolicyArgs defaults) {
            $ = new IngressPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder ingressFrom(@Nullable Output<IngressFromArgs> ingressFrom) {
            $.ingressFrom = ingressFrom;
            return this;
        }

        public Builder ingressFrom(IngressFromArgs ingressFrom) {
            return ingressFrom(Output.of(ingressFrom));
        }

        public Builder ingressTo(@Nullable Output<IngressToArgs> ingressTo) {
            $.ingressTo = ingressTo;
            return this;
        }

        public Builder ingressTo(IngressToArgs ingressTo) {
            return ingressTo(Output.of(ingressTo));
        }

        public IngressPolicyArgs build() {
            return $;
        }
    }

}
