// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusGetArgs Empty = new ServicePerimeterStatusGetArgs();

    /**
     * A list of AccessLevel resource names that allow resources within
     * the ServicePerimeter to be accessed from the internet.
     * AccessLevels listed must be in the same policy as this
     * ServicePerimeter. Referencing a nonexistent AccessLevel is a
     * syntax error. If no AccessLevel names are listed, resources within
     * the perimeter can only be accessed via GCP calls with request
     * origins within the perimeter. For Service Perimeter Bridge, must
     * be empty.
     * Format: accessPolicies/{policy_id}/accessLevels/{access_level_name}
     * 
     */
    @Import(name="accessLevels")
      private final @Nullable Output<List<String>> accessLevels;

    public Output<List<String>> accessLevels() {
        return this.accessLevels == null ? Codegen.empty() : this.accessLevels;
    }

    /**
     * List of EgressPolicies to apply to the perimeter. A perimeter may
     * have multiple EgressPolicies, each of which is evaluated separately.
     * Access is granted if any EgressPolicy grants it. Must be empty for
     * a perimeter bridge.
     * Structure is documented below.
     * 
     */
    @Import(name="egressPolicies")
      private final @Nullable Output<List<ServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies;

    public Output<List<ServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies() {
        return this.egressPolicies == null ? Codegen.empty() : this.egressPolicies;
    }

    /**
     * List of `IngressPolicies` to apply to the perimeter. A perimeter may
     * have multiple `IngressPolicies`, each of which is evaluated
     * separately. Access is granted if any `Ingress Policy` grants it.
     * Must be empty for a perimeter bridge.
     * Structure is documented below.
     * 
     */
    @Import(name="ingressPolicies")
      private final @Nullable Output<List<ServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies;

    public Output<List<ServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies() {
        return this.ingressPolicies == null ? Codegen.empty() : this.ingressPolicies;
    }

    /**
     * A list of resources, currently only projects in the form
     * `projects/<projectnumber>`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> resources() {
        return this.resources == null ? Codegen.empty() : this.resources;
    }

    /**
     * GCP services that are subject to the Service Perimeter
     * restrictions. Must contain a list of services. For example, if
     * `storage.googleapis.com` is specified, access to the storage
     * buckets inside the perimeter must meet the perimeter's access
     * restrictions.
     * 
     */
    @Import(name="restrictedServices")
      private final @Nullable Output<List<String>> restrictedServices;

    public Output<List<String>> restrictedServices() {
        return this.restrictedServices == null ? Codegen.empty() : this.restrictedServices;
    }

    /**
     * Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * 
     */
    @Import(name="vpcAccessibleServices")
      private final @Nullable Output<ServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices;

    public Output<ServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices() {
        return this.vpcAccessibleServices == null ? Codegen.empty() : this.vpcAccessibleServices;
    }

    public ServicePerimeterStatusGetArgs(
        @Nullable Output<List<String>> accessLevels,
        @Nullable Output<List<ServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies,
        @Nullable Output<List<ServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies,
        @Nullable Output<List<String>> resources,
        @Nullable Output<List<String>> restrictedServices,
        @Nullable Output<ServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices) {
        this.accessLevels = accessLevels;
        this.egressPolicies = egressPolicies;
        this.ingressPolicies = ingressPolicies;
        this.resources = resources;
        this.restrictedServices = restrictedServices;
        this.vpcAccessibleServices = vpcAccessibleServices;
    }

    private ServicePerimeterStatusGetArgs() {
        this.accessLevels = Codegen.empty();
        this.egressPolicies = Codegen.empty();
        this.ingressPolicies = Codegen.empty();
        this.resources = Codegen.empty();
        this.restrictedServices = Codegen.empty();
        this.vpcAccessibleServices = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> accessLevels;
        private @Nullable Output<List<ServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies;
        private @Nullable Output<List<ServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies;
        private @Nullable Output<List<String>> resources;
        private @Nullable Output<List<String>> restrictedServices;
        private @Nullable Output<ServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.egressPolicies = defaults.egressPolicies;
    	      this.ingressPolicies = defaults.ingressPolicies;
    	      this.resources = defaults.resources;
    	      this.restrictedServices = defaults.restrictedServices;
    	      this.vpcAccessibleServices = defaults.vpcAccessibleServices;
        }

        public Builder accessLevels(@Nullable Output<List<String>> accessLevels) {
            this.accessLevels = accessLevels;
            return this;
        }
        public Builder accessLevels(@Nullable List<String> accessLevels) {
            this.accessLevels = Codegen.ofNullable(accessLevels);
            return this;
        }
        public Builder accessLevels(String... accessLevels) {
            return accessLevels(List.of(accessLevels));
        }
        public Builder egressPolicies(@Nullable Output<List<ServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies) {
            this.egressPolicies = egressPolicies;
            return this;
        }
        public Builder egressPolicies(@Nullable List<ServicePerimeterStatusEgressPolicyGetArgs> egressPolicies) {
            this.egressPolicies = Codegen.ofNullable(egressPolicies);
            return this;
        }
        public Builder egressPolicies(ServicePerimeterStatusEgressPolicyGetArgs... egressPolicies) {
            return egressPolicies(List.of(egressPolicies));
        }
        public Builder ingressPolicies(@Nullable Output<List<ServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies) {
            this.ingressPolicies = ingressPolicies;
            return this;
        }
        public Builder ingressPolicies(@Nullable List<ServicePerimeterStatusIngressPolicyGetArgs> ingressPolicies) {
            this.ingressPolicies = Codegen.ofNullable(ingressPolicies);
            return this;
        }
        public Builder ingressPolicies(ServicePerimeterStatusIngressPolicyGetArgs... ingressPolicies) {
            return ingressPolicies(List.of(ingressPolicies));
        }
        public Builder resources(@Nullable Output<List<String>> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = Codegen.ofNullable(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public Builder restrictedServices(@Nullable Output<List<String>> restrictedServices) {
            this.restrictedServices = restrictedServices;
            return this;
        }
        public Builder restrictedServices(@Nullable List<String> restrictedServices) {
            this.restrictedServices = Codegen.ofNullable(restrictedServices);
            return this;
        }
        public Builder restrictedServices(String... restrictedServices) {
            return restrictedServices(List.of(restrictedServices));
        }
        public Builder vpcAccessibleServices(@Nullable Output<ServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices) {
            this.vpcAccessibleServices = vpcAccessibleServices;
            return this;
        }
        public Builder vpcAccessibleServices(@Nullable ServicePerimeterStatusVpcAccessibleServicesGetArgs vpcAccessibleServices) {
            this.vpcAccessibleServices = Codegen.ofNullable(vpcAccessibleServices);
            return this;
        }        public ServicePerimeterStatusGetArgs build() {
            return new ServicePerimeterStatusGetArgs(accessLevels, egressPolicies, ingressPolicies, resources, restrictedServices, vpcAccessibleServices);
        }
    }
}
