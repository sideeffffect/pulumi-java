// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs Empty = new ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs();

    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="ingressFrom")
      private final @Nullable Output<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom;

    public Output<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom() {
        return this.ingressFrom == null ? Codegen.empty() : this.ingressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="ingressTo")
      private final @Nullable Output<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo;

    public Output<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo() {
        return this.ingressTo == null ? Codegen.empty() : this.ingressTo;
    }

    public ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs(
        @Nullable Output<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom,
        @Nullable Output<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo) {
        this.ingressFrom = ingressFrom;
        this.ingressTo = ingressTo;
    }

    private ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs() {
        this.ingressFrom = Codegen.empty();
        this.ingressTo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom;
        private @Nullable Output<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder ingressFrom(@Nullable Output<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom) {
            this.ingressFrom = ingressFrom;
            return this;
        }
        public Builder ingressFrom(@Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs ingressFrom) {
            this.ingressFrom = Codegen.ofNullable(ingressFrom);
            return this;
        }
        public Builder ingressTo(@Nullable Output<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo) {
            this.ingressTo = ingressTo;
            return this;
        }
        public Builder ingressTo(@Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs ingressTo) {
            this.ingressTo = Codegen.ofNullable(ingressTo);
            return this;
        }        public ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs build() {
            return new ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs(ingressFrom, ingressTo);
        }
    }
}
