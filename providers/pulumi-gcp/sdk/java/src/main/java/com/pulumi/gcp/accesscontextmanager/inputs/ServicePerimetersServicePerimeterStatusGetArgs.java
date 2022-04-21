// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusGetArgs Empty = new ServicePerimetersServicePerimeterStatusGetArgs();

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
    private @Nullable Output<List<String>> accessLevels;

    public Optional<Output<List<String>>> accessLevels() {
        return Optional.ofNullable(this.accessLevels);
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
    private @Nullable Output<List<ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies;

    public Optional<Output<List<ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs>>> egressPolicies() {
        return Optional.ofNullable(this.egressPolicies);
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
    private @Nullable Output<List<ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies;

    public Optional<Output<List<ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs>>> ingressPolicies() {
        return Optional.ofNullable(this.ingressPolicies);
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

    /**
     * GCP services that are subject to the Service Perimeter
     * restrictions. Must contain a list of services. For example, if
     * `storage.googleapis.com` is specified, access to the storage
     * buckets inside the perimeter must meet the perimeter&#39;s access
     * restrictions.
     * 
     */
    @Import(name="restrictedServices")
    private @Nullable Output<List<String>> restrictedServices;

    public Optional<Output<List<String>>> restrictedServices() {
        return Optional.ofNullable(this.restrictedServices);
    }

    /**
     * Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * 
     */
    @Import(name="vpcAccessibleServices")
    private @Nullable Output<ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices;

    public Optional<Output<ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs>> vpcAccessibleServices() {
        return Optional.ofNullable(this.vpcAccessibleServices);
    }

    private ServicePerimetersServicePerimeterStatusGetArgs() {}

    private ServicePerimetersServicePerimeterStatusGetArgs(ServicePerimetersServicePerimeterStatusGetArgs $) {
        this.accessLevels = $.accessLevels;
        this.egressPolicies = $.egressPolicies;
        this.ingressPolicies = $.ingressPolicies;
        this.resources = $.resources;
        this.restrictedServices = $.restrictedServices;
        this.vpcAccessibleServices = $.vpcAccessibleServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimetersServicePerimeterStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimetersServicePerimeterStatusGetArgs $;

        public Builder() {
            $ = new ServicePerimetersServicePerimeterStatusGetArgs();
        }

        public Builder(ServicePerimetersServicePerimeterStatusGetArgs defaults) {
            $ = new ServicePerimetersServicePerimeterStatusGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessLevels(@Nullable Output<List<String>> accessLevels) {
            $.accessLevels = accessLevels;
            return this;
        }

        public Builder accessLevels(List<String> accessLevels) {
            return accessLevels(Output.of(accessLevels));
        }

        public Builder accessLevels(String... accessLevels) {
            return accessLevels(List.of(accessLevels));
        }

        public Builder egressPolicies(@Nullable Output<List<ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies) {
            $.egressPolicies = egressPolicies;
            return this;
        }

        public Builder egressPolicies(List<ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs> egressPolicies) {
            return egressPolicies(Output.of(egressPolicies));
        }

        public Builder egressPolicies(ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs... egressPolicies) {
            return egressPolicies(List.of(egressPolicies));
        }

        public Builder ingressPolicies(@Nullable Output<List<ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies) {
            $.ingressPolicies = ingressPolicies;
            return this;
        }

        public Builder ingressPolicies(List<ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs> ingressPolicies) {
            return ingressPolicies(Output.of(ingressPolicies));
        }

        public Builder ingressPolicies(ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs... ingressPolicies) {
            return ingressPolicies(List.of(ingressPolicies));
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

        public Builder restrictedServices(@Nullable Output<List<String>> restrictedServices) {
            $.restrictedServices = restrictedServices;
            return this;
        }

        public Builder restrictedServices(List<String> restrictedServices) {
            return restrictedServices(Output.of(restrictedServices));
        }

        public Builder restrictedServices(String... restrictedServices) {
            return restrictedServices(List.of(restrictedServices));
        }

        public Builder vpcAccessibleServices(@Nullable Output<ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices) {
            $.vpcAccessibleServices = vpcAccessibleServices;
            return this;
        }

        public Builder vpcAccessibleServices(ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs vpcAccessibleServices) {
            return vpcAccessibleServices(Output.of(vpcAccessibleServices));
        }

        public ServicePerimetersServicePerimeterStatusGetArgs build() {
            return $;
        }
    }

}
